/**
  * Created by Shin-Yi on 3/17/2016.
  * Run DecisionTree.scala first, because there're codes for spliting raw data into train, test, and new datasets 
  * Then save the train_test dataset into train_test_Table and save the new dataset into new_Table.
  * So in this DataInputSVMOutput.scala, don't need to split the raw data. Just get the 2 datasets from Cassandra.
  */
import com.datastax.spark.connector._
import org.apache.spark.mllib.classification.SVMWithSGD
import org.apache.spark.mllib.evaluation.BinaryClassificationMetrics
import org.apache.spark.mllib.linalg.Vectors
import org.apache.spark.mllib.regression.LabeledPoint
import org.apache.spark.{SparkConf, SparkContext}


object DataInputSVMOutput {
  def target_String2Dou(s:String): Double={
            if(s=="yes") return 1.0
            else return 0.0
  }

  def feature_job_String2Dou(s:String): Double={
            if(s=="entrepreneur") return 11.0
            else if(s=="management") return 10.0
            else if(s=="self-employed") return 9.0
            else if(s=="blue-collar") return 8.0
            else if(s=="technician") return 7.0
            else if(s=="admin.") return 6.0
            else if(s=="services") return 5.0
            else if(s=="housemaid") return 4.0
            else if(s=="retired") return 3.0
            else if(s=="student") return 2.0
            else if(s=="unemployed") return 1.0
            else return 0.0 //unknown
  }

  //marital state
  def feature_ma_String2Dou(s:String): Double={
            if(s=="married") return 2.0
            else if(s=="divorced") return 1.0
            else return 0.0  //single
  }

  //education
  def feature_edu_String2Dou(s:String): Double={
            if(s=="primary") return 3.0
            else if(s=="secondary") return 2.0
            else if(s=="tertiary") return 1.0
            else return 0.0  //single
  }

  //has credit in default?
  def feature_def_String2Dou(s:String): Double={
            if(s=="yes") return 1.0
            else return 0.0   //no
  }

  //housing
  def feature_hou_String2Dou(s:String): Double={
            if(s=="yes") return 1.0
            else return 0.0   //no
  }

  //loan
  def feature_loan_String2Dou(s:String): Double={
            if(s=="no") return 1.0
            else return 0.0   //yes
  }

  //contact
  def feature_con_String2Dou(s:String): Double={
            if(s=="cellular") return 2.0
            if(s=="telephone") return 1.0
            else return 0.0   //unknown
  }

  //month
  def feature_mon_String2Dou(s:String): Double={
            if(s=="dec") return 12.0
            if(s=="nov") return 11.0
            if(s=="oct") return 10.0
            if(s=="sep") return 9.0
            if(s=="aug") return 8.0
            if(s=="jul") return 7.0
            if(s=="jun") return 6.0
            if(s=="may") return 5.0
            if(s=="apr") return 4.0
            if(s=="mar") return 3.0
            if(s=="feb") return 2.0
            else return 1.0   //jan
  }

  //contact
  def feature_pout_String2Dou(s:String): Double={
            if(s=="success") return 2.0
            if(s=="other") return 1.0
            if(s=="unknown") return 0.0
            else return -1.0   //failure
  }

  def target_Dou2String(d:Double): String={
            if(d>=0.5) return "yes"
            else return "no"
  }

  case class CustomerNew(user_id:Int,y_actual:String,y_predict:String)

	 def main(args: Array[String]): Unit = {
	  	val conf = new SparkConf(true).set("spark.cassandra.connection.host", "127.0.0.1")
      val sc = new SparkContext("local", "test", conf)

    // Load training data from Cassandra.
		 val bankmarketing_cassandraRowsRDD = sc.cassandraTable("bankmarketing", "customer")
		 val train_testData_cassandraRowsRDD = sc.cassandraTable("bankmarketing", "customertraintest")
     val newData_cassandraRowsRDD=bankmarketing_cassandraRowsRDD.subtract(train_testData_cassandraRowsRDD)


		//Transform train_testData_cassandraRowsRDD into LabeledPointRDD
		  val featureIndex_Double = Array(0,1,2,3,5,7,14,16)
      val targetIndex = 17
    	val train_testData_labeledPointRDD=train_testData_cassandraRowsRDD.map(r => LabeledPoint(
      	target_String2Dou(r.getString(targetIndex)), // Get target value
      	// Map feature indices to values
      	Vectors.dense(featureIndex_Double.map(r.getDouble(_))++Array(feature_job_String2Dou(r.getString(10)),feature_ma_String2Dou(r.getString(12)),
                    feature_edu_String2Dou(r.getString(8)),feature_def_String2Dou(r.getString(6)),
                    feature_hou_String2Dou(r.getString(9)),feature_loan_String2Dou(r.getString(11)),
                    feature_con_String2Dou(r.getString(4)),feature_mon_String2Dou(r.getString(13)),
                    feature_pout_String2Dou(r.getString(15)))
                    )
    	))

     	val splitss = train_testData_labeledPointRDD .randomSplit(Array(0.7, 0.3), seed = 11L)
		  val (trainData_labeledPointRDD , testData_labeledPointRDD) = (splitss(0),splitss(1))

    //Transform newData_cassandraRowsRDD into LabeledPointRDD
      //val featureIndex_Double = Array(0,1,2,3,5,7,14,16)
      //val targetIndex = 17
      val newData_labeledPointRDD=newData_cassandraRowsRDD.map(r => LabeledPoint(
        target_String2Dou(r.getString(targetIndex)), // Get target value
        // Map feature indices to values
        Vectors.dense(featureIndex_Double.map(r.getDouble(_))++Array(feature_job_String2Dou(r.getString(10)),feature_ma_String2Dou(r.getString(12)),
                    feature_edu_String2Dou(r.getString(8)),feature_def_String2Dou(r.getString(6)),
                    feature_hou_String2Dou(r.getString(9)),feature_loan_String2Dou(r.getString(11)),
                    feature_con_String2Dou(r.getString(4)),feature_mon_String2Dou(r.getString(13)),
                    feature_pout_String2Dou(r.getString(15)))
                    )
      ))

	  // Run training algorithm to build the model
		   val numIterations = 100
		   val model = SVMWithSGD.train(train_testData_labeledPointRDD, numIterations)
       //p.s. Spark MLLIB error: java.lang.NoSuchMethodError: org.apache.spark.rdd.RDD.treeAggregate$default$4(Ljava/lang/Object;)I
       //     Solve this problem by updating "spark-core" % "1.2.0" to "spark-core" % "1.3.1" in build.sbt file

		// Clear the default threshold.
    //Clears the threshold so that predict will output raw prediction score
		   //model.clearThreshold()

	  // Compute raw scores on the test set.
		 val scoreAndLabels_testData = testData_labeledPointRDD.map { point =>
   		//score is prediction result with double float type
      val score = model.predict(point.features)
   			(score,point.label)
		 }

     // Compute raw scores on the new data set.
     val scoreAndLabels_newData = newData_labeledPointRDD.map { point =>
      //score is prediction result with double float type
      val score = model.predict(point.features)
        //point.features.apply(0) is customer_id
        (point.features.apply(0),point.label,score)
     }

		// Get evaluation metrics.
      //val metrics = new BinaryClassificationMetrics(scoreAndLabels,numBins)
      //Parameter int numBins is used for down-sampling because if inputs are millions of points or more,
      //then thousands of input points may be entirely sufficient to summarize the curve.
		  //If numBins is greater than 0, then the curves (ROC curve, PR curve) computed internally will be down-sampled to this many "bins".
      //If numBins is 0, no down-sampling will occur.
       val metrics = new BinaryClassificationMetrics(scoreAndLabels_testData)

		   //Computes the area under the receiver operating characteristic (ROC) curve.
       //ROC curve: Sensitivity(TPR)/(1-Specificity)(FPR)  https://en.wikipedia.org/wiki/Receiver_operating_characteristic
       val auROC = metrics.areaUnderROC()
       println("Rate of area under ROC = " + auROC)
       //Computes the area under the precision-recall curve.
       val auPR = metrics.areaUnderPR()
       println("Rate of area under PR = " + auPR)
       //Compute the recall and precision
       val precitionRecall = metrics.pr()
       //print the recall (first) and precision (second)
       precitionRecall.foreach(println)
       //println(precitionRecall.foreach(r=>(r._1.toString,r._2.toString)))
       println("Learned classification SVM model:\n" + model.toPMML())

       //scoreAndLabels_testData.collect().foreach(println)
       scoreAndLabels_newData.collect().foreach(println)
    
    //Save the new data predicted result into "customerNewSVMPred" Table
    //r._1=customer_id, r._2=actual_label, r._3=predicted_score
    val collection=scoreAndLabels_newData.map(r=>new CustomerNew(r._1.toInt,target_Dou2String(r._2),target_Dou2String(r._3)))
		collection.foreach(println)
    collection.saveAsCassandraTable("bankmarketing","newCustomer_SVMpredict",SomeColumns("user_id","y_actual","y_predict"))
    //collection.saveToCassandra("bankmarketing","newCustomer_SVMpredict",SomeColumns("user_id","y_actual","y_predict"))
    
    // Save and load model
    //human-readable (JSON) model metadata to path/metadata/
		 //model.save(sc, "./SVMModel")
     //model.toPMML(sc, "./SVMModel_PMML")
     //model.toPMML("./SVMModel.xml")
		 //var sameModel = SVMModel.load(sc, "./SVMModel")
     //println("Learned classification SVM model:\n" + sameModel.toPMML())

     //Save the scoreAndLabels_testData
     //new java.io.PrintWriter("./decisionTreeModel.txt") { write("Test Error = " + testErr+"\n"+model.toDebugString); close }

	
    // The SVMWithSGD.train() method by default performs L2 regularization with the regularization parameter set to 1.0. If we want to configure this algorithm, we can customize SVMWithSGD further by creating a new object directly and calling setter methods. All other spark.mllib algorithms support customization in this way as well. For example, the following code produces an L1 regularized variant of SVMs with regularization parameter set to 0.1, and runs the training algorithm for 200 iterations.
		// import org.apache.spark.mllib.optimization.L1Updater

		// val svmAlg = new SVMWithSGD()
		// svmAlg.optimizer.
    // 		setNumIterations(200).
    // 		setRegParam(0.1).
    // 		setUpdater(new L1Updater)
		// val modelL1 = svmAlg.run(training)
	}
}

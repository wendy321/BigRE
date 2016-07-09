/**
  * Created by Shin-Yi on 2/22/2016.
  */

import com.datastax.spark.connector._
import org.apache.spark.mllib.linalg.Vectors
import org.apache.spark.mllib.regression.LabeledPoint
import org.apache.spark.mllib.tree.DecisionTree
import org.apache.spark.{SparkConf, SparkContext}

object DataInputDTOutput {

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

  // def feature_m_String2Int(s:Array[String]): Array[Int]={
  //       val a= Array()
  //       for(e <- s){
  //           if(e=="single")
  //           else if(e=="divorced") return 1
  //           else return 2
  //       }

  // }

  def target_Dou2String(d:Double): String={
    if(d>=0.5) return "yes"
    else return "no"
  }

  case class CumstomerNew(user_id: Int, y_actual: String, y_predict: String)

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf(true)
      .set("spark.cassandra.connection.host", "127.0.0.1")

    val sc = new SparkContext("local", "test", conf)

    // val sqlContext = new org.apache.spark.sql.SQLContext(sc)
    // val df = sqlContext.read.json("./sparktest.json")


    val bankmarketing_cassandraRowsRDD = sc.cassandraTable("bankmarketing", "customer")

    // Split the data into training-test and new data sets
    val splits = bankmarketing_cassandraRowsRDD.randomSplit(Array(0.7,0.3))
    val (train_testData_cassandraRowsRDD, newData_cassandraRowsRDD) = (splits(0), splits(1))

    train_testData_cassandraRowsRDD.saveToCassandra("bankmarketing", "customertraintest")


    //Transform RDD<CassandraRow> to RDD<LabeledPoint>
    val featureIndex_Double = Array(0,1,2,3,5,7,14,16)
    val targetIndex = 17

    //(Train and Test)Transform cassandraRowsRDD into labeled point RDD
    val train_testData_labeledPointRDD=train_testData_cassandraRowsRDD.map(r => LabeledPoint(
      target_String2Dou(r.getString(targetIndex)), // Get target value
      // Map feature indices to values
      //RDD1.union(RDD2)
      Vectors.dense(featureIndex_Double.map(r.getDouble(_))++Array(feature_job_String2Dou(r.getString(10)),feature_ma_String2Dou(r.getString(12)),
        feature_edu_String2Dou(r.getString(8)),feature_def_String2Dou(r.getString(6)),
        feature_hou_String2Dou(r.getString(9)),feature_loan_String2Dou(r.getString(11)),
        feature_con_String2Dou(r.getString(4)),feature_mon_String2Dou(r.getString(13)),
        feature_pout_String2Dou(r.getString(15)))
      )
    ))

    // Split the data into training and test sets (30% held out for testing)
    val splitsss = train_testData_labeledPointRDD.randomSplit(Array(0.7,0.3))
    val (trainingData, testData) = (splitsss(0), splitsss(1))

    //(New Data)Transform cassandraRowsRDD into labeled point RDD
    val newData_labeledPointRDD=newData_cassandraRowsRDD.map(r => LabeledPoint(
      target_String2Dou(r.getString(targetIndex)), // Get target value
      // Map feature indices to values
      //RDD1.union(RDD2)
      Vectors.dense(featureIndex_Double.map(r.getDouble(_))++Array(feature_job_String2Dou(r.getString(10)),feature_ma_String2Dou(r.getString(12)),
        feature_edu_String2Dou(r.getString(8)),feature_def_String2Dou(r.getString(6)),
        feature_hou_String2Dou(r.getString(9)),feature_loan_String2Dou(r.getString(11)),
        feature_con_String2Dou(r.getString(4)),feature_mon_String2Dou(r.getString(13)),
        feature_pout_String2Dou(r.getString(15)))
      )
    ))

    // Train a DecisionTree model.
    val numClasses = 2
    //  Empty categoricalFeaturesInfo indicates all features are continuous.
    val categoricalFeaturesInfo = Map[Int, Int]()
    //val categoricalFeaturesInfo = Map[Int, Int](2->12,3->4,4->8,5->3,7->3,8->3,9->3,11->12,16->3,17->2)
    // Information gain calculation. Supported values: "gini" (recommended) or "entropy".
    val impurity = "gini"
    //Maximum depth of the tree. E.g., depth 0 means 1 leaf node; depth 1 means 1 internal node + 2 leaf nodes. (suggested value: 5)
    val maxDepth = 5
    //maximum number of bins used for splitting features (suggested value: 32)
    val maxBins = 32

    //Build Decision Tree Model by training data
    val model = DecisionTree.trainClassifier(trainingData, numClasses, categoricalFeaturesInfo,impurity, maxDepth, maxBins)

    // Evaluate model by test data
    val labelAndPreds_testData = testData.map { point =>
      val prediction = model.predict(point.features)
      (point.label, prediction)
    }
    //Calculate the testing error= (number of (actual value != predicted value)) / (total data number)
    val testErr = labelAndPreds_testData.filter(r => r._1 != r._2).count().toDouble / testData.count()
    println("Test Error = " + testErr)
    println("Learned classification tree model:\n" + model.toDebugString)

    //Predict result of new data
    val labelAndPreds_newData = newData_labeledPointRDD.map { point =>
      val prediction = model.predict(point.features)
      (point.features.apply(0) ,point.label, prediction)
    }

    //Save the new data predicted result into "customerNew" Table

    //labelAndPreds_newData.map(r=> new CumstomerNew(r._1.toInt,target_Dou2String(r._2),target_Dou2String(r._3))).saveToCassandra("bankmarketing","customernew",SomeColumns("user_id","y_actual","y_predict"))
    val RDD=labelAndPreds_newData.map(r=> new CumstomerNew(r._1.toInt,target_Dou2String(r._2),target_Dou2String(r._3)))
    RDD.saveToCassandra("bankmarketing","countcustomer_pyactual",SomeColumns("user_id","y_actual","y_predict"))
    RDD.saveToCassandra("bankmarketing","countcustomer_pypredict",SomeColumns("user_id","y_actual","y_predict"))

    new java.io.PrintWriter("./decisionTreeModel.txt") { write("Test Error = " + testErr+"\n"+model.toDebugString); close }
    //model.save(sc,"./DT-test") //Not Work
    //model.toPMML("./tmp/DT_test.xml") // Not for decision tree
  }
}

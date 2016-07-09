package jfacetutorial.model;

//import java.util.ArrayList;
import java.util.List;

public class SoftGoal {
	private String name;
	private String satType;
	private List<SoftGoal> subSoftGoals;
	public static int counter;
	
	public SoftGoal (String name, String satType,List<SoftGoal> subSoftGoals){
		this.name=name;
		this.satType=satType;
		this.subSoftGoals=subSoftGoals;
		this.counter++;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getSatType(){
		return satType;
	}
	
	public void setSatType(String satType){
		this.satType=satType;
	}
	
	public List<SoftGoal> getSubSoftGoals(){
		return subSoftGoals;
	}
	
	public void setSubSoftGoal(List<SoftGoal> subSoftGoal){
		this.subSoftGoals=subSoftGoal;
	}
}


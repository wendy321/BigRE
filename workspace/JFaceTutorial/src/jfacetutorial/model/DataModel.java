package jfacetutorial.model;

import java.util.ArrayList;
import java.util.List;

public class DataModel {
	private static List<SoftGoal> softGoalList;
	private static List<AppMenu> appMenuList;
	
	public static List<SoftGoal> getSoftGoals(){
		if(softGoalList==null){
			softGoalList=new ArrayList<SoftGoal>();
			SoftGoal subSG_C=new SoftGoal("Confidentiality","Undecided",null);
			SoftGoal subSG_I=new SoftGoal("Integrity","Satisficed",null);
			SoftGoal subSG_A=new SoftGoal("Availability","Undecided",null);
			List<SoftGoal> subSGList=new ArrayList<SoftGoal>();
			subSGList.add(subSG_C);
			subSGList.add(subSG_I);
			subSGList.add(subSG_A);
			SoftGoal SG_S=new SoftGoal("Security","Undecided",subSGList);
			softGoalList.add(SG_S);
		}
		return softGoalList;
	}
	
	public static List<AppMenu> getAppMenus(){
		if(appMenuList==null){
			appMenuList=new ArrayList<AppMenu>();			
		
		AppMenu appMenu31=new AppMenu("ErrorLog","Error Log",null);
		AppMenu appMenu32=new AppMenu("ProjectExplorer","Proect Explorer",null);
		
		List<AppMenu> list3=new ArrayList<AppMenu>();
		list3.add(appMenu31);
		list3.add(appMenu32);
		
		AppMenu appMenu21=new AppMenu("ShowView","Show View",null);
		AppMenu appMenu22=new AppMenu("ClosePerspective","Close Perspective..",null);
		
		List<AppMenu> list2=new ArrayList<AppMenu>();
		list2.add(appMenu21);
		list2.add(appMenu22);
		
		AppMenu appMenu1=new AppMenu("Window","Window", list2);
		appMenuList.add(appMenu1);
		
		}
		return appMenuList;
	}
}

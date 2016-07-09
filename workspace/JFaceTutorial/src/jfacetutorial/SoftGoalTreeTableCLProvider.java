package jfacetutorial;

import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.LocalResourceManager;
//import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import jfacetutorial.model.SoftGoal;
import jfacetutorial.provider.AbstractTreeTableContentLabelProvider;

public class SoftGoalTreeTableCLProvider extends AbstractTreeTableContentLabelProvider{
	private Image SOFTGOAL_UNDSAT_IMAGE;
	private Image SOFTGOAL_SAT_IMAGE;
	private Image BLANK_IMAGE;
	//private Image INFORMATION_IMAGE;
	//private Image ERROR_IMAGE;
	
	public SoftGoalTreeTableCLProvider(){
		LocalResourceManager jfaceRsManager=new LocalResourceManager(
				JFaceResources.getResources(),
				Display.getCurrent().getShells()[0]);
		ImageDescriptor imageDescriptor1=ImageDescriptor.createFromFile(
				SoftGoalTreeTableCLProvider.class,
				"/jfacetutorial/image/UndecidedNFRSoftgoal.jpg");
		ImageDescriptor imageDescriptor2=ImageDescriptor.createFromFile(
				SoftGoalTreeTableCLProvider.class,
				"/jfacetutorial/image/SatisficedNFRSoftgoal.jpg");
		ImageDescriptor imageDescriptor3=ImageDescriptor.createFromFile(
				SoftGoalTreeTableCLProvider.class,
				"/jfacetutorial/image/blank.jpg");
		SOFTGOAL_UNDSAT_IMAGE=jfaceRsManager.createImage(imageDescriptor1);
		SOFTGOAL_SAT_IMAGE=jfaceRsManager.createImage(imageDescriptor2);
		BLANK_IMAGE=jfaceRsManager.createImage(imageDescriptor3);
		//INFORMATION_IMAGE=Display.getCurrent().getSystemImage(SWT.ICON_INFORMATION);
		//ERROR_IMAGE=Display.getCurrent().getSystemImage(SWT.ICON_ERROR);
	}

	@SuppressWarnings("unchecked")
	@Override 
	public Object[] getElements(Object inputElement) {
		List<SoftGoal> softgoals=(List<SoftGoal>)inputElement;
		return softgoals.toArray();
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if(parentElement instanceof SoftGoal){
			SoftGoal sfg=(SoftGoal)parentElement;
			List<SoftGoal> sub_sfgs=sfg.getSubSoftGoals();
			return sub_sfgs==null?null:sub_sfgs.toArray();
		}else{
			//SoftGoal has no children
			return null;
		}		
	}

	@Override
	public boolean hasChildren(Object element) {
		if(element instanceof SoftGoal){
			SoftGoal sfg=(SoftGoal)element;
			List<SoftGoal> sub_sfgs=sfg.getSubSoftGoals();
			return sub_sfgs!=null && !sub_sfgs.isEmpty();
		}else{
			//SoftGoal has no children
			return false;
		}
	}
	
	@Override
	public String getColumnText(Object element, int columnIndex) {
		SoftGoal sfg=null;
		if(element instanceof SoftGoal){
			sfg=(SoftGoal)element;
		}
		
		if(sfg.getSubSoftGoals()!=null){
			switch(columnIndex){
			case 0:
				return sfg.getName(); 
			case 1:
				return sfg.getSatType();
			default:
				return "";
			}
		}else{
			switch(columnIndex){
			case 2:
				return sfg.getName();
			case 3:
				return sfg.getSatType();
			default:
				return "";
			}
		}		
	}

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		SoftGoal sfg=null;
		if(element instanceof SoftGoal){
			sfg=(SoftGoal)element;
		}
		
		if(sfg.getSubSoftGoals()!=null){
			if(sfg.getSatType()=="Undecided"){
				switch(columnIndex){
				case 0:
					return SOFTGOAL_UNDSAT_IMAGE;
				default:
					return BLANK_IMAGE;
				}
			}else if(sfg.getSatType()=="Satisficed"){
				switch(columnIndex){
				case 0:
					return SOFTGOAL_SAT_IMAGE;
				default:
					return BLANK_IMAGE;
				}				
			}else{
				return BLANK_IMAGE;
			}
		}else if(sfg.getSubSoftGoals()==null){
			if(sfg.getSatType()=="Undecided"){
				switch(columnIndex){
				case 2:
					return SOFTGOAL_UNDSAT_IMAGE;
				default:
					return BLANK_IMAGE;
				}
			}else if(sfg.getSatType()=="Satisficed"){
				switch(columnIndex){
				case 2:
					return SOFTGOAL_SAT_IMAGE;
				default:
					return BLANK_IMAGE;
				}				
			}else{
				return BLANK_IMAGE;
			}
		}else{
			return BLANK_IMAGE;
		}
	}
	
	
	
	
	
	
}

package bpmn.funcextend;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Collection;
import java.util.Map;



//import javax.swing.JOptionPane;
//import org.eclipse.swt.widge.*;
import jfacetutorial.*;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.viewpoint.SiriusPlugin;
import org.eclipse.swt.widgets.Display;

import bpmn.BpmnFactory;
import bpmn.BpmnPackage;
import bpmn.NFRSoftsolution;
import bpmn.impl.NFRSoftsolutionImpl;
//import sqltest.CallScala;

public class KPIMethodAction extends AbstractExternalJavaAction {
	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		try{
				SoftGoalApplication window = new SoftGoalApplication();
				window.setBlockOnOpen(true);
				window.open();
				//When click on X(close) of pop-up window, the whole running Application will close too.
				//Displa_y.getCurrent().dispose(); 
				
				
//				File file=new File("D:/Eclipse_Project/workspace3/bpmn.funcextend/output/output.txt");
//				
//				if(!file.exists()){
//					file.createNewFile();
//				}
//				
//				FileWriter fw=new FileWriter(file);
//				BufferedWriter bw=new BufferedWriter(fw);
				
				//SQLTest2_java stj=new SQLTest2_java();
				String[] str=new String[1];
				str[0]="";
//				SQLTest2_java.main(str);
				
//				SQLTest2$ st=SQLTest2$.MODULE$;
//				String[] str=new String[1];
//				str[0]="";
//				st.main(str);
				
//				CallScala cs=new CallScala();
//				String[] str=new String[1];
//				cs.main(str);
				
				
//				//Object nfr_sfg_jface=window.getSelectedSoftGoalList().get(0);
//				NFRSoftgoal nfr_sfg_emf=new NFRSoftgoalImpl();
//				//BpmnFactory.eINSTANCE.createNFRSoftgoal();
//				System.out.println(nfr_sfg_emf.getName());
//				
//				EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(nfr_sfg_emf);
//			
//				if (!((NFRSoftgoal)nfr_sfg_emf).getParents().isEmpty()){			
//					Command command = SetCommand.create(editingDomain, nfr_sfg_emf, BpmnPackage.eINSTANCE.getNFRSoftgoal().getEStructuralFeature(BpmnPackage.NFR_SOFTGOAL__NAME), 10);		
//					editingDomain.getCommandStack().execute(command);		
//				}	
				
				
			    //JOptionPane.showMessageDialog(null,"Hi there!");
		}catch(Exception e){
			SiriusPlugin.getDefault().error("Error while running KPI method.", e);
		}
	}
	
	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}

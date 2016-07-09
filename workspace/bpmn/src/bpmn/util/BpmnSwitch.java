/**
 */
package bpmn.util;

import bpmn.ANDDecomposition;
import bpmn.AbstractTask;
import bpmn.Activity;
import bpmn.Annotation;
import bpmn.Artifact;
import bpmn.BPMNRootElement;
import bpmn.BigQuery;
import bpmn.BoundaryEvent;
import bpmn.BpmnPackage;
import bpmn.Break;
import bpmn.BusinessConcepts;
import bpmn.BusinessGoal;
import bpmn.BusinessProcessGoal;
import bpmn.BusinessRulesTask;
import bpmn.CatchEvent;
import bpmn.CausalAttribution;
import bpmn.ClaimSoftsolution;
import bpmn.ComplexGateway;
import bpmn.ConnectingObject;
import bpmn.Contribution;
import bpmn.DataAssociation;
import bpmn.DataInput;
import bpmn.DataObject;
import bpmn.DataOutput;
import bpmn.Decomposition;
import bpmn.EQLDecomposition;
import bpmn.EndEvent;
import bpmn.EvenbasedGateway;
import bpmn.Event;
import bpmn.EventDefinition;
import bpmn.ExclusiveGateway;
import bpmn.FlowObject;
import bpmn.Gateway;
import bpmn.Goal;
import bpmn.GraphcialObject;
import bpmn.Group;
import bpmn.Help;
import bpmn.Hurt;
import bpmn.InclusiveGateway;
import bpmn.IntermediateCatchEvent;
import bpmn.IntermediateEndEvent;
import bpmn.KPI;
import bpmn.KPIGoal;
import bpmn.Lane;
import bpmn.Make;
import bpmn.ManualTask;
import bpmn.Message;
import bpmn.MessageFlow;
import bpmn.Multiple;
import bpmn.NFRSoftsolution;
import bpmn.NegativeSatisficing;
import bpmn.None;
import bpmn.ORDecomposition;
import bpmn.OperationalizingSoftsolution;
import bpmn.ParallelGateway;
import bpmn.PhenomenonType;
import bpmn.Pool;
import bpmn.PositiveSatisficing;
import bpmn.ReceiveTask;
import bpmn.Satisficing;
import bpmn.SendTask;
import bpmn.SequenceFlow;
import bpmn.ServiceTask;
import bpmn.SoftProblem;
import bpmn.SoftSolution;
import bpmn.SomeMinus;
import bpmn.SomePlus;
import bpmn.StartEvent;
import bpmn.SubProcess;
import bpmn.Swimlane;
import bpmn.Task;
import bpmn.ThrowEvent;
import bpmn.Timer;
import bpmn.UndesirableOperationalization;
import bpmn.UndesirableSituation;
import bpmn.UserTask;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see bpmn.BpmnPackage
 * @generated
 */
public class BpmnSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BpmnPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnSwitch() {
		if (modelPackage == null) {
			modelPackage = BpmnPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BpmnPackage.COMPLEX_GATEWAY: {
				ComplexGateway complexGateway = (ComplexGateway)theEObject;
				T result = caseComplexGateway(complexGateway);
				if (result == null) result = caseGateway(complexGateway);
				if (result == null) result = caseFlowObject(complexGateway);
				if (result == null) result = caseGraphcialObject(complexGateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.RECEIVE_TASK: {
				ReceiveTask receiveTask = (ReceiveTask)theEObject;
				T result = caseReceiveTask(receiveTask);
				if (result == null) result = caseAbstractTask(receiveTask);
				if (result == null) result = caseActivity(receiveTask);
				if (result == null) result = caseFlowObject(receiveTask);
				if (result == null) result = caseGraphcialObject(receiveTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.MANUAL_TASK: {
				ManualTask manualTask = (ManualTask)theEObject;
				T result = caseManualTask(manualTask);
				if (result == null) result = caseAbstractTask(manualTask);
				if (result == null) result = caseActivity(manualTask);
				if (result == null) result = caseFlowObject(manualTask);
				if (result == null) result = caseGraphcialObject(manualTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.GATEWAY: {
				Gateway gateway = (Gateway)theEObject;
				T result = caseGateway(gateway);
				if (result == null) result = caseFlowObject(gateway);
				if (result == null) result = caseGraphcialObject(gateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.POOL: {
				Pool pool = (Pool)theEObject;
				T result = casePool(pool);
				if (result == null) result = caseSwimlane(pool);
				if (result == null) result = caseGraphcialObject(pool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseFlowObject(event);
				if (result == null) result = caseGraphcialObject(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.ARTIFACT: {
				Artifact artifact = (Artifact)theEObject;
				T result = caseArtifact(artifact);
				if (result == null) result = caseGraphcialObject(artifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.NFR_SOFTSOLUTION: {
				NFRSoftsolution nfrSoftsolution = (NFRSoftsolution)theEObject;
				T result = caseNFRSoftsolution(nfrSoftsolution);
				if (result == null) result = caseSoftSolution(nfrSoftsolution);
				if (result == null) result = casePhenomenonType(nfrSoftsolution);
				if (result == null) result = caseBusinessConcepts(nfrSoftsolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.DECOMPOSITION: {
				Decomposition decomposition = (Decomposition)theEObject;
				T result = caseDecomposition(decomposition);
				if (result == null) result = caseContribution(decomposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.INCLUSIVE_GATEWAY: {
				InclusiveGateway inclusiveGateway = (InclusiveGateway)theEObject;
				T result = caseInclusiveGateway(inclusiveGateway);
				if (result == null) result = caseGateway(inclusiveGateway);
				if (result == null) result = caseFlowObject(inclusiveGateway);
				if (result == null) result = caseGraphcialObject(inclusiveGateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.SOME_PLUS: {
				SomePlus somePlus = (SomePlus)theEObject;
				T result = caseSomePlus(somePlus);
				if (result == null) result = casePositiveSatisficing(somePlus);
				if (result == null) result = caseSatisficing(somePlus);
				if (result == null) result = caseContribution(somePlus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.AND_DECOMPOSITION: {
				ANDDecomposition andDecomposition = (ANDDecomposition)theEObject;
				T result = caseANDDecomposition(andDecomposition);
				if (result == null) result = caseDecomposition(andDecomposition);
				if (result == null) result = caseContribution(andDecomposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseFlowObject(activity);
				if (result == null) result = caseGraphcialObject(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.SWIMLANE: {
				Swimlane swimlane = (Swimlane)theEObject;
				T result = caseSwimlane(swimlane);
				if (result == null) result = caseGraphcialObject(swimlane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.CLAIM_SOFTSOLUTION: {
				ClaimSoftsolution claimSoftsolution = (ClaimSoftsolution)theEObject;
				T result = caseClaimSoftsolution(claimSoftsolution);
				if (result == null) result = caseSoftSolution(claimSoftsolution);
				if (result == null) result = casePhenomenonType(claimSoftsolution);
				if (result == null) result = caseBusinessConcepts(claimSoftsolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.PARALLEL_GATEWAY: {
				ParallelGateway parallelGateway = (ParallelGateway)theEObject;
				T result = caseParallelGateway(parallelGateway);
				if (result == null) result = caseGateway(parallelGateway);
				if (result == null) result = caseFlowObject(parallelGateway);
				if (result == null) result = caseGraphcialObject(parallelGateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.SATISFICING: {
				Satisficing satisficing = (Satisficing)theEObject;
				T result = caseSatisficing(satisficing);
				if (result == null) result = caseContribution(satisficing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.EXCLUSIVE_GATEWAY: {
				ExclusiveGateway exclusiveGateway = (ExclusiveGateway)theEObject;
				T result = caseExclusiveGateway(exclusiveGateway);
				if (result == null) result = caseGateway(exclusiveGateway);
				if (result == null) result = caseFlowObject(exclusiveGateway);
				if (result == null) result = caseGraphcialObject(exclusiveGateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.DATA_OBJECT: {
				DataObject dataObject = (DataObject)theEObject;
				T result = caseDataObject(dataObject);
				if (result == null) result = caseArtifact(dataObject);
				if (result == null) result = caseGraphcialObject(dataObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.LANE: {
				Lane lane = (Lane)theEObject;
				T result = caseLane(lane);
				if (result == null) result = caseSwimlane(lane);
				if (result == null) result = caseGraphcialObject(lane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.FLOW_OBJECT: {
				FlowObject flowObject = (FlowObject)theEObject;
				T result = caseFlowObject(flowObject);
				if (result == null) result = caseGraphcialObject(flowObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.SEND_TASK: {
				SendTask sendTask = (SendTask)theEObject;
				T result = caseSendTask(sendTask);
				if (result == null) result = caseAbstractTask(sendTask);
				if (result == null) result = caseActivity(sendTask);
				if (result == null) result = caseFlowObject(sendTask);
				if (result == null) result = caseGraphcialObject(sendTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.GROUP: {
				Group group = (Group)theEObject;
				T result = caseGroup(group);
				if (result == null) result = caseArtifact(group);
				if (result == null) result = caseGraphcialObject(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.OPERATIONALIZING_SOFTSOLUTION: {
				OperationalizingSoftsolution operationalizingSoftsolution = (OperationalizingSoftsolution)theEObject;
				T result = caseOperationalizingSoftsolution(operationalizingSoftsolution);
				if (result == null) result = caseSoftSolution(operationalizingSoftsolution);
				if (result == null) result = casePhenomenonType(operationalizingSoftsolution);
				if (result == null) result = caseBusinessConcepts(operationalizingSoftsolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.THROW_EVENT: {
				ThrowEvent throwEvent = (ThrowEvent)theEObject;
				T result = caseThrowEvent(throwEvent);
				if (result == null) result = caseEvent(throwEvent);
				if (result == null) result = caseFlowObject(throwEvent);
				if (result == null) result = caseGraphcialObject(throwEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.ABSTRACT_TASK: {
				AbstractTask abstractTask = (AbstractTask)theEObject;
				T result = caseAbstractTask(abstractTask);
				if (result == null) result = caseActivity(abstractTask);
				if (result == null) result = caseFlowObject(abstractTask);
				if (result == null) result = caseGraphcialObject(abstractTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.SOME_MINUS: {
				SomeMinus someMinus = (SomeMinus)theEObject;
				T result = caseSomeMinus(someMinus);
				if (result == null) result = caseNegativeSatisficing(someMinus);
				if (result == null) result = caseSatisficing(someMinus);
				if (result == null) result = caseContribution(someMinus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.HELP: {
				Help help = (Help)theEObject;
				T result = caseHelp(help);
				if (result == null) result = casePositiveSatisficing(help);
				if (result == null) result = caseSatisficing(help);
				if (result == null) result = caseContribution(help);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.BUSINESS_RULES_TASK: {
				BusinessRulesTask businessRulesTask = (BusinessRulesTask)theEObject;
				T result = caseBusinessRulesTask(businessRulesTask);
				if (result == null) result = caseAbstractTask(businessRulesTask);
				if (result == null) result = caseActivity(businessRulesTask);
				if (result == null) result = caseFlowObject(businessRulesTask);
				if (result == null) result = caseGraphcialObject(businessRulesTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = caseArtifact(annotation);
				if (result == null) result = caseGraphcialObject(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.HURT: {
				Hurt hurt = (Hurt)theEObject;
				T result = caseHurt(hurt);
				if (result == null) result = caseNegativeSatisficing(hurt);
				if (result == null) result = caseSatisficing(hurt);
				if (result == null) result = caseContribution(hurt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.SEQUENCE_FLOW: {
				SequenceFlow sequenceFlow = (SequenceFlow)theEObject;
				T result = caseSequenceFlow(sequenceFlow);
				if (result == null) result = caseConnectingObject(sequenceFlow);
				if (result == null) result = caseGraphcialObject(sequenceFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.POSITIVE_SATISFICING: {
				PositiveSatisficing positiveSatisficing = (PositiveSatisficing)theEObject;
				T result = casePositiveSatisficing(positiveSatisficing);
				if (result == null) result = caseSatisficing(positiveSatisficing);
				if (result == null) result = caseContribution(positiveSatisficing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.EQL_DECOMPOSITION: {
				EQLDecomposition eqlDecomposition = (EQLDecomposition)theEObject;
				T result = caseEQLDecomposition(eqlDecomposition);
				if (result == null) result = caseDecomposition(eqlDecomposition);
				if (result == null) result = caseContribution(eqlDecomposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.BREAK: {
				Break break_ = (Break)theEObject;
				T result = caseBreak(break_);
				if (result == null) result = caseNegativeSatisficing(break_);
				if (result == null) result = caseSatisficing(break_);
				if (result == null) result = caseContribution(break_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.CONNECTING_OBJECT: {
				ConnectingObject connectingObject = (ConnectingObject)theEObject;
				T result = caseConnectingObject(connectingObject);
				if (result == null) result = caseGraphcialObject(connectingObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.CATCH_EVENT: {
				CatchEvent catchEvent = (CatchEvent)theEObject;
				T result = caseCatchEvent(catchEvent);
				if (result == null) result = caseEvent(catchEvent);
				if (result == null) result = caseFlowObject(catchEvent);
				if (result == null) result = caseGraphcialObject(catchEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.BPMN_ROOT_ELEMENT: {
				BPMNRootElement bpmnRootElement = (BPMNRootElement)theEObject;
				T result = caseBPMNRootElement(bpmnRootElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.MAKE: {
				Make make = (Make)theEObject;
				T result = caseMake(make);
				if (result == null) result = casePositiveSatisficing(make);
				if (result == null) result = caseSatisficing(make);
				if (result == null) result = caseContribution(make);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.NEGATIVE_SATISFICING: {
				NegativeSatisficing negativeSatisficing = (NegativeSatisficing)theEObject;
				T result = caseNegativeSatisficing(negativeSatisficing);
				if (result == null) result = caseSatisficing(negativeSatisficing);
				if (result == null) result = caseContribution(negativeSatisficing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.USER_TASK: {
				UserTask userTask = (UserTask)theEObject;
				T result = caseUserTask(userTask);
				if (result == null) result = caseAbstractTask(userTask);
				if (result == null) result = caseActivity(userTask);
				if (result == null) result = caseFlowObject(userTask);
				if (result == null) result = caseGraphcialObject(userTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.GRAPHCIAL_OBJECT: {
				GraphcialObject graphcialObject = (GraphcialObject)theEObject;
				T result = caseGraphcialObject(graphcialObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.SOFT_SOLUTION: {
				SoftSolution softSolution = (SoftSolution)theEObject;
				T result = caseSoftSolution(softSolution);
				if (result == null) result = casePhenomenonType(softSolution);
				if (result == null) result = caseBusinessConcepts(softSolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.OR_DECOMPOSITION: {
				ORDecomposition orDecomposition = (ORDecomposition)theEObject;
				T result = caseORDecomposition(orDecomposition);
				if (result == null) result = caseDecomposition(orDecomposition);
				if (result == null) result = caseContribution(orDecomposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.SERVICE_TASK: {
				ServiceTask serviceTask = (ServiceTask)theEObject;
				T result = caseServiceTask(serviceTask);
				if (result == null) result = caseAbstractTask(serviceTask);
				if (result == null) result = caseActivity(serviceTask);
				if (result == null) result = caseFlowObject(serviceTask);
				if (result == null) result = caseGraphcialObject(serviceTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.CONTRIBUTION: {
				Contribution contribution = (Contribution)theEObject;
				T result = caseContribution(contribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.PHENOMENON_TYPE: {
				PhenomenonType phenomenonType = (PhenomenonType)theEObject;
				T result = casePhenomenonType(phenomenonType);
				if (result == null) result = caseBusinessConcepts(phenomenonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.SOFT_PROBLEM: {
				SoftProblem softProblem = (SoftProblem)theEObject;
				T result = caseSoftProblem(softProblem);
				if (result == null) result = casePhenomenonType(softProblem);
				if (result == null) result = caseBusinessConcepts(softProblem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.UNDESIRABLE_SITUATION: {
				UndesirableSituation undesirableSituation = (UndesirableSituation)theEObject;
				T result = caseUndesirableSituation(undesirableSituation);
				if (result == null) result = caseSoftProblem(undesirableSituation);
				if (result == null) result = casePhenomenonType(undesirableSituation);
				if (result == null) result = caseBusinessConcepts(undesirableSituation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.UNDESIRABLE_OPERATIONALIZATION: {
				UndesirableOperationalization undesirableOperationalization = (UndesirableOperationalization)theEObject;
				T result = caseUndesirableOperationalization(undesirableOperationalization);
				if (result == null) result = caseSoftProblem(undesirableOperationalization);
				if (result == null) result = casePhenomenonType(undesirableOperationalization);
				if (result == null) result = caseBusinessConcepts(undesirableOperationalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.CAUSAL_ATTRIBUTION: {
				CausalAttribution causalAttribution = (CausalAttribution)theEObject;
				T result = caseCausalAttribution(causalAttribution);
				if (result == null) result = caseSoftProblem(causalAttribution);
				if (result == null) result = casePhenomenonType(causalAttribution);
				if (result == null) result = caseBusinessConcepts(causalAttribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = caseAbstractTask(task);
				if (result == null) result = caseActivity(task);
				if (result == null) result = caseFlowObject(task);
				if (result == null) result = caseGraphcialObject(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.MESSAGE_FLOW: {
				MessageFlow messageFlow = (MessageFlow)theEObject;
				T result = caseMessageFlow(messageFlow);
				if (result == null) result = caseConnectingObject(messageFlow);
				if (result == null) result = caseGraphcialObject(messageFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.SUB_PROCESS: {
				SubProcess subProcess = (SubProcess)theEObject;
				T result = caseSubProcess(subProcess);
				if (result == null) result = caseActivity(subProcess);
				if (result == null) result = caseFlowObject(subProcess);
				if (result == null) result = caseGraphcialObject(subProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = caseEventDefinition(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.TIMER: {
				Timer timer = (Timer)theEObject;
				T result = caseTimer(timer);
				if (result == null) result = caseEventDefinition(timer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.ERROR: {
				bpmn.Error error = (bpmn.Error)theEObject;
				T result = caseError(error);
				if (result == null) result = caseEventDefinition(error);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.MULTIPLE: {
				Multiple multiple = (Multiple)theEObject;
				T result = caseMultiple(multiple);
				if (result == null) result = caseEventDefinition(multiple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.START_EVENT: {
				StartEvent startEvent = (StartEvent)theEObject;
				T result = caseStartEvent(startEvent);
				if (result == null) result = caseCatchEvent(startEvent);
				if (result == null) result = caseEvent(startEvent);
				if (result == null) result = caseFlowObject(startEvent);
				if (result == null) result = caseGraphcialObject(startEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.BOUNDARY_EVENT: {
				BoundaryEvent boundaryEvent = (BoundaryEvent)theEObject;
				T result = caseBoundaryEvent(boundaryEvent);
				if (result == null) result = caseCatchEvent(boundaryEvent);
				if (result == null) result = caseEvent(boundaryEvent);
				if (result == null) result = caseFlowObject(boundaryEvent);
				if (result == null) result = caseGraphcialObject(boundaryEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.EVENT_DEFINITION: {
				EventDefinition eventDefinition = (EventDefinition)theEObject;
				T result = caseEventDefinition(eventDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.NONE: {
				None none = (None)theEObject;
				T result = caseNone(none);
				if (result == null) result = caseEventDefinition(none);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.END_EVENT: {
				EndEvent endEvent = (EndEvent)theEObject;
				T result = caseEndEvent(endEvent);
				if (result == null) result = caseThrowEvent(endEvent);
				if (result == null) result = caseEvent(endEvent);
				if (result == null) result = caseFlowObject(endEvent);
				if (result == null) result = caseGraphcialObject(endEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.EVENBASED_GATEWAY: {
				EvenbasedGateway evenbasedGateway = (EvenbasedGateway)theEObject;
				T result = caseEvenbasedGateway(evenbasedGateway);
				if (result == null) result = caseGateway(evenbasedGateway);
				if (result == null) result = caseFlowObject(evenbasedGateway);
				if (result == null) result = caseGraphcialObject(evenbasedGateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.DATA_INPUT: {
				DataInput dataInput = (DataInput)theEObject;
				T result = caseDataInput(dataInput);
				if (result == null) result = caseDataObject(dataInput);
				if (result == null) result = caseArtifact(dataInput);
				if (result == null) result = caseGraphcialObject(dataInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.DATA_OUTPUT: {
				DataOutput dataOutput = (DataOutput)theEObject;
				T result = caseDataOutput(dataOutput);
				if (result == null) result = caseDataObject(dataOutput);
				if (result == null) result = caseArtifact(dataOutput);
				if (result == null) result = caseGraphcialObject(dataOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.INTERMEDIATE_CATCH_EVENT: {
				IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent)theEObject;
				T result = caseIntermediateCatchEvent(intermediateCatchEvent);
				if (result == null) result = caseCatchEvent(intermediateCatchEvent);
				if (result == null) result = caseEvent(intermediateCatchEvent);
				if (result == null) result = caseFlowObject(intermediateCatchEvent);
				if (result == null) result = caseGraphcialObject(intermediateCatchEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.INTERMEDIATE_END_EVENT: {
				IntermediateEndEvent intermediateEndEvent = (IntermediateEndEvent)theEObject;
				T result = caseIntermediateEndEvent(intermediateEndEvent);
				if (result == null) result = caseThrowEvent(intermediateEndEvent);
				if (result == null) result = caseEvent(intermediateEndEvent);
				if (result == null) result = caseFlowObject(intermediateEndEvent);
				if (result == null) result = caseGraphcialObject(intermediateEndEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.DATA_ASSOCIATION: {
				DataAssociation dataAssociation = (DataAssociation)theEObject;
				T result = caseDataAssociation(dataAssociation);
				if (result == null) result = caseConnectingObject(dataAssociation);
				if (result == null) result = caseGraphcialObject(dataAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.BIG_QUERY: {
				BigQuery bigQuery = (BigQuery)theEObject;
				T result = caseBigQuery(bigQuery);
				if (result == null) result = caseBusinessConcepts(bigQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.KPI_GOAL: {
				KPIGoal kpiGoal = (KPIGoal)theEObject;
				T result = caseKPIGoal(kpiGoal);
				if (result == null) result = caseGoal(kpiGoal);
				if (result == null) result = caseBusinessConcepts(kpiGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.KPI: {
				KPI kpi = (KPI)theEObject;
				T result = caseKPI(kpi);
				if (result == null) result = caseBusinessConcepts(kpi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.BUSINESS_GOAL: {
				BusinessGoal businessGoal = (BusinessGoal)theEObject;
				T result = caseBusinessGoal(businessGoal);
				if (result == null) result = caseGoal(businessGoal);
				if (result == null) result = caseBusinessConcepts(businessGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.BUSINESS_PROCESS_GOAL: {
				BusinessProcessGoal businessProcessGoal = (BusinessProcessGoal)theEObject;
				T result = caseBusinessProcessGoal(businessProcessGoal);
				if (result == null) result = caseGoal(businessProcessGoal);
				if (result == null) result = caseBusinessConcepts(businessProcessGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseBusinessConcepts(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpmnPackage.BUSINESS_CONCEPTS: {
				BusinessConcepts businessConcepts = (BusinessConcepts)theEObject;
				T result = caseBusinessConcepts(businessConcepts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexGateway(ComplexGateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiveTask(ReceiveTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manual Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manual Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManualTask(ManualTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGateway(Gateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePool(Pool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFR Softsolution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFR Softsolution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFRSoftsolution(NFRSoftsolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecomposition(Decomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inclusive Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inclusive Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInclusiveGateway(InclusiveGateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Some Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Some Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSomePlus(SomePlus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AND Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AND Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANDDecomposition(ANDDecomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swimlane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swimlane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwimlane(Swimlane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Softsolution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Softsolution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimSoftsolution(ClaimSoftsolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndEvent(EndEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evenbased Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evenbased Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvenbasedGateway(EvenbasedGateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataInput(DataInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataOutput(DataOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermediate Catch Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermediate Catch Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermediateCatchEvent(IntermediateCatchEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermediate End Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermediate End Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermediateEndEvent(IntermediateEndEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAssociation(DataAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Big Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Big Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBigQuery(BigQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KPI Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KPI Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKPIGoal(KPIGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KPI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KPI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKPI(KPI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessGoal(BusinessGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Process Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Process Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessProcessGoal(BusinessProcessGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Concepts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Concepts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessConcepts(BusinessConcepts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelGateway(ParallelGateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satisficing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satisficing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatisficing(Satisficing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveGateway(ExclusiveGateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataObject(DataObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLane(Lane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowObject(FlowObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendTask(SendTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operationalizing Softsolution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operationalizing Softsolution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalizingSoftsolution(OperationalizingSoftsolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throw Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throw Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrowEvent(ThrowEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTask(AbstractTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageFlow(MessageFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubProcess(SubProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimer(Timer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseError(bpmn.Error object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiple(Multiple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Some Minus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Some Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSomeMinus(SomeMinus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Help</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Help</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHelp(Help object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Rules Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Rules Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessRulesTask(BusinessRulesTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hurt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hurt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHurt(Hurt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceFlow(SequenceFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Satisficing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Satisficing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveSatisficing(PositiveSatisficing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EQL Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EQL Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEQLDecomposition(EQLDecomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Break</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Break</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreak(Break object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connecting Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connecting Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectingObject(ConnectingObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catch Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catch Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatchEvent(CatchEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartEvent(StartEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boundary Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boundary Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundaryEvent(BoundaryEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventDefinition(EventDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>None</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>None</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNone(None object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPMN Root Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BPMN Root Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPMNRootElement(BPMNRootElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Make</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Make</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMake(Make object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Satisficing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Satisficing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeSatisficing(NegativeSatisficing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserTask(UserTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphcial Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphcial Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphcialObject(GraphcialObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Soft Solution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Soft Solution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftSolution(SoftSolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OR Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OR Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseORDecomposition(ORDecomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceTask(ServiceTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContribution(Contribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phenomenon Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phenomenon Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhenomenonType(PhenomenonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Soft Problem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Soft Problem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftProblem(SoftProblem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Undesirable Situation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Undesirable Situation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUndesirableSituation(UndesirableSituation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Undesirable Operationalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Undesirable Operationalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUndesirableOperationalization(UndesirableOperationalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Causal Attribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Causal Attribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCausalAttribution(CausalAttribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BpmnSwitch

/**
 */
package bpmn;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bpmn.BpmnFactory
 * @model kind="package"
 * @generated
 */
public interface BpmnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bpmn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/bpmn";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bpmn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BpmnPackage eINSTANCE = bpmn.impl.BpmnPackageImpl.init();

	/**
	 * The meta object id for the '{@link bpmn.impl.GraphcialObjectImpl <em>Graphcial Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.GraphcialObjectImpl
	 * @see bpmn.impl.BpmnPackageImpl#getGraphcialObject()
	 * @generated
	 */
	int GRAPHCIAL_OBJECT = 41;

	/**
	 * The meta object id for the '{@link bpmn.impl.FlowObjectImpl <em>Flow Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.FlowObjectImpl
	 * @see bpmn.impl.BpmnPackageImpl#getFlowObject()
	 * @generated
	 */
	int FLOW_OBJECT = 20;

	/**
	 * The meta object id for the '{@link bpmn.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.GatewayImpl
	 * @see bpmn.impl.BpmnPackageImpl#getGateway()
	 * @generated
	 */
	int GATEWAY = 3;

	/**
	 * The meta object id for the '{@link bpmn.impl.ComplexGatewayImpl <em>Complex Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.ComplexGatewayImpl
	 * @see bpmn.impl.BpmnPackageImpl#getComplexGateway()
	 * @generated
	 */
	int COMPLEX_GATEWAY = 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.ActivityImpl
	 * @see bpmn.impl.BpmnPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 12;

	/**
	 * The meta object id for the '{@link bpmn.impl.AbstractTaskImpl <em>Abstract Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.AbstractTaskImpl
	 * @see bpmn.impl.BpmnPackageImpl#getAbstractTask()
	 * @generated
	 */
	int ABSTRACT_TASK = 25;

	/**
	 * The meta object id for the '{@link bpmn.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.TaskImpl
	 * @see bpmn.impl.BpmnPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 51;

	/**
	 * The meta object id for the '{@link bpmn.impl.ReceiveTaskImpl <em>Receive Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.ReceiveTaskImpl
	 * @see bpmn.impl.BpmnPackageImpl#getReceiveTask()
	 * @generated
	 */
	int RECEIVE_TASK = 1;

	/**
	 * The meta object id for the '{@link bpmn.impl.ManualTaskImpl <em>Manual Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.ManualTaskImpl
	 * @see bpmn.impl.BpmnPackageImpl#getManualTask()
	 * @generated
	 */
	int MANUAL_TASK = 2;

	/**
	 * The meta object id for the '{@link bpmn.impl.SwimlaneImpl <em>Swimlane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.SwimlaneImpl
	 * @see bpmn.impl.BpmnPackageImpl#getSwimlane()
	 * @generated
	 */
	int SWIMLANE = 13;

	/**
	 * The meta object id for the '{@link bpmn.impl.PoolImpl <em>Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.PoolImpl
	 * @see bpmn.impl.BpmnPackageImpl#getPool()
	 * @generated
	 */
	int POOL = 4;

	/**
	 * The meta object id for the '{@link bpmn.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.EventImpl
	 * @see bpmn.impl.BpmnPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 5;

	/**
	 * The meta object id for the '{@link bpmn.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.ArtifactImpl
	 * @see bpmn.impl.BpmnPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 6;

	/**
	 * The meta object id for the '{@link bpmn.impl.PhenomenonTypeImpl <em>Phenomenon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.PhenomenonTypeImpl
	 * @see bpmn.impl.BpmnPackageImpl#getPhenomenonType()
	 * @generated
	 */
	int PHENOMENON_TYPE = 46;

	/**
	 * The meta object id for the '{@link bpmn.impl.SoftSolutionImpl <em>Soft Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.SoftSolutionImpl
	 * @see bpmn.impl.BpmnPackageImpl#getSoftSolution()
	 * @generated
	 */
	int SOFT_SOLUTION = 42;

	/**
	 * The meta object id for the '{@link bpmn.impl.NFRSoftsolutionImpl <em>NFR Softsolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.NFRSoftsolutionImpl
	 * @see bpmn.impl.BpmnPackageImpl#getNFRSoftsolution()
	 * @generated
	 */
	int NFR_SOFTSOLUTION = 7;

	/**
	 * The meta object id for the '{@link bpmn.impl.ContributionImpl <em>Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.ContributionImpl
	 * @see bpmn.impl.BpmnPackageImpl#getContribution()
	 * @generated
	 */
	int CONTRIBUTION = 45;

	/**
	 * The meta object id for the '{@link bpmn.impl.DecompositionImpl <em>Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.DecompositionImpl
	 * @see bpmn.impl.BpmnPackageImpl#getDecomposition()
	 * @generated
	 */
	int DECOMPOSITION = 8;

	/**
	 * The meta object id for the '{@link bpmn.impl.InclusiveGatewayImpl <em>Inclusive Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.InclusiveGatewayImpl
	 * @see bpmn.impl.BpmnPackageImpl#getInclusiveGateway()
	 * @generated
	 */
	int INCLUSIVE_GATEWAY = 9;

	/**
	 * The meta object id for the '{@link bpmn.impl.SatisficingImpl <em>Satisficing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.SatisficingImpl
	 * @see bpmn.impl.BpmnPackageImpl#getSatisficing()
	 * @generated
	 */
	int SATISFICING = 16;

	/**
	 * The meta object id for the '{@link bpmn.impl.PositiveSatisficingImpl <em>Positive Satisficing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.PositiveSatisficingImpl
	 * @see bpmn.impl.BpmnPackageImpl#getPositiveSatisficing()
	 * @generated
	 */
	int POSITIVE_SATISFICING = 32;

	/**
	 * The meta object id for the '{@link bpmn.impl.SomePlusImpl <em>Some Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.SomePlusImpl
	 * @see bpmn.impl.BpmnPackageImpl#getSomePlus()
	 * @generated
	 */
	int SOME_PLUS = 10;

	/**
	 * The meta object id for the '{@link bpmn.impl.ANDDecompositionImpl <em>AND Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.ANDDecompositionImpl
	 * @see bpmn.impl.BpmnPackageImpl#getANDDecomposition()
	 * @generated
	 */
	int AND_DECOMPOSITION = 11;

	/**
	 * The meta object id for the '{@link bpmn.impl.ClaimSoftsolutionImpl <em>Claim Softsolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.ClaimSoftsolutionImpl
	 * @see bpmn.impl.BpmnPackageImpl#getClaimSoftsolution()
	 * @generated
	 */
	int CLAIM_SOFTSOLUTION = 14;

	/**
	 * The meta object id for the '{@link bpmn.impl.EndEventImpl <em>End Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.EndEventImpl
	 * @see bpmn.impl.BpmnPackageImpl#getEndEvent()
	 * @generated
	 */
	int END_EVENT = 62;

	/**
	 * The meta object id for the '{@link bpmn.impl.DataInputImpl <em>Data Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.DataInputImpl
	 * @see bpmn.impl.BpmnPackageImpl#getDataInput()
	 * @generated
	 */
	int DATA_INPUT = 64;

	/**
	 * The meta object id for the '{@link bpmn.impl.DataOutputImpl <em>Data Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.DataOutputImpl
	 * @see bpmn.impl.BpmnPackageImpl#getDataOutput()
	 * @generated
	 */
	int DATA_OUTPUT = 65;

	/**
	 * The meta object id for the '{@link bpmn.impl.ParallelGatewayImpl <em>Parallel Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.ParallelGatewayImpl
	 * @see bpmn.impl.BpmnPackageImpl#getParallelGateway()
	 * @generated
	 */
	int PARALLEL_GATEWAY = 15;

	/**
	 * The meta object id for the '{@link bpmn.impl.ExclusiveGatewayImpl <em>Exclusive Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.ExclusiveGatewayImpl
	 * @see bpmn.impl.BpmnPackageImpl#getExclusiveGateway()
	 * @generated
	 */
	int EXCLUSIVE_GATEWAY = 17;

	/**
	 * The meta object id for the '{@link bpmn.impl.DataObjectImpl <em>Data Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.DataObjectImpl
	 * @see bpmn.impl.BpmnPackageImpl#getDataObject()
	 * @generated
	 */
	int DATA_OBJECT = 18;

	/**
	 * The meta object id for the '{@link bpmn.impl.LaneImpl <em>Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.LaneImpl
	 * @see bpmn.impl.BpmnPackageImpl#getLane()
	 * @generated
	 */
	int LANE = 19;

	/**
	 * The meta object id for the '{@link bpmn.impl.SendTaskImpl <em>Send Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.SendTaskImpl
	 * @see bpmn.impl.BpmnPackageImpl#getSendTask()
	 * @generated
	 */
	int SEND_TASK = 21;

	/**
	 * The meta object id for the '{@link bpmn.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.GroupImpl
	 * @see bpmn.impl.BpmnPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 22;

	/**
	 * The meta object id for the '{@link bpmn.impl.OperationalizingSoftsolutionImpl <em>Operationalizing Softsolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.OperationalizingSoftsolutionImpl
	 * @see bpmn.impl.BpmnPackageImpl#getOperationalizingSoftsolution()
	 * @generated
	 */
	int OPERATIONALIZING_SOFTSOLUTION = 23;

	/**
	 * The meta object id for the '{@link bpmn.impl.ThrowEventImpl <em>Throw Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.ThrowEventImpl
	 * @see bpmn.impl.BpmnPackageImpl#getThrowEvent()
	 * @generated
	 */
	int THROW_EVENT = 24;

	/**
	 * The meta object id for the '{@link bpmn.impl.NegativeSatisficingImpl <em>Negative Satisficing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.NegativeSatisficingImpl
	 * @see bpmn.impl.BpmnPackageImpl#getNegativeSatisficing()
	 * @generated
	 */
	int NEGATIVE_SATISFICING = 39;

	/**
	 * The meta object id for the '{@link bpmn.impl.SomeMinusImpl <em>Some Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.SomeMinusImpl
	 * @see bpmn.impl.BpmnPackageImpl#getSomeMinus()
	 * @generated
	 */
	int SOME_MINUS = 26;

	/**
	 * The meta object id for the '{@link bpmn.impl.HelpImpl <em>Help</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.HelpImpl
	 * @see bpmn.impl.BpmnPackageImpl#getHelp()
	 * @generated
	 */
	int HELP = 27;

	/**
	 * The meta object id for the '{@link bpmn.impl.BusinessRulesTaskImpl <em>Business Rules Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.BusinessRulesTaskImpl
	 * @see bpmn.impl.BpmnPackageImpl#getBusinessRulesTask()
	 * @generated
	 */
	int BUSINESS_RULES_TASK = 28;

	/**
	 * The meta object id for the '{@link bpmn.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.AnnotationImpl
	 * @see bpmn.impl.BpmnPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 29;

	/**
	 * The meta object id for the '{@link bpmn.impl.HurtImpl <em>Hurt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.HurtImpl
	 * @see bpmn.impl.BpmnPackageImpl#getHurt()
	 * @generated
	 */
	int HURT = 30;

	/**
	 * The meta object id for the '{@link bpmn.impl.ConnectingObjectImpl <em>Connecting Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.ConnectingObjectImpl
	 * @see bpmn.impl.BpmnPackageImpl#getConnectingObject()
	 * @generated
	 */
	int CONNECTING_OBJECT = 35;

	/**
	 * The meta object id for the '{@link bpmn.impl.SequenceFlowImpl <em>Sequence Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.SequenceFlowImpl
	 * @see bpmn.impl.BpmnPackageImpl#getSequenceFlow()
	 * @generated
	 */
	int SEQUENCE_FLOW = 31;

	/**
	 * The meta object id for the '{@link bpmn.impl.EQLDecompositionImpl <em>EQL Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.EQLDecompositionImpl
	 * @see bpmn.impl.BpmnPackageImpl#getEQLDecomposition()
	 * @generated
	 */
	int EQL_DECOMPOSITION = 33;

	/**
	 * The meta object id for the '{@link bpmn.impl.BreakImpl <em>Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.BreakImpl
	 * @see bpmn.impl.BpmnPackageImpl#getBreak()
	 * @generated
	 */
	int BREAK = 34;

	/**
	 * The meta object id for the '{@link bpmn.impl.CatchEventImpl <em>Catch Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.CatchEventImpl
	 * @see bpmn.impl.BpmnPackageImpl#getCatchEvent()
	 * @generated
	 */
	int CATCH_EVENT = 36;

	/**
	 * The meta object id for the '{@link bpmn.impl.StartEventImpl <em>Start Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.StartEventImpl
	 * @see bpmn.impl.BpmnPackageImpl#getStartEvent()
	 * @generated
	 */
	int START_EVENT = 58;

	/**
	 * The meta object id for the '{@link bpmn.impl.BoundaryEventImpl <em>Boundary Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.BoundaryEventImpl
	 * @see bpmn.impl.BpmnPackageImpl#getBoundaryEvent()
	 * @generated
	 */
	int BOUNDARY_EVENT = 59;

	/**
	 * The meta object id for the '{@link bpmn.impl.NoneImpl <em>None</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.NoneImpl
	 * @see bpmn.impl.BpmnPackageImpl#getNone()
	 * @generated
	 */
	int NONE = 61;

	/**
	 * The meta object id for the '{@link bpmn.impl.BPMNRootElementImpl <em>BPMN Root Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.BPMNRootElementImpl
	 * @see bpmn.impl.BpmnPackageImpl#getBPMNRootElement()
	 * @generated
	 */
	int BPMN_ROOT_ELEMENT = 37;

	/**
	 * The meta object id for the '{@link bpmn.impl.MakeImpl <em>Make</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.MakeImpl
	 * @see bpmn.impl.BpmnPackageImpl#getMake()
	 * @generated
	 */
	int MAKE = 38;

	/**
	 * The meta object id for the '{@link bpmn.impl.UserTaskImpl <em>User Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.UserTaskImpl
	 * @see bpmn.impl.BpmnPackageImpl#getUserTask()
	 * @generated
	 */
	int USER_TASK = 40;

	/**
	 * The meta object id for the '{@link bpmn.impl.ORDecompositionImpl <em>OR Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.ORDecompositionImpl
	 * @see bpmn.impl.BpmnPackageImpl#getORDecomposition()
	 * @generated
	 */
	int OR_DECOMPOSITION = 43;

	/**
	 * The meta object id for the '{@link bpmn.impl.ServiceTaskImpl <em>Service Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.ServiceTaskImpl
	 * @see bpmn.impl.BpmnPackageImpl#getServiceTask()
	 * @generated
	 */
	int SERVICE_TASK = 44;

	/**
	 * The meta object id for the '{@link bpmn.impl.SoftProblemImpl <em>Soft Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.SoftProblemImpl
	 * @see bpmn.impl.BpmnPackageImpl#getSoftProblem()
	 * @generated
	 */
	int SOFT_PROBLEM = 47;

	/**
	 * The meta object id for the '{@link bpmn.impl.UndesirableSituationImpl <em>Undesirable Situation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.UndesirableSituationImpl
	 * @see bpmn.impl.BpmnPackageImpl#getUndesirableSituation()
	 * @generated
	 */
	int UNDESIRABLE_SITUATION = 48;

	/**
	 * The meta object id for the '{@link bpmn.impl.UndesirableOperationalizationImpl <em>Undesirable Operationalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.UndesirableOperationalizationImpl
	 * @see bpmn.impl.BpmnPackageImpl#getUndesirableOperationalization()
	 * @generated
	 */
	int UNDESIRABLE_OPERATIONALIZATION = 49;

	/**
	 * The meta object id for the '{@link bpmn.impl.CausalAttributionImpl <em>Causal Attribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.CausalAttributionImpl
	 * @see bpmn.impl.BpmnPackageImpl#getCausalAttribution()
	 * @generated
	 */
	int CAUSAL_ATTRIBUTION = 50;

	/**
	 * The meta object id for the '{@link bpmn.impl.MessageFlowImpl <em>Message Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.MessageFlowImpl
	 * @see bpmn.impl.BpmnPackageImpl#getMessageFlow()
	 * @generated
	 */
	int MESSAGE_FLOW = 52;

	/**
	 * The meta object id for the '{@link bpmn.impl.SubProcessImpl <em>Sub Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.SubProcessImpl
	 * @see bpmn.impl.BpmnPackageImpl#getSubProcess()
	 * @generated
	 */
	int SUB_PROCESS = 53;

	/**
	 * The meta object id for the '{@link bpmn.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.EventDefinitionImpl
	 * @see bpmn.impl.BpmnPackageImpl#getEventDefinition()
	 * @generated
	 */
	int EVENT_DEFINITION = 60;

	/**
	 * The meta object id for the '{@link bpmn.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.MessageImpl
	 * @see bpmn.impl.BpmnPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 54;

	/**
	 * The meta object id for the '{@link bpmn.impl.TimerImpl <em>Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.TimerImpl
	 * @see bpmn.impl.BpmnPackageImpl#getTimer()
	 * @generated
	 */
	int TIMER = 55;

	/**
	 * The meta object id for the '{@link bpmn.impl.ErrorImpl <em>Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.ErrorImpl
	 * @see bpmn.impl.BpmnPackageImpl#getError()
	 * @generated
	 */
	int ERROR = 56;

	/**
	 * The meta object id for the '{@link bpmn.impl.MultipleImpl <em>Multiple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.MultipleImpl
	 * @see bpmn.impl.BpmnPackageImpl#getMultiple()
	 * @generated
	 */
	int MULTIPLE = 57;

	/**
	 * The meta object id for the '{@link bpmn.impl.EvenbasedGatewayImpl <em>Evenbased Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.EvenbasedGatewayImpl
	 * @see bpmn.impl.BpmnPackageImpl#getEvenbasedGateway()
	 * @generated
	 */
	int EVENBASED_GATEWAY = 63;

	/**
	 * The meta object id for the '{@link bpmn.impl.IntermediateCatchEventImpl <em>Intermediate Catch Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.IntermediateCatchEventImpl
	 * @see bpmn.impl.BpmnPackageImpl#getIntermediateCatchEvent()
	 * @generated
	 */
	int INTERMEDIATE_CATCH_EVENT = 66;

	/**
	 * The meta object id for the '{@link bpmn.impl.IntermediateEndEventImpl <em>Intermediate End Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.IntermediateEndEventImpl
	 * @see bpmn.impl.BpmnPackageImpl#getIntermediateEndEvent()
	 * @generated
	 */
	int INTERMEDIATE_END_EVENT = 67;

	/**
	 * The meta object id for the '{@link bpmn.impl.DataAssociationImpl <em>Data Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.DataAssociationImpl
	 * @see bpmn.impl.BpmnPackageImpl#getDataAssociation()
	 * @generated
	 */
	int DATA_ASSOCIATION = 68;

	/**
	 * The meta object id for the '{@link bpmn.impl.BusinessConceptsImpl <em>Business Concepts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.BusinessConceptsImpl
	 * @see bpmn.impl.BpmnPackageImpl#getBusinessConcepts()
	 * @generated
	 */
	int BUSINESS_CONCEPTS = 75;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHCIAL_OBJECT__ARTIFACT = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHCIAL_OBJECT__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHCIAL_OBJECT__BUSINESSCONCEPTS_PARENT = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHCIAL_OBJECT__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHCIAL_OBJECT__NAME = 4;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT = 5;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHCIAL_OBJECT__CONTRIB_TYPE_TO_PARENTS = 6;

	/**
	 * The number of structural features of the '<em>Graphcial Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHCIAL_OBJECT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Graphcial Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHCIAL_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OBJECT__ARTIFACT = GRAPHCIAL_OBJECT__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OBJECT__LABEL = GRAPHCIAL_OBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OBJECT__BUSINESSCONCEPTS_PARENT = GRAPHCIAL_OBJECT__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OBJECT__TYPE = GRAPHCIAL_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OBJECT__NAME = GRAPHCIAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OBJECT__LOCAL_BUSINESS_CONCEPT = GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OBJECT__CONTRIB_TYPE_TO_PARENTS = GRAPHCIAL_OBJECT__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OBJECT__SEQUENCE_FLOWS = GRAPHCIAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Flow Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OBJECT_FEATURE_COUNT = GRAPHCIAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Flow Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OBJECT_OPERATION_COUNT = GRAPHCIAL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__ARTIFACT = FLOW_OBJECT__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__LABEL = FLOW_OBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__BUSINESSCONCEPTS_PARENT = FLOW_OBJECT__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__TYPE = FLOW_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NAME = FLOW_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__LOCAL_BUSINESS_CONCEPT = FLOW_OBJECT__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__CONTRIB_TYPE_TO_PARENTS = FLOW_OBJECT__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__SEQUENCE_FLOWS = FLOW_OBJECT__SEQUENCE_FLOWS;

	/**
	 * The number of structural features of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_FEATURE_COUNT = FLOW_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_OPERATION_COUNT = FLOW_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__ARTIFACT = GATEWAY__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__LABEL = GATEWAY__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__BUSINESSCONCEPTS_PARENT = GATEWAY__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__TYPE = GATEWAY__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__NAME = GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__LOCAL_BUSINESS_CONCEPT = GATEWAY__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__CONTRIB_TYPE_TO_PARENTS = GATEWAY__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__SEQUENCE_FLOWS = GATEWAY__SEQUENCE_FLOWS;

	/**
	 * The number of structural features of the '<em>Complex Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Complex Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY_OPERATION_COUNT = GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ARTIFACT = FLOW_OBJECT__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LABEL = FLOW_OBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__BUSINESSCONCEPTS_PARENT = FLOW_OBJECT__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TYPE = FLOW_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = FLOW_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LOCAL_BUSINESS_CONCEPT = FLOW_OBJECT__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CONTRIB_TYPE_TO_PARENTS = FLOW_OBJECT__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SEQUENCE_FLOWS = FLOW_OBJECT__SEQUENCE_FLOWS;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__BOUNDARY_EVENT_REFS = FLOW_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = FLOW_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = FLOW_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__ARTIFACT = ACTIVITY__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__LABEL = ACTIVITY__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__BUSINESSCONCEPTS_PARENT = ACTIVITY__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__TYPE = ACTIVITY__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__LOCAL_BUSINESS_CONCEPT = ACTIVITY__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__CONTRIB_TYPE_TO_PARENTS = ACTIVITY__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__SEQUENCE_FLOWS = ACTIVITY__SEQUENCE_FLOWS;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__BOUNDARY_EVENT_REFS = ACTIVITY__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Task Boundary Event Refs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__TASK_BOUNDARY_EVENT_REFS = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__ARTIFACT = ABSTRACT_TASK__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__LABEL = ABSTRACT_TASK__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__BUSINESSCONCEPTS_PARENT = ABSTRACT_TASK__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__TYPE = ABSTRACT_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__NAME = ABSTRACT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__LOCAL_BUSINESS_CONCEPT = ABSTRACT_TASK__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__CONTRIB_TYPE_TO_PARENTS = ABSTRACT_TASK__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__SEQUENCE_FLOWS = ABSTRACT_TASK__SEQUENCE_FLOWS;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__BOUNDARY_EVENT_REFS = ABSTRACT_TASK__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Task Boundary Event Refs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__TASK_BOUNDARY_EVENT_REFS = ABSTRACT_TASK__TASK_BOUNDARY_EVENT_REFS;

	/**
	 * The number of structural features of the '<em>Receive Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK_FEATURE_COUNT = ABSTRACT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Receive Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK_OPERATION_COUNT = ABSTRACT_TASK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__ARTIFACT = ABSTRACT_TASK__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__LABEL = ABSTRACT_TASK__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__BUSINESSCONCEPTS_PARENT = ABSTRACT_TASK__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__TYPE = ABSTRACT_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__NAME = ABSTRACT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__LOCAL_BUSINESS_CONCEPT = ABSTRACT_TASK__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__CONTRIB_TYPE_TO_PARENTS = ABSTRACT_TASK__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__SEQUENCE_FLOWS = ABSTRACT_TASK__SEQUENCE_FLOWS;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__BOUNDARY_EVENT_REFS = ABSTRACT_TASK__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Task Boundary Event Refs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__TASK_BOUNDARY_EVENT_REFS = ABSTRACT_TASK__TASK_BOUNDARY_EVENT_REFS;

	/**
	 * The number of structural features of the '<em>Manual Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK_FEATURE_COUNT = ABSTRACT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Manual Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK_OPERATION_COUNT = ABSTRACT_TASK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIMLANE__ARTIFACT = GRAPHCIAL_OBJECT__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIMLANE__LABEL = GRAPHCIAL_OBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIMLANE__BUSINESSCONCEPTS_PARENT = GRAPHCIAL_OBJECT__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIMLANE__TYPE = GRAPHCIAL_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIMLANE__NAME = GRAPHCIAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIMLANE__LOCAL_BUSINESS_CONCEPT = GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIMLANE__CONTRIB_TYPE_TO_PARENTS = GRAPHCIAL_OBJECT__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The number of structural features of the '<em>Swimlane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIMLANE_FEATURE_COUNT = GRAPHCIAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Swimlane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIMLANE_OPERATION_COUNT = GRAPHCIAL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__ARTIFACT = SWIMLANE__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__LABEL = SWIMLANE__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__BUSINESSCONCEPTS_PARENT = SWIMLANE__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__TYPE = SWIMLANE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__NAME = SWIMLANE__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__LOCAL_BUSINESS_CONCEPT = SWIMLANE__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__CONTRIB_TYPE_TO_PARENTS = SWIMLANE__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Contain Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__CONTAIN_LANE = SWIMLANE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_FEATURE_COUNT = SWIMLANE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_OPERATION_COUNT = SWIMLANE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ARTIFACT = FLOW_OBJECT__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__LABEL = FLOW_OBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__BUSINESSCONCEPTS_PARENT = FLOW_OBJECT__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TYPE = FLOW_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = FLOW_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__LOCAL_BUSINESS_CONCEPT = FLOW_OBJECT__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONTRIB_TYPE_TO_PARENTS = FLOW_OBJECT__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SEQUENCE_FLOWS = FLOW_OBJECT__SEQUENCE_FLOWS;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = FLOW_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = FLOW_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ARTIFACT = GRAPHCIAL_OBJECT__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__LABEL = GRAPHCIAL_OBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__BUSINESSCONCEPTS_PARENT = GRAPHCIAL_OBJECT__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__TYPE = GRAPHCIAL_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = GRAPHCIAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__LOCAL_BUSINESS_CONCEPT = GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__CONTRIB_TYPE_TO_PARENTS = GRAPHCIAL_OBJECT__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__CONTRIB_TYPE_TO_PARENT = GRAPHCIAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = GRAPHCIAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = GRAPHCIAL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONCEPTS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONCEPTS__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONCEPTS__CHILD = 2;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONCEPTS__CONTRIB_TYPE_TO_PARENTS = 3;

	/**
	 * The feature id for the '<em><b>Topic Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONCEPTS__TOPIC_CHILD = 4;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONCEPTS__TOPIC = 5;

	/**
	 * The number of structural features of the '<em>Business Concepts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONCEPTS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Business Concepts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONCEPTS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHENOMENON_TYPE__NAME = BUSINESS_CONCEPTS__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHENOMENON_TYPE__PARENT = BUSINESS_CONCEPTS__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHENOMENON_TYPE__CHILD = BUSINESS_CONCEPTS__CHILD;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHENOMENON_TYPE__CONTRIB_TYPE_TO_PARENTS = BUSINESS_CONCEPTS__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Topic Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHENOMENON_TYPE__TOPIC_CHILD = BUSINESS_CONCEPTS__TOPIC_CHILD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHENOMENON_TYPE__TOPIC = BUSINESS_CONCEPTS__TOPIC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHENOMENON_TYPE__TYPE = BUSINESS_CONCEPTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHENOMENON_TYPE__LABEL = BUSINESS_CONCEPTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bigquery</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHENOMENON_TYPE__BIGQUERY = BUSINESS_CONCEPTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHENOMENON_TYPE__GOAL = BUSINESS_CONCEPTS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Phenomenon Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHENOMENON_TYPE_FEATURE_COUNT = BUSINESS_CONCEPTS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Phenomenon Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHENOMENON_TYPE_OPERATION_COUNT = BUSINESS_CONCEPTS_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_SOLUTION__NAME = PHENOMENON_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_SOLUTION__PARENT = PHENOMENON_TYPE__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_SOLUTION__CHILD = PHENOMENON_TYPE__CHILD;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_SOLUTION__CONTRIB_TYPE_TO_PARENTS = PHENOMENON_TYPE__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Topic Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_SOLUTION__TOPIC_CHILD = PHENOMENON_TYPE__TOPIC_CHILD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_SOLUTION__TOPIC = PHENOMENON_TYPE__TOPIC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_SOLUTION__TYPE = PHENOMENON_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_SOLUTION__LABEL = PHENOMENON_TYPE__LABEL;

	/**
	 * The feature id for the '<em><b>Bigquery</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_SOLUTION__BIGQUERY = PHENOMENON_TYPE__BIGQUERY;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_SOLUTION__GOAL = PHENOMENON_TYPE__GOAL;

	/**
	 * The number of structural features of the '<em>Soft Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_SOLUTION_FEATURE_COUNT = PHENOMENON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Soft Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_SOLUTION_OPERATION_COUNT = PHENOMENON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_SOFTSOLUTION__NAME = SOFT_SOLUTION__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_SOFTSOLUTION__PARENT = SOFT_SOLUTION__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_SOFTSOLUTION__CHILD = SOFT_SOLUTION__CHILD;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_SOFTSOLUTION__CONTRIB_TYPE_TO_PARENTS = SOFT_SOLUTION__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Topic Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_SOFTSOLUTION__TOPIC_CHILD = SOFT_SOLUTION__TOPIC_CHILD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_SOFTSOLUTION__TOPIC = SOFT_SOLUTION__TOPIC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_SOFTSOLUTION__TYPE = SOFT_SOLUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_SOFTSOLUTION__LABEL = SOFT_SOLUTION__LABEL;

	/**
	 * The feature id for the '<em><b>Bigquery</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_SOFTSOLUTION__BIGQUERY = SOFT_SOLUTION__BIGQUERY;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_SOFTSOLUTION__GOAL = SOFT_SOLUTION__GOAL;

	/**
	 * The number of structural features of the '<em>NFR Softsolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_SOFTSOLUTION_FEATURE_COUNT = SOFT_SOLUTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>NFR Softsolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_SOFTSOLUTION_OPERATION_COUNT = SOFT_SOLUTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Target Business Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__TARGET_BUSINESS_CONCEPT = 1;

	/**
	 * The number of structural features of the '<em>Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__NAME = CONTRIBUTION__NAME;

	/**
	 * The feature id for the '<em><b>Target Business Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__TARGET_BUSINESS_CONCEPT = CONTRIBUTION__TARGET_BUSINESS_CONCEPT;

	/**
	 * The number of structural features of the '<em>Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_FEATURE_COUNT = CONTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_OPERATION_COUNT = CONTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__ARTIFACT = GATEWAY__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__LABEL = GATEWAY__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__BUSINESSCONCEPTS_PARENT = GATEWAY__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__TYPE = GATEWAY__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__NAME = GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__LOCAL_BUSINESS_CONCEPT = GATEWAY__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__CONTRIB_TYPE_TO_PARENTS = GATEWAY__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__SEQUENCE_FLOWS = GATEWAY__SEQUENCE_FLOWS;

	/**
	 * The number of structural features of the '<em>Inclusive Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inclusive Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY_OPERATION_COUNT = GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFICING__NAME = CONTRIBUTION__NAME;

	/**
	 * The feature id for the '<em><b>Target Business Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFICING__TARGET_BUSINESS_CONCEPT = CONTRIBUTION__TARGET_BUSINESS_CONCEPT;

	/**
	 * The number of structural features of the '<em>Satisficing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFICING_FEATURE_COUNT = CONTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Satisficing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFICING_OPERATION_COUNT = CONTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_SATISFICING__NAME = SATISFICING__NAME;

	/**
	 * The feature id for the '<em><b>Target Business Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_SATISFICING__TARGET_BUSINESS_CONCEPT = SATISFICING__TARGET_BUSINESS_CONCEPT;

	/**
	 * The number of structural features of the '<em>Positive Satisficing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_SATISFICING_FEATURE_COUNT = SATISFICING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive Satisficing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_SATISFICING_OPERATION_COUNT = SATISFICING_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_PLUS__NAME = POSITIVE_SATISFICING__NAME;

	/**
	 * The feature id for the '<em><b>Target Business Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_PLUS__TARGET_BUSINESS_CONCEPT = POSITIVE_SATISFICING__TARGET_BUSINESS_CONCEPT;

	/**
	 * The number of structural features of the '<em>Some Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_PLUS_FEATURE_COUNT = POSITIVE_SATISFICING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Some Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_PLUS_OPERATION_COUNT = POSITIVE_SATISFICING_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DECOMPOSITION__NAME = DECOMPOSITION__NAME;

	/**
	 * The feature id for the '<em><b>Target Business Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DECOMPOSITION__TARGET_BUSINESS_CONCEPT = DECOMPOSITION__TARGET_BUSINESS_CONCEPT;

	/**
	 * The number of structural features of the '<em>AND Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DECOMPOSITION_FEATURE_COUNT = DECOMPOSITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AND Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DECOMPOSITION_OPERATION_COUNT = DECOMPOSITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SOFTSOLUTION__NAME = SOFT_SOLUTION__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SOFTSOLUTION__PARENT = SOFT_SOLUTION__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SOFTSOLUTION__CHILD = SOFT_SOLUTION__CHILD;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SOFTSOLUTION__CONTRIB_TYPE_TO_PARENTS = SOFT_SOLUTION__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Topic Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SOFTSOLUTION__TOPIC_CHILD = SOFT_SOLUTION__TOPIC_CHILD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SOFTSOLUTION__TOPIC = SOFT_SOLUTION__TOPIC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SOFTSOLUTION__TYPE = SOFT_SOLUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SOFTSOLUTION__LABEL = SOFT_SOLUTION__LABEL;

	/**
	 * The feature id for the '<em><b>Bigquery</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SOFTSOLUTION__BIGQUERY = SOFT_SOLUTION__BIGQUERY;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SOFTSOLUTION__GOAL = SOFT_SOLUTION__GOAL;

	/**
	 * The number of structural features of the '<em>Claim Softsolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SOFTSOLUTION_FEATURE_COUNT = SOFT_SOLUTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Claim Softsolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SOFTSOLUTION_OPERATION_COUNT = SOFT_SOLUTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__ARTIFACT = GATEWAY__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__LABEL = GATEWAY__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__BUSINESSCONCEPTS_PARENT = GATEWAY__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__TYPE = GATEWAY__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__NAME = GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__LOCAL_BUSINESS_CONCEPT = GATEWAY__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__CONTRIB_TYPE_TO_PARENTS = GATEWAY__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__SEQUENCE_FLOWS = GATEWAY__SEQUENCE_FLOWS;

	/**
	 * The number of structural features of the '<em>Parallel Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parallel Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_OPERATION_COUNT = GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__ARTIFACT = GATEWAY__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__LABEL = GATEWAY__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__BUSINESSCONCEPTS_PARENT = GATEWAY__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__TYPE = GATEWAY__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__NAME = GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__LOCAL_BUSINESS_CONCEPT = GATEWAY__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__CONTRIB_TYPE_TO_PARENTS = GATEWAY__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__SEQUENCE_FLOWS = GATEWAY__SEQUENCE_FLOWS;

	/**
	 * The number of structural features of the '<em>Exclusive Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exclusive Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_OPERATION_COUNT = GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__ARTIFACT = ARTIFACT__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__LABEL = ARTIFACT__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__BUSINESSCONCEPTS_PARENT = ARTIFACT__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__TYPE = ARTIFACT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__NAME = ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__LOCAL_BUSINESS_CONCEPT = ARTIFACT__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__CONTRIB_TYPE_TO_PARENTS = ARTIFACT__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__CONTRIB_TYPE_TO_PARENT = ARTIFACT__CONTRIB_TYPE_TO_PARENT;

	/**
	 * The number of structural features of the '<em>Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_OPERATION_COUNT = ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__ARTIFACT = SWIMLANE__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__LABEL = SWIMLANE__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__BUSINESSCONCEPTS_PARENT = SWIMLANE__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__TYPE = SWIMLANE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__NAME = SWIMLANE__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__LOCAL_BUSINESS_CONCEPT = SWIMLANE__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__CONTRIB_TYPE_TO_PARENTS = SWIMLANE__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Graphic Obj</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__GRAPHIC_OBJ = SWIMLANE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_FEATURE_COUNT = SWIMLANE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_OPERATION_COUNT = SWIMLANE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__ARTIFACT = ABSTRACT_TASK__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__LABEL = ABSTRACT_TASK__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__BUSINESSCONCEPTS_PARENT = ABSTRACT_TASK__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__TYPE = ABSTRACT_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__NAME = ABSTRACT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__LOCAL_BUSINESS_CONCEPT = ABSTRACT_TASK__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__CONTRIB_TYPE_TO_PARENTS = ABSTRACT_TASK__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__SEQUENCE_FLOWS = ABSTRACT_TASK__SEQUENCE_FLOWS;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__BOUNDARY_EVENT_REFS = ABSTRACT_TASK__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Task Boundary Event Refs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__TASK_BOUNDARY_EVENT_REFS = ABSTRACT_TASK__TASK_BOUNDARY_EVENT_REFS;

	/**
	 * The number of structural features of the '<em>Send Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_FEATURE_COUNT = ABSTRACT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Send Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_OPERATION_COUNT = ABSTRACT_TASK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ARTIFACT = ARTIFACT__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__LABEL = ARTIFACT__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__BUSINESSCONCEPTS_PARENT = ARTIFACT__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TYPE = ARTIFACT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__LOCAL_BUSINESS_CONCEPT = ARTIFACT__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONTRIB_TYPE_TO_PARENTS = ARTIFACT__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONTRIB_TYPE_TO_PARENT = ARTIFACT__CONTRIB_TYPE_TO_PARENT;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONALIZING_SOFTSOLUTION__NAME = SOFT_SOLUTION__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONALIZING_SOFTSOLUTION__PARENT = SOFT_SOLUTION__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONALIZING_SOFTSOLUTION__CHILD = SOFT_SOLUTION__CHILD;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONALIZING_SOFTSOLUTION__CONTRIB_TYPE_TO_PARENTS = SOFT_SOLUTION__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Topic Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONALIZING_SOFTSOLUTION__TOPIC_CHILD = SOFT_SOLUTION__TOPIC_CHILD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONALIZING_SOFTSOLUTION__TOPIC = SOFT_SOLUTION__TOPIC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONALIZING_SOFTSOLUTION__TYPE = SOFT_SOLUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONALIZING_SOFTSOLUTION__LABEL = SOFT_SOLUTION__LABEL;

	/**
	 * The feature id for the '<em><b>Bigquery</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONALIZING_SOFTSOLUTION__BIGQUERY = SOFT_SOLUTION__BIGQUERY;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONALIZING_SOFTSOLUTION__GOAL = SOFT_SOLUTION__GOAL;

	/**
	 * The number of structural features of the '<em>Operationalizing Softsolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONALIZING_SOFTSOLUTION_FEATURE_COUNT = SOFT_SOLUTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operationalizing Softsolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONALIZING_SOFTSOLUTION_OPERATION_COUNT = SOFT_SOLUTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__ARTIFACT = EVENT__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__LABEL = EVENT__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__BUSINESSCONCEPTS_PARENT = EVENT__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__TYPE = EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__LOCAL_BUSINESS_CONCEPT = EVENT__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__CONTRIB_TYPE_TO_PARENTS = EVENT__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__SEQUENCE_FLOWS = EVENT__SEQUENCE_FLOWS;

	/**
	 * The feature id for the '<em><b>Throw Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__THROW_EVENT_DEFINITION = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Throw Event Definition Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__THROW_EVENT_DEFINITION_REF = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Throw Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Throw Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_SATISFICING__NAME = SATISFICING__NAME;

	/**
	 * The feature id for the '<em><b>Target Business Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_SATISFICING__TARGET_BUSINESS_CONCEPT = SATISFICING__TARGET_BUSINESS_CONCEPT;

	/**
	 * The number of structural features of the '<em>Negative Satisficing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_SATISFICING_FEATURE_COUNT = SATISFICING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negative Satisficing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_SATISFICING_OPERATION_COUNT = SATISFICING_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_MINUS__NAME = NEGATIVE_SATISFICING__NAME;

	/**
	 * The feature id for the '<em><b>Target Business Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_MINUS__TARGET_BUSINESS_CONCEPT = NEGATIVE_SATISFICING__TARGET_BUSINESS_CONCEPT;

	/**
	 * The number of structural features of the '<em>Some Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_MINUS_FEATURE_COUNT = NEGATIVE_SATISFICING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Some Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_MINUS_OPERATION_COUNT = NEGATIVE_SATISFICING_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP__NAME = POSITIVE_SATISFICING__NAME;

	/**
	 * The feature id for the '<em><b>Target Business Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP__TARGET_BUSINESS_CONCEPT = POSITIVE_SATISFICING__TARGET_BUSINESS_CONCEPT;

	/**
	 * The number of structural features of the '<em>Help</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_FEATURE_COUNT = POSITIVE_SATISFICING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Help</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_OPERATION_COUNT = POSITIVE_SATISFICING_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULES_TASK__ARTIFACT = ABSTRACT_TASK__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULES_TASK__LABEL = ABSTRACT_TASK__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULES_TASK__BUSINESSCONCEPTS_PARENT = ABSTRACT_TASK__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULES_TASK__TYPE = ABSTRACT_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULES_TASK__NAME = ABSTRACT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULES_TASK__LOCAL_BUSINESS_CONCEPT = ABSTRACT_TASK__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULES_TASK__CONTRIB_TYPE_TO_PARENTS = ABSTRACT_TASK__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULES_TASK__SEQUENCE_FLOWS = ABSTRACT_TASK__SEQUENCE_FLOWS;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULES_TASK__BOUNDARY_EVENT_REFS = ABSTRACT_TASK__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Task Boundary Event Refs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULES_TASK__TASK_BOUNDARY_EVENT_REFS = ABSTRACT_TASK__TASK_BOUNDARY_EVENT_REFS;

	/**
	 * The number of structural features of the '<em>Business Rules Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULES_TASK_FEATURE_COUNT = ABSTRACT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Business Rules Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULES_TASK_OPERATION_COUNT = ABSTRACT_TASK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ARTIFACT = ARTIFACT__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__LABEL = ARTIFACT__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__BUSINESSCONCEPTS_PARENT = ARTIFACT__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TYPE = ARTIFACT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NAME = ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__LOCAL_BUSINESS_CONCEPT = ARTIFACT__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__CONTRIB_TYPE_TO_PARENTS = ARTIFACT__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__CONTRIB_TYPE_TO_PARENT = ARTIFACT__CONTRIB_TYPE_TO_PARENT;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HURT__NAME = NEGATIVE_SATISFICING__NAME;

	/**
	 * The feature id for the '<em><b>Target Business Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HURT__TARGET_BUSINESS_CONCEPT = NEGATIVE_SATISFICING__TARGET_BUSINESS_CONCEPT;

	/**
	 * The number of structural features of the '<em>Hurt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HURT_FEATURE_COUNT = NEGATIVE_SATISFICING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hurt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HURT_OPERATION_COUNT = NEGATIVE_SATISFICING_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTING_OBJECT__ARTIFACT = GRAPHCIAL_OBJECT__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTING_OBJECT__LABEL = GRAPHCIAL_OBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTING_OBJECT__BUSINESSCONCEPTS_PARENT = GRAPHCIAL_OBJECT__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTING_OBJECT__TYPE = GRAPHCIAL_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTING_OBJECT__NAME = GRAPHCIAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTING_OBJECT__LOCAL_BUSINESS_CONCEPT = GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTING_OBJECT__CONTRIB_TYPE_TO_PARENTS = GRAPHCIAL_OBJECT__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The number of structural features of the '<em>Connecting Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTING_OBJECT_FEATURE_COUNT = GRAPHCIAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connecting Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTING_OBJECT_OPERATION_COUNT = GRAPHCIAL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__ARTIFACT = CONNECTING_OBJECT__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__LABEL = CONNECTING_OBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__BUSINESSCONCEPTS_PARENT = CONNECTING_OBJECT__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__TYPE = CONNECTING_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__NAME = CONNECTING_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__LOCAL_BUSINESS_CONCEPT = CONNECTING_OBJECT__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__CONTRIB_TYPE_TO_PARENTS = CONNECTING_OBJECT__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Target Flow Object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__TARGET_FLOW_OBJECT = CONNECTING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_FEATURE_COUNT = CONNECTING_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sequence Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_OPERATION_COUNT = CONNECTING_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQL_DECOMPOSITION__NAME = DECOMPOSITION__NAME;

	/**
	 * The feature id for the '<em><b>Target Business Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQL_DECOMPOSITION__TARGET_BUSINESS_CONCEPT = DECOMPOSITION__TARGET_BUSINESS_CONCEPT;

	/**
	 * The number of structural features of the '<em>EQL Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQL_DECOMPOSITION_FEATURE_COUNT = DECOMPOSITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EQL Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQL_DECOMPOSITION_OPERATION_COUNT = DECOMPOSITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__NAME = NEGATIVE_SATISFICING__NAME;

	/**
	 * The feature id for the '<em><b>Target Business Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__TARGET_BUSINESS_CONCEPT = NEGATIVE_SATISFICING__TARGET_BUSINESS_CONCEPT;

	/**
	 * The number of structural features of the '<em>Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_FEATURE_COUNT = NEGATIVE_SATISFICING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_OPERATION_COUNT = NEGATIVE_SATISFICING_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__ARTIFACT = EVENT__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__LABEL = EVENT__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__BUSINESSCONCEPTS_PARENT = EVENT__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__TYPE = EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__LOCAL_BUSINESS_CONCEPT = EVENT__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__CONTRIB_TYPE_TO_PARENTS = EVENT__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__SEQUENCE_FLOWS = EVENT__SEQUENCE_FLOWS;

	/**
	 * The feature id for the '<em><b>Parallel Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__PARALLEL_MULTIPLE = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Catch Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__CATCH_EVENT_DEFINITION = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Catch Event Definition Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__CATCH_EVENT_DEFINITION_REF = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Catch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Catch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>BPMN Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT_ELEMENT__BPMN_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Business Concept EReference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT_ELEMENT__BUSINESS_CONCEPT_EREFERENCE = 2;

	/**
	 * The number of structural features of the '<em>BPMN Root Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>BPMN Root Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE__NAME = POSITIVE_SATISFICING__NAME;

	/**
	 * The feature id for the '<em><b>Target Business Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE__TARGET_BUSINESS_CONCEPT = POSITIVE_SATISFICING__TARGET_BUSINESS_CONCEPT;

	/**
	 * The number of structural features of the '<em>Make</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_FEATURE_COUNT = POSITIVE_SATISFICING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Make</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_OPERATION_COUNT = POSITIVE_SATISFICING_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__ARTIFACT = ABSTRACT_TASK__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__LABEL = ABSTRACT_TASK__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__BUSINESSCONCEPTS_PARENT = ABSTRACT_TASK__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__TYPE = ABSTRACT_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__NAME = ABSTRACT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__LOCAL_BUSINESS_CONCEPT = ABSTRACT_TASK__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__CONTRIB_TYPE_TO_PARENTS = ABSTRACT_TASK__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__SEQUENCE_FLOWS = ABSTRACT_TASK__SEQUENCE_FLOWS;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__BOUNDARY_EVENT_REFS = ABSTRACT_TASK__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Task Boundary Event Refs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__TASK_BOUNDARY_EVENT_REFS = ABSTRACT_TASK__TASK_BOUNDARY_EVENT_REFS;

	/**
	 * The number of structural features of the '<em>User Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_FEATURE_COUNT = ABSTRACT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>User Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_OPERATION_COUNT = ABSTRACT_TASK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DECOMPOSITION__NAME = DECOMPOSITION__NAME;

	/**
	 * The feature id for the '<em><b>Target Business Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DECOMPOSITION__TARGET_BUSINESS_CONCEPT = DECOMPOSITION__TARGET_BUSINESS_CONCEPT;

	/**
	 * The number of structural features of the '<em>OR Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DECOMPOSITION_FEATURE_COUNT = DECOMPOSITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OR Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DECOMPOSITION_OPERATION_COUNT = DECOMPOSITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__ARTIFACT = ABSTRACT_TASK__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__LABEL = ABSTRACT_TASK__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__BUSINESSCONCEPTS_PARENT = ABSTRACT_TASK__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__TYPE = ABSTRACT_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__NAME = ABSTRACT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__LOCAL_BUSINESS_CONCEPT = ABSTRACT_TASK__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__CONTRIB_TYPE_TO_PARENTS = ABSTRACT_TASK__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__SEQUENCE_FLOWS = ABSTRACT_TASK__SEQUENCE_FLOWS;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__BOUNDARY_EVENT_REFS = ABSTRACT_TASK__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Task Boundary Event Refs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__TASK_BOUNDARY_EVENT_REFS = ABSTRACT_TASK__TASK_BOUNDARY_EVENT_REFS;

	/**
	 * The number of structural features of the '<em>Service Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_FEATURE_COUNT = ABSTRACT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_OPERATION_COUNT = ABSTRACT_TASK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PROBLEM__NAME = PHENOMENON_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PROBLEM__PARENT = PHENOMENON_TYPE__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PROBLEM__CHILD = PHENOMENON_TYPE__CHILD;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PROBLEM__CONTRIB_TYPE_TO_PARENTS = PHENOMENON_TYPE__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Topic Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PROBLEM__TOPIC_CHILD = PHENOMENON_TYPE__TOPIC_CHILD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PROBLEM__TOPIC = PHENOMENON_TYPE__TOPIC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PROBLEM__TYPE = PHENOMENON_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PROBLEM__LABEL = PHENOMENON_TYPE__LABEL;

	/**
	 * The feature id for the '<em><b>Bigquery</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PROBLEM__BIGQUERY = PHENOMENON_TYPE__BIGQUERY;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PROBLEM__GOAL = PHENOMENON_TYPE__GOAL;

	/**
	 * The number of structural features of the '<em>Soft Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PROBLEM_FEATURE_COUNT = PHENOMENON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Soft Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PROBLEM_OPERATION_COUNT = PHENOMENON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRABLE_SITUATION__NAME = SOFT_PROBLEM__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRABLE_SITUATION__PARENT = SOFT_PROBLEM__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRABLE_SITUATION__CHILD = SOFT_PROBLEM__CHILD;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRABLE_SITUATION__CONTRIB_TYPE_TO_PARENTS = SOFT_PROBLEM__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Topic Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRABLE_SITUATION__TOPIC_CHILD = SOFT_PROBLEM__TOPIC_CHILD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRABLE_SITUATION__TOPIC = SOFT_PROBLEM__TOPIC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRABLE_SITUATION__TYPE = SOFT_PROBLEM__TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRABLE_SITUATION__LABEL = SOFT_PROBLEM__LABEL;

	/**
	 * The feature id for the '<em><b>Bigquery</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRABLE_SITUATION__BIGQUERY = SOFT_PROBLEM__BIGQUERY;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRABLE_SITUATION__GOAL = SOFT_PROBLEM__GOAL;

	/**
	 * The number of structural features of the '<em>Undesirable Situation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRABLE_SITUATION_FEATURE_COUNT = SOFT_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Undesirable Situation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRABLE_SITUATION_OPERATION_COUNT = SOFT_PROBLEM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRABLE_OPERATIONALIZATION__NAME = SOFT_PROBLEM__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRABLE_OPERATIONALIZATION__PARENT = SOFT_PROBLEM__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRABLE_OPERATIONALIZATION__CHILD = SOFT_PROBLEM__CHILD;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRABLE_OPERATIONALIZATION__CONTRIB_TYPE_TO_PARENTS = SOFT_PROBLEM__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Topic Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRABLE_OPERATIONALIZATION__TOPIC_CHILD = SOFT_PROBLEM__TOPIC_CHILD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRABLE_OPERATIONALIZATION__TOPIC = SOFT_PROBLEM__TOPIC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRABLE_OPERATIONALIZATION__TYPE = SOFT_PROBLEM__TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRABLE_OPERATIONALIZATION__LABEL = SOFT_PROBLEM__LABEL;

	/**
	 * The feature id for the '<em><b>Bigquery</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRABLE_OPERATIONALIZATION__BIGQUERY = SOFT_PROBLEM__BIGQUERY;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRABLE_OPERATIONALIZATION__GOAL = SOFT_PROBLEM__GOAL;

	/**
	 * The number of structural features of the '<em>Undesirable Operationalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRABLE_OPERATIONALIZATION_FEATURE_COUNT = SOFT_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Undesirable Operationalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDESIRABLE_OPERATIONALIZATION_OPERATION_COUNT = SOFT_PROBLEM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSAL_ATTRIBUTION__NAME = SOFT_PROBLEM__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSAL_ATTRIBUTION__PARENT = SOFT_PROBLEM__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSAL_ATTRIBUTION__CHILD = SOFT_PROBLEM__CHILD;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSAL_ATTRIBUTION__CONTRIB_TYPE_TO_PARENTS = SOFT_PROBLEM__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Topic Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSAL_ATTRIBUTION__TOPIC_CHILD = SOFT_PROBLEM__TOPIC_CHILD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSAL_ATTRIBUTION__TOPIC = SOFT_PROBLEM__TOPIC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSAL_ATTRIBUTION__TYPE = SOFT_PROBLEM__TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSAL_ATTRIBUTION__LABEL = SOFT_PROBLEM__LABEL;

	/**
	 * The feature id for the '<em><b>Bigquery</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSAL_ATTRIBUTION__BIGQUERY = SOFT_PROBLEM__BIGQUERY;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSAL_ATTRIBUTION__GOAL = SOFT_PROBLEM__GOAL;

	/**
	 * The number of structural features of the '<em>Causal Attribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSAL_ATTRIBUTION_FEATURE_COUNT = SOFT_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Causal Attribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSAL_ATTRIBUTION_OPERATION_COUNT = SOFT_PROBLEM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ARTIFACT = ABSTRACT_TASK__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__LABEL = ABSTRACT_TASK__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__BUSINESSCONCEPTS_PARENT = ABSTRACT_TASK__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TYPE = ABSTRACT_TASK__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = ABSTRACT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__LOCAL_BUSINESS_CONCEPT = ABSTRACT_TASK__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CONTRIB_TYPE_TO_PARENTS = ABSTRACT_TASK__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SEQUENCE_FLOWS = ABSTRACT_TASK__SEQUENCE_FLOWS;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__BOUNDARY_EVENT_REFS = ABSTRACT_TASK__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Task Boundary Event Refs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TASK_BOUNDARY_EVENT_REFS = ABSTRACT_TASK__TASK_BOUNDARY_EVENT_REFS;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = ABSTRACT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = ABSTRACT_TASK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__ARTIFACT = CONNECTING_OBJECT__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__LABEL = CONNECTING_OBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__BUSINESSCONCEPTS_PARENT = CONNECTING_OBJECT__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__TYPE = CONNECTING_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__NAME = CONNECTING_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__LOCAL_BUSINESS_CONCEPT = CONNECTING_OBJECT__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__CONTRIB_TYPE_TO_PARENTS = CONNECTING_OBJECT__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Message Flow Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__MESSAGE_FLOW_OBJECT = CONNECTING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_FEATURE_COUNT = CONNECTING_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_OPERATION_COUNT = CONNECTING_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__ARTIFACT = ACTIVITY__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__LABEL = ACTIVITY__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__BUSINESSCONCEPTS_PARENT = ACTIVITY__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__TYPE = ACTIVITY__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__LOCAL_BUSINESS_CONCEPT = ACTIVITY__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__CONTRIB_TYPE_TO_PARENTS = ACTIVITY__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__SEQUENCE_FLOWS = ACTIVITY__SEQUENCE_FLOWS;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__BOUNDARY_EVENT_REFS = ACTIVITY__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__CHILDREN = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Collapsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__IS_COLLAPSED = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sub Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sub Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = EVENT_DEFINITION__NAME;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__NAME = EVENT_DEFINITION__NAME;

	/**
	 * The number of structural features of the '<em>Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_OPERATION_COUNT = EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__NAME = EVENT_DEFINITION__NAME;

	/**
	 * The number of structural features of the '<em>Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_OPERATION_COUNT = EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE__NAME = EVENT_DEFINITION__NAME;

	/**
	 * The number of structural features of the '<em>Multiple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multiple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_OPERATION_COUNT = EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__ARTIFACT = CATCH_EVENT__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__LABEL = CATCH_EVENT__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__BUSINESSCONCEPTS_PARENT = CATCH_EVENT__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__TYPE = CATCH_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__NAME = CATCH_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__LOCAL_BUSINESS_CONCEPT = CATCH_EVENT__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__CONTRIB_TYPE_TO_PARENTS = CATCH_EVENT__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__SEQUENCE_FLOWS = CATCH_EVENT__SEQUENCE_FLOWS;

	/**
	 * The feature id for the '<em><b>Parallel Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__PARALLEL_MULTIPLE = CATCH_EVENT__PARALLEL_MULTIPLE;

	/**
	 * The feature id for the '<em><b>Catch Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__CATCH_EVENT_DEFINITION = CATCH_EVENT__CATCH_EVENT_DEFINITION;

	/**
	 * The feature id for the '<em><b>Catch Event Definition Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__CATCH_EVENT_DEFINITION_REF = CATCH_EVENT__CATCH_EVENT_DEFINITION_REF;

	/**
	 * The feature id for the '<em><b>Is Interrupt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__IS_INTERRUPT = CATCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_FEATURE_COUNT = CATCH_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_OPERATION_COUNT = CATCH_EVENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__ARTIFACT = CATCH_EVENT__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__LABEL = CATCH_EVENT__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__BUSINESSCONCEPTS_PARENT = CATCH_EVENT__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__TYPE = CATCH_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__NAME = CATCH_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__LOCAL_BUSINESS_CONCEPT = CATCH_EVENT__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__CONTRIB_TYPE_TO_PARENTS = CATCH_EVENT__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__SEQUENCE_FLOWS = CATCH_EVENT__SEQUENCE_FLOWS;

	/**
	 * The feature id for the '<em><b>Parallel Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__PARALLEL_MULTIPLE = CATCH_EVENT__PARALLEL_MULTIPLE;

	/**
	 * The feature id for the '<em><b>Catch Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__CATCH_EVENT_DEFINITION = CATCH_EVENT__CATCH_EVENT_DEFINITION;

	/**
	 * The feature id for the '<em><b>Catch Event Definition Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__CATCH_EVENT_DEFINITION_REF = CATCH_EVENT__CATCH_EVENT_DEFINITION_REF;

	/**
	 * The feature id for the '<em><b>Cancel Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__CANCEL_ACTIVITY = CATCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attached To Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__ATTACHED_TO_REF = CATCH_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boundary Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT_FEATURE_COUNT = CATCH_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Boundary Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT_OPERATION_COUNT = CATCH_EVENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE__NAME = EVENT_DEFINITION__NAME;

	/**
	 * The number of structural features of the '<em>None</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>None</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_OPERATION_COUNT = EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__ARTIFACT = THROW_EVENT__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__LABEL = THROW_EVENT__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__BUSINESSCONCEPTS_PARENT = THROW_EVENT__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__TYPE = THROW_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__NAME = THROW_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__LOCAL_BUSINESS_CONCEPT = THROW_EVENT__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__CONTRIB_TYPE_TO_PARENTS = THROW_EVENT__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__SEQUENCE_FLOWS = THROW_EVENT__SEQUENCE_FLOWS;

	/**
	 * The feature id for the '<em><b>Throw Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__THROW_EVENT_DEFINITION = THROW_EVENT__THROW_EVENT_DEFINITION;

	/**
	 * The feature id for the '<em><b>Throw Event Definition Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__THROW_EVENT_DEFINITION_REF = THROW_EVENT__THROW_EVENT_DEFINITION_REF;

	/**
	 * The number of structural features of the '<em>End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_FEATURE_COUNT = THROW_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_OPERATION_COUNT = THROW_EVENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENBASED_GATEWAY__ARTIFACT = GATEWAY__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENBASED_GATEWAY__LABEL = GATEWAY__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENBASED_GATEWAY__BUSINESSCONCEPTS_PARENT = GATEWAY__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENBASED_GATEWAY__TYPE = GATEWAY__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENBASED_GATEWAY__NAME = GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENBASED_GATEWAY__LOCAL_BUSINESS_CONCEPT = GATEWAY__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENBASED_GATEWAY__CONTRIB_TYPE_TO_PARENTS = GATEWAY__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENBASED_GATEWAY__SEQUENCE_FLOWS = GATEWAY__SEQUENCE_FLOWS;

	/**
	 * The feature id for the '<em><b>Event Gateway Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENBASED_GATEWAY__EVENT_GATEWAY_TYPE = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Instanciate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENBASED_GATEWAY__IS_INSTANCIATE = GATEWAY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evenbased Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENBASED_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evenbased Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENBASED_GATEWAY_OPERATION_COUNT = GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__ARTIFACT = DATA_OBJECT__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__LABEL = DATA_OBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__BUSINESSCONCEPTS_PARENT = DATA_OBJECT__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__TYPE = DATA_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__NAME = DATA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__LOCAL_BUSINESS_CONCEPT = DATA_OBJECT__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__CONTRIB_TYPE_TO_PARENTS = DATA_OBJECT__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__CONTRIB_TYPE_TO_PARENT = DATA_OBJECT__CONTRIB_TYPE_TO_PARENT;

	/**
	 * The number of structural features of the '<em>Data Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_FEATURE_COUNT = DATA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_OPERATION_COUNT = DATA_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__ARTIFACT = DATA_OBJECT__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__LABEL = DATA_OBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__BUSINESSCONCEPTS_PARENT = DATA_OBJECT__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__TYPE = DATA_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__NAME = DATA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__LOCAL_BUSINESS_CONCEPT = DATA_OBJECT__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__CONTRIB_TYPE_TO_PARENTS = DATA_OBJECT__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__CONTRIB_TYPE_TO_PARENT = DATA_OBJECT__CONTRIB_TYPE_TO_PARENT;

	/**
	 * The number of structural features of the '<em>Data Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_FEATURE_COUNT = DATA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_OPERATION_COUNT = DATA_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__ARTIFACT = CATCH_EVENT__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__LABEL = CATCH_EVENT__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__BUSINESSCONCEPTS_PARENT = CATCH_EVENT__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__TYPE = CATCH_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__NAME = CATCH_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__LOCAL_BUSINESS_CONCEPT = CATCH_EVENT__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__CONTRIB_TYPE_TO_PARENTS = CATCH_EVENT__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__SEQUENCE_FLOWS = CATCH_EVENT__SEQUENCE_FLOWS;

	/**
	 * The feature id for the '<em><b>Parallel Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__PARALLEL_MULTIPLE = CATCH_EVENT__PARALLEL_MULTIPLE;

	/**
	 * The feature id for the '<em><b>Catch Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__CATCH_EVENT_DEFINITION = CATCH_EVENT__CATCH_EVENT_DEFINITION;

	/**
	 * The feature id for the '<em><b>Catch Event Definition Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__CATCH_EVENT_DEFINITION_REF = CATCH_EVENT__CATCH_EVENT_DEFINITION_REF;

	/**
	 * The feature id for the '<em><b>Is Interrupt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__IS_INTERRUPT = CATCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Intermediate Catch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_FEATURE_COUNT = CATCH_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Intermediate Catch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_OPERATION_COUNT = CATCH_EVENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_END_EVENT__ARTIFACT = THROW_EVENT__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_END_EVENT__LABEL = THROW_EVENT__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_END_EVENT__BUSINESSCONCEPTS_PARENT = THROW_EVENT__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_END_EVENT__TYPE = THROW_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_END_EVENT__NAME = THROW_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_END_EVENT__LOCAL_BUSINESS_CONCEPT = THROW_EVENT__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_END_EVENT__CONTRIB_TYPE_TO_PARENTS = THROW_EVENT__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_END_EVENT__SEQUENCE_FLOWS = THROW_EVENT__SEQUENCE_FLOWS;

	/**
	 * The feature id for the '<em><b>Throw Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_END_EVENT__THROW_EVENT_DEFINITION = THROW_EVENT__THROW_EVENT_DEFINITION;

	/**
	 * The feature id for the '<em><b>Throw Event Definition Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_END_EVENT__THROW_EVENT_DEFINITION_REF = THROW_EVENT__THROW_EVENT_DEFINITION_REF;

	/**
	 * The feature id for the '<em><b>Is Interrupt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_END_EVENT__IS_INTERRUPT = THROW_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Intermediate End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_END_EVENT_FEATURE_COUNT = THROW_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Intermediate End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_END_EVENT_OPERATION_COUNT = THROW_EVENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__ARTIFACT = CONNECTING_OBJECT__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__LABEL = CONNECTING_OBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__BUSINESSCONCEPTS_PARENT = CONNECTING_OBJECT__BUSINESSCONCEPTS_PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__TYPE = CONNECTING_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__NAME = CONNECTING_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__LOCAL_BUSINESS_CONCEPT = CONNECTING_OBJECT__LOCAL_BUSINESS_CONCEPT;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__CONTRIB_TYPE_TO_PARENTS = CONNECTING_OBJECT__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Data Associate Object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__DATA_ASSOCIATE_OBJECT = CONNECTING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION_FEATURE_COUNT = CONNECTING_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION_OPERATION_COUNT = CONNECTING_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.BigQueryImpl <em>Big Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.BigQueryImpl
	 * @see bpmn.impl.BpmnPackageImpl#getBigQuery()
	 * @generated
	 */
	int BIG_QUERY = 69;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_QUERY__NAME = BUSINESS_CONCEPTS__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_QUERY__PARENT = BUSINESS_CONCEPTS__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_QUERY__CHILD = BUSINESS_CONCEPTS__CHILD;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_QUERY__CONTRIB_TYPE_TO_PARENTS = BUSINESS_CONCEPTS__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Topic Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_QUERY__TOPIC_CHILD = BUSINESS_CONCEPTS__TOPIC_CHILD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_QUERY__TOPIC = BUSINESS_CONCEPTS__TOPIC;

	/**
	 * The feature id for the '<em><b>Phenomenontype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_QUERY__PHENOMENONTYPE = BUSINESS_CONCEPTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Big Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_QUERY_FEATURE_COUNT = BUSINESS_CONCEPTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Big Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_QUERY_OPERATION_COUNT = BUSINESS_CONCEPTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.GoalImpl
	 * @see bpmn.impl.BpmnPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 74;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = BUSINESS_CONCEPTS__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__PARENT = BUSINESS_CONCEPTS__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CHILD = BUSINESS_CONCEPTS__CHILD;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONTRIB_TYPE_TO_PARENTS = BUSINESS_CONCEPTS__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Topic Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TOPIC_CHILD = BUSINESS_CONCEPTS__TOPIC_CHILD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TOPIC = BUSINESS_CONCEPTS__TOPIC;

	/**
	 * The feature id for the '<em><b>Phenomenontype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__PHENOMENONTYPE = BUSINESS_CONCEPTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__LABEL = BUSINESS_CONCEPTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = BUSINESS_CONCEPTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = BUSINESS_CONCEPTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.KPIGoalImpl <em>KPI Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.KPIGoalImpl
	 * @see bpmn.impl.BpmnPackageImpl#getKPIGoal()
	 * @generated
	 */
	int KPI_GOAL = 70;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_GOAL__NAME = GOAL__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_GOAL__PARENT = GOAL__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_GOAL__CHILD = GOAL__CHILD;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_GOAL__CONTRIB_TYPE_TO_PARENTS = GOAL__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Topic Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_GOAL__TOPIC_CHILD = GOAL__TOPIC_CHILD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_GOAL__TOPIC = GOAL__TOPIC;

	/**
	 * The feature id for the '<em><b>Phenomenontype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_GOAL__PHENOMENONTYPE = GOAL__PHENOMENONTYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_GOAL__LABEL = GOAL__LABEL;

	/**
	 * The feature id for the '<em><b>Kpi</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_GOAL__KPI = GOAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>KPI Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_GOAL_FEATURE_COUNT = GOAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>KPI Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_GOAL_OPERATION_COUNT = GOAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.KPIImpl <em>KPI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.KPIImpl
	 * @see bpmn.impl.BpmnPackageImpl#getKPI()
	 * @generated
	 */
	int KPI = 71;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI__NAME = BUSINESS_CONCEPTS__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI__PARENT = BUSINESS_CONCEPTS__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI__CHILD = BUSINESS_CONCEPTS__CHILD;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI__CONTRIB_TYPE_TO_PARENTS = BUSINESS_CONCEPTS__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Topic Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI__TOPIC_CHILD = BUSINESS_CONCEPTS__TOPIC_CHILD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI__TOPIC = BUSINESS_CONCEPTS__TOPIC;

	/**
	 * The feature id for the '<em><b>Kpigoal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI__KPIGOAL = BUSINESS_CONCEPTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>KPI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_FEATURE_COUNT = BUSINESS_CONCEPTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>KPI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_OPERATION_COUNT = BUSINESS_CONCEPTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.BusinessGoalImpl <em>Business Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.BusinessGoalImpl
	 * @see bpmn.impl.BpmnPackageImpl#getBusinessGoal()
	 * @generated
	 */
	int BUSINESS_GOAL = 72;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_GOAL__NAME = GOAL__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_GOAL__PARENT = GOAL__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_GOAL__CHILD = GOAL__CHILD;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_GOAL__CONTRIB_TYPE_TO_PARENTS = GOAL__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Topic Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_GOAL__TOPIC_CHILD = GOAL__TOPIC_CHILD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_GOAL__TOPIC = GOAL__TOPIC;

	/**
	 * The feature id for the '<em><b>Phenomenontype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_GOAL__PHENOMENONTYPE = GOAL__PHENOMENONTYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_GOAL__LABEL = GOAL__LABEL;

	/**
	 * The number of structural features of the '<em>Business Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_GOAL_FEATURE_COUNT = GOAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Business Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_GOAL_OPERATION_COUNT = GOAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.BusinessProcessGoalImpl <em>Business Process Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.BusinessProcessGoalImpl
	 * @see bpmn.impl.BpmnPackageImpl#getBusinessProcessGoal()
	 * @generated
	 */
	int BUSINESS_PROCESS_GOAL = 73;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_GOAL__NAME = GOAL__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_GOAL__PARENT = GOAL__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_GOAL__CHILD = GOAL__CHILD;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_GOAL__CONTRIB_TYPE_TO_PARENTS = GOAL__CONTRIB_TYPE_TO_PARENTS;

	/**
	 * The feature id for the '<em><b>Topic Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_GOAL__TOPIC_CHILD = GOAL__TOPIC_CHILD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_GOAL__TOPIC = GOAL__TOPIC;

	/**
	 * The feature id for the '<em><b>Phenomenontype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_GOAL__PHENOMENONTYPE = GOAL__PHENOMENONTYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_GOAL__LABEL = GOAL__LABEL;

	/**
	 * The number of structural features of the '<em>Business Process Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_GOAL_FEATURE_COUNT = GOAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Business Process Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_GOAL_OPERATION_COUNT = GOAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.SatisficingLabelType <em>Satisficing Label Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.SatisficingLabelType
	 * @see bpmn.impl.BpmnPackageImpl#getSatisficingLabelType()
	 * @generated
	 */
	int SATISFICING_LABEL_TYPE = 76;


	/**
	 * The meta object id for the '{@link bpmn.SystemBoundaryType <em>System Boundary Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.SystemBoundaryType
	 * @see bpmn.impl.BpmnPackageImpl#getSystemBoundaryType()
	 * @generated
	 */
	int SYSTEM_BOUNDARY_TYPE = 77;

	/**
	 * The meta object id for the '{@link bpmn.ActivationType <em>Activation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.ActivationType
	 * @see bpmn.impl.BpmnPackageImpl#getActivationType()
	 * @generated
	 */
	int ACTIVATION_TYPE = 78;

	/**
	 * The meta object id for the '{@link bpmn.RelationshipType <em>Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.RelationshipType
	 * @see bpmn.impl.BpmnPackageImpl#getRelationshipType()
	 * @generated
	 */
	int RELATIONSHIP_TYPE = 79;


	/**
	 * The meta object id for the '{@link bpmn.eventBasedGatewayType <em>event Based Gateway Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.eventBasedGatewayType
	 * @see bpmn.impl.BpmnPackageImpl#geteventBasedGatewayType()
	 * @generated
	 */
	int EVENT_BASED_GATEWAY_TYPE = 80;


	/**
	 * Returns the meta object for class '{@link bpmn.ComplexGateway <em>Complex Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Gateway</em>'.
	 * @see bpmn.ComplexGateway
	 * @generated
	 */
	EClass getComplexGateway();

	/**
	 * Returns the meta object for class '{@link bpmn.ReceiveTask <em>Receive Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Task</em>'.
	 * @see bpmn.ReceiveTask
	 * @generated
	 */
	EClass getReceiveTask();

	/**
	 * Returns the meta object for class '{@link bpmn.ManualTask <em>Manual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manual Task</em>'.
	 * @see bpmn.ManualTask
	 * @generated
	 */
	EClass getManualTask();

	/**
	 * Returns the meta object for class '{@link bpmn.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway</em>'.
	 * @see bpmn.Gateway
	 * @generated
	 */
	EClass getGateway();

	/**
	 * Returns the meta object for class '{@link bpmn.Pool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pool</em>'.
	 * @see bpmn.Pool
	 * @generated
	 */
	EClass getPool();

	/**
	 * Returns the meta object for the containment reference list '{@link bpmn.Pool#getContainLane <em>Contain Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contain Lane</em>'.
	 * @see bpmn.Pool#getContainLane()
	 * @see #getPool()
	 * @generated
	 */
	EReference getPool_ContainLane();

	/**
	 * Returns the meta object for class '{@link bpmn.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see bpmn.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link bpmn.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see bpmn.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.Artifact#getContribTypeToParent <em>Contrib Type To Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contrib Type To Parent</em>'.
	 * @see bpmn.Artifact#getContribTypeToParent()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_ContribTypeToParent();

	/**
	 * Returns the meta object for class '{@link bpmn.NFRSoftsolution <em>NFR Softsolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFR Softsolution</em>'.
	 * @see bpmn.NFRSoftsolution
	 * @generated
	 */
	EClass getNFRSoftsolution();

	/**
	 * Returns the meta object for class '{@link bpmn.Decomposition <em>Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decomposition</em>'.
	 * @see bpmn.Decomposition
	 * @generated
	 */
	EClass getDecomposition();

	/**
	 * Returns the meta object for class '{@link bpmn.InclusiveGateway <em>Inclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inclusive Gateway</em>'.
	 * @see bpmn.InclusiveGateway
	 * @generated
	 */
	EClass getInclusiveGateway();

	/**
	 * Returns the meta object for class '{@link bpmn.SomePlus <em>Some Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Some Plus</em>'.
	 * @see bpmn.SomePlus
	 * @generated
	 */
	EClass getSomePlus();

	/**
	 * Returns the meta object for class '{@link bpmn.ANDDecomposition <em>AND Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AND Decomposition</em>'.
	 * @see bpmn.ANDDecomposition
	 * @generated
	 */
	EClass getANDDecomposition();

	/**
	 * Returns the meta object for class '{@link bpmn.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see bpmn.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.Activity#getBoundaryEventRefs <em>Boundary Event Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Boundary Event Refs</em>'.
	 * @see bpmn.Activity#getBoundaryEventRefs()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_BoundaryEventRefs();

	/**
	 * Returns the meta object for class '{@link bpmn.Swimlane <em>Swimlane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swimlane</em>'.
	 * @see bpmn.Swimlane
	 * @generated
	 */
	EClass getSwimlane();

	/**
	 * Returns the meta object for class '{@link bpmn.ClaimSoftsolution <em>Claim Softsolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Claim Softsolution</em>'.
	 * @see bpmn.ClaimSoftsolution
	 * @generated
	 */
	EClass getClaimSoftsolution();

	/**
	 * Returns the meta object for class '{@link bpmn.EndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Event</em>'.
	 * @see bpmn.EndEvent
	 * @generated
	 */
	EClass getEndEvent();

	/**
	 * Returns the meta object for class '{@link bpmn.EvenbasedGateway <em>Evenbased Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evenbased Gateway</em>'.
	 * @see bpmn.EvenbasedGateway
	 * @generated
	 */
	EClass getEvenbasedGateway();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.EvenbasedGateway#getEventGatewayType <em>Event Gateway Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Gateway Type</em>'.
	 * @see bpmn.EvenbasedGateway#getEventGatewayType()
	 * @see #getEvenbasedGateway()
	 * @generated
	 */
	EAttribute getEvenbasedGateway_EventGatewayType();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.EvenbasedGateway#isIsInstanciate <em>Is Instanciate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Instanciate</em>'.
	 * @see bpmn.EvenbasedGateway#isIsInstanciate()
	 * @see #getEvenbasedGateway()
	 * @generated
	 */
	EAttribute getEvenbasedGateway_IsInstanciate();

	/**
	 * Returns the meta object for class '{@link bpmn.DataInput <em>Data Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Input</em>'.
	 * @see bpmn.DataInput
	 * @generated
	 */
	EClass getDataInput();

	/**
	 * Returns the meta object for class '{@link bpmn.DataOutput <em>Data Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Output</em>'.
	 * @see bpmn.DataOutput
	 * @generated
	 */
	EClass getDataOutput();

	/**
	 * Returns the meta object for class '{@link bpmn.IntermediateCatchEvent <em>Intermediate Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Catch Event</em>'.
	 * @see bpmn.IntermediateCatchEvent
	 * @generated
	 */
	EClass getIntermediateCatchEvent();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.IntermediateCatchEvent#getIsInterrupt <em>Is Interrupt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Interrupt</em>'.
	 * @see bpmn.IntermediateCatchEvent#getIsInterrupt()
	 * @see #getIntermediateCatchEvent()
	 * @generated
	 */
	EAttribute getIntermediateCatchEvent_IsInterrupt();

	/**
	 * Returns the meta object for class '{@link bpmn.IntermediateEndEvent <em>Intermediate End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate End Event</em>'.
	 * @see bpmn.IntermediateEndEvent
	 * @generated
	 */
	EClass getIntermediateEndEvent();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.IntermediateEndEvent#getIsInterrupt <em>Is Interrupt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Interrupt</em>'.
	 * @see bpmn.IntermediateEndEvent#getIsInterrupt()
	 * @see #getIntermediateEndEvent()
	 * @generated
	 */
	EAttribute getIntermediateEndEvent_IsInterrupt();

	/**
	 * Returns the meta object for class '{@link bpmn.DataAssociation <em>Data Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Association</em>'.
	 * @see bpmn.DataAssociation
	 * @generated
	 */
	EClass getDataAssociation();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.DataAssociation#getDataAssociateObject <em>Data Associate Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Associate Object</em>'.
	 * @see bpmn.DataAssociation#getDataAssociateObject()
	 * @see #getDataAssociation()
	 * @generated
	 */
	EReference getDataAssociation_DataAssociateObject();

	/**
	 * Returns the meta object for class '{@link bpmn.BigQuery <em>Big Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Big Query</em>'.
	 * @see bpmn.BigQuery
	 * @generated
	 */
	EClass getBigQuery();

	/**
	 * Returns the meta object for the reference '{@link bpmn.BigQuery#getPhenomenontype <em>Phenomenontype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phenomenontype</em>'.
	 * @see bpmn.BigQuery#getPhenomenontype()
	 * @see #getBigQuery()
	 * @generated
	 */
	EReference getBigQuery_Phenomenontype();

	/**
	 * Returns the meta object for class '{@link bpmn.KPIGoal <em>KPI Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KPI Goal</em>'.
	 * @see bpmn.KPIGoal
	 * @generated
	 */
	EClass getKPIGoal();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.KPIGoal#getKpi <em>Kpi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Kpi</em>'.
	 * @see bpmn.KPIGoal#getKpi()
	 * @see #getKPIGoal()
	 * @generated
	 */
	EReference getKPIGoal_Kpi();

	/**
	 * Returns the meta object for class '{@link bpmn.KPI <em>KPI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KPI</em>'.
	 * @see bpmn.KPI
	 * @generated
	 */
	EClass getKPI();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.KPI#getKpigoal <em>Kpigoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Kpigoal</em>'.
	 * @see bpmn.KPI#getKpigoal()
	 * @see #getKPI()
	 * @generated
	 */
	EReference getKPI_Kpigoal();

	/**
	 * Returns the meta object for class '{@link bpmn.BusinessGoal <em>Business Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Goal</em>'.
	 * @see bpmn.BusinessGoal
	 * @generated
	 */
	EClass getBusinessGoal();

	/**
	 * Returns the meta object for class '{@link bpmn.BusinessProcessGoal <em>Business Process Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Process Goal</em>'.
	 * @see bpmn.BusinessProcessGoal
	 * @generated
	 */
	EClass getBusinessProcessGoal();

	/**
	 * Returns the meta object for class '{@link bpmn.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see bpmn.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.Goal#getPhenomenontype <em>Phenomenontype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Phenomenontype</em>'.
	 * @see bpmn.Goal#getPhenomenontype()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Phenomenontype();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.Goal#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see bpmn.Goal#getLabel()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Label();

	/**
	 * Returns the meta object for class '{@link bpmn.BusinessConcepts <em>Business Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Concepts</em>'.
	 * @see bpmn.BusinessConcepts
	 * @generated
	 */
	EClass getBusinessConcepts();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.BusinessConcepts#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmn.BusinessConcepts#getName()
	 * @see #getBusinessConcepts()
	 * @generated
	 */
	EAttribute getBusinessConcepts_Name();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.BusinessConcepts#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent</em>'.
	 * @see bpmn.BusinessConcepts#getParent()
	 * @see #getBusinessConcepts()
	 * @generated
	 */
	EReference getBusinessConcepts_Parent();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.BusinessConcepts#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child</em>'.
	 * @see bpmn.BusinessConcepts#getChild()
	 * @see #getBusinessConcepts()
	 * @generated
	 */
	EReference getBusinessConcepts_Child();

	/**
	 * Returns the meta object for the containment reference list '{@link bpmn.BusinessConcepts#getContribTypeToParents <em>Contrib Type To Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contrib Type To Parents</em>'.
	 * @see bpmn.BusinessConcepts#getContribTypeToParents()
	 * @see #getBusinessConcepts()
	 * @generated
	 */
	EReference getBusinessConcepts_ContribTypeToParents();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.BusinessConcepts#getTopicChild <em>Topic Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Topic Child</em>'.
	 * @see bpmn.BusinessConcepts#getTopicChild()
	 * @see #getBusinessConcepts()
	 * @generated
	 */
	EReference getBusinessConcepts_TopicChild();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.BusinessConcepts#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Topic</em>'.
	 * @see bpmn.BusinessConcepts#getTopic()
	 * @see #getBusinessConcepts()
	 * @generated
	 */
	EReference getBusinessConcepts_Topic();

	/**
	 * Returns the meta object for class '{@link bpmn.ParallelGateway <em>Parallel Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Gateway</em>'.
	 * @see bpmn.ParallelGateway
	 * @generated
	 */
	EClass getParallelGateway();

	/**
	 * Returns the meta object for class '{@link bpmn.Satisficing <em>Satisficing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satisficing</em>'.
	 * @see bpmn.Satisficing
	 * @generated
	 */
	EClass getSatisficing();

	/**
	 * Returns the meta object for class '{@link bpmn.ExclusiveGateway <em>Exclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Gateway</em>'.
	 * @see bpmn.ExclusiveGateway
	 * @generated
	 */
	EClass getExclusiveGateway();

	/**
	 * Returns the meta object for class '{@link bpmn.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Object</em>'.
	 * @see bpmn.DataObject
	 * @generated
	 */
	EClass getDataObject();

	/**
	 * Returns the meta object for class '{@link bpmn.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lane</em>'.
	 * @see bpmn.Lane
	 * @generated
	 */
	EClass getLane();

	/**
	 * Returns the meta object for the containment reference list '{@link bpmn.Lane#getGraphicObj <em>Graphic Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graphic Obj</em>'.
	 * @see bpmn.Lane#getGraphicObj()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_GraphicObj();

	/**
	 * Returns the meta object for class '{@link bpmn.FlowObject <em>Flow Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Object</em>'.
	 * @see bpmn.FlowObject
	 * @generated
	 */
	EClass getFlowObject();

	/**
	 * Returns the meta object for the containment reference list '{@link bpmn.FlowObject#getSequenceFlows <em>Sequence Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Flows</em>'.
	 * @see bpmn.FlowObject#getSequenceFlows()
	 * @see #getFlowObject()
	 * @generated
	 */
	EReference getFlowObject_SequenceFlows();

	/**
	 * Returns the meta object for class '{@link bpmn.SendTask <em>Send Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Task</em>'.
	 * @see bpmn.SendTask
	 * @generated
	 */
	EClass getSendTask();

	/**
	 * Returns the meta object for class '{@link bpmn.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see bpmn.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for class '{@link bpmn.OperationalizingSoftsolution <em>Operationalizing Softsolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operationalizing Softsolution</em>'.
	 * @see bpmn.OperationalizingSoftsolution
	 * @generated
	 */
	EClass getOperationalizingSoftsolution();

	/**
	 * Returns the meta object for class '{@link bpmn.ThrowEvent <em>Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throw Event</em>'.
	 * @see bpmn.ThrowEvent
	 * @generated
	 */
	EClass getThrowEvent();

	/**
	 * Returns the meta object for the containment reference '{@link bpmn.ThrowEvent#getThrowEventDefinition <em>Throw Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throw Event Definition</em>'.
	 * @see bpmn.ThrowEvent#getThrowEventDefinition()
	 * @see #getThrowEvent()
	 * @generated
	 */
	EReference getThrowEvent_ThrowEventDefinition();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.ThrowEvent#getThrowEventDefinitionRef <em>Throw Event Definition Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Throw Event Definition Ref</em>'.
	 * @see bpmn.ThrowEvent#getThrowEventDefinitionRef()
	 * @see #getThrowEvent()
	 * @generated
	 */
	EReference getThrowEvent_ThrowEventDefinitionRef();

	/**
	 * Returns the meta object for class '{@link bpmn.AbstractTask <em>Abstract Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Task</em>'.
	 * @see bpmn.AbstractTask
	 * @generated
	 */
	EClass getAbstractTask();

	/**
	 * Returns the meta object for the containment reference '{@link bpmn.AbstractTask#getTaskBoundaryEventRefs <em>Task Boundary Event Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task Boundary Event Refs</em>'.
	 * @see bpmn.AbstractTask#getTaskBoundaryEventRefs()
	 * @see #getAbstractTask()
	 * @generated
	 */
	EReference getAbstractTask_TaskBoundaryEventRefs();

	/**
	 * Returns the meta object for class '{@link bpmn.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see bpmn.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for class '{@link bpmn.MessageFlow <em>Message Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Flow</em>'.
	 * @see bpmn.MessageFlow
	 * @generated
	 */
	EClass getMessageFlow();

	/**
	 * Returns the meta object for the reference '{@link bpmn.MessageFlow#getMessageFlowObject <em>Message Flow Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Flow Object</em>'.
	 * @see bpmn.MessageFlow#getMessageFlowObject()
	 * @see #getMessageFlow()
	 * @generated
	 */
	EReference getMessageFlow_MessageFlowObject();

	/**
	 * Returns the meta object for class '{@link bpmn.SubProcess <em>Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Process</em>'.
	 * @see bpmn.SubProcess
	 * @generated
	 */
	EClass getSubProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link bpmn.SubProcess#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see bpmn.SubProcess#getChildren()
	 * @see #getSubProcess()
	 * @generated
	 */
	EReference getSubProcess_Children();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.SubProcess#getIsCollapsed <em>Is Collapsed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Collapsed</em>'.
	 * @see bpmn.SubProcess#getIsCollapsed()
	 * @see #getSubProcess()
	 * @generated
	 */
	EAttribute getSubProcess_IsCollapsed();

	/**
	 * Returns the meta object for class '{@link bpmn.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see bpmn.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for class '{@link bpmn.Timer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer</em>'.
	 * @see bpmn.Timer
	 * @generated
	 */
	EClass getTimer();

	/**
	 * Returns the meta object for class '{@link bpmn.Error <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error</em>'.
	 * @see bpmn.Error
	 * @generated
	 */
	EClass getError();

	/**
	 * Returns the meta object for class '{@link bpmn.Multiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple</em>'.
	 * @see bpmn.Multiple
	 * @generated
	 */
	EClass getMultiple();

	/**
	 * Returns the meta object for class '{@link bpmn.SomeMinus <em>Some Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Some Minus</em>'.
	 * @see bpmn.SomeMinus
	 * @generated
	 */
	EClass getSomeMinus();

	/**
	 * Returns the meta object for class '{@link bpmn.Help <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Help</em>'.
	 * @see bpmn.Help
	 * @generated
	 */
	EClass getHelp();

	/**
	 * Returns the meta object for class '{@link bpmn.BusinessRulesTask <em>Business Rules Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Rules Task</em>'.
	 * @see bpmn.BusinessRulesTask
	 * @generated
	 */
	EClass getBusinessRulesTask();

	/**
	 * Returns the meta object for class '{@link bpmn.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see bpmn.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for class '{@link bpmn.Hurt <em>Hurt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hurt</em>'.
	 * @see bpmn.Hurt
	 * @generated
	 */
	EClass getHurt();

	/**
	 * Returns the meta object for class '{@link bpmn.SequenceFlow <em>Sequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Flow</em>'.
	 * @see bpmn.SequenceFlow
	 * @generated
	 */
	EClass getSequenceFlow();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.SequenceFlow#getTargetFlowObject <em>Target Flow Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Flow Object</em>'.
	 * @see bpmn.SequenceFlow#getTargetFlowObject()
	 * @see #getSequenceFlow()
	 * @generated
	 */
	EReference getSequenceFlow_TargetFlowObject();

	/**
	 * Returns the meta object for class '{@link bpmn.PositiveSatisficing <em>Positive Satisficing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Satisficing</em>'.
	 * @see bpmn.PositiveSatisficing
	 * @generated
	 */
	EClass getPositiveSatisficing();

	/**
	 * Returns the meta object for class '{@link bpmn.EQLDecomposition <em>EQL Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EQL Decomposition</em>'.
	 * @see bpmn.EQLDecomposition
	 * @generated
	 */
	EClass getEQLDecomposition();

	/**
	 * Returns the meta object for class '{@link bpmn.Break <em>Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break</em>'.
	 * @see bpmn.Break
	 * @generated
	 */
	EClass getBreak();

	/**
	 * Returns the meta object for class '{@link bpmn.ConnectingObject <em>Connecting Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connecting Object</em>'.
	 * @see bpmn.ConnectingObject
	 * @generated
	 */
	EClass getConnectingObject();

	/**
	 * Returns the meta object for class '{@link bpmn.CatchEvent <em>Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch Event</em>'.
	 * @see bpmn.CatchEvent
	 * @generated
	 */
	EClass getCatchEvent();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.CatchEvent#getParallelMultiple <em>Parallel Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallel Multiple</em>'.
	 * @see bpmn.CatchEvent#getParallelMultiple()
	 * @see #getCatchEvent()
	 * @generated
	 */
	EAttribute getCatchEvent_ParallelMultiple();

	/**
	 * Returns the meta object for the containment reference '{@link bpmn.CatchEvent#getCatchEventDefinition <em>Catch Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catch Event Definition</em>'.
	 * @see bpmn.CatchEvent#getCatchEventDefinition()
	 * @see #getCatchEvent()
	 * @generated
	 */
	EReference getCatchEvent_CatchEventDefinition();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.CatchEvent#getCatchEventDefinitionRef <em>Catch Event Definition Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Catch Event Definition Ref</em>'.
	 * @see bpmn.CatchEvent#getCatchEventDefinitionRef()
	 * @see #getCatchEvent()
	 * @generated
	 */
	EReference getCatchEvent_CatchEventDefinitionRef();

	/**
	 * Returns the meta object for class '{@link bpmn.StartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Event</em>'.
	 * @see bpmn.StartEvent
	 * @generated
	 */
	EClass getStartEvent();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.StartEvent#getIsInterrupt <em>Is Interrupt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Interrupt</em>'.
	 * @see bpmn.StartEvent#getIsInterrupt()
	 * @see #getStartEvent()
	 * @generated
	 */
	EAttribute getStartEvent_IsInterrupt();

	/**
	 * Returns the meta object for class '{@link bpmn.BoundaryEvent <em>Boundary Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boundary Event</em>'.
	 * @see bpmn.BoundaryEvent
	 * @generated
	 */
	EClass getBoundaryEvent();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.BoundaryEvent#getCancelActivity <em>Cancel Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Activity</em>'.
	 * @see bpmn.BoundaryEvent#getCancelActivity()
	 * @see #getBoundaryEvent()
	 * @generated
	 */
	EAttribute getBoundaryEvent_CancelActivity();

	/**
	 * Returns the meta object for the reference '{@link bpmn.BoundaryEvent#getAttachedToRef <em>Attached To Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attached To Ref</em>'.
	 * @see bpmn.BoundaryEvent#getAttachedToRef()
	 * @see #getBoundaryEvent()
	 * @generated
	 */
	EReference getBoundaryEvent_AttachedToRef();

	/**
	 * Returns the meta object for class '{@link bpmn.EventDefinition <em>Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Definition</em>'.
	 * @see bpmn.EventDefinition
	 * @generated
	 */
	EClass getEventDefinition();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.EventDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmn.EventDefinition#getName()
	 * @see #getEventDefinition()
	 * @generated
	 */
	EAttribute getEventDefinition_Name();

	/**
	 * Returns the meta object for class '{@link bpmn.None <em>None</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>None</em>'.
	 * @see bpmn.None
	 * @generated
	 */
	EClass getNone();

	/**
	 * Returns the meta object for class '{@link bpmn.BPMNRootElement <em>BPMN Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BPMN Root Element</em>'.
	 * @see bpmn.BPMNRootElement
	 * @generated
	 */
	EClass getBPMNRootElement();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.BPMNRootElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmn.BPMNRootElement#getName()
	 * @see #getBPMNRootElement()
	 * @generated
	 */
	EAttribute getBPMNRootElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link bpmn.BPMNRootElement#getBPMNReference <em>BPMN Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BPMN Reference</em>'.
	 * @see bpmn.BPMNRootElement#getBPMNReference()
	 * @see #getBPMNRootElement()
	 * @generated
	 */
	EReference getBPMNRootElement_BPMNReference();

	/**
	 * Returns the meta object for the containment reference list '{@link bpmn.BPMNRootElement#getBusinessConceptEReference <em>Business Concept EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Concept EReference</em>'.
	 * @see bpmn.BPMNRootElement#getBusinessConceptEReference()
	 * @see #getBPMNRootElement()
	 * @generated
	 */
	EReference getBPMNRootElement_BusinessConceptEReference();

	/**
	 * Returns the meta object for class '{@link bpmn.Make <em>Make</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Make</em>'.
	 * @see bpmn.Make
	 * @generated
	 */
	EClass getMake();

	/**
	 * Returns the meta object for class '{@link bpmn.NegativeSatisficing <em>Negative Satisficing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Satisficing</em>'.
	 * @see bpmn.NegativeSatisficing
	 * @generated
	 */
	EClass getNegativeSatisficing();

	/**
	 * Returns the meta object for class '{@link bpmn.UserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Task</em>'.
	 * @see bpmn.UserTask
	 * @generated
	 */
	EClass getUserTask();

	/**
	 * Returns the meta object for class '{@link bpmn.GraphcialObject <em>Graphcial Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphcial Object</em>'.
	 * @see bpmn.GraphcialObject
	 * @generated
	 */
	EClass getGraphcialObject();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.GraphcialObject#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Artifact</em>'.
	 * @see bpmn.GraphcialObject#getArtifact()
	 * @see #getGraphcialObject()
	 * @generated
	 */
	EReference getGraphcialObject_Artifact();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.GraphcialObject#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see bpmn.GraphcialObject#getLabel()
	 * @see #getGraphcialObject()
	 * @generated
	 */
	EAttribute getGraphcialObject_Label();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.GraphcialObject#getBusinessconceptsParent <em>Businessconcepts Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Businessconcepts Parent</em>'.
	 * @see bpmn.GraphcialObject#getBusinessconceptsParent()
	 * @see #getGraphcialObject()
	 * @generated
	 */
	EReference getGraphcialObject_BusinessconceptsParent();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.GraphcialObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see bpmn.GraphcialObject#getType()
	 * @see #getGraphcialObject()
	 * @generated
	 */
	EReference getGraphcialObject_Type();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.GraphcialObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmn.GraphcialObject#getName()
	 * @see #getGraphcialObject()
	 * @generated
	 */
	EAttribute getGraphcialObject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link bpmn.GraphcialObject#getLocalBusinessConcept <em>Local Business Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Business Concept</em>'.
	 * @see bpmn.GraphcialObject#getLocalBusinessConcept()
	 * @see #getGraphcialObject()
	 * @generated
	 */
	EReference getGraphcialObject_LocalBusinessConcept();

	/**
	 * Returns the meta object for the containment reference list '{@link bpmn.GraphcialObject#getContribTypeToParents <em>Contrib Type To Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contrib Type To Parents</em>'.
	 * @see bpmn.GraphcialObject#getContribTypeToParents()
	 * @see #getGraphcialObject()
	 * @generated
	 */
	EReference getGraphcialObject_ContribTypeToParents();

	/**
	 * Returns the meta object for class '{@link bpmn.SoftSolution <em>Soft Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soft Solution</em>'.
	 * @see bpmn.SoftSolution
	 * @generated
	 */
	EClass getSoftSolution();

	/**
	 * Returns the meta object for class '{@link bpmn.ORDecomposition <em>OR Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OR Decomposition</em>'.
	 * @see bpmn.ORDecomposition
	 * @generated
	 */
	EClass getORDecomposition();

	/**
	 * Returns the meta object for class '{@link bpmn.ServiceTask <em>Service Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Task</em>'.
	 * @see bpmn.ServiceTask
	 * @generated
	 */
	EClass getServiceTask();

	/**
	 * Returns the meta object for class '{@link bpmn.Contribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contribution</em>'.
	 * @see bpmn.Contribution
	 * @generated
	 */
	EClass getContribution();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.Contribution#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmn.Contribution#getName()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_Name();

	/**
	 * Returns the meta object for the reference '{@link bpmn.Contribution#getTargetBusinessConcept <em>Target Business Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Business Concept</em>'.
	 * @see bpmn.Contribution#getTargetBusinessConcept()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_TargetBusinessConcept();

	/**
	 * Returns the meta object for class '{@link bpmn.PhenomenonType <em>Phenomenon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phenomenon Type</em>'.
	 * @see bpmn.PhenomenonType
	 * @generated
	 */
	EClass getPhenomenonType();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.PhenomenonType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmn.PhenomenonType#getType()
	 * @see #getPhenomenonType()
	 * @generated
	 */
	EAttribute getPhenomenonType_Type();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.PhenomenonType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see bpmn.PhenomenonType#getLabel()
	 * @see #getPhenomenonType()
	 * @generated
	 */
	EAttribute getPhenomenonType_Label();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.PhenomenonType#getBigquery <em>Bigquery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bigquery</em>'.
	 * @see bpmn.PhenomenonType#getBigquery()
	 * @see #getPhenomenonType()
	 * @generated
	 */
	EReference getPhenomenonType_Bigquery();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.PhenomenonType#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Goal</em>'.
	 * @see bpmn.PhenomenonType#getGoal()
	 * @see #getPhenomenonType()
	 * @generated
	 */
	EReference getPhenomenonType_Goal();

	/**
	 * Returns the meta object for class '{@link bpmn.SoftProblem <em>Soft Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soft Problem</em>'.
	 * @see bpmn.SoftProblem
	 * @generated
	 */
	EClass getSoftProblem();

	/**
	 * Returns the meta object for class '{@link bpmn.UndesirableSituation <em>Undesirable Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undesirable Situation</em>'.
	 * @see bpmn.UndesirableSituation
	 * @generated
	 */
	EClass getUndesirableSituation();

	/**
	 * Returns the meta object for class '{@link bpmn.UndesirableOperationalization <em>Undesirable Operationalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undesirable Operationalization</em>'.
	 * @see bpmn.UndesirableOperationalization
	 * @generated
	 */
	EClass getUndesirableOperationalization();

	/**
	 * Returns the meta object for class '{@link bpmn.CausalAttribution <em>Causal Attribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Causal Attribution</em>'.
	 * @see bpmn.CausalAttribution
	 * @generated
	 */
	EClass getCausalAttribution();

	/**
	 * Returns the meta object for enum '{@link bpmn.SatisficingLabelType <em>Satisficing Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Satisficing Label Type</em>'.
	 * @see bpmn.SatisficingLabelType
	 * @generated
	 */
	EEnum getSatisficingLabelType();

	/**
	 * Returns the meta object for enum '{@link bpmn.SystemBoundaryType <em>System Boundary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>System Boundary Type</em>'.
	 * @see bpmn.SystemBoundaryType
	 * @generated
	 */
	EEnum getSystemBoundaryType();

	/**
	 * Returns the meta object for enum '{@link bpmn.ActivationType <em>Activation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activation Type</em>'.
	 * @see bpmn.ActivationType
	 * @generated
	 */
	EEnum getActivationType();

	/**
	 * Returns the meta object for enum '{@link bpmn.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relationship Type</em>'.
	 * @see bpmn.RelationshipType
	 * @generated
	 */
	EEnum getRelationshipType();

	/**
	 * Returns the meta object for enum '{@link bpmn.eventBasedGatewayType <em>event Based Gateway Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>event Based Gateway Type</em>'.
	 * @see bpmn.eventBasedGatewayType
	 * @generated
	 */
	EEnum geteventBasedGatewayType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BpmnFactory getBpmnFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bpmn.impl.ComplexGatewayImpl <em>Complex Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.ComplexGatewayImpl
		 * @see bpmn.impl.BpmnPackageImpl#getComplexGateway()
		 * @generated
		 */
		EClass COMPLEX_GATEWAY = eINSTANCE.getComplexGateway();

		/**
		 * The meta object literal for the '{@link bpmn.impl.ReceiveTaskImpl <em>Receive Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.ReceiveTaskImpl
		 * @see bpmn.impl.BpmnPackageImpl#getReceiveTask()
		 * @generated
		 */
		EClass RECEIVE_TASK = eINSTANCE.getReceiveTask();

		/**
		 * The meta object literal for the '{@link bpmn.impl.ManualTaskImpl <em>Manual Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.ManualTaskImpl
		 * @see bpmn.impl.BpmnPackageImpl#getManualTask()
		 * @generated
		 */
		EClass MANUAL_TASK = eINSTANCE.getManualTask();

		/**
		 * The meta object literal for the '{@link bpmn.impl.GatewayImpl <em>Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.GatewayImpl
		 * @see bpmn.impl.BpmnPackageImpl#getGateway()
		 * @generated
		 */
		EClass GATEWAY = eINSTANCE.getGateway();

		/**
		 * The meta object literal for the '{@link bpmn.impl.PoolImpl <em>Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.PoolImpl
		 * @see bpmn.impl.BpmnPackageImpl#getPool()
		 * @generated
		 */
		EClass POOL = eINSTANCE.getPool();

		/**
		 * The meta object literal for the '<em><b>Contain Lane</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POOL__CONTAIN_LANE = eINSTANCE.getPool_ContainLane();

		/**
		 * The meta object literal for the '{@link bpmn.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.EventImpl
		 * @see bpmn.impl.BpmnPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link bpmn.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.ArtifactImpl
		 * @see bpmn.impl.BpmnPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Contrib Type To Parent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__CONTRIB_TYPE_TO_PARENT = eINSTANCE.getArtifact_ContribTypeToParent();

		/**
		 * The meta object literal for the '{@link bpmn.impl.NFRSoftsolutionImpl <em>NFR Softsolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.NFRSoftsolutionImpl
		 * @see bpmn.impl.BpmnPackageImpl#getNFRSoftsolution()
		 * @generated
		 */
		EClass NFR_SOFTSOLUTION = eINSTANCE.getNFRSoftsolution();

		/**
		 * The meta object literal for the '{@link bpmn.impl.DecompositionImpl <em>Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.DecompositionImpl
		 * @see bpmn.impl.BpmnPackageImpl#getDecomposition()
		 * @generated
		 */
		EClass DECOMPOSITION = eINSTANCE.getDecomposition();

		/**
		 * The meta object literal for the '{@link bpmn.impl.InclusiveGatewayImpl <em>Inclusive Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.InclusiveGatewayImpl
		 * @see bpmn.impl.BpmnPackageImpl#getInclusiveGateway()
		 * @generated
		 */
		EClass INCLUSIVE_GATEWAY = eINSTANCE.getInclusiveGateway();

		/**
		 * The meta object literal for the '{@link bpmn.impl.SomePlusImpl <em>Some Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.SomePlusImpl
		 * @see bpmn.impl.BpmnPackageImpl#getSomePlus()
		 * @generated
		 */
		EClass SOME_PLUS = eINSTANCE.getSomePlus();

		/**
		 * The meta object literal for the '{@link bpmn.impl.ANDDecompositionImpl <em>AND Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.ANDDecompositionImpl
		 * @see bpmn.impl.BpmnPackageImpl#getANDDecomposition()
		 * @generated
		 */
		EClass AND_DECOMPOSITION = eINSTANCE.getANDDecomposition();

		/**
		 * The meta object literal for the '{@link bpmn.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.ActivityImpl
		 * @see bpmn.impl.BpmnPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Boundary Event Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__BOUNDARY_EVENT_REFS = eINSTANCE.getActivity_BoundaryEventRefs();

		/**
		 * The meta object literal for the '{@link bpmn.impl.SwimlaneImpl <em>Swimlane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.SwimlaneImpl
		 * @see bpmn.impl.BpmnPackageImpl#getSwimlane()
		 * @generated
		 */
		EClass SWIMLANE = eINSTANCE.getSwimlane();

		/**
		 * The meta object literal for the '{@link bpmn.impl.ClaimSoftsolutionImpl <em>Claim Softsolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.ClaimSoftsolutionImpl
		 * @see bpmn.impl.BpmnPackageImpl#getClaimSoftsolution()
		 * @generated
		 */
		EClass CLAIM_SOFTSOLUTION = eINSTANCE.getClaimSoftsolution();

		/**
		 * The meta object literal for the '{@link bpmn.impl.EndEventImpl <em>End Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.EndEventImpl
		 * @see bpmn.impl.BpmnPackageImpl#getEndEvent()
		 * @generated
		 */
		EClass END_EVENT = eINSTANCE.getEndEvent();

		/**
		 * The meta object literal for the '{@link bpmn.impl.EvenbasedGatewayImpl <em>Evenbased Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.EvenbasedGatewayImpl
		 * @see bpmn.impl.BpmnPackageImpl#getEvenbasedGateway()
		 * @generated
		 */
		EClass EVENBASED_GATEWAY = eINSTANCE.getEvenbasedGateway();

		/**
		 * The meta object literal for the '<em><b>Event Gateway Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENBASED_GATEWAY__EVENT_GATEWAY_TYPE = eINSTANCE.getEvenbasedGateway_EventGatewayType();

		/**
		 * The meta object literal for the '<em><b>Is Instanciate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENBASED_GATEWAY__IS_INSTANCIATE = eINSTANCE.getEvenbasedGateway_IsInstanciate();

		/**
		 * The meta object literal for the '{@link bpmn.impl.DataInputImpl <em>Data Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.DataInputImpl
		 * @see bpmn.impl.BpmnPackageImpl#getDataInput()
		 * @generated
		 */
		EClass DATA_INPUT = eINSTANCE.getDataInput();

		/**
		 * The meta object literal for the '{@link bpmn.impl.DataOutputImpl <em>Data Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.DataOutputImpl
		 * @see bpmn.impl.BpmnPackageImpl#getDataOutput()
		 * @generated
		 */
		EClass DATA_OUTPUT = eINSTANCE.getDataOutput();

		/**
		 * The meta object literal for the '{@link bpmn.impl.IntermediateCatchEventImpl <em>Intermediate Catch Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.IntermediateCatchEventImpl
		 * @see bpmn.impl.BpmnPackageImpl#getIntermediateCatchEvent()
		 * @generated
		 */
		EClass INTERMEDIATE_CATCH_EVENT = eINSTANCE.getIntermediateCatchEvent();

		/**
		 * The meta object literal for the '<em><b>Is Interrupt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERMEDIATE_CATCH_EVENT__IS_INTERRUPT = eINSTANCE.getIntermediateCatchEvent_IsInterrupt();

		/**
		 * The meta object literal for the '{@link bpmn.impl.IntermediateEndEventImpl <em>Intermediate End Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.IntermediateEndEventImpl
		 * @see bpmn.impl.BpmnPackageImpl#getIntermediateEndEvent()
		 * @generated
		 */
		EClass INTERMEDIATE_END_EVENT = eINSTANCE.getIntermediateEndEvent();

		/**
		 * The meta object literal for the '<em><b>Is Interrupt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERMEDIATE_END_EVENT__IS_INTERRUPT = eINSTANCE.getIntermediateEndEvent_IsInterrupt();

		/**
		 * The meta object literal for the '{@link bpmn.impl.DataAssociationImpl <em>Data Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.DataAssociationImpl
		 * @see bpmn.impl.BpmnPackageImpl#getDataAssociation()
		 * @generated
		 */
		EClass DATA_ASSOCIATION = eINSTANCE.getDataAssociation();

		/**
		 * The meta object literal for the '<em><b>Data Associate Object</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ASSOCIATION__DATA_ASSOCIATE_OBJECT = eINSTANCE.getDataAssociation_DataAssociateObject();

		/**
		 * The meta object literal for the '{@link bpmn.impl.BigQueryImpl <em>Big Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.BigQueryImpl
		 * @see bpmn.impl.BpmnPackageImpl#getBigQuery()
		 * @generated
		 */
		EClass BIG_QUERY = eINSTANCE.getBigQuery();

		/**
		 * The meta object literal for the '<em><b>Phenomenontype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIG_QUERY__PHENOMENONTYPE = eINSTANCE.getBigQuery_Phenomenontype();

		/**
		 * The meta object literal for the '{@link bpmn.impl.KPIGoalImpl <em>KPI Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.KPIGoalImpl
		 * @see bpmn.impl.BpmnPackageImpl#getKPIGoal()
		 * @generated
		 */
		EClass KPI_GOAL = eINSTANCE.getKPIGoal();

		/**
		 * The meta object literal for the '<em><b>Kpi</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KPI_GOAL__KPI = eINSTANCE.getKPIGoal_Kpi();

		/**
		 * The meta object literal for the '{@link bpmn.impl.KPIImpl <em>KPI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.KPIImpl
		 * @see bpmn.impl.BpmnPackageImpl#getKPI()
		 * @generated
		 */
		EClass KPI = eINSTANCE.getKPI();

		/**
		 * The meta object literal for the '<em><b>Kpigoal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KPI__KPIGOAL = eINSTANCE.getKPI_Kpigoal();

		/**
		 * The meta object literal for the '{@link bpmn.impl.BusinessGoalImpl <em>Business Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.BusinessGoalImpl
		 * @see bpmn.impl.BpmnPackageImpl#getBusinessGoal()
		 * @generated
		 */
		EClass BUSINESS_GOAL = eINSTANCE.getBusinessGoal();

		/**
		 * The meta object literal for the '{@link bpmn.impl.BusinessProcessGoalImpl <em>Business Process Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.BusinessProcessGoalImpl
		 * @see bpmn.impl.BpmnPackageImpl#getBusinessProcessGoal()
		 * @generated
		 */
		EClass BUSINESS_PROCESS_GOAL = eINSTANCE.getBusinessProcessGoal();

		/**
		 * The meta object literal for the '{@link bpmn.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.GoalImpl
		 * @see bpmn.impl.BpmnPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Phenomenontype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__PHENOMENONTYPE = eINSTANCE.getGoal_Phenomenontype();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__LABEL = eINSTANCE.getGoal_Label();

		/**
		 * The meta object literal for the '{@link bpmn.impl.BusinessConceptsImpl <em>Business Concepts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.BusinessConceptsImpl
		 * @see bpmn.impl.BpmnPackageImpl#getBusinessConcepts()
		 * @generated
		 */
		EClass BUSINESS_CONCEPTS = eINSTANCE.getBusinessConcepts();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_CONCEPTS__NAME = eINSTANCE.getBusinessConcepts_Name();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_CONCEPTS__PARENT = eINSTANCE.getBusinessConcepts_Parent();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_CONCEPTS__CHILD = eINSTANCE.getBusinessConcepts_Child();

		/**
		 * The meta object literal for the '<em><b>Contrib Type To Parents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_CONCEPTS__CONTRIB_TYPE_TO_PARENTS = eINSTANCE.getBusinessConcepts_ContribTypeToParents();

		/**
		 * The meta object literal for the '<em><b>Topic Child</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_CONCEPTS__TOPIC_CHILD = eINSTANCE.getBusinessConcepts_TopicChild();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_CONCEPTS__TOPIC = eINSTANCE.getBusinessConcepts_Topic();

		/**
		 * The meta object literal for the '{@link bpmn.impl.ParallelGatewayImpl <em>Parallel Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.ParallelGatewayImpl
		 * @see bpmn.impl.BpmnPackageImpl#getParallelGateway()
		 * @generated
		 */
		EClass PARALLEL_GATEWAY = eINSTANCE.getParallelGateway();

		/**
		 * The meta object literal for the '{@link bpmn.impl.SatisficingImpl <em>Satisficing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.SatisficingImpl
		 * @see bpmn.impl.BpmnPackageImpl#getSatisficing()
		 * @generated
		 */
		EClass SATISFICING = eINSTANCE.getSatisficing();

		/**
		 * The meta object literal for the '{@link bpmn.impl.ExclusiveGatewayImpl <em>Exclusive Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.ExclusiveGatewayImpl
		 * @see bpmn.impl.BpmnPackageImpl#getExclusiveGateway()
		 * @generated
		 */
		EClass EXCLUSIVE_GATEWAY = eINSTANCE.getExclusiveGateway();

		/**
		 * The meta object literal for the '{@link bpmn.impl.DataObjectImpl <em>Data Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.DataObjectImpl
		 * @see bpmn.impl.BpmnPackageImpl#getDataObject()
		 * @generated
		 */
		EClass DATA_OBJECT = eINSTANCE.getDataObject();

		/**
		 * The meta object literal for the '{@link bpmn.impl.LaneImpl <em>Lane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.LaneImpl
		 * @see bpmn.impl.BpmnPackageImpl#getLane()
		 * @generated
		 */
		EClass LANE = eINSTANCE.getLane();

		/**
		 * The meta object literal for the '<em><b>Graphic Obj</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__GRAPHIC_OBJ = eINSTANCE.getLane_GraphicObj();

		/**
		 * The meta object literal for the '{@link bpmn.impl.FlowObjectImpl <em>Flow Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.FlowObjectImpl
		 * @see bpmn.impl.BpmnPackageImpl#getFlowObject()
		 * @generated
		 */
		EClass FLOW_OBJECT = eINSTANCE.getFlowObject();

		/**
		 * The meta object literal for the '<em><b>Sequence Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_OBJECT__SEQUENCE_FLOWS = eINSTANCE.getFlowObject_SequenceFlows();

		/**
		 * The meta object literal for the '{@link bpmn.impl.SendTaskImpl <em>Send Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.SendTaskImpl
		 * @see bpmn.impl.BpmnPackageImpl#getSendTask()
		 * @generated
		 */
		EClass SEND_TASK = eINSTANCE.getSendTask();

		/**
		 * The meta object literal for the '{@link bpmn.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.GroupImpl
		 * @see bpmn.impl.BpmnPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '{@link bpmn.impl.OperationalizingSoftsolutionImpl <em>Operationalizing Softsolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.OperationalizingSoftsolutionImpl
		 * @see bpmn.impl.BpmnPackageImpl#getOperationalizingSoftsolution()
		 * @generated
		 */
		EClass OPERATIONALIZING_SOFTSOLUTION = eINSTANCE.getOperationalizingSoftsolution();

		/**
		 * The meta object literal for the '{@link bpmn.impl.ThrowEventImpl <em>Throw Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.ThrowEventImpl
		 * @see bpmn.impl.BpmnPackageImpl#getThrowEvent()
		 * @generated
		 */
		EClass THROW_EVENT = eINSTANCE.getThrowEvent();

		/**
		 * The meta object literal for the '<em><b>Throw Event Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROW_EVENT__THROW_EVENT_DEFINITION = eINSTANCE.getThrowEvent_ThrowEventDefinition();

		/**
		 * The meta object literal for the '<em><b>Throw Event Definition Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROW_EVENT__THROW_EVENT_DEFINITION_REF = eINSTANCE.getThrowEvent_ThrowEventDefinitionRef();

		/**
		 * The meta object literal for the '{@link bpmn.impl.AbstractTaskImpl <em>Abstract Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.AbstractTaskImpl
		 * @see bpmn.impl.BpmnPackageImpl#getAbstractTask()
		 * @generated
		 */
		EClass ABSTRACT_TASK = eINSTANCE.getAbstractTask();

		/**
		 * The meta object literal for the '<em><b>Task Boundary Event Refs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TASK__TASK_BOUNDARY_EVENT_REFS = eINSTANCE.getAbstractTask_TaskBoundaryEventRefs();

		/**
		 * The meta object literal for the '{@link bpmn.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.TaskImpl
		 * @see bpmn.impl.BpmnPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '{@link bpmn.impl.MessageFlowImpl <em>Message Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.MessageFlowImpl
		 * @see bpmn.impl.BpmnPackageImpl#getMessageFlow()
		 * @generated
		 */
		EClass MESSAGE_FLOW = eINSTANCE.getMessageFlow();

		/**
		 * The meta object literal for the '<em><b>Message Flow Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_FLOW__MESSAGE_FLOW_OBJECT = eINSTANCE.getMessageFlow_MessageFlowObject();

		/**
		 * The meta object literal for the '{@link bpmn.impl.SubProcessImpl <em>Sub Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.SubProcessImpl
		 * @see bpmn.impl.BpmnPackageImpl#getSubProcess()
		 * @generated
		 */
		EClass SUB_PROCESS = eINSTANCE.getSubProcess();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_PROCESS__CHILDREN = eINSTANCE.getSubProcess_Children();

		/**
		 * The meta object literal for the '<em><b>Is Collapsed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_PROCESS__IS_COLLAPSED = eINSTANCE.getSubProcess_IsCollapsed();

		/**
		 * The meta object literal for the '{@link bpmn.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.MessageImpl
		 * @see bpmn.impl.BpmnPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '{@link bpmn.impl.TimerImpl <em>Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.TimerImpl
		 * @see bpmn.impl.BpmnPackageImpl#getTimer()
		 * @generated
		 */
		EClass TIMER = eINSTANCE.getTimer();

		/**
		 * The meta object literal for the '{@link bpmn.impl.ErrorImpl <em>Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.ErrorImpl
		 * @see bpmn.impl.BpmnPackageImpl#getError()
		 * @generated
		 */
		EClass ERROR = eINSTANCE.getError();

		/**
		 * The meta object literal for the '{@link bpmn.impl.MultipleImpl <em>Multiple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.MultipleImpl
		 * @see bpmn.impl.BpmnPackageImpl#getMultiple()
		 * @generated
		 */
		EClass MULTIPLE = eINSTANCE.getMultiple();

		/**
		 * The meta object literal for the '{@link bpmn.impl.SomeMinusImpl <em>Some Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.SomeMinusImpl
		 * @see bpmn.impl.BpmnPackageImpl#getSomeMinus()
		 * @generated
		 */
		EClass SOME_MINUS = eINSTANCE.getSomeMinus();

		/**
		 * The meta object literal for the '{@link bpmn.impl.HelpImpl <em>Help</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.HelpImpl
		 * @see bpmn.impl.BpmnPackageImpl#getHelp()
		 * @generated
		 */
		EClass HELP = eINSTANCE.getHelp();

		/**
		 * The meta object literal for the '{@link bpmn.impl.BusinessRulesTaskImpl <em>Business Rules Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.BusinessRulesTaskImpl
		 * @see bpmn.impl.BpmnPackageImpl#getBusinessRulesTask()
		 * @generated
		 */
		EClass BUSINESS_RULES_TASK = eINSTANCE.getBusinessRulesTask();

		/**
		 * The meta object literal for the '{@link bpmn.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.AnnotationImpl
		 * @see bpmn.impl.BpmnPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '{@link bpmn.impl.HurtImpl <em>Hurt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.HurtImpl
		 * @see bpmn.impl.BpmnPackageImpl#getHurt()
		 * @generated
		 */
		EClass HURT = eINSTANCE.getHurt();

		/**
		 * The meta object literal for the '{@link bpmn.impl.SequenceFlowImpl <em>Sequence Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.SequenceFlowImpl
		 * @see bpmn.impl.BpmnPackageImpl#getSequenceFlow()
		 * @generated
		 */
		EClass SEQUENCE_FLOW = eINSTANCE.getSequenceFlow();

		/**
		 * The meta object literal for the '<em><b>Target Flow Object</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_FLOW__TARGET_FLOW_OBJECT = eINSTANCE.getSequenceFlow_TargetFlowObject();

		/**
		 * The meta object literal for the '{@link bpmn.impl.PositiveSatisficingImpl <em>Positive Satisficing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.PositiveSatisficingImpl
		 * @see bpmn.impl.BpmnPackageImpl#getPositiveSatisficing()
		 * @generated
		 */
		EClass POSITIVE_SATISFICING = eINSTANCE.getPositiveSatisficing();

		/**
		 * The meta object literal for the '{@link bpmn.impl.EQLDecompositionImpl <em>EQL Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.EQLDecompositionImpl
		 * @see bpmn.impl.BpmnPackageImpl#getEQLDecomposition()
		 * @generated
		 */
		EClass EQL_DECOMPOSITION = eINSTANCE.getEQLDecomposition();

		/**
		 * The meta object literal for the '{@link bpmn.impl.BreakImpl <em>Break</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.BreakImpl
		 * @see bpmn.impl.BpmnPackageImpl#getBreak()
		 * @generated
		 */
		EClass BREAK = eINSTANCE.getBreak();

		/**
		 * The meta object literal for the '{@link bpmn.impl.ConnectingObjectImpl <em>Connecting Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.ConnectingObjectImpl
		 * @see bpmn.impl.BpmnPackageImpl#getConnectingObject()
		 * @generated
		 */
		EClass CONNECTING_OBJECT = eINSTANCE.getConnectingObject();

		/**
		 * The meta object literal for the '{@link bpmn.impl.CatchEventImpl <em>Catch Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.CatchEventImpl
		 * @see bpmn.impl.BpmnPackageImpl#getCatchEvent()
		 * @generated
		 */
		EClass CATCH_EVENT = eINSTANCE.getCatchEvent();

		/**
		 * The meta object literal for the '<em><b>Parallel Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATCH_EVENT__PARALLEL_MULTIPLE = eINSTANCE.getCatchEvent_ParallelMultiple();

		/**
		 * The meta object literal for the '<em><b>Catch Event Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATCH_EVENT__CATCH_EVENT_DEFINITION = eINSTANCE.getCatchEvent_CatchEventDefinition();

		/**
		 * The meta object literal for the '<em><b>Catch Event Definition Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATCH_EVENT__CATCH_EVENT_DEFINITION_REF = eINSTANCE.getCatchEvent_CatchEventDefinitionRef();

		/**
		 * The meta object literal for the '{@link bpmn.impl.StartEventImpl <em>Start Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.StartEventImpl
		 * @see bpmn.impl.BpmnPackageImpl#getStartEvent()
		 * @generated
		 */
		EClass START_EVENT = eINSTANCE.getStartEvent();

		/**
		 * The meta object literal for the '<em><b>Is Interrupt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_EVENT__IS_INTERRUPT = eINSTANCE.getStartEvent_IsInterrupt();

		/**
		 * The meta object literal for the '{@link bpmn.impl.BoundaryEventImpl <em>Boundary Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.BoundaryEventImpl
		 * @see bpmn.impl.BpmnPackageImpl#getBoundaryEvent()
		 * @generated
		 */
		EClass BOUNDARY_EVENT = eINSTANCE.getBoundaryEvent();

		/**
		 * The meta object literal for the '<em><b>Cancel Activity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDARY_EVENT__CANCEL_ACTIVITY = eINSTANCE.getBoundaryEvent_CancelActivity();

		/**
		 * The meta object literal for the '<em><b>Attached To Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDARY_EVENT__ATTACHED_TO_REF = eINSTANCE.getBoundaryEvent_AttachedToRef();

		/**
		 * The meta object literal for the '{@link bpmn.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.EventDefinitionImpl
		 * @see bpmn.impl.BpmnPackageImpl#getEventDefinition()
		 * @generated
		 */
		EClass EVENT_DEFINITION = eINSTANCE.getEventDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_DEFINITION__NAME = eINSTANCE.getEventDefinition_Name();

		/**
		 * The meta object literal for the '{@link bpmn.impl.NoneImpl <em>None</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.NoneImpl
		 * @see bpmn.impl.BpmnPackageImpl#getNone()
		 * @generated
		 */
		EClass NONE = eINSTANCE.getNone();

		/**
		 * The meta object literal for the '{@link bpmn.impl.BPMNRootElementImpl <em>BPMN Root Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.BPMNRootElementImpl
		 * @see bpmn.impl.BpmnPackageImpl#getBPMNRootElement()
		 * @generated
		 */
		EClass BPMN_ROOT_ELEMENT = eINSTANCE.getBPMNRootElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPMN_ROOT_ELEMENT__NAME = eINSTANCE.getBPMNRootElement_Name();

		/**
		 * The meta object literal for the '<em><b>BPMN Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPMN_ROOT_ELEMENT__BPMN_REFERENCE = eINSTANCE.getBPMNRootElement_BPMNReference();

		/**
		 * The meta object literal for the '<em><b>Business Concept EReference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPMN_ROOT_ELEMENT__BUSINESS_CONCEPT_EREFERENCE = eINSTANCE.getBPMNRootElement_BusinessConceptEReference();

		/**
		 * The meta object literal for the '{@link bpmn.impl.MakeImpl <em>Make</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.MakeImpl
		 * @see bpmn.impl.BpmnPackageImpl#getMake()
		 * @generated
		 */
		EClass MAKE = eINSTANCE.getMake();

		/**
		 * The meta object literal for the '{@link bpmn.impl.NegativeSatisficingImpl <em>Negative Satisficing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.NegativeSatisficingImpl
		 * @see bpmn.impl.BpmnPackageImpl#getNegativeSatisficing()
		 * @generated
		 */
		EClass NEGATIVE_SATISFICING = eINSTANCE.getNegativeSatisficing();

		/**
		 * The meta object literal for the '{@link bpmn.impl.UserTaskImpl <em>User Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.UserTaskImpl
		 * @see bpmn.impl.BpmnPackageImpl#getUserTask()
		 * @generated
		 */
		EClass USER_TASK = eINSTANCE.getUserTask();

		/**
		 * The meta object literal for the '{@link bpmn.impl.GraphcialObjectImpl <em>Graphcial Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.GraphcialObjectImpl
		 * @see bpmn.impl.BpmnPackageImpl#getGraphcialObject()
		 * @generated
		 */
		EClass GRAPHCIAL_OBJECT = eINSTANCE.getGraphcialObject();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHCIAL_OBJECT__ARTIFACT = eINSTANCE.getGraphcialObject_Artifact();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHCIAL_OBJECT__LABEL = eINSTANCE.getGraphcialObject_Label();

		/**
		 * The meta object literal for the '<em><b>Businessconcepts Parent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHCIAL_OBJECT__BUSINESSCONCEPTS_PARENT = eINSTANCE.getGraphcialObject_BusinessconceptsParent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHCIAL_OBJECT__TYPE = eINSTANCE.getGraphcialObject_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHCIAL_OBJECT__NAME = eINSTANCE.getGraphcialObject_Name();

		/**
		 * The meta object literal for the '<em><b>Local Business Concept</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT = eINSTANCE.getGraphcialObject_LocalBusinessConcept();

		/**
		 * The meta object literal for the '<em><b>Contrib Type To Parents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHCIAL_OBJECT__CONTRIB_TYPE_TO_PARENTS = eINSTANCE.getGraphcialObject_ContribTypeToParents();

		/**
		 * The meta object literal for the '{@link bpmn.impl.SoftSolutionImpl <em>Soft Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.SoftSolutionImpl
		 * @see bpmn.impl.BpmnPackageImpl#getSoftSolution()
		 * @generated
		 */
		EClass SOFT_SOLUTION = eINSTANCE.getSoftSolution();

		/**
		 * The meta object literal for the '{@link bpmn.impl.ORDecompositionImpl <em>OR Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.ORDecompositionImpl
		 * @see bpmn.impl.BpmnPackageImpl#getORDecomposition()
		 * @generated
		 */
		EClass OR_DECOMPOSITION = eINSTANCE.getORDecomposition();

		/**
		 * The meta object literal for the '{@link bpmn.impl.ServiceTaskImpl <em>Service Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.ServiceTaskImpl
		 * @see bpmn.impl.BpmnPackageImpl#getServiceTask()
		 * @generated
		 */
		EClass SERVICE_TASK = eINSTANCE.getServiceTask();

		/**
		 * The meta object literal for the '{@link bpmn.impl.ContributionImpl <em>Contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.ContributionImpl
		 * @see bpmn.impl.BpmnPackageImpl#getContribution()
		 * @generated
		 */
		EClass CONTRIBUTION = eINSTANCE.getContribution();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__NAME = eINSTANCE.getContribution_Name();

		/**
		 * The meta object literal for the '<em><b>Target Business Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION__TARGET_BUSINESS_CONCEPT = eINSTANCE.getContribution_TargetBusinessConcept();

		/**
		 * The meta object literal for the '{@link bpmn.impl.PhenomenonTypeImpl <em>Phenomenon Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.PhenomenonTypeImpl
		 * @see bpmn.impl.BpmnPackageImpl#getPhenomenonType()
		 * @generated
		 */
		EClass PHENOMENON_TYPE = eINSTANCE.getPhenomenonType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHENOMENON_TYPE__TYPE = eINSTANCE.getPhenomenonType_Type();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHENOMENON_TYPE__LABEL = eINSTANCE.getPhenomenonType_Label();

		/**
		 * The meta object literal for the '<em><b>Bigquery</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHENOMENON_TYPE__BIGQUERY = eINSTANCE.getPhenomenonType_Bigquery();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHENOMENON_TYPE__GOAL = eINSTANCE.getPhenomenonType_Goal();

		/**
		 * The meta object literal for the '{@link bpmn.impl.SoftProblemImpl <em>Soft Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.SoftProblemImpl
		 * @see bpmn.impl.BpmnPackageImpl#getSoftProblem()
		 * @generated
		 */
		EClass SOFT_PROBLEM = eINSTANCE.getSoftProblem();

		/**
		 * The meta object literal for the '{@link bpmn.impl.UndesirableSituationImpl <em>Undesirable Situation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.UndesirableSituationImpl
		 * @see bpmn.impl.BpmnPackageImpl#getUndesirableSituation()
		 * @generated
		 */
		EClass UNDESIRABLE_SITUATION = eINSTANCE.getUndesirableSituation();

		/**
		 * The meta object literal for the '{@link bpmn.impl.UndesirableOperationalizationImpl <em>Undesirable Operationalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.UndesirableOperationalizationImpl
		 * @see bpmn.impl.BpmnPackageImpl#getUndesirableOperationalization()
		 * @generated
		 */
		EClass UNDESIRABLE_OPERATIONALIZATION = eINSTANCE.getUndesirableOperationalization();

		/**
		 * The meta object literal for the '{@link bpmn.impl.CausalAttributionImpl <em>Causal Attribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.CausalAttributionImpl
		 * @see bpmn.impl.BpmnPackageImpl#getCausalAttribution()
		 * @generated
		 */
		EClass CAUSAL_ATTRIBUTION = eINSTANCE.getCausalAttribution();

		/**
		 * The meta object literal for the '{@link bpmn.SatisficingLabelType <em>Satisficing Label Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.SatisficingLabelType
		 * @see bpmn.impl.BpmnPackageImpl#getSatisficingLabelType()
		 * @generated
		 */
		EEnum SATISFICING_LABEL_TYPE = eINSTANCE.getSatisficingLabelType();

		/**
		 * The meta object literal for the '{@link bpmn.SystemBoundaryType <em>System Boundary Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.SystemBoundaryType
		 * @see bpmn.impl.BpmnPackageImpl#getSystemBoundaryType()
		 * @generated
		 */
		EEnum SYSTEM_BOUNDARY_TYPE = eINSTANCE.getSystemBoundaryType();

		/**
		 * The meta object literal for the '{@link bpmn.ActivationType <em>Activation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.ActivationType
		 * @see bpmn.impl.BpmnPackageImpl#getActivationType()
		 * @generated
		 */
		EEnum ACTIVATION_TYPE = eINSTANCE.getActivationType();

		/**
		 * The meta object literal for the '{@link bpmn.RelationshipType <em>Relationship Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.RelationshipType
		 * @see bpmn.impl.BpmnPackageImpl#getRelationshipType()
		 * @generated
		 */
		EEnum RELATIONSHIP_TYPE = eINSTANCE.getRelationshipType();

		/**
		 * The meta object literal for the '{@link bpmn.eventBasedGatewayType <em>event Based Gateway Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.eventBasedGatewayType
		 * @see bpmn.impl.BpmnPackageImpl#geteventBasedGatewayType()
		 * @generated
		 */
		EEnum EVENT_BASED_GATEWAY_TYPE = eINSTANCE.geteventBasedGatewayType();

	}

} //BpmnPackage

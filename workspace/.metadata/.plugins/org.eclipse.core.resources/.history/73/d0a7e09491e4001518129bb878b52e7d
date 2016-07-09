/**
 */
package bpmn.impl;

import bpmn.ANDDecomposition;
import bpmn.ActivationType;
import bpmn.Annotation;
import bpmn.BPMNRootElement;
import bpmn.BigQuery;
import bpmn.BoundaryEvent;
import bpmn.BpmnFactory;
import bpmn.BpmnPackage;
import bpmn.Break;
import bpmn.BusinessGoal;
import bpmn.BusinessProcessGoal;
import bpmn.BusinessRulesTask;
import bpmn.CausalAttribution;
import bpmn.ClaimSoftsolution;
import bpmn.ComplexGateway;
import bpmn.DataAssociation;
import bpmn.DataInput;
import bpmn.DataOutput;
import bpmn.EQLDecomposition;
import bpmn.EndEvent;
import bpmn.EvenbasedGateway;
import bpmn.ExclusiveGateway;
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
import bpmn.None;
import bpmn.ORDecomposition;
import bpmn.OperationalizingSoftsolution;
import bpmn.ParallelGateway;
import bpmn.Pool;
import bpmn.ReceiveTask;
import bpmn.RelationshipType;
import bpmn.SatisficingLabelType;
import bpmn.SendTask;
import bpmn.SequenceFlow;
import bpmn.ServiceTask;
import bpmn.SomeMinus;
import bpmn.SomePlus;
import bpmn.StartEvent;
import bpmn.SubProcess;
import bpmn.SystemBoundaryType;
import bpmn.Task;
import bpmn.Timer;
import bpmn.UndesirableOperationalization;
import bpmn.UndesirableSituation;
import bpmn.UserTask;
import bpmn.eventBasedGatewayType;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BpmnFactoryImpl extends EFactoryImpl implements BpmnFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BpmnFactory init() {
		try {
			BpmnFactory theBpmnFactory = (BpmnFactory)EPackage.Registry.INSTANCE.getEFactory(BpmnPackage.eNS_URI);
			if (theBpmnFactory != null) {
				return theBpmnFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BpmnFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BpmnPackage.COMPLEX_GATEWAY: return createComplexGateway();
			case BpmnPackage.RECEIVE_TASK: return createReceiveTask();
			case BpmnPackage.MANUAL_TASK: return createManualTask();
			case BpmnPackage.POOL: return createPool();
			case BpmnPackage.NFR_SOFTSOLUTION: return createNFRSoftsolution();
			case BpmnPackage.INCLUSIVE_GATEWAY: return createInclusiveGateway();
			case BpmnPackage.SOME_PLUS: return createSomePlus();
			case BpmnPackage.AND_DECOMPOSITION: return createANDDecomposition();
			case BpmnPackage.CLAIM_SOFTSOLUTION: return createClaimSoftsolution();
			case BpmnPackage.PARALLEL_GATEWAY: return createParallelGateway();
			case BpmnPackage.EXCLUSIVE_GATEWAY: return createExclusiveGateway();
			case BpmnPackage.LANE: return createLane();
			case BpmnPackage.SEND_TASK: return createSendTask();
			case BpmnPackage.GROUP: return createGroup();
			case BpmnPackage.OPERATIONALIZING_SOFTSOLUTION: return createOperationalizingSoftsolution();
			case BpmnPackage.SOME_MINUS: return createSomeMinus();
			case BpmnPackage.HELP: return createHelp();
			case BpmnPackage.BUSINESS_RULES_TASK: return createBusinessRulesTask();
			case BpmnPackage.ANNOTATION: return createAnnotation();
			case BpmnPackage.HURT: return createHurt();
			case BpmnPackage.SEQUENCE_FLOW: return createSequenceFlow();
			case BpmnPackage.EQL_DECOMPOSITION: return createEQLDecomposition();
			case BpmnPackage.BREAK: return createBreak();
			case BpmnPackage.BPMN_ROOT_ELEMENT: return createBPMNRootElement();
			case BpmnPackage.MAKE: return createMake();
			case BpmnPackage.USER_TASK: return createUserTask();
			case BpmnPackage.OR_DECOMPOSITION: return createORDecomposition();
			case BpmnPackage.SERVICE_TASK: return createServiceTask();
			case BpmnPackage.UNDESIRABLE_SITUATION: return createUndesirableSituation();
			case BpmnPackage.UNDESIRABLE_OPERATIONALIZATION: return createUndesirableOperationalization();
			case BpmnPackage.CAUSAL_ATTRIBUTION: return createCausalAttribution();
			case BpmnPackage.TASK: return createTask();
			case BpmnPackage.MESSAGE_FLOW: return createMessageFlow();
			case BpmnPackage.SUB_PROCESS: return createSubProcess();
			case BpmnPackage.MESSAGE: return createMessage();
			case BpmnPackage.TIMER: return createTimer();
			case BpmnPackage.ERROR: return createError();
			case BpmnPackage.MULTIPLE: return createMultiple();
			case BpmnPackage.START_EVENT: return createStartEvent();
			case BpmnPackage.BOUNDARY_EVENT: return createBoundaryEvent();
			case BpmnPackage.NONE: return createNone();
			case BpmnPackage.END_EVENT: return createEndEvent();
			case BpmnPackage.EVENBASED_GATEWAY: return createEvenbasedGateway();
			case BpmnPackage.DATA_INPUT: return createDataInput();
			case BpmnPackage.DATA_OUTPUT: return createDataOutput();
			case BpmnPackage.INTERMEDIATE_CATCH_EVENT: return createIntermediateCatchEvent();
			case BpmnPackage.INTERMEDIATE_END_EVENT: return createIntermediateEndEvent();
			case BpmnPackage.DATA_ASSOCIATION: return createDataAssociation();
			case BpmnPackage.BIG_QUERY: return createBigQuery();
			case BpmnPackage.KPI_GOAL: return createKPIGoal();
			case BpmnPackage.KPI: return createKPI();
			case BpmnPackage.BUSINESS_GOAL: return createBusinessGoal();
			case BpmnPackage.BUSINESS_PROCESS_GOAL: return createBusinessProcessGoal();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BpmnPackage.SATISFICING_LABEL_TYPE:
				return createSatisficingLabelTypeFromString(eDataType, initialValue);
			case BpmnPackage.SYSTEM_BOUNDARY_TYPE:
				return createSystemBoundaryTypeFromString(eDataType, initialValue);
			case BpmnPackage.ACTIVATION_TYPE:
				return createActivationTypeFromString(eDataType, initialValue);
			case BpmnPackage.RELATIONSHIP_TYPE:
				return createRelationshipTypeFromString(eDataType, initialValue);
			case BpmnPackage.EVENT_BASED_GATEWAY_TYPE:
				return createeventBasedGatewayTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BpmnPackage.SATISFICING_LABEL_TYPE:
				return convertSatisficingLabelTypeToString(eDataType, instanceValue);
			case BpmnPackage.SYSTEM_BOUNDARY_TYPE:
				return convertSystemBoundaryTypeToString(eDataType, instanceValue);
			case BpmnPackage.ACTIVATION_TYPE:
				return convertActivationTypeToString(eDataType, instanceValue);
			case BpmnPackage.RELATIONSHIP_TYPE:
				return convertRelationshipTypeToString(eDataType, instanceValue);
			case BpmnPackage.EVENT_BASED_GATEWAY_TYPE:
				return converteventBasedGatewayTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexGateway createComplexGateway() {
		ComplexGatewayImpl complexGateway = new ComplexGatewayImpl();
		return complexGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveTask createReceiveTask() {
		ReceiveTaskImpl receiveTask = new ReceiveTaskImpl();
		return receiveTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManualTask createManualTask() {
		ManualTaskImpl manualTask = new ManualTaskImpl();
		return manualTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pool createPool() {
		PoolImpl pool = new PoolImpl();
		return pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFRSoftsolution createNFRSoftsolution() {
		NFRSoftsolutionImpl nfrSoftsolution = new NFRSoftsolutionImpl();
		return nfrSoftsolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InclusiveGateway createInclusiveGateway() {
		InclusiveGatewayImpl inclusiveGateway = new InclusiveGatewayImpl();
		return inclusiveGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SomePlus createSomePlus() {
		SomePlusImpl somePlus = new SomePlusImpl();
		return somePlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANDDecomposition createANDDecomposition() {
		ANDDecompositionImpl andDecomposition = new ANDDecompositionImpl();
		return andDecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimSoftsolution createClaimSoftsolution() {
		ClaimSoftsolutionImpl claimSoftsolution = new ClaimSoftsolutionImpl();
		return claimSoftsolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelGateway createParallelGateway() {
		ParallelGatewayImpl parallelGateway = new ParallelGatewayImpl();
		return parallelGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveGateway createExclusiveGateway() {
		ExclusiveGatewayImpl exclusiveGateway = new ExclusiveGatewayImpl();
		return exclusiveGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lane createLane() {
		LaneImpl lane = new LaneImpl();
		return lane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendTask createSendTask() {
		SendTaskImpl sendTask = new SendTaskImpl();
		return sendTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalizingSoftsolution createOperationalizingSoftsolution() {
		OperationalizingSoftsolutionImpl operationalizingSoftsolution = new OperationalizingSoftsolutionImpl();
		return operationalizingSoftsolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFlow createMessageFlow() {
		MessageFlowImpl messageFlow = new MessageFlowImpl();
		return messageFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubProcess createSubProcess() {
		SubProcessImpl subProcess = new SubProcessImpl();
		return subProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timer createTimer() {
		TimerImpl timer = new TimerImpl();
		return timer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public bpmn.Error createError() {
		ErrorImpl error = new ErrorImpl();
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiple createMultiple() {
		MultipleImpl multiple = new MultipleImpl();
		return multiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartEvent createStartEvent() {
		StartEventImpl startEvent = new StartEventImpl();
		return startEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryEvent createBoundaryEvent() {
		BoundaryEventImpl boundaryEvent = new BoundaryEventImpl();
		return boundaryEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public None createNone() {
		NoneImpl none = new NoneImpl();
		return none;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndEvent createEndEvent() {
		EndEventImpl endEvent = new EndEventImpl();
		return endEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvenbasedGateway createEvenbasedGateway() {
		EvenbasedGatewayImpl evenbasedGateway = new EvenbasedGatewayImpl();
		return evenbasedGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInput createDataInput() {
		DataInputImpl dataInput = new DataInputImpl();
		return dataInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOutput createDataOutput() {
		DataOutputImpl dataOutput = new DataOutputImpl();
		return dataOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateCatchEvent createIntermediateCatchEvent() {
		IntermediateCatchEventImpl intermediateCatchEvent = new IntermediateCatchEventImpl();
		return intermediateCatchEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateEndEvent createIntermediateEndEvent() {
		IntermediateEndEventImpl intermediateEndEvent = new IntermediateEndEventImpl();
		return intermediateEndEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAssociation createDataAssociation() {
		DataAssociationImpl dataAssociation = new DataAssociationImpl();
		return dataAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigQuery createBigQuery() {
		BigQueryImpl bigQuery = new BigQueryImpl();
		return bigQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KPIGoal createKPIGoal() {
		KPIGoalImpl kpiGoal = new KPIGoalImpl();
		return kpiGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KPI createKPI() {
		KPIImpl kpi = new KPIImpl();
		return kpi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessGoal createBusinessGoal() {
		BusinessGoalImpl businessGoal = new BusinessGoalImpl();
		return businessGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessProcessGoal createBusinessProcessGoal() {
		BusinessProcessGoalImpl businessProcessGoal = new BusinessProcessGoalImpl();
		return businessProcessGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SomeMinus createSomeMinus() {
		SomeMinusImpl someMinus = new SomeMinusImpl();
		return someMinus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Help createHelp() {
		HelpImpl help = new HelpImpl();
		return help;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessRulesTask createBusinessRulesTask() {
		BusinessRulesTaskImpl businessRulesTask = new BusinessRulesTaskImpl();
		return businessRulesTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hurt createHurt() {
		HurtImpl hurt = new HurtImpl();
		return hurt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFlow createSequenceFlow() {
		SequenceFlowImpl sequenceFlow = new SequenceFlowImpl();
		return sequenceFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EQLDecomposition createEQLDecomposition() {
		EQLDecompositionImpl eqlDecomposition = new EQLDecompositionImpl();
		return eqlDecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Break createBreak() {
		BreakImpl break_ = new BreakImpl();
		return break_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNRootElement createBPMNRootElement() {
		BPMNRootElementImpl bpmnRootElement = new BPMNRootElementImpl();
		return bpmnRootElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Make createMake() {
		MakeImpl make = new MakeImpl();
		return make;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTask createUserTask() {
		UserTaskImpl userTask = new UserTaskImpl();
		return userTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORDecomposition createORDecomposition() {
		ORDecompositionImpl orDecomposition = new ORDecompositionImpl();
		return orDecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTask createServiceTask() {
		ServiceTaskImpl serviceTask = new ServiceTaskImpl();
		return serviceTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UndesirableSituation createUndesirableSituation() {
		UndesirableSituationImpl undesirableSituation = new UndesirableSituationImpl();
		return undesirableSituation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UndesirableOperationalization createUndesirableOperationalization() {
		UndesirableOperationalizationImpl undesirableOperationalization = new UndesirableOperationalizationImpl();
		return undesirableOperationalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CausalAttribution createCausalAttribution() {
		CausalAttributionImpl causalAttribution = new CausalAttributionImpl();
		return causalAttribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatisficingLabelType createSatisficingLabelTypeFromString(EDataType eDataType, String initialValue) {
		SatisficingLabelType result = SatisficingLabelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSatisficingLabelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemBoundaryType createSystemBoundaryTypeFromString(EDataType eDataType, String initialValue) {
		SystemBoundaryType result = SystemBoundaryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemBoundaryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationType createActivationTypeFromString(EDataType eDataType, String initialValue) {
		ActivationType result = ActivationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType createRelationshipTypeFromString(EDataType eDataType, String initialValue) {
		RelationshipType result = RelationshipType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public eventBasedGatewayType createeventBasedGatewayTypeFromString(EDataType eDataType, String initialValue) {
		eventBasedGatewayType result = eventBasedGatewayType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converteventBasedGatewayTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnPackage getBpmnPackage() {
		return (BpmnPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BpmnPackage getPackage() {
		return BpmnPackage.eINSTANCE;
	}

} //BpmnFactoryImpl

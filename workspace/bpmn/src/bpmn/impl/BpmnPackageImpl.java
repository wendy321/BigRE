/**
 */
package bpmn.impl;

import bpmn.ANDDecomposition;
import bpmn.AbstractTask;
import bpmn.ActivationType;
import bpmn.Activity;
import bpmn.Annotation;
import bpmn.Artifact;
import bpmn.BPMNRootElement;
import bpmn.BigQuery;
import bpmn.BoundaryEvent;
import bpmn.BpmnFactory;
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
import bpmn.RelationshipType;
import bpmn.Satisficing;
import bpmn.SatisficingLabelType;
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
import bpmn.SystemBoundaryType;
import bpmn.Task;
import bpmn.ThrowEvent;
import bpmn.Timer;
import bpmn.UndesirableOperationalization;
import bpmn.UndesirableSituation;
import bpmn.UserTask;
import bpmn.eventBasedGatewayType;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BpmnPackageImpl extends EPackageImpl implements BpmnPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manualTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfrSoftsolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inclusiveGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass somePlusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andDecompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swimlaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimSoftsolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evenbasedGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediateCatchEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediateEndEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bigQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kpiGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kpiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessProcessGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessConceptsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satisficingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalizingSoftsolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throwEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass someMinusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass helpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessRulesTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hurtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveSatisficingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eqlDecompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectingObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catchEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundaryEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnRootElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass makeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeSatisficingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphcialObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softSolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orDecompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phenomenonTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softProblemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass undesirableSituationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass undesirableOperationalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass causalAttributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum satisficingLabelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum systemBoundaryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum activationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationshipTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventBasedGatewayTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see bpmn.BpmnPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BpmnPackageImpl() {
		super(eNS_URI, BpmnFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BpmnPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BpmnPackage init() {
		if (isInited) return (BpmnPackage)EPackage.Registry.INSTANCE.getEPackage(BpmnPackage.eNS_URI);

		// Obtain or create and register package
		BpmnPackageImpl theBpmnPackage = (BpmnPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BpmnPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BpmnPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBpmnPackage.createPackageContents();

		// Initialize created meta-data
		theBpmnPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBpmnPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BpmnPackage.eNS_URI, theBpmnPackage);
		return theBpmnPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexGateway() {
		return complexGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiveTask() {
		return receiveTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManualTask() {
		return manualTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGateway() {
		return gatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPool() {
		return poolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPool_ContainLane() {
		return (EReference)poolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_ContribTypeToParent() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFRSoftsolution() {
		return nfrSoftsolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecomposition() {
		return decompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInclusiveGateway() {
		return inclusiveGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSomePlus() {
		return somePlusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANDDecomposition() {
		return andDecompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_BoundaryEventRefs() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwimlane() {
		return swimlaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimSoftsolution() {
		return claimSoftsolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndEvent() {
		return endEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvenbasedGateway() {
		return evenbasedGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvenbasedGateway_EventGatewayType() {
		return (EAttribute)evenbasedGatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvenbasedGateway_IsInstanciate() {
		return (EAttribute)evenbasedGatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataInput() {
		return dataInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataOutput() {
		return dataOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntermediateCatchEvent() {
		return intermediateCatchEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntermediateCatchEvent_IsInterrupt() {
		return (EAttribute)intermediateCatchEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntermediateEndEvent() {
		return intermediateEndEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntermediateEndEvent_IsInterrupt() {
		return (EAttribute)intermediateEndEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAssociation() {
		return dataAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAssociation_DataAssociateObject() {
		return (EReference)dataAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBigQuery() {
		return bigQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBigQuery_Phenomenontype() {
		return (EReference)bigQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKPIGoal() {
		return kpiGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKPIGoal_Kpi() {
		return (EReference)kpiGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKPI() {
		return kpiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKPI_Kpigoal() {
		return (EReference)kpiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessGoal() {
		return businessGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessProcessGoal() {
		return businessProcessGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Phenomenontype() {
		return (EReference)goalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoal_Label() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessConcepts() {
		return businessConceptsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessConcepts_Name() {
		return (EAttribute)businessConceptsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessConcepts_Parent() {
		return (EReference)businessConceptsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessConcepts_Child() {
		return (EReference)businessConceptsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessConcepts_ContribTypeToParents() {
		return (EReference)businessConceptsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessConcepts_TopicChild() {
		return (EReference)businessConceptsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessConcepts_Topic() {
		return (EReference)businessConceptsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelGateway() {
		return parallelGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatisficing() {
		return satisficingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusiveGateway() {
		return exclusiveGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataObject() {
		return dataObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLane() {
		return laneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLane_GraphicObj() {
		return (EReference)laneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowObject() {
		return flowObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowObject_SequenceFlows() {
		return (EReference)flowObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendTask() {
		return sendTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalizingSoftsolution() {
		return operationalizingSoftsolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThrowEvent() {
		return throwEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThrowEvent_ThrowEventDefinition() {
		return (EReference)throwEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThrowEvent_ThrowEventDefinitionRef() {
		return (EReference)throwEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTask() {
		return abstractTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTask_TaskBoundaryEventRefs() {
		return (EReference)abstractTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageFlow() {
		return messageFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageFlow_MessageFlowObject() {
		return (EReference)messageFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubProcess() {
		return subProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubProcess_Children() {
		return (EReference)subProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubProcess_IsCollapsed() {
		return (EAttribute)subProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimer() {
		return timerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getError() {
		return errorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiple() {
		return multipleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSomeMinus() {
		return someMinusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHelp() {
		return helpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessRulesTask() {
		return businessRulesTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHurt() {
		return hurtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceFlow() {
		return sequenceFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceFlow_TargetFlowObject() {
		return (EReference)sequenceFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositiveSatisficing() {
		return positiveSatisficingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEQLDecomposition() {
		return eqlDecompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreak() {
		return breakEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectingObject() {
		return connectingObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatchEvent() {
		return catchEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatchEvent_ParallelMultiple() {
		return (EAttribute)catchEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatchEvent_CatchEventDefinition() {
		return (EReference)catchEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatchEvent_CatchEventDefinitionRef() {
		return (EReference)catchEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartEvent() {
		return startEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartEvent_IsInterrupt() {
		return (EAttribute)startEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundaryEvent() {
		return boundaryEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundaryEvent_CancelActivity() {
		return (EAttribute)boundaryEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundaryEvent_AttachedToRef() {
		return (EReference)boundaryEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventDefinition() {
		return eventDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventDefinition_Name() {
		return (EAttribute)eventDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNone() {
		return noneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNRootElement() {
		return bpmnRootElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPMNRootElement_Name() {
		return (EAttribute)bpmnRootElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNRootElement_BPMNReference() {
		return (EReference)bpmnRootElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNRootElement_BusinessConceptEReference() {
		return (EReference)bpmnRootElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMake() {
		return makeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegativeSatisficing() {
		return negativeSatisficingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserTask() {
		return userTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphcialObject() {
		return graphcialObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphcialObject_Artifact() {
		return (EReference)graphcialObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphcialObject_Label() {
		return (EAttribute)graphcialObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphcialObject_BusinessconceptsParent() {
		return (EReference)graphcialObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphcialObject_Type() {
		return (EReference)graphcialObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphcialObject_Name() {
		return (EAttribute)graphcialObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphcialObject_LocalBusinessConcept() {
		return (EReference)graphcialObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphcialObject_ContribTypeToParents() {
		return (EReference)graphcialObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftSolution() {
		return softSolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getORDecomposition() {
		return orDecompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceTask() {
		return serviceTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContribution() {
		return contributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContribution_Name() {
		return (EAttribute)contributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContribution_TargetBusinessConcept() {
		return (EReference)contributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhenomenonType() {
		return phenomenonTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhenomenonType_Type() {
		return (EAttribute)phenomenonTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhenomenonType_Label() {
		return (EAttribute)phenomenonTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhenomenonType_Bigquery() {
		return (EReference)phenomenonTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhenomenonType_Goal() {
		return (EReference)phenomenonTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftProblem() {
		return softProblemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUndesirableSituation() {
		return undesirableSituationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUndesirableOperationalization() {
		return undesirableOperationalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCausalAttribution() {
		return causalAttributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSatisficingLabelType() {
		return satisficingLabelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSystemBoundaryType() {
		return systemBoundaryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActivationType() {
		return activationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationshipType() {
		return relationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum geteventBasedGatewayType() {
		return eventBasedGatewayTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnFactory getBpmnFactory() {
		return (BpmnFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		complexGatewayEClass = createEClass(COMPLEX_GATEWAY);

		receiveTaskEClass = createEClass(RECEIVE_TASK);

		manualTaskEClass = createEClass(MANUAL_TASK);

		gatewayEClass = createEClass(GATEWAY);

		poolEClass = createEClass(POOL);
		createEReference(poolEClass, POOL__CONTAIN_LANE);

		eventEClass = createEClass(EVENT);

		artifactEClass = createEClass(ARTIFACT);
		createEReference(artifactEClass, ARTIFACT__CONTRIB_TYPE_TO_PARENT);

		nfrSoftsolutionEClass = createEClass(NFR_SOFTSOLUTION);

		decompositionEClass = createEClass(DECOMPOSITION);

		inclusiveGatewayEClass = createEClass(INCLUSIVE_GATEWAY);

		somePlusEClass = createEClass(SOME_PLUS);

		andDecompositionEClass = createEClass(AND_DECOMPOSITION);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__BOUNDARY_EVENT_REFS);

		swimlaneEClass = createEClass(SWIMLANE);

		claimSoftsolutionEClass = createEClass(CLAIM_SOFTSOLUTION);

		parallelGatewayEClass = createEClass(PARALLEL_GATEWAY);

		satisficingEClass = createEClass(SATISFICING);

		exclusiveGatewayEClass = createEClass(EXCLUSIVE_GATEWAY);

		dataObjectEClass = createEClass(DATA_OBJECT);

		laneEClass = createEClass(LANE);
		createEReference(laneEClass, LANE__GRAPHIC_OBJ);

		flowObjectEClass = createEClass(FLOW_OBJECT);
		createEReference(flowObjectEClass, FLOW_OBJECT__SEQUENCE_FLOWS);

		sendTaskEClass = createEClass(SEND_TASK);

		groupEClass = createEClass(GROUP);

		operationalizingSoftsolutionEClass = createEClass(OPERATIONALIZING_SOFTSOLUTION);

		throwEventEClass = createEClass(THROW_EVENT);
		createEReference(throwEventEClass, THROW_EVENT__THROW_EVENT_DEFINITION);
		createEReference(throwEventEClass, THROW_EVENT__THROW_EVENT_DEFINITION_REF);

		abstractTaskEClass = createEClass(ABSTRACT_TASK);
		createEReference(abstractTaskEClass, ABSTRACT_TASK__TASK_BOUNDARY_EVENT_REFS);

		someMinusEClass = createEClass(SOME_MINUS);

		helpEClass = createEClass(HELP);

		businessRulesTaskEClass = createEClass(BUSINESS_RULES_TASK);

		annotationEClass = createEClass(ANNOTATION);

		hurtEClass = createEClass(HURT);

		sequenceFlowEClass = createEClass(SEQUENCE_FLOW);
		createEReference(sequenceFlowEClass, SEQUENCE_FLOW__TARGET_FLOW_OBJECT);

		positiveSatisficingEClass = createEClass(POSITIVE_SATISFICING);

		eqlDecompositionEClass = createEClass(EQL_DECOMPOSITION);

		breakEClass = createEClass(BREAK);

		connectingObjectEClass = createEClass(CONNECTING_OBJECT);

		catchEventEClass = createEClass(CATCH_EVENT);
		createEAttribute(catchEventEClass, CATCH_EVENT__PARALLEL_MULTIPLE);
		createEReference(catchEventEClass, CATCH_EVENT__CATCH_EVENT_DEFINITION);
		createEReference(catchEventEClass, CATCH_EVENT__CATCH_EVENT_DEFINITION_REF);

		bpmnRootElementEClass = createEClass(BPMN_ROOT_ELEMENT);
		createEAttribute(bpmnRootElementEClass, BPMN_ROOT_ELEMENT__NAME);
		createEReference(bpmnRootElementEClass, BPMN_ROOT_ELEMENT__BPMN_REFERENCE);
		createEReference(bpmnRootElementEClass, BPMN_ROOT_ELEMENT__BUSINESS_CONCEPT_EREFERENCE);

		makeEClass = createEClass(MAKE);

		negativeSatisficingEClass = createEClass(NEGATIVE_SATISFICING);

		userTaskEClass = createEClass(USER_TASK);

		graphcialObjectEClass = createEClass(GRAPHCIAL_OBJECT);
		createEReference(graphcialObjectEClass, GRAPHCIAL_OBJECT__ARTIFACT);
		createEAttribute(graphcialObjectEClass, GRAPHCIAL_OBJECT__LABEL);
		createEReference(graphcialObjectEClass, GRAPHCIAL_OBJECT__BUSINESSCONCEPTS_PARENT);
		createEReference(graphcialObjectEClass, GRAPHCIAL_OBJECT__TYPE);
		createEAttribute(graphcialObjectEClass, GRAPHCIAL_OBJECT__NAME);
		createEReference(graphcialObjectEClass, GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT);
		createEReference(graphcialObjectEClass, GRAPHCIAL_OBJECT__CONTRIB_TYPE_TO_PARENTS);

		softSolutionEClass = createEClass(SOFT_SOLUTION);

		orDecompositionEClass = createEClass(OR_DECOMPOSITION);

		serviceTaskEClass = createEClass(SERVICE_TASK);

		contributionEClass = createEClass(CONTRIBUTION);
		createEAttribute(contributionEClass, CONTRIBUTION__NAME);
		createEReference(contributionEClass, CONTRIBUTION__TARGET_BUSINESS_CONCEPT);

		phenomenonTypeEClass = createEClass(PHENOMENON_TYPE);
		createEAttribute(phenomenonTypeEClass, PHENOMENON_TYPE__TYPE);
		createEAttribute(phenomenonTypeEClass, PHENOMENON_TYPE__LABEL);
		createEReference(phenomenonTypeEClass, PHENOMENON_TYPE__BIGQUERY);
		createEReference(phenomenonTypeEClass, PHENOMENON_TYPE__GOAL);

		softProblemEClass = createEClass(SOFT_PROBLEM);

		undesirableSituationEClass = createEClass(UNDESIRABLE_SITUATION);

		undesirableOperationalizationEClass = createEClass(UNDESIRABLE_OPERATIONALIZATION);

		causalAttributionEClass = createEClass(CAUSAL_ATTRIBUTION);

		taskEClass = createEClass(TASK);

		messageFlowEClass = createEClass(MESSAGE_FLOW);
		createEReference(messageFlowEClass, MESSAGE_FLOW__MESSAGE_FLOW_OBJECT);

		subProcessEClass = createEClass(SUB_PROCESS);
		createEReference(subProcessEClass, SUB_PROCESS__CHILDREN);
		createEAttribute(subProcessEClass, SUB_PROCESS__IS_COLLAPSED);

		messageEClass = createEClass(MESSAGE);

		timerEClass = createEClass(TIMER);

		errorEClass = createEClass(ERROR);

		multipleEClass = createEClass(MULTIPLE);

		startEventEClass = createEClass(START_EVENT);
		createEAttribute(startEventEClass, START_EVENT__IS_INTERRUPT);

		boundaryEventEClass = createEClass(BOUNDARY_EVENT);
		createEAttribute(boundaryEventEClass, BOUNDARY_EVENT__CANCEL_ACTIVITY);
		createEReference(boundaryEventEClass, BOUNDARY_EVENT__ATTACHED_TO_REF);

		eventDefinitionEClass = createEClass(EVENT_DEFINITION);
		createEAttribute(eventDefinitionEClass, EVENT_DEFINITION__NAME);

		noneEClass = createEClass(NONE);

		endEventEClass = createEClass(END_EVENT);

		evenbasedGatewayEClass = createEClass(EVENBASED_GATEWAY);
		createEAttribute(evenbasedGatewayEClass, EVENBASED_GATEWAY__EVENT_GATEWAY_TYPE);
		createEAttribute(evenbasedGatewayEClass, EVENBASED_GATEWAY__IS_INSTANCIATE);

		dataInputEClass = createEClass(DATA_INPUT);

		dataOutputEClass = createEClass(DATA_OUTPUT);

		intermediateCatchEventEClass = createEClass(INTERMEDIATE_CATCH_EVENT);
		createEAttribute(intermediateCatchEventEClass, INTERMEDIATE_CATCH_EVENT__IS_INTERRUPT);

		intermediateEndEventEClass = createEClass(INTERMEDIATE_END_EVENT);
		createEAttribute(intermediateEndEventEClass, INTERMEDIATE_END_EVENT__IS_INTERRUPT);

		dataAssociationEClass = createEClass(DATA_ASSOCIATION);
		createEReference(dataAssociationEClass, DATA_ASSOCIATION__DATA_ASSOCIATE_OBJECT);

		bigQueryEClass = createEClass(BIG_QUERY);
		createEReference(bigQueryEClass, BIG_QUERY__PHENOMENONTYPE);

		kpiGoalEClass = createEClass(KPI_GOAL);
		createEReference(kpiGoalEClass, KPI_GOAL__KPI);

		kpiEClass = createEClass(KPI);
		createEReference(kpiEClass, KPI__KPIGOAL);

		businessGoalEClass = createEClass(BUSINESS_GOAL);

		businessProcessGoalEClass = createEClass(BUSINESS_PROCESS_GOAL);

		goalEClass = createEClass(GOAL);
		createEReference(goalEClass, GOAL__PHENOMENONTYPE);
		createEAttribute(goalEClass, GOAL__LABEL);

		businessConceptsEClass = createEClass(BUSINESS_CONCEPTS);
		createEAttribute(businessConceptsEClass, BUSINESS_CONCEPTS__NAME);
		createEReference(businessConceptsEClass, BUSINESS_CONCEPTS__PARENT);
		createEReference(businessConceptsEClass, BUSINESS_CONCEPTS__CHILD);
		createEReference(businessConceptsEClass, BUSINESS_CONCEPTS__CONTRIB_TYPE_TO_PARENTS);
		createEReference(businessConceptsEClass, BUSINESS_CONCEPTS__TOPIC_CHILD);
		createEReference(businessConceptsEClass, BUSINESS_CONCEPTS__TOPIC);

		// Create enums
		satisficingLabelTypeEEnum = createEEnum(SATISFICING_LABEL_TYPE);
		systemBoundaryTypeEEnum = createEEnum(SYSTEM_BOUNDARY_TYPE);
		activationTypeEEnum = createEEnum(ACTIVATION_TYPE);
		relationshipTypeEEnum = createEEnum(RELATIONSHIP_TYPE);
		eventBasedGatewayTypeEEnum = createEEnum(EVENT_BASED_GATEWAY_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		complexGatewayEClass.getESuperTypes().add(this.getGateway());
		receiveTaskEClass.getESuperTypes().add(this.getAbstractTask());
		manualTaskEClass.getESuperTypes().add(this.getAbstractTask());
		gatewayEClass.getESuperTypes().add(this.getFlowObject());
		poolEClass.getESuperTypes().add(this.getSwimlane());
		eventEClass.getESuperTypes().add(this.getFlowObject());
		artifactEClass.getESuperTypes().add(this.getGraphcialObject());
		nfrSoftsolutionEClass.getESuperTypes().add(this.getSoftSolution());
		decompositionEClass.getESuperTypes().add(this.getContribution());
		inclusiveGatewayEClass.getESuperTypes().add(this.getGateway());
		somePlusEClass.getESuperTypes().add(this.getPositiveSatisficing());
		andDecompositionEClass.getESuperTypes().add(this.getDecomposition());
		activityEClass.getESuperTypes().add(this.getFlowObject());
		swimlaneEClass.getESuperTypes().add(this.getGraphcialObject());
		claimSoftsolutionEClass.getESuperTypes().add(this.getSoftSolution());
		parallelGatewayEClass.getESuperTypes().add(this.getGateway());
		satisficingEClass.getESuperTypes().add(this.getContribution());
		exclusiveGatewayEClass.getESuperTypes().add(this.getGateway());
		dataObjectEClass.getESuperTypes().add(this.getArtifact());
		laneEClass.getESuperTypes().add(this.getSwimlane());
		flowObjectEClass.getESuperTypes().add(this.getGraphcialObject());
		sendTaskEClass.getESuperTypes().add(this.getAbstractTask());
		groupEClass.getESuperTypes().add(this.getArtifact());
		operationalizingSoftsolutionEClass.getESuperTypes().add(this.getSoftSolution());
		throwEventEClass.getESuperTypes().add(this.getEvent());
		abstractTaskEClass.getESuperTypes().add(this.getActivity());
		someMinusEClass.getESuperTypes().add(this.getNegativeSatisficing());
		helpEClass.getESuperTypes().add(this.getPositiveSatisficing());
		businessRulesTaskEClass.getESuperTypes().add(this.getAbstractTask());
		annotationEClass.getESuperTypes().add(this.getArtifact());
		hurtEClass.getESuperTypes().add(this.getNegativeSatisficing());
		sequenceFlowEClass.getESuperTypes().add(this.getConnectingObject());
		positiveSatisficingEClass.getESuperTypes().add(this.getSatisficing());
		eqlDecompositionEClass.getESuperTypes().add(this.getDecomposition());
		breakEClass.getESuperTypes().add(this.getNegativeSatisficing());
		connectingObjectEClass.getESuperTypes().add(this.getGraphcialObject());
		catchEventEClass.getESuperTypes().add(this.getEvent());
		makeEClass.getESuperTypes().add(this.getPositiveSatisficing());
		negativeSatisficingEClass.getESuperTypes().add(this.getSatisficing());
		userTaskEClass.getESuperTypes().add(this.getAbstractTask());
		softSolutionEClass.getESuperTypes().add(this.getPhenomenonType());
		orDecompositionEClass.getESuperTypes().add(this.getDecomposition());
		serviceTaskEClass.getESuperTypes().add(this.getAbstractTask());
		phenomenonTypeEClass.getESuperTypes().add(this.getBusinessConcepts());
		softProblemEClass.getESuperTypes().add(this.getPhenomenonType());
		undesirableSituationEClass.getESuperTypes().add(this.getSoftProblem());
		undesirableOperationalizationEClass.getESuperTypes().add(this.getSoftProblem());
		causalAttributionEClass.getESuperTypes().add(this.getSoftProblem());
		taskEClass.getESuperTypes().add(this.getAbstractTask());
		messageFlowEClass.getESuperTypes().add(this.getConnectingObject());
		subProcessEClass.getESuperTypes().add(this.getActivity());
		messageEClass.getESuperTypes().add(this.getEventDefinition());
		timerEClass.getESuperTypes().add(this.getEventDefinition());
		errorEClass.getESuperTypes().add(this.getEventDefinition());
		multipleEClass.getESuperTypes().add(this.getEventDefinition());
		startEventEClass.getESuperTypes().add(this.getCatchEvent());
		boundaryEventEClass.getESuperTypes().add(this.getCatchEvent());
		noneEClass.getESuperTypes().add(this.getEventDefinition());
		endEventEClass.getESuperTypes().add(this.getThrowEvent());
		evenbasedGatewayEClass.getESuperTypes().add(this.getGateway());
		dataInputEClass.getESuperTypes().add(this.getDataObject());
		dataOutputEClass.getESuperTypes().add(this.getDataObject());
		intermediateCatchEventEClass.getESuperTypes().add(this.getCatchEvent());
		intermediateEndEventEClass.getESuperTypes().add(this.getThrowEvent());
		dataAssociationEClass.getESuperTypes().add(this.getConnectingObject());
		bigQueryEClass.getESuperTypes().add(this.getBusinessConcepts());
		kpiGoalEClass.getESuperTypes().add(this.getGoal());
		kpiGoalEClass.getESuperTypes().add(this.getBusinessConcepts());
		kpiEClass.getESuperTypes().add(this.getBusinessConcepts());
		businessGoalEClass.getESuperTypes().add(this.getGoal());
		businessProcessGoalEClass.getESuperTypes().add(this.getGoal());
		goalEClass.getESuperTypes().add(this.getBusinessConcepts());

		// Initialize classes, features, and operations; add parameters
		initEClass(complexGatewayEClass, ComplexGateway.class, "ComplexGateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(receiveTaskEClass, ReceiveTask.class, "ReceiveTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manualTaskEClass, ManualTask.class, "ManualTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gatewayEClass, Gateway.class, "Gateway", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(poolEClass, Pool.class, "Pool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPool_ContainLane(), this.getLane(), null, "containLane", null, 0, -1, Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(artifactEClass, Artifact.class, "Artifact", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArtifact_ContribTypeToParent(), this.getGraphcialObject(), this.getGraphcialObject_Artifact(), "contribTypeToParent", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nfrSoftsolutionEClass, NFRSoftsolution.class, "NFRSoftsolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decompositionEClass, Decomposition.class, "Decomposition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inclusiveGatewayEClass, InclusiveGateway.class, "InclusiveGateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(somePlusEClass, SomePlus.class, "SomePlus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andDecompositionEClass, ANDDecomposition.class, "ANDDecomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityEClass, Activity.class, "Activity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_BoundaryEventRefs(), this.getBoundaryEvent(), null, "boundaryEventRefs", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swimlaneEClass, Swimlane.class, "Swimlane", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(claimSoftsolutionEClass, ClaimSoftsolution.class, "ClaimSoftsolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parallelGatewayEClass, ParallelGateway.class, "ParallelGateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(satisficingEClass, Satisficing.class, "Satisficing", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exclusiveGatewayEClass, ExclusiveGateway.class, "ExclusiveGateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataObjectEClass, DataObject.class, "DataObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(laneEClass, Lane.class, "Lane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLane_GraphicObj(), this.getGraphcialObject(), null, "graphicObj", null, 0, -1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowObjectEClass, FlowObject.class, "FlowObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowObject_SequenceFlows(), this.getConnectingObject(), null, "sequenceFlows", null, 0, -1, FlowObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendTaskEClass, SendTask.class, "SendTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationalizingSoftsolutionEClass, OperationalizingSoftsolution.class, "OperationalizingSoftsolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(throwEventEClass, ThrowEvent.class, "ThrowEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThrowEvent_ThrowEventDefinition(), this.getEventDefinition(), null, "throwEventDefinition", null, 1, 1, ThrowEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThrowEvent_ThrowEventDefinitionRef(), this.getEventDefinition(), null, "throwEventDefinitionRef", null, 1, -1, ThrowEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractTaskEClass, AbstractTask.class, "AbstractTask", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractTask_TaskBoundaryEventRefs(), this.getBoundaryEvent(), null, "taskBoundaryEventRefs", null, 0, 1, AbstractTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(someMinusEClass, SomeMinus.class, "SomeMinus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(helpEClass, Help.class, "Help", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessRulesTaskEClass, BusinessRulesTask.class, "BusinessRulesTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hurtEClass, Hurt.class, "Hurt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceFlowEClass, SequenceFlow.class, "SequenceFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceFlow_TargetFlowObject(), this.getFlowObject(), null, "targetFlowObject", null, 1, -1, SequenceFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positiveSatisficingEClass, PositiveSatisficing.class, "PositiveSatisficing", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eqlDecompositionEClass, EQLDecomposition.class, "EQLDecomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(breakEClass, Break.class, "Break", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectingObjectEClass, ConnectingObject.class, "ConnectingObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(catchEventEClass, CatchEvent.class, "CatchEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCatchEvent_ParallelMultiple(), ecorePackage.getEBooleanObject(), "parallelMultiple", null, 0, 1, CatchEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatchEvent_CatchEventDefinition(), this.getEventDefinition(), null, "catchEventDefinition", null, 1, 1, CatchEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatchEvent_CatchEventDefinitionRef(), this.getEventDefinition(), null, "catchEventDefinitionRef", null, 1, -1, CatchEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpmnRootElementEClass, BPMNRootElement.class, "BPMNRootElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBPMNRootElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, BPMNRootElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPMNRootElement_BPMNReference(), this.getGraphcialObject(), null, "BPMNReference", null, 0, -1, BPMNRootElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPMNRootElement_BusinessConceptEReference(), this.getBusinessConcepts(), null, "businessConceptEReference", null, 0, -1, BPMNRootElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(makeEClass, Make.class, "Make", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negativeSatisficingEClass, NegativeSatisficing.class, "NegativeSatisficing", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userTaskEClass, UserTask.class, "UserTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(graphcialObjectEClass, GraphcialObject.class, "GraphcialObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphcialObject_Artifact(), this.getArtifact(), this.getArtifact_ContribTypeToParent(), "artifact", null, 0, -1, GraphcialObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphcialObject_Label(), this.getSatisficingLabelType(), "label", null, 0, 1, GraphcialObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphcialObject_BusinessconceptsParent(), this.getBusinessConcepts(), this.getBusinessConcepts_TopicChild(), "businessconceptsParent", null, 0, -1, GraphcialObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphcialObject_Type(), this.getBusinessConcepts(), this.getBusinessConcepts_Topic(), "type", null, 0, -1, GraphcialObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphcialObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, GraphcialObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphcialObject_LocalBusinessConcept(), this.getBusinessConcepts(), null, "localBusinessConcept", null, 0, -1, GraphcialObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphcialObject_ContribTypeToParents(), this.getContribution(), null, "contribTypeToParents", null, 0, -1, GraphcialObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softSolutionEClass, SoftSolution.class, "SoftSolution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orDecompositionEClass, ORDecomposition.class, "ORDecomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceTaskEClass, ServiceTask.class, "ServiceTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contributionEClass, Contribution.class, "Contribution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContribution_Name(), ecorePackage.getEString(), "name", null, 0, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContribution_TargetBusinessConcept(), this.getBusinessConcepts(), null, "targetBusinessConcept", null, 0, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phenomenonTypeEClass, PhenomenonType.class, "PhenomenonType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhenomenonType_Type(), ecorePackage.getEString(), "Type", null, 0, 1, PhenomenonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhenomenonType_Label(), this.getSatisficingLabelType(), "label", null, 0, 1, PhenomenonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhenomenonType_Bigquery(), this.getBigQuery(), this.getBigQuery_Phenomenontype(), "bigquery", null, 0, -1, PhenomenonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhenomenonType_Goal(), this.getGoal(), this.getGoal_Phenomenontype(), "goal", null, 0, -1, PhenomenonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softProblemEClass, SoftProblem.class, "SoftProblem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(undesirableSituationEClass, UndesirableSituation.class, "UndesirableSituation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(undesirableOperationalizationEClass, UndesirableOperationalization.class, "UndesirableOperationalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(causalAttributionEClass, CausalAttribution.class, "CausalAttribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageFlowEClass, MessageFlow.class, "MessageFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageFlow_MessageFlowObject(), this.getPool(), null, "messageFlowObject", null, 1, 1, MessageFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subProcessEClass, SubProcess.class, "SubProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubProcess_Children(), this.getGraphcialObject(), null, "children", null, 0, -1, SubProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubProcess_IsCollapsed(), ecorePackage.getEBooleanObject(), "isCollapsed", "true", 0, 1, SubProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timerEClass, Timer.class, "Timer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(errorEClass, bpmn.Error.class, "Error", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleEClass, Multiple.class, "Multiple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startEventEClass, StartEvent.class, "StartEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStartEvent_IsInterrupt(), ecorePackage.getEBooleanObject(), "isInterrupt", null, 0, 1, StartEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundaryEventEClass, BoundaryEvent.class, "BoundaryEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundaryEvent_CancelActivity(), ecorePackage.getEBooleanObject(), "cancelActivity", null, 0, 1, BoundaryEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoundaryEvent_AttachedToRef(), this.getActivity(), null, "attachedToRef", null, 1, 1, BoundaryEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventDefinitionEClass, EventDefinition.class, "EventDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, EventDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noneEClass, None.class, "None", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endEventEClass, EndEvent.class, "EndEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evenbasedGatewayEClass, EvenbasedGateway.class, "EvenbasedGateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvenbasedGateway_EventGatewayType(), this.geteventBasedGatewayType(), "eventGatewayType", null, 0, 1, EvenbasedGateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvenbasedGateway_IsInstanciate(), ecorePackage.getEBoolean(), "isInstanciate", null, 0, 1, EvenbasedGateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataInputEClass, DataInput.class, "DataInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataOutputEClass, DataOutput.class, "DataOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intermediateCatchEventEClass, IntermediateCatchEvent.class, "IntermediateCatchEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntermediateCatchEvent_IsInterrupt(), ecorePackage.getEBooleanObject(), "isInterrupt", "true", 0, 1, IntermediateCatchEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intermediateEndEventEClass, IntermediateEndEvent.class, "IntermediateEndEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntermediateEndEvent_IsInterrupt(), ecorePackage.getEBooleanObject(), "isInterrupt", "true", 0, 1, IntermediateEndEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAssociationEClass, DataAssociation.class, "DataAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataAssociation_DataAssociateObject(), this.getDataObject(), null, "dataAssociateObject", null, 1, -1, DataAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bigQueryEClass, BigQuery.class, "BigQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBigQuery_Phenomenontype(), this.getPhenomenonType(), this.getPhenomenonType_Bigquery(), "phenomenontype", null, 0, 1, BigQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kpiGoalEClass, KPIGoal.class, "KPIGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKPIGoal_Kpi(), this.getKPI(), this.getKPI_Kpigoal(), "kpi", null, 0, -1, KPIGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kpiEClass, bpmn.KPI.class, "KPI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKPI_Kpigoal(), this.getKPIGoal(), this.getKPIGoal_Kpi(), "kpigoal", null, 0, -1, bpmn.KPI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessGoalEClass, BusinessGoal.class, "BusinessGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessProcessGoalEClass, BusinessProcessGoal.class, "BusinessProcessGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(goalEClass, Goal.class, "Goal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoal_Phenomenontype(), this.getPhenomenonType(), this.getPhenomenonType_Goal(), "phenomenontype", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoal_Label(), this.getSatisficingLabelType(), "label", "Undecided", 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessConceptsEClass, BusinessConcepts.class, "BusinessConcepts", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusinessConcepts_Name(), ecorePackage.getEString(), "name", null, 0, 1, BusinessConcepts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessConcepts_Parent(), this.getBusinessConcepts(), this.getBusinessConcepts_Child(), "parent", null, 0, -1, BusinessConcepts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessConcepts_Child(), this.getBusinessConcepts(), this.getBusinessConcepts_Parent(), "child", null, 0, -1, BusinessConcepts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessConcepts_ContribTypeToParents(), this.getContribution(), null, "contribTypeToParents", null, 0, -1, BusinessConcepts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessConcepts_TopicChild(), this.getGraphcialObject(), this.getGraphcialObject_BusinessconceptsParent(), "topicChild", null, 0, -1, BusinessConcepts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessConcepts_Topic(), this.getGraphcialObject(), this.getGraphcialObject_Type(), "topic", null, 0, -1, BusinessConcepts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(satisficingLabelTypeEEnum, SatisficingLabelType.class, "SatisficingLabelType");
		addEEnumLiteral(satisficingLabelTypeEEnum, SatisficingLabelType.UNDECIDED);
		addEEnumLiteral(satisficingLabelTypeEEnum, SatisficingLabelType.SATISFICED);
		addEEnumLiteral(satisficingLabelTypeEEnum, SatisficingLabelType.WEAKLY_SATISFICED);
		addEEnumLiteral(satisficingLabelTypeEEnum, SatisficingLabelType.WEAKLY_DENIED);
		addEEnumLiteral(satisficingLabelTypeEEnum, SatisficingLabelType.DENIED);
		addEEnumLiteral(satisficingLabelTypeEEnum, SatisficingLabelType.CONFLICT);

		initEEnum(systemBoundaryTypeEEnum, SystemBoundaryType.class, "SystemBoundaryType");
		addEEnumLiteral(systemBoundaryTypeEEnum, SystemBoundaryType.INSIDE);
		addEEnumLiteral(systemBoundaryTypeEEnum, SystemBoundaryType.OUTSIDE);
		addEEnumLiteral(systemBoundaryTypeEEnum, SystemBoundaryType.INBETWEEN);
		addEEnumLiteral(systemBoundaryTypeEEnum, SystemBoundaryType.UNDECIDED);

		initEEnum(activationTypeEEnum, ActivationType.class, "ActivationType");
		addEEnumLiteral(activationTypeEEnum, ActivationType.ACTIVE);
		addEEnumLiteral(activationTypeEEnum, ActivationType.INACTIVE);
		addEEnumLiteral(activationTypeEEnum, ActivationType.UNDECIDED);

		initEEnum(relationshipTypeEEnum, RelationshipType.class, "RelationshipType");
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.GENERALIZATION);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.SPECIALIZATION);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.INCLUSION);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.EXTENSION);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.UNDECIDED);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.SUBSUMPTION);

		initEEnum(eventBasedGatewayTypeEEnum, eventBasedGatewayType.class, "eventBasedGatewayType");
		addEEnumLiteral(eventBasedGatewayTypeEEnum, eventBasedGatewayType.EXCLUSIVE);
		addEEnumLiteral(eventBasedGatewayTypeEEnum, eventBasedGatewayType.PARALLEL);

		// Create resource
		createResource(eNS_URI);
	}

} //BpmnPackageImpl
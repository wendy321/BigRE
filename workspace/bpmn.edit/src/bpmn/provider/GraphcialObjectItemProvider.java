/**
 */
package bpmn.provider;


import bpmn.BpmnFactory;
import bpmn.BpmnPackage;
import bpmn.GraphcialObject;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link bpmn.GraphcialObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphcialObjectItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphcialObjectItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addArtifactPropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addBusinessconceptsParentPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Artifact feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArtifactPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphcialObject_artifact_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphcialObject_artifact_feature", "_UI_GraphcialObject_type"),
				 BpmnPackage.Literals.GRAPHCIAL_OBJECT__ARTIFACT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphcialObject_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphcialObject_label_feature", "_UI_GraphcialObject_type"),
				 BpmnPackage.Literals.GRAPHCIAL_OBJECT__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Businessconcepts Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBusinessconceptsParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphcialObject_businessconceptsParent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphcialObject_businessconceptsParent_feature", "_UI_GraphcialObject_type"),
				 BpmnPackage.Literals.GRAPHCIAL_OBJECT__BUSINESSCONCEPTS_PARENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphcialObject_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphcialObject_type_feature", "_UI_GraphcialObject_type"),
				 BpmnPackage.Literals.GRAPHCIAL_OBJECT__TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphcialObject_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphcialObject_name_feature", "_UI_GraphcialObject_type"),
				 BpmnPackage.Literals.GRAPHCIAL_OBJECT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BpmnPackage.Literals.GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT);
			childrenFeatures.add(BpmnPackage.Literals.GRAPHCIAL_OBJECT__CONTRIB_TYPE_TO_PARENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GraphcialObject)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GraphcialObject_type") :
			getString("_UI_GraphcialObject_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(GraphcialObject.class)) {
			case BpmnPackage.GRAPHCIAL_OBJECT__LABEL:
			case BpmnPackage.GRAPHCIAL_OBJECT__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BpmnPackage.GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT:
			case BpmnPackage.GRAPHCIAL_OBJECT__CONTRIB_TYPE_TO_PARENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT,
				 BpmnFactory.eINSTANCE.createNFRSoftsolution()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT,
				 BpmnFactory.eINSTANCE.createClaimSoftsolution()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT,
				 BpmnFactory.eINSTANCE.createOperationalizingSoftsolution()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT,
				 BpmnFactory.eINSTANCE.createUndesirableSituation()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT,
				 BpmnFactory.eINSTANCE.createUndesirableOperationalization()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT,
				 BpmnFactory.eINSTANCE.createCausalAttribution()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT,
				 BpmnFactory.eINSTANCE.createBigQuery()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT,
				 BpmnFactory.eINSTANCE.createKPIGoal()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT,
				 BpmnFactory.eINSTANCE.createKPI()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT,
				 BpmnFactory.eINSTANCE.createBusinessGoal()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT,
				 BpmnFactory.eINSTANCE.createBusinessProcessGoal()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.GRAPHCIAL_OBJECT__CONTRIB_TYPE_TO_PARENTS,
				 BpmnFactory.eINSTANCE.createSomePlus()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.GRAPHCIAL_OBJECT__CONTRIB_TYPE_TO_PARENTS,
				 BpmnFactory.eINSTANCE.createANDDecomposition()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.GRAPHCIAL_OBJECT__CONTRIB_TYPE_TO_PARENTS,
				 BpmnFactory.eINSTANCE.createSomeMinus()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.GRAPHCIAL_OBJECT__CONTRIB_TYPE_TO_PARENTS,
				 BpmnFactory.eINSTANCE.createHelp()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.GRAPHCIAL_OBJECT__CONTRIB_TYPE_TO_PARENTS,
				 BpmnFactory.eINSTANCE.createHurt()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.GRAPHCIAL_OBJECT__CONTRIB_TYPE_TO_PARENTS,
				 BpmnFactory.eINSTANCE.createEQLDecomposition()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.GRAPHCIAL_OBJECT__CONTRIB_TYPE_TO_PARENTS,
				 BpmnFactory.eINSTANCE.createBreak()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.GRAPHCIAL_OBJECT__CONTRIB_TYPE_TO_PARENTS,
				 BpmnFactory.eINSTANCE.createMake()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.GRAPHCIAL_OBJECT__CONTRIB_TYPE_TO_PARENTS,
				 BpmnFactory.eINSTANCE.createORDecomposition()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BpmnEditPlugin.INSTANCE;
	}

}
/**
 */
package bpmn.provider;


import bpmn.BpmnFactory;
import bpmn.BpmnPackage;
import bpmn.Lane;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link bpmn.Lane} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LaneItemProvider extends SwimlaneItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaneItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(BpmnPackage.Literals.LANE__GRAPHIC_OBJ);
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
	 * This returns Lane.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Lane"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Lane)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Lane_type") :
			getString("_UI_Lane_type") + " " + label;
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

		switch (notification.getFeatureID(Lane.class)) {
			case BpmnPackage.LANE__GRAPHIC_OBJ:
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
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createComplexGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createReceiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createPool()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createInclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createParallelGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createExclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createLane()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createSendTask()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createBusinessRulesTask()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createSequenceFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createServiceTask()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createMessageFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createEvenbasedGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createDataInput()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createDataOutput()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createIntermediateCatchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createIntermediateEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnPackage.Literals.LANE__GRAPHIC_OBJ,
				 BpmnFactory.eINSTANCE.createDataAssociation()));
	}

}

/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Artifact#getContribTypeToParent <em>Contrib Type To Parent</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getArtifact()
 * @model abstract="true"
 * @generated
 */
public interface Artifact extends GraphcialObject {
	/**
	 * Returns the value of the '<em><b>Contrib Type To Parent</b></em>' reference list.
	 * The list contents are of type {@link bpmn.GraphcialObject}.
	 * It is bidirectional and its opposite is '{@link bpmn.GraphcialObject#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contrib Type To Parent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrib Type To Parent</em>' reference list.
	 * @see bpmn.BpmnPackage#getArtifact_ContribTypeToParent()
	 * @see bpmn.GraphcialObject#getArtifact
	 * @model opposite="artifact"
	 * @generated
	 */
	EList<GraphcialObject> getContribTypeToParent();

} // Artifact

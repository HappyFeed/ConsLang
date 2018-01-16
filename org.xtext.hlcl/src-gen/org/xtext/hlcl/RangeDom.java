/**
 * generated by Xtext 2.13.0
 */
package org.xtext.hlcl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Dom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hlcl.RangeDom#getStart <em>Start</em>}</li>
 *   <li>{@link org.xtext.hlcl.RangeDom#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hlcl.HlclPackage#getRangeDom()
 * @model
 * @generated
 */
public interface RangeDom extends Dom
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' attribute.
   * @see #setStart(int)
   * @see org.xtext.hlcl.HlclPackage#getRangeDom_Start()
   * @model
   * @generated
   */
  int getStart();

  /**
   * Sets the value of the '{@link org.xtext.hlcl.RangeDom#getStart <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' attribute.
   * @see #getStart()
   * @generated
   */
  void setStart(int value);

  /**
   * Returns the value of the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' attribute.
   * @see #setEnd(int)
   * @see org.xtext.hlcl.HlclPackage#getRangeDom_End()
   * @model
   * @generated
   */
  int getEnd();

  /**
   * Sets the value of the '{@link org.xtext.hlcl.RangeDom#getEnd <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' attribute.
   * @see #getEnd()
   * @generated
   */
  void setEnd(int value);

} // RangeDom
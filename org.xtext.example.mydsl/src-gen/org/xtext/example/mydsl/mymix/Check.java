/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.mymix;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.mymix.Check#getCup <em>Cup</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mymix.Check#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.mymix.MymixPackage#getCheck()
 * @model
 * @generated
 */
public interface Check extends Operation
{
  /**
   * Returns the value of the '<em><b>Cup</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cup</em>' containment reference.
   * @see #setCup(Cup)
   * @see org.xtext.example.mydsl.mymix.MymixPackage#getCheck_Cup()
   * @model containment="true"
   * @generated
   */
  Cup getCup();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mymix.Check#getCup <em>Cup</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cup</em>' containment reference.
   * @see #getCup()
   * @generated
   */
  void setCup(Cup value);

  /**
   * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantity</em>' containment reference.
   * @see #setQuantity(Quantity)
   * @see org.xtext.example.mydsl.mymix.MymixPackage#getCheck_Quantity()
   * @model containment="true"
   * @generated
   */
  Quantity getQuantity();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mymix.Check#getQuantity <em>Quantity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantity</em>' containment reference.
   * @see #getQuantity()
   * @generated
   */
  void setQuantity(Quantity value);

} // Check
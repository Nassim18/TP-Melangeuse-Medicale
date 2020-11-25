/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.mymix;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Take Stuff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.mymix.TakeStuff#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mymix.TakeStuff#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.mymix.MymixPackage#getTakeStuff()
 * @model
 * @generated
 */
public interface TakeStuff extends Operation
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' containment reference.
   * @see #setOp(Take)
   * @see org.xtext.example.mydsl.mymix.MymixPackage#getTakeStuff_Op()
   * @model containment="true"
   * @generated
   */
  Take getOp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mymix.TakeStuff#getOp <em>Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' containment reference.
   * @see #getOp()
   * @generated
   */
  void setOp(Take value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(EObject)
   * @see org.xtext.example.mydsl.mymix.MymixPackage#getTakeStuff_Body()
   * @model containment="true"
   * @generated
   */
  EObject getBody();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mymix.TakeStuff#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(EObject value);

} // TakeStuff

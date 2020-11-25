/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.mymix;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Put All</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.mymix.PutAll#getCup <em>Cup</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mymix.PutAll#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.mymix.MymixPackage#getPutAll()
 * @model
 * @generated
 */
public interface PutAll extends EObject
{
  /**
   * Returns the value of the '<em><b>Cup</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cup</em>' containment reference.
   * @see #setCup(Cup)
   * @see org.xtext.example.mydsl.mymix.MymixPackage#getPutAll_Cup()
   * @model containment="true"
   * @generated
   */
  Cup getCup();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mymix.PutAll#getCup <em>Cup</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cup</em>' containment reference.
   * @see #getCup()
   * @generated
   */
  void setCup(Cup value);

  /**
   * Returns the value of the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' containment reference.
   * @see #setFilter(Filter)
   * @see org.xtext.example.mydsl.mymix.MymixPackage#getPutAll_Filter()
   * @model containment="true"
   * @generated
   */
  Filter getFilter();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mymix.PutAll#getFilter <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' containment reference.
   * @see #getFilter()
   * @generated
   */
  void setFilter(Filter value);

} // PutAll

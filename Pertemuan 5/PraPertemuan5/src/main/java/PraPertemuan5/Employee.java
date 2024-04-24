/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan5;

/**
 *
 * @author Dwinanda
 */
public abstract class Employee {

  private int ssNo;
  private String name;
  private String email;
  private static int counter = 50;

  public Employee() {
    this.ssNo = counter++; // assign unique ssNo to each employee
  }

  public Employee(String name) {
    this.name = name;
  }

  public Employee(int ssNo, String name, String email) {
    this.ssNo = ssNo;
    this.name = name;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSsNo() {
    return ssNo;
  }

  public void setSsNo(int ssNo) {
    this.ssNo = ssNo;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return (
      "Employee[ssNo=" + ssNo + ", name=" + name + ", email=" + email + "]"
    );
  }
}

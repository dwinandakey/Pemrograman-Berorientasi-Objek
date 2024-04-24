/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan3;

/**
 *
 * @author Dwinanda
 */
public class Staff extends Person {

  private String school;
  private double pay;

  public Staff(String school, double pay, String name, String address) {
    super(name, address);
    this.school = school;
    this.pay = pay;
  }

  public String getSchool() {
    return school;
  }

  public double getPay() {
    return pay;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public void setPay(double pay) {
    this.pay = pay;
  }

  @Override  
  public String toString() {
    return (
      "Staff[" +
      super.toString() +
      ", school = " +
      school +
      ", pay = " +
      pay +
      "]"
    );
  }
}

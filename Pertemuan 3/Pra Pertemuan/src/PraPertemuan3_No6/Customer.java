/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan3_No6;

/**
 *
 * @author Dwinanda
 */
public class Customer {

  private String name;
  private boolean member;
  private String memberType;

  public Customer(String name) {
    this.name = name;
    member = false;
  }

  public String getName() {
    return name;
  }

  public boolean isMember() {
    return member;
  }

  public String getMemberType() {
    return memberType;
  }

  public void setMember(boolean member) {
    this.member = member;
  }

  public void setMemberType(String memberType) {
    this.memberType = memberType;
  }

  @Override  
  public String toString() {
    return (
      "[name = " +
      name +
      ", member = " +
      member +
      ", memberType = " +
      memberType +
      "]"
    );
  }
}

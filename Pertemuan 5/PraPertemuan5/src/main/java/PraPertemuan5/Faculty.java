/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan5;

/**
 *
 * @author Dwinanda
 */
public class Faculty {

  private String name;
  private String institutes[];
  private Employee dean;

  public Faculty(String name) {
    this.name = name;
  }

  public Faculty(String name, String[] institutes, Employee dean) {
    this.name = name;
    this.institutes = institutes;
    this.dean = dean;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String[] getInstitutes() {
    return institutes;
  }

  public void setInstitutes(String[] institutes) {
    this.institutes = institutes;
  }

  public Employee getDean() {
    return dean;
  }

  public void setDean(Employee dean) {
    this.dean = dean;
  }

  @Override
  public String toString() {
    String text = "Faculty[name=" + name + ",";
    for (String institute : institutes) {
      text += " " + institute + ", ";
    }
    text += "Dean[" + dean + "]]";
    return text;
  }
}

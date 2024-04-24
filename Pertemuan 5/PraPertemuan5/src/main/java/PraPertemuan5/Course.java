/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan5;

/**
 *
 * @author Dwinanda
 */
public class Course {

  private int id;
  private String name;
  private float hours;

  public Course(int id, String name, float hours) {
    this.id = id;
    this.name = name;
    this.hours = hours;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getHours() {
    return hours;
  }

  public void setHours(float hours) {
    this.hours = hours;
  }

  @Override
  public String toString() {
    return ("Course[id=" + id + ", name=" + name + ", hours=" + hours + "]");
  }
}

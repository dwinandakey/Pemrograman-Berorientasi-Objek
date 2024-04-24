/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan3;

/**
 *
 * @author Dwinanda
 */
public class Cylinder {

  private Circle base;
  private double height;

  public Cylinder(Circle base, double height) {
    this.base = base;
    this.height = height;
  }

  public Circle getBase() {
    return base;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double volume() {
    return Math.PI * Math.pow(base.getRadius(), 2) * height;
  }

  @Override  
  public String toString() {
    return (
      "Cylinder[" +
      base.toString() +
      "], height = " +
      height +
      ", volume = " +
      volume() +
      "]"
    );
  }
}

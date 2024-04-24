/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan3;

/**
 *
 * @author Dwinanda
 */
public class Customer {

  private int id, discount;
  private String name;

  public Customer(int id, int discount, String name) {
    this.id = id;
    this.discount = discount;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public int getDiscount() {
    return discount;
  }

  public String getName() {
    return name;
  }

  public void setDiscount(int discount) {
    this.discount = discount;
  }

  @Override
  public String toString() {
    return name + "(" + id + ")(" + discount + "%)";
  }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan4.No1;

/**
 *
 * @author Dwinanda
 */
public class Dog extends Animal {

  public Dog(String name) {
    // this.name = name;
    super(name);
  }

  @Override
  public void greets() {
    System.out.println("Woof");
  }

  // @Override
  public void greets(Dog another) {
    System.out.println("Woooof");
  }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;

/**
 *
 * @author Dwinanda
 */
import java.util.ArrayList;

public class PinkBook implements Observable {

  private boolean inStock = true;
  private ArrayList<Observer> customers;

  public PinkBook(boolean inStock) {
    this.inStock = inStock;
    customers = new ArrayList<Observer>();
  }

  public boolean isInstock() {
    return inStock;
  }

  public void setInStock(boolean inStock) {
    this.inStock = inStock;
    if (isInstock()) {
      notifyObserver();
    }
  }

  @Override
  public void addObserver(Observer o) {
    customers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    customers.remove(o);
  }

  @Override
  public void notifyObserver() {
    for (int i = 0; i < customers.size(); i++) {
      customers.get(i).update();
    }
  }
}

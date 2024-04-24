/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;

/**
 *
 * @author Dwinanda
 */
public class Customer implements Observer {

  private Observable observable;
  private String username;

  public Customer(Observable observable, String username) {
    this.observable = observable;
    this.username = username;
  }

  @Override
  public void update() {
    System.out.println("Buku Pink Tersedia");
    buyDress();
  }

  private void buyDress() {
    System.out.println(username + " mendapatkan Buku Pink. ");
  }

  public void unsubscribe() {
    observable.removeObserver(this);
  }
}

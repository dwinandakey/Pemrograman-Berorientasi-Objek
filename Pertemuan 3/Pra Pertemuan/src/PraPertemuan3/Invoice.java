/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan3;

/**
 *
 * @author Dwinanda
 */
public class Invoice {

  private int id;
  private Customer customer;
  private double amount;

  public Invoice(int id, Customer customer, double amount) {
    this.id = id;
    this.customer = customer;
    this.amount = amount;
  }

  public int getId() {
    return id;
  }

  public Customer getCustomer() {
    return customer;
  }

  public double getAmount() {
    return amount;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public int getCustomerId() {
    return customer.getId();
  }

  public String getCustomerName() {
    return customer.getName();
  }

  public int getCustomerDiscount() {
    return customer.getDiscount();
  }

  public double getAmountAfterDiscount() {
    return (double) amount - (amount * getCustomerDiscount() / 100);
  }

  @Override  
  public String toString() {
    return (
      "Invoice[id=" +
      id +
      ", customer=" +
      getCustomerName() +
      "(" +
      getCustomerId() +
      ")(" +
      getCustomerDiscount() +
      "%), amount=" +
      getAmountAfterDiscount() +
      "]"
    );
  }
}

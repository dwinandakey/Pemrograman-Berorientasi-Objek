/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan3_No6;

/**
 *
 * @author Dwinanda
 */

import java.time.LocalDate;

public class Visit {

  private Customer customer;
  private LocalDate date;
  private double serviceExpense;
  private double productExpense;

  public Visit(Customer customer, LocalDate date) {
    this.customer = customer;
    this.date = date;
  }

  public String getname() {
    return customer.getName();
  }

  public Customer getCustomer() {
    return customer;
  }

  public double getServiceExpense() {
    return serviceExpense;
  }

  public double getProductExpense() {
    return productExpense;
  }

  public void setServiceExpense(double serviceExpense) {
    this.serviceExpense = serviceExpense;
  }

  public void setProductExpense(double productExpense) {
    this.productExpense = productExpense;
  }

  public double getTotalExpense() {
    return getServiceExpense() + getProductExpense();
  }

  public double getTotalExpenseAfterDiscount() {
    return (
      (
        getServiceExpense() *
        (1 - DiscountRate.getServiceDiscountRate(customer.getMemberType()))
      ) +
      (
        getProductExpense() *
        (1 - DiscountRate.getProductDiscountRate(customer.getMemberType()))
      )
    );
  }

  @Override
  public String toString() {
    String text =
      "Customer[" +
      customer +
      ", date=" +
      date +
      ", serviceExpense=" +
      serviceExpense +
      ", productExpense=" +
      productExpense +
      ", totalExpense=" +
      getTotalExpense();
    if (customer.isMember()) {
      text +=
        ", serviceDiscount=" +
        DiscountRate.getServiceDiscountRate(customer.getMemberType()) *
        100 +
        "%" +
        ", productDiscount=" +
        DiscountRate.getProductDiscountRate(customer.getMemberType()) *
        100 +
        "%" +
        ", totalExpenseAfterDiscount=" +
        getTotalExpenseAfterDiscount();
    }
    text += "]";

    return text;
  }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan3;

/**
 *
 * @author Dwinanda
 */
public class InvoiceMain {

  public static void main(String[] args) {
    Customer customer1 = new Customer(001, 10, "Dwinanda");
    Customer customer2 = new Customer(002, 5, "Muhammad");
    Customer customer3 = new Customer(003, 0, "Keyzha");

    Invoice invoice1 = new Invoice(001, customer1, 100000);
    Invoice invoice2 = new Invoice(002, customer2, 75000);
    Invoice invoice3 = new Invoice(003, customer3, 50000);

    System.out.println("Informasi Customer yang ada: ");
    System.out.println(customer1);
    System.out.println(customer2);
    System.out.println(customer3);

    System.out.println("\nInvoice dari Customer yang ada: ");
    System.out.println(invoice1);
    System.out.println(invoice2);
    System.out.println(invoice3);
  }
}

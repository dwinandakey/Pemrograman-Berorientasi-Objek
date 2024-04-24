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

public class CustomerVisitDiscountMain {

  public static void main(String[] args) {
    Customer customer1 = new Customer("Dwinanda");
    Customer customer2 = new Customer("Muhammad");
    Customer customer3 = new Customer("Keyzha");
    customer1.setMember(true);
    customer1.setMemberType("Premium");
    customer2.setMember(true);
    customer2.setMemberType("Silver");

    Visit c1 = new Visit(customer1, LocalDate.of(2024, 1, 25));
    c1.setServiceExpense(5.75);
    c1.setProductExpense(4.5);
    System.out.println("Informasi tentang pengunjung pertama: ");
    System.out.println(c1);

    Visit c2 = new Visit(customer1, LocalDate.now());
    c2.setServiceExpense(10);
    c2.setProductExpense(20);
    System.out.println("\nInformasi tentang pengunjung kedua: ");
    System.out.println(c2);

    Visit c3 = new Visit(customer2, LocalDate.now());
    c3.setServiceExpense(100);
    c3.setProductExpense(50);
    System.out.println("\nInformasi tentang pengunjung ketiga: ");
    System.out.println(c3);

    Visit c4 = new Visit(customer3, LocalDate.now());
    c4.setServiceExpense(7.5);
    c4.setProductExpense(8);
    System.out.println("\nInformasi tentang pengunjung keempat: ");
    System.out.println(c4);
  }
}

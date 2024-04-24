/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan3;

/**
 *
 * @author Dwinanda
 */
public class MyPointMain {

  public static void main(String[] args) {
    MyPoint point1 = new MyPoint(3, 4);
    System.out.println("Point 1: ");
    System.out.println(point1);

    MyPoint point2 = new MyPoint(8, 6);
    System.out.println("Point 2: ");
    System.out.println(point2);

    System.out.println("Distance from point 1 (3, 4) to (5, 7): ");
    System.out.println(point1.distance(5, 7));

    System.out.println("Distance from point 1 (3, 4) to point 2 (8, 6): ");
    System.out.println(point1.distance(point2));

    System.out.println("Distance from point 1 (3, 4) to (0, 0): ");
    System.out.println(point1.distance());
  }
}

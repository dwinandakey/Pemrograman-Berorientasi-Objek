/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan3;

/**
 *
 * @author Dwinanda
 */
public class BallMain {

  public static void main(String[] args) {
    Ball ball1 = new Ball(10, 15, 5, 5, 20);
    System.out.println("Posisi awal: ");
    System.out.println(ball1);

    ball1.setyDelta(-5);
    ball1.move();

    System.out.println("\nPosisi saat ini: ");
    System.out.println(ball1);

    ball1.reflectHorizontal();
    ball1.reflectVertical();
    ball1.move();
    System.out.println("\nPosisi akhir: ");
    System.out.println(ball1);
  }
}

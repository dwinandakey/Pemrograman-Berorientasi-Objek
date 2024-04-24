/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;

/**
 *
 * @author Dwinanda
 */
public class DecoratorPatternMain {

  public static void main(String[] args) {
    Pakaian Kaos = new Kaos();
    Pakaian kaosmerah = new WarnaiMerah(new Kaos());
    Pakaian celanamerah = new WarnaiMerah(new Celana());
    System.out.println("Kaos belum diwarnai");
    Kaos.pakai();
    System.out.println("\nCelana warna merah");
    celanamerah.pakai();
    System.out.println("\nKaos warna merah");
    kaosmerah.pakai();
  }
}

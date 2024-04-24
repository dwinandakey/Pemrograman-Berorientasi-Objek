/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;

/**
 *
 * @author Dwinanda
 */
public class FactoryPatternMain {

  public static void main(String[] args) {
    PegawaiFactory factory = new PegawaiFactory();
    System.out.println(factory.buatPegawai("Lutfi", "tetap").toString());
    System.out.println(factory.buatPegawai("Dani", "kontrak").toString());
  }
}

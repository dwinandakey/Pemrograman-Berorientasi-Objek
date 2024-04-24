/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;

/**
 *
 * @author Dwinanda
 */
public class PegawaiFactory {

  public Pegawai buatPegawai(String nama, String tipe) {
    return switch (tipe) {
      case "tetap" -> new PegawaiTetap(nama);
      case "kontrak" -> new PegawaiKontrak(nama);
      default -> null;
    };
  }
}

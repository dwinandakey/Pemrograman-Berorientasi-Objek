/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Dwinanda
 */

import java.time.LocalDate;

public class Orang {

  private String nama;
  private LocalDate tanggalLahir;

  public Orang() {}

  public Orang(String nama) {
    this.nama = nama;
  }

  public Orang(String nama, LocalDate tanggalLahir) {
    this.nama = nama;
    this.tanggalLahir = tanggalLahir;
  }

  public String getNama() {
    return nama;
  }

  public LocalDate getTanggalLahir() {
    return tanggalLahir;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setTanggalLahir(LocalDate tanggalLahir) {
    this.tanggalLahir = tanggalLahir;
  }

  public String getGaji() {
    return "tidak ada";
  }
}

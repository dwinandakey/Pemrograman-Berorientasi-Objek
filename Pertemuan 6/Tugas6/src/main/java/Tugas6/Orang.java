/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author Dwinanda
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Orang {

  private String nama;
  private Calendar tanggalLahir;

  public Orang() {}

  public Orang(String nama) {
    this.nama = nama;
  }

  public Orang(String nama, Calendar tanggalLahir) {
    this.nama = nama;
    this.tanggalLahir = tanggalLahir;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getTanggalLahir() {
    try {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
      validatetanggallahir();
      return sdf.format(tanggalLahir.getTime()).toString();
    } catch (Exception e) {
      return "Belum Tersedia";
    } finally {
      System.out.println("error tertangani");
    }
  }

  void validatetanggallahir() throws Exception {
    if (tanggalLahir.get(Calendar.YEAR) < 2000) {
      throw new Exception("Dibawah umur");
    } else {
      System.out.println("cukup umur");
    }
  }

  public void setTanggalLahir(Calendar tanggalLahir) {
    this.tanggalLahir = tanggalLahir;
  }

  public String getNamaPanggilan() {
    if (nama.length() >= 3) {
      return nama.substring(0, 3);
    } else {
      return nama;
    }
  }
}

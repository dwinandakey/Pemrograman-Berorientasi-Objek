/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Dwinanda
 */

import java.util.List;

public class UnitKerja {

  private String nama;
  private final List<Pegawai> daftarPegawai;

  public UnitKerja(String nama, List<Pegawai> daftarPegawai) {
    this.nama = nama;
    this.daftarPegawai = daftarPegawai;
  }

  public String getNama() {
    return nama;
  }

  public List<Pegawai> getDaftarPegawai() {
    return daftarPegawai;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void PrintDaftarPegawai() {
    System.out.println("\nDaftar Pegawai di Unit " + nama + ": ");
    for (Pegawai pegawai : daftarPegawai) {
      System.out.println(pegawai.getNama());
    }
  }
}

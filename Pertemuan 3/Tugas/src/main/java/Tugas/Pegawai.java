/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

import java.time.LocalDate;

/**
 *
 * @author Dwinanda
 */

public class Pegawai extends Orang {

  private String NIP;
  private String namaKantor;
  private String unitKerja;

  public Pegawai() {}

  public Pegawai(String NIP, String namaKantor, String unitKerja) {
    this.NIP = NIP;
    this.namaKantor = namaKantor;
    this.unitKerja = unitKerja;
  }

  public Pegawai(
    String nama,
    LocalDate date,
    String NIP,
    String namaKantor,
    String unitKerja
  ) {
    super(nama);
    this.NIP = NIP;
    this.namaKantor = namaKantor;
    this.unitKerja = unitKerja;
  }

  public String getNIP() {
    return NIP;
  }

  public String getNamaKantor() {
    return namaKantor;
  }

  public String getUnitKerja() {
    return unitKerja;
  }

  public void setNIP(String NIP) {
    this.NIP = NIP;
  }

  public void setNamaKantor(String namaKantor) {
    this.namaKantor = namaKantor;
  }

  public void setUnitKerja(String unitKerja) {
    this.unitKerja = unitKerja;
  }

  @Override
  public String getGaji() {
    return "7 Juta";
  }
}

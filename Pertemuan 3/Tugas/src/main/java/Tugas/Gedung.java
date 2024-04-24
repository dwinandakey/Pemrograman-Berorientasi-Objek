/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Dwinanda
 */

import java.util.ArrayList;
import java.util.List;

public class Gedung {

  private final List<Ruang> daftarRuang = new ArrayList<>();

  public Gedung() {}

  public void addRuang(String namaRuang) {
    Ruang ruang = new Ruang(namaRuang);
    daftarRuang.add(ruang);
  }

  public List<Ruang> getDaftarRuang() {
    return daftarRuang;
  }
}

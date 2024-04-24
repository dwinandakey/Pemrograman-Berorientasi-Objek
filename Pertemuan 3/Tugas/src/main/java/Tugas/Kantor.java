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
import java.time.LocalDate;

public class Kantor {

  public static void main(String[] args) {
    Orang lutfi = new Orang();
    lutfi.setNama("Lutfi");

    Orang rahma = new Orang("Rahma");
    rahma.setTanggalLahir(LocalDate.of(1997, 7, 5));

    System.out.println("Ada orang:");
    System.out.println(
      lutfi.getNama() + " lahir pada " + lutfi.getTanggalLahir()
    );
    System.out.println(
      rahma.getNama() + " lahir pada " + rahma.getTanggalLahir()
    );

    Pegawai tuti = new Pegawai(
      "Tuti",
      LocalDate.of(1997, 8, 2),
      "6836492379",
      "STIS",
      "IT"
    );
    Pegawai itut = new Pegawai(
      "Itut",
      LocalDate.of(1997, 7, 5),
      "3243291379",
      "STIS",
      "Direktur"
    );
    Pegawai titu = new Pegawai();
    titu.setNama("Titu");
    titu.setTanggalLahir(LocalDate.of(1990, 5, 15));
    titu.setNIP("123456789");
    titu.setNamaKantor("Kantor A");
    titu.setUnitKerja("Bagian IT");

    System.out.println(
      tuti.getNama() +
      " lahir pada " +
      tuti.getTanggalLahir() +
      " NIP: " +
      tuti.getNIP() +
      " Kantor: " +
      tuti.getNamaKantor() +
      " bagian: " +
      tuti.getUnitKerja()
    );
    
    System.out.println("\nInformasi Pegawai dengan Nama " + titu.getNama() + ":");
    System.out.println("Tanggal Lahir: " + titu.getTanggalLahir());
    System.out.println("NIP: " + titu.getNIP());
    System.out.println("Nama Kantor: " + titu.getNamaKantor());
    System.out.println("Unit Kerja: " + titu.getUnitKerja());
    System.out.println("Gaji: " + titu.getGaji());
    
    System.out.println("\ngaji Orang Rahma : " + rahma.getGaji());
    System.out.println("gaji Orang Tuti : " + tuti.getGaji());

    List<Pegawai> daftarPegawai = new ArrayList<>();
    daftarPegawai.add(tuti);
    daftarPegawai.add(itut);
    daftarPegawai.add(titu);

    UnitKerja Umum = new UnitKerja("Umum", daftarPegawai);
    Umum.PrintDaftarPegawai();
    
    Gedung STIS = new Gedung();
    STIS.addRuang("Lobi");
    STIS.addRuang("Bagian Umum");
    STIS.addRuang("Kepala Kantor");

    List<Ruang> ruangan = STIS.getDaftarRuang();
    for (Ruang ruang : ruangan) {
      System.out.println("Ruang : " + ruang.getNamaRuang());
    }
  }
}

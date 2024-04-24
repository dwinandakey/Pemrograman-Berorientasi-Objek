/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Dwinanda
 */
import java.time.LocalDate;

public class Pegawai extends Orang implements Dosen {

  private String NIP;
  private String namaKantor;
  private String unitKerja;
  private String alamat;
  String NIDN;
  String keahlian;

  public Pegawai() {}

  public Pegawai(String NIP, String namaKantor, String unitKerja) {
    this.NIP = NIP;
    this.namaKantor = namaKantor;
    this.unitKerja = unitKerja;
  }

  public Pegawai(
    String nama,
    LocalDate tanggalLahir,
    String NIDN,
    String namaKantor,
    String unitKerja
  ) {
    super(nama, tanggalLahir);
    this.namaKantor = namaKantor;
    this.unitKerja = unitKerja;
    this.NIDN = NIDN;
  }

  //    nilai NIDN akan keluar null karena belum terinisiasi sehingga perlu di-setNIDN() jika menggunakan program ini
  //    public Pegawai(String nama, LocalDate tanggalLahir, String NIP, String namaKantor, String unitKerja) {
  //        super(nama, tanggalLahir);
  //        this.NIP = NIP;
  //        this.namaKantor = namaKantor;
  //        this.unitKerja = unitKerja;
  //    }

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

  public String getGaji() {
    return "7 Juta";
  }

  @Override
  public String getAlamat() {
    return alamat;
  }

  @Override
  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  @Override
  public String getNIDN() {
    return NIDN;
  }

  @Override
  public void setNIDN(String NIDN) {
    this.NIDN = NIDN;
  }

  @Override
  public String getKelompokKeahlian() {
    return keahlian;
  }

  @Override
  public void setKelompokKeahlian(String kelompokKeahlian) {
    this.keahlian = kelompokKeahlian;
  }
}

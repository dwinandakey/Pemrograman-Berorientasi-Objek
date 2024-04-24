/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanUTS;

/**
 *
 * @author Dwinanda
 */
public class PesertaVaksinasi {

    private Tanggal tanggalLahir;
    private Tanggal tanggalVaksinPertama;
    private String nama;

    public int getUmurTahun(int tahunSekarang) {
        return tahunSekarang - tanggalLahir.getTahun();
    }

    public void setTanggalVaksinPertama(Tanggal tanggal) {
        this.tanggalVaksinPertama = tanggal;
    }

    public int getJadwalVaksinKedua() {
        return tanggalVaksinPertama.getTanggal() + 14;
    }

    /**
     * @return the tanggalLahir
     */
    public Tanggal getTanggalLahir() {
        return tanggalLahir;
    }

    /**
     * @return the tanggalVaksinPertama
     */
    public Tanggal getTanggalVaksinPertama() {
        return tanggalVaksinPertama;
    }

    /**
     * @param tanggalLahir the tanggalLahir to set
     */
    public void setTanggalLahir(Tanggal tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
}

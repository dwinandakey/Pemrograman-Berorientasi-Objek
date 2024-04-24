/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author Dwinanda
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Pegawai extends Orang {

    private String NIP;
    private String kantor;
    private String unitKerja;
//     private String alamat;
//    String NIDN;
//    String keahlian;
//     String pekerjaan;

    public Pegawai() {

    }

    public Pegawai(String NIP, String kantor, String unitKerja) {
        this.NIP = NIP;
        this.kantor = kantor;
        this.unitKerja = unitKerja;
    }

    public Pegawai(String nama, Calendar tanggalLahir, String NIP, String kantor, String unitKerja) {
        super(nama, tanggalLahir);
        this.NIP = NIP;
        this.kantor = kantor;
        this.unitKerja = unitKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getkantor() {
        return kantor;
    }

    public void setkantor(String kantor) {
        this.kantor = kantor;
    }

    public String getUnitKerja() {
        return unitKerja;
    }

    public void setUnitKerja(String unitKerja) {
        this.unitKerja = unitKerja;
    }

    public void getGaji() {
        System.out.println("7 Juta");
    }

//    @Override
//     public String getAlamat(){
//         return alamat;
//     }
//    @Override
//     public void setAlamat(String alamat){
//         this.alamat=alamat;
//     }
//    @Override
//    public String getNIDN(){
//        return NIDN;
//    }
//    @Override
//    public void setNIDN(String NIDN){
//        this.NIDN=NIDN;
//    }
//    @Override
//    public String getKelompokKeahlian(){
//        return keahlian;
//    }
//    @Override
//    public void setKelompokKeahlian(String kelompokKeahlian){
//        this.keahlian=kelompokKeahlian;
//    }
//    @Override
//    public String getPekerjaan(){
//        return "mengajar";
//    }
}

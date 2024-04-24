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

public class Programmer extends Pegawai {
    private String bahasaPemrograman;
    private String platform;

    public Programmer() {
    }

    public Programmer(String nama, LocalDate tanggalLahir, String bahasaPemrograman, String platform, String NIDN, String kelompokKeahlian, String UnitKerja) {
        super(nama, tanggalLahir, NIDN, kelompokKeahlian, UnitKerja);
        this.bahasaPemrograman = bahasaPemrograman;
        this.platform = platform;
    }
    
    public String getBahasaPemrograman() {
        return bahasaPemrograman;
    }

    public String getPlatform() {
        return platform;
    }

    public void setBahasaPemrograman(String bahasaPemrograman) {
        this.bahasaPemrograman = bahasaPemrograman;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }  
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5;

import java.time.LocalDate;

/**
 *
 * @author Dwinanda
 */
public class Programmer extends Pegawai {

    private String bahasaPemrograman;
    private String platform;

    public Programmer() {
    }

    public Programmer(String nama, LocalDate tanggalLahir, String bahasaPemrograman, String platform, String NIDN, String Keahlian, String UnitKerja) {
        super(nama, tanggalLahir, NIDN, Keahlian, UnitKerja);
        this.bahasaPemrograman = bahasaPemrograman;
        this.platform = platform;
    }

    public String getBahasaPemrograman() {
        return bahasaPemrograman;
    }

    public void setBahasaPemrograman(String bahasaPemrograman) {
        this.bahasaPemrograman = bahasaPemrograman;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String getPekerjaan() {
        return "Coding all along day";
    }
}

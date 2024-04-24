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

public class Programmer extends Pegawai {
    private String bahasaPemrograman;
    private String platform;
    
    public Programmer(){
        
    }
    public Programmer(String nama, Calendar tanggalLahir, String bahasaPemograman, String platform, String NIDN, String kelompokKeahlian, String UnitKerja){
        super(nama, tanggalLahir, NIDN, kelompokKeahlian, UnitKerja);
        this.bahasaPemrograman = bahasaPemrograman;
        this.platform = platform;
    }

    /**
     * @return the bahasaPemograman
     */
    public String getBahasaPemrograman() {
        return bahasaPemrograman;
    }

    /**
     * @param bahasaPemograman the bahasaPemograman to set
     */
    public void setBahasaPemrograman(String bahasaPemrograman) {
        this.bahasaPemrograman = bahasaPemrograman;
    }

    /**
     * @return the platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * @param platform the platform to set
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }
//    @Override
//    public String getPekerjaan(){
//        return "Coding all along day";
//    }
}

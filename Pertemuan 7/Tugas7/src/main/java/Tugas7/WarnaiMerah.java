/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;

/**
 *
 * @author Dwinanda
 */
public class WarnaiMerah extends WarnaiPakaian {

    public WarnaiMerah(Pakaian warnai) {
        super(warnai);
    }

    @Override
    public void pakai() {
        warnai.pakai();
        setWarnaPakaian(warnai);
    }

    private void setWarnaPakaian(Pakaian warnai) {
        System.out.println("Warna Border : Merah");
    }
}

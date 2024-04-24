/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanUTS;

import java.util.ArrayList;

/**
 *
 * @author Dwinanda
 */
public class Klinik {

    private static final Klinik INSTANCE = new Klinik();
    private final ArrayList<PesertaVaksinasi> dataPeserta = new ArrayList<>();
    
    //Agar hanya bisa dibuat 1 objek saja
    private Klinik() {
    }

    public static Klinik getInstance() {
        return INSTANCE;
    }

    public void addPeserta(PesertaVaksinasi peserta) {
       dataPeserta.add(peserta);
    }

    public ArrayList<PesertaVaksinasi> getDaftarPeserta() {
        return dataPeserta;
    }
    
    public void listPesertaLansia(PesertaVaksinasi lansia){
       dataPeserta.add(lansia);
    }
    
    public ArrayList<PesertaVaksinasi> getDaftarPesertaLansia(){
        return dataPeserta;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9;

/**
 *
 * @author Iman
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    private MahasiswaView view;
    List<Mahasiswa> mahasiswaList = new ArrayList<>();

    public Main(MahasiswaView view) {
        this.view = view;
        this.view.setSimpanButtonListener(e -> simpanMahasiswa());
        this.view.setResetButtonListener(e -> resetForm());
    }

    private void simpanMahasiswa() {
        Mahasiswa mahasiswa = new Mahasiswa(view);
        if(!mahasiswa.isValid()) {
            view.displayErrorMessage(mahasiswa.validate());
        }
        else {
            mahasiswa.setNim(view.getNIM());
            mahasiswa.setNamaDepan(view.getNamaDepan());
            mahasiswa.setNamaBelakang(view.getNamaBelakang());
            mahasiswa.setUmur(Integer.parseInt(view.getUmur()));
            mahasiswa.setAsal(view.getAsal());
            mahasiswaList.add(mahasiswa);
            view.clearFields();
            view.displaySuccessMessage("Data mahasiswa berhasil disimpan!", mahasiswaList);
        }
    }

    private void resetForm() {
        view.clearFields();
    }

    public static void main(String[] args) {
        MahasiswaView view = new MahasiswaView();
        Main main = new Main(view);
    }
}


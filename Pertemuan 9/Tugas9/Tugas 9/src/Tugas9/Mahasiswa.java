package Tugas9;

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {
    private String nim;
    private String namaDepan;
    private String namaBelakang;
    private int umur;
    private String asal;
    private MahasiswaView view;
    
    public Mahasiswa(MahasiswaView view) {
        this.view = view;
    }

    public Mahasiswa(String nim, String namaDepan, String namaBelakang, int umur, String asal) {
        this.nim = nim;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.umur = umur;
        this.asal = asal;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return namaDepan + " " + namaBelakang;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public List<String> validate() {
        List<String> errorMessage = new ArrayList<>();

        if (view.getNIM().isEmpty() || view.getNama().isEmpty() || view.getUmur().isEmpty()) {
            errorMessage.add("Semua isian wajib terisi!");
            return errorMessage;
        }

        if (view.getNIM().length() != 6 || !view.getNIM().matches("[0-9]+$")) {
            errorMessage.add("Terjadi kesalahan: NIM harus memiliki panjang 6 digit dan berupa angka!");
        }

        if (view.getNama().length() > 50 || !view.getNama().matches("[a-zA-Z ]+$")) {
            errorMessage.add("Terjadi kesalahan: maksimal nama lengkap adalah 50 karakter dan berupa huruf!");
        }

        if (!view.getUmur().matches("\\d+")) {
            errorMessage.add("Terjadi kesalahan input pada Umur: Umur hanya bisa diisi oleh angka!");
        }
        return errorMessage;
    }

    public boolean isValid() {
        List<String> errors = validate();
        return errors.isEmpty();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanUTS;

/**
 *
 * @author Dwinanda
 */
public class Tanggal {

    private int tanggal;
    private int bulan;
    private int tahun;

    public final int MAX_TGL1 = 28;
    public final int MAX_TGL2 = 29;
    public final int MAX_TGL3 = 30;
    public final int MAX_TGL4 = 31;
    public final int MIN_BULAN = 1;
    public final int MAX_BULAN = 12;

    public Tanggal(int tahun, int bulan, int tanggal) throws Exception {
        try {
            setTahun(tahun);
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }

        try {
            setBulan(bulan);
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }

        try {
            setTanggal(tanggal);
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }

    }

    public int keHariSelanjutnya(int tanggal1) {
        tanggal1 = tanggal1 + 1;
        return tanggal1;
    }

    public int keHariSelanjutnyaKe_N(int n, int tanggal2) {
      tanggal = tanggal2 + n;
        return tanggal;
    }

    /**
     * @param tahun the tahun to set
     */
    private void setTahun(int tahun) {
        this.tahun = tahun;
    }

    /**
     * @param bulan the bulan to set
     * @throws java.lang.Exception
     */
    private void setBulan(int bulan) throws Exception {
        if (bulan >= 1 && bulan <= 12) {
            this.bulan = bulan;
        } else {
            throw new Exception("INPUT BULAN SALAH");

        }

    }

    /**
     * @param tanggal the tanggal to set
     * @throws java.lang.Exception
     */
    private void setTanggal(int tanggal) throws Exception {
        if ((tanggal >= 1 && tanggal <= MAX_TGL1) || (tanggal >= 1 && tanggal <= MAX_TGL2) || (tanggal >= 1 && tanggal <= MAX_TGL3) || (tanggal >= 1 && tanggal <= MAX_TGL4)) {
            this.tanggal = tanggal;
        } else {
            throw new Exception("INPUT TANGGAL SALAH");
        }
    }

    /**
     * @return the tanggal
     */
    public int getTanggal() {
        return tanggal;
    }

    /**
     * @return the bulan
     */
    public int getBulan() {

        return bulan;
    }

    /**
     * @return the tahun
     */
    public int getTahun() {
        return tahun;
    }
}

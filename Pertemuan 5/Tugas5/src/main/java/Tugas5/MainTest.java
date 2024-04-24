/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5;

/**
 *
 * @author Dwinanda
 */
import java.time.LocalDate;

public class MainTest {

    public static void main(String[] args) {
// Membuat objek Pegawai dengan constructor yang sesuai
        Pegawai lutfi = new Pegawai("Lutfi", LocalDate.of(1997, 8, 2), "12345678", "BPS", "HRD");
        lutfi.setAlamat("Otista 64 C");
        System.out.println("Alamat Lutfi: " + lutfi.getAlamat());
        System.out.println("Nama Panggilan Lutfi: " + lutfi.getNamaPanggilan());

        // Membuat objek Pegawai dengan constructor tanpa parameter
        Pegawai udin = new Pegawai();
        udin.setNama("Udin");
        udin.setTanggalLahir(LocalDate.of(1995, 5, 10));
        udin.setNIP("87654321");
        udin.setNamaKantor("BAPPENAS");
        udin.setUnitKerja("IT");
        udin.setAlamat("Otista II");
        System.out.println("\nInformasi Pegawai Udin");
        System.out.println("Nama: " + udin.getNama());
        System.out.println("Tanggal Lahir: " + udin.getTanggalLahir());
        System.out.println("NIP: " + udin.getNIP());
        System.out.println("Nama Kantor: " + udin.getNamaKantor());
        System.out.println("Unit Kerja: " + udin.getUnitKerja());
        System.out.println("Alamat: " + udin.getAlamat());
        System.out.println("Nama Panggilan Udin: " + udin.getNamaPanggilan());

        // Menetapkan NIDN dan kelompok keahlian untuk objek lutfi
        lutfi.setNIDN("12345678");
        lutfi.setKeahlian("Computer Science");
        System.out.println("\nAda dosen Lutfi dengan NIDN " + lutfi.getNIDN() + " kelompok " + lutfi.getKeahlian());

        // Membuat objek Programmer dengan constructor yang sesuai
        Programmer p1 = new Programmer("Sipahutar", LocalDate.of(1990, 3, 2), "Java", "Netbeans", "222212576", "BPS", "SI");
        System.out.println("\n" + p1.getNama() + " dengan NIDN " + p1.getNIDN() + " kelompok " + p1.getUnitKerja() + " menguasai bahasa " + p1.getBahasaPemrograman() + " menggunakan platform " + p1.getPlatform() + " di Kantor " + p1.getNamaKantor());
        System.out.println(p1.getPekerjaan());
        
        // Membuat objek Programmer dengan constructor tanpa parameter
        Programmer p2 = new Programmer();
        p2.setNama("Sudirman");
        p2.setTanggalLahir(LocalDate.of(1988, 6, 20));
        p2.setBahasaPemrograman("Python");
        p2.setPlatform("PyCharm");
        p2.setNIDN("45454545");
        p2.setKeahlian("Data Science");
        p2.setUnitKerja("IT");
        p2.setNamaKantor("KEMENKEU");
        System.out.println("\n" + p2.getNama() + " dengan NIDN " + p2.getNIDN() + " kelompok " + p2.getUnitKerja() + " menguasai bahasa " + p2.getBahasaPemrograman() + " menggunakan platform " + p2.getPlatform() + " di Kantor " + p2.getNamaKantor());
        System.out.println(p2.getPekerjaan());
    }
}

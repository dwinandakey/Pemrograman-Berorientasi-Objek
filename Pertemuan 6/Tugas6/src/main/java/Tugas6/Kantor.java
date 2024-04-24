/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author Dwinanda
 */

import java.util.GregorianCalendar;

public class Kantor {

    public static void main(String args[]) {
        Orang lutfi = new Orang();
        lutfi.setNama("Lutfi");
        //lutfi.setTanggalLahir(new GregorianCalendar(2001, 1, 20));
        Pegawai rahma = new Pegawai("Rahma", new GregorianCalendar(1997, 10, 1), "222212576", "BPS", "IT");
        rahma.setTanggalLahir(new GregorianCalendar(2015, 8, 31));
        System.out.println("Ada orang");
        System.out.println(lutfi.getNama() + " lahir pada " + lutfi.getTanggalLahir());
        System.out.println(rahma.getNama() + " lahir pada " + rahma.getTanggalLahir());
    }
}

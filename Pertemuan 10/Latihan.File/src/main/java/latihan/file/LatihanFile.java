/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package latihan.file;

/**
 *
 * @author Dwinanda
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LatihanFile {

    public static void main(String[] args) {
        // TODO code application logic here
        // FileInputStream fis = null;
        // File f = new File("C:\\Users\\Dwinanda\\OneDrive\\Documents\\STIS\\Praktikum dan Coding\\2KS2\\Pemrograman Berorientasi Objek\\Pertemuan 10\\javaio.txt");
        /* System.out.println(f.getName());
        System.out.println(f.getParent());
        System.out.println(f.canWrite());*/

        // rename file atau mendelete file
        // f.renameTo(new File("C:\\Users\\Dwinanda\\OneDrive\\Documents\\STIS\\Praktikum dan Coding\\2KS2\\Pemrograman Berorientasi Objek\\Pertemuan 10\\javaio2.txt"));
        //f.delete();
        
        // Membaca File (byte)
        /*
        try {
            fis = new FileInputStream(f);
            System.out.println(fis.available());
            System.out.println((char) fis.read());
            System.out.println(fis.available());
            System.out.println((char) fis.read());
            System.out.println(fis.available());
        } catch (FileNotFoundException ex) {
            System.err.println("File tidak ditemukan");
        } catch (IOException ex) {
            System.err.println("File gagal dibaca");
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(LatihanFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
        // Membaca File (teks perkarakter)
        try {
            fis = new FileInputStream(f);
            while (fis.available() > 0) {
                System.out.print((char) fis.read());
            }
        } catch (FileNotFoundException ex) {
            System.err.println("File tidak ditemukan");
        } catch (IOException ex) {
            System.err.println("File gagal dibaca");
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(LatihanFile.class.getName()).log(Level.SEVERE,
                        null, ex);
            }
        }

        // Menulis File
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Dwinanda\\OneDrive\\Documents\\STIS\\Praktikum dan Coding\\2KS2\\Pemrograman Berorientasi Objek\\Pertemuan 10\\javaio.txt");
            String str = "Java Input Output";
            fos.write(str.getBytes());
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LatihanFile.class.getName()).log(Level.SEVERE,null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LatihanFile.class.getName()).log(Level.SEVERE,null, ex);
        }
        */

        // Membaca dan Menulis Object
        /*
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Dwinanda\\OneDrive\\Documents\\STIS\\Praktikum dan Coding\\2KS2\\Pemrograman Berorientasi Objek\\Pertemuan 10\\objek.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Mahasiswa mhs = new Mahasiswa();
            mhs.setNim("1234");
            mhs.setNama("Andi");
            oos.writeObject(mhs);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LatihanFile.class.getName()).log(Level.SEVERE,null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LatihanFile.class.getName()).log(Level.SEVERE,null, ex);
        }
        */

        // Membaca Object
        try {
            File f = new File("C:\\Users\\Dwinanda\\OneDrive\\Documents\\STIS\\Praktikum dan Coding\\2KS2\\Pemrograman Berorientasi Objek\\Pertemuan 10\\objek.dat");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Mahasiswa mhs = (Mahasiswa) ois.readObject();
            System.out.println(mhs.getNim());
            System.out.println(mhs.getNama());
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File tidak ditemukan");
        } catch (IOException ex) {
            System.err.println("File gagal dibaca");
        } catch (ClassNotFoundException ex) {
            System.err.println("Format File salah");
        }
    }
}

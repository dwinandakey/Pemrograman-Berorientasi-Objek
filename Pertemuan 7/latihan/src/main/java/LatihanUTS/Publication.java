/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanUTS;

/**
 *
 * @author Dwinanda
 */
public class Publication extends Content {

    @Override
    public void share(){
        System.out.println("PDF publikasi dibagikan ke "+getMedia());
    }

    @Override
    public void generateSharedContent(){
        System.out.println("Mendapatkan file PDF publikasi terpilih");
    }

    @Override
    public void display(){
        System.out.println("Menampilkan daftar Publikasi");
    }
    @Override
    public void selectContent(){
        System.out.println("Satu Publikasi dipilih");
    }
}

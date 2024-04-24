/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

import java.util.List;

/**
 *
 * @author Dwinanda
 */
public class Drawing {
    public List<Shape> shapes;

    public Drawing() {
    }
    
    public void addShape(shape Shape){
        System.out.println("Menambahkan bentuk");
    }
    
    public void draw() {
        System.out.println("Menampilkan gambar");
    }
}

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
public class Polygon extends Shape {

    private List<Point> vertices;

    public Polygon(List<Point> vertices) {
        this.vertices = vertices;
    }

    @Override
    public void draw() {
        System.out.println("Menampilkan gambar Polygon");
    }

}

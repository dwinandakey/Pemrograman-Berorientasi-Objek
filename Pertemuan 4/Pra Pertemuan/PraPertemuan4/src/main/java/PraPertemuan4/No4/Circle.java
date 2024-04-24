/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan4.No4;

/**
 *
 * @author Dwinanda
 */
public class Circle implements GeometricObject {

    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Radius circle : " + radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

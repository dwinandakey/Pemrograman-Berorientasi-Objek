/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan4.No4;

/**
 *
 * @author Dwinanda
 */
public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    public String toString() {
        return "ResizableCircle: " + super.toString();
    }

    @Override
    public void resize(int percent) {
        radius *= (percent / 100.0);
    }
}

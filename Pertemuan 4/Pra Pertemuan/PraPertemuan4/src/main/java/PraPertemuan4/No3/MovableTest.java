/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan4.No3;

/**
 *
 * @author Dwinanda
 */
public class MovableTest {

    public static void main(String[] args) {
        MovableRectangle rectangle1 = new MovableRectangle(10, 10, 5, 5, 5, 5);
        System.out.println(rectangle1);
        rectangle1.moveUp();
        System.out.println(rectangle1);
        rectangle1.moveDown();
        System.out.println(rectangle1);
        rectangle1.moveLeft();
        System.out.println(rectangle1);
        rectangle1.moveRight();
        System.out.println(rectangle1);
    }
}

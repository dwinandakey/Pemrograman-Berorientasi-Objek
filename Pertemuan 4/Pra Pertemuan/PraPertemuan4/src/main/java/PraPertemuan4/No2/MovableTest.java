/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan4.No2;

/**
 *
 * @author Dwinanda
 */
public class MovableTest {

    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(10, 10, 5, 5);
        System.out.println(point1);
        point1.moveUp();
        System.out.println(point1);

        MovableCircle circle1 = new MovableCircle(10, 10, 5, 5, 10);
        System.out.println(circle1);
        circle1.moveUp();
        System.out.println(circle1);
    }
}

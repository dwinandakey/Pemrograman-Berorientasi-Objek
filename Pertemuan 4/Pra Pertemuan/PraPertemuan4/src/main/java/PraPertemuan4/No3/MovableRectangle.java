/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan4.No3;

/**
 *
 * @author Dwinanda
 */
public class MovableRectangle {

    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xspeed, int yspeed) {
        topLeft = new MovablePoint(x1, y1, xspeed, yspeed);
        bottomRight = new MovablePoint(x2, y2, xspeed, yspeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle: " + topLeft + " " + bottomRight;
    }

    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}

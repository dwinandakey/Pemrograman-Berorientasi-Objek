/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan3;

/**
 *
 * @author Dwinanda
 */
public class Ball {

  private float x, y, xDelta, yDelta;
  private int radius;

  public Ball(float x, float y, float xDelta, float yDelta, int radius) {
    this.x = x;
    this.y = y;
    this.xDelta = xDelta;
    this.yDelta = yDelta;
    this.radius = radius;
  }

  public float getX() {
    return x;
  }

  public float getY() {
    return y;
  }

  public float getxDelta() {
    return xDelta;
  }

  public float getyDelta() {
    return yDelta;
  }

  public int getRadius() {
    return radius;
  }

  public void setX(float x) {
    this.x = x;
  }

  public void setY(float y) {
    this.y = y;
  }

  public void setxDelta(float xDelta) {
    this.xDelta = xDelta;
  }

  public void setyDelta(float yDelta) {
    this.yDelta = yDelta;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public void move() {
    x += xDelta;
    y += yDelta;
  }

  public void reflectHorizontal() {
    xDelta *= -1;
  }

  public void reflectVertical() {
    yDelta *= -1;
  }

  @Override
  public String toString() {
    return "Ball[(" + x + "," + y + "),speed=(" + xDelta + "," + yDelta + ")]";
  }
}

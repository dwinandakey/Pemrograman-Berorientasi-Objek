/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan3;

/**
 *
 * @author Dwinanda
 */
public class MyPoint {

  private int x, y;

  public MyPoint() {
    this.x = 0;
    this.y = 0;
  }

  public MyPoint(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int[] getXY() {
    int arr[] = new int[2];
    arr[0] = x;
    arr[1] = y;
    return arr;
  }

  public void setXY(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "(" + x + "," + y + ")";
  }

  public double distance(int x, int y) {
    return (double) Math.sqrt(
      Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2)
    );
  }

  public double distance(MyPoint another) {
    return (double) distance(another.getX(), another.getY());
  }

  public double distance() {
    return (double) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
  }
}

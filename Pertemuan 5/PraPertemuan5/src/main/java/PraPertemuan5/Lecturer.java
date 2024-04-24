/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan5;

/**
 *
 * @author Dwinanda
 */
public class Lecturer extends ResearchAssociate {

  private final Course course;

  public Lecturer(
    Course course,
    double hour,
    String fieldOfstudy,
    Institute[] institutes,
    int ssNo,
    String name,
    String email
  ) {
    super(hour, fieldOfstudy, institutes, ssNo, name, email);
    this.course = course;
  }

  @Override
  public String toString() {
    return super.toString() + ", Course=" + course + "]";
  }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan5;

/**
 *
 * @author Dwinanda
 */
public class ResearchAssociate extends Employee {

  private double hour;
  private String fieldOfstudy;
  private Project project;
  private Institute[] institutes;

  public ResearchAssociate(
    String fieldOfstudy,
    int ssNo,
    String name,
    String email
  ) {
    super(ssNo, name, email);
    this.fieldOfstudy = fieldOfstudy;
  }

  public ResearchAssociate(
    double hour,
    String fieldOfstudy,
    Institute[] institutes,
    int ssNo,
    String name,
    String email
  ) {
    super(ssNo, name, email);
    this.hour = hour;
    this.fieldOfstudy = fieldOfstudy;
    this.institutes = institutes;
  }

  public ResearchAssociate(
    double hour,
    String fieldOfstudy,
    Project project,
    Institute[] institutes,
    int ssNo,
    String name,
    String email
  ) {
    super(ssNo, name, email);
    this.hour = hour;
    this.fieldOfstudy = fieldOfstudy;
    this.project = project;
    this.institutes = institutes;
  }

  public double attendance(double hour) {
    return hour;
  }

  public String getFieldOfstudy() {
    return fieldOfstudy;
  }

  public void setFieldOfstudy(String fieldOfstudy) {
    this.fieldOfstudy = fieldOfstudy;
  }

  public Institute[] getInstitutes() {
    return institutes;
  }

  public void setInstitutes(Institute[] institutes) {
    this.institutes = institutes;
  }

  public Project getProject() {
    return project;
  }

  public void setProject(Project project) {
    this.project = project;
  }

  @Override
  public String toString() {
    String institutesText = "";
    for (Institute institute : institutes) {
      institutesText += institute.toString() + " ";
    }
    return (
      "ResearchAssociate[" +
      super.toString() +
      ", institute=" +
      institutesText +
      ", Field of Study=" +
      fieldOfstudy +
      "]"
    );
  }
}

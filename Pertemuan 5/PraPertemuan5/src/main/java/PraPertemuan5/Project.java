/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan5;

/**
 *
 * @author Dwinanda
 */
import java.time.LocalDate;

public class Project {

  private String name;
  private int hours;
  private LocalDate start;
  private LocalDate end;
  private final ResearchAssociate researchAssociate;

  public Project(
    String name,
    int hours,
    LocalDate start,
    LocalDate end,
    ResearchAssociate researchAssociate
  ) {
    this.name = name;
    this.hours = hours;
    this.start = start;
    this.end = end;
    this.researchAssociate = researchAssociate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHours() {
    return hours;
  }

  public void setHours(int hours) {
    this.hours = hours;
  }

  public LocalDate getStart() {
    return start;
  }

  public void setStart(LocalDate start) {
    this.start = start;
  }

  public LocalDate getEnd() {
    return end;
  }

  public void setEnd(LocalDate end) {
    this.end = end;
  }

  @Override
  public String toString() {
    return (
      "Project[name=" +
      name +
      ", hours=" +
      hours +
      ", start=" +
      start +
      ", end=" +
      end +
      ", ResearchAssociation=" +
      researchAssociate +
      "]"
    );
  }
}

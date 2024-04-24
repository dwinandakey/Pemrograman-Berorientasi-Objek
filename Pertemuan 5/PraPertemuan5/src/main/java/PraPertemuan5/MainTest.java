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

public class MainTest {

  public static void main(String[] args) {
    // Creating Dean object
    Employee Dwinanda = new Dean(222212576, "Dwinanda", "Dwinanda@gmail.com");

    // Creating Institutes
    Institute sisteminformasi = new Institute(
      "Sistem Informasi",
      "Jalan Otista 64C"
    );
    Institute sainsData = new Institute("Sains Data", "Jalan Otista 46C");

    String[] instituteNames = {
      sisteminformasi.getName(),
      sainsData.getName(),
    };
    Faculty fmipa = new Faculty("FATISDA", instituteNames, Dwinanda);

    // Creating AdministrativeEmployee object
    AdministrativeEmployee Muhammad = new AdministrativeEmployee(
      111112576,
      "Muhammad",
      "Muhammad@gmail.com"
    );

    // Creating ResearchAssociate objects
    ResearchAssociate Keyzha = new ResearchAssociate(
      3,
      "Basis Data, English, Pemrograman Berbasis Web",
      new Institute[] { sisteminformasi, sainsData },
      333312576,
      "Keyzha",
      "Keyzha@gmail.com"
    );

    ResearchAssociate Nanda = new ResearchAssociate(
      5,
      "Pemrograman Berorientasi Objek",
      new Project(
        "Project Kamu",
        5,
        LocalDate.of(2024, 2, 12),
        LocalDate.of(2024, 2, 15),
        Keyzha
      ),
      new Institute[] { sisteminformasi },
      555512576,
      "Nanda",
      "Nanda@gmail.com"
    );

    // Creating Project object
    Project project = new Project(
      "Project 1",
      5,
      LocalDate.of(2024, 2, 12),
      LocalDate.of(2024, 2, 15),
      Keyzha
    );

    // Printing AdministrativeEmployee object before and after attendance
    System.out.println(Muhammad + "\n");

    Muhammad.attendant();
    Muhammad.attendant();
    System.out.println("Setelah Attendance 2x \n" + Muhammad + "\n");

    // Printing Faculty object
    System.out.println(fmipa + "\n");

    // Printing Project object
    System.out.println(project + "\n");

    // Printing ResearchAssociate objects
    System.out.println(Keyzha + "\n");
    System.out.println(Nanda + "\n");
  }
}

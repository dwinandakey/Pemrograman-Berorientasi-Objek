/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan3;

/**
 *
 * @author Dwinanda
 */
public class StaffStudentPersonMain {

  public static void main(String[] args) {
    Student student1 = new Student(
      "KS",
      2022,
      5000000,
      "Dwinanda",
      "Otista 64C"
    );
    Student student2 = new Student("ST", 2022, 2500000, "Keyzha", "Otista 64C");

    System.out.println("informasi tentang murid: ");
    System.out.println(student1);
    System.out.println(student2);

    Staff staff1 = new Staff("STAN", 10000000, "Muh", "Otista 46C");
    Staff staff2 = new Staff("STAN", 10000000, "Ammad", "Otista 46C");

    System.out.println("\ninformasi tentang staff: ");
    System.out.println(staff1);
    System.out.println(staff2);
  }
}

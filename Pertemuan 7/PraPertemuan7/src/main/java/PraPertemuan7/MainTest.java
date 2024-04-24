/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan7;

/**
 *
 * @author Dwinanda
 */

public class MainTest {

  public static void main(String[] args) {
    Location lokasiDwinanda = new Location(
      "Lokasi Dwinanda",
      -6.13521,
      106.5200
    );
    Location lokasiKeyzha = new Location("Lokasi Keyzha", -6.3740, 106.4939);

    Route bestRoute;

    // Menggunakan Walking
    System.out.println("Best Walking Route:");
    bestRoute = new Walking(lokasiDwinanda, lokasiKeyzha);
    bestRoute.printRoute();

    // Menggunakan Driving
    System.out.println("\nBest Driving Route:");
    bestRoute = new Driving(lokasiDwinanda, lokasiKeyzha);
    bestRoute.printRoute();

    // Menggunakan PublicTransport
    System.out.println("\nBest Public Transport Route:");
    bestRoute = new PublicTransport(lokasiDwinanda, lokasiKeyzha);
    bestRoute.printRoute();
  }
}

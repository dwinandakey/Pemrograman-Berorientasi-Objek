/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan7;

/**
 *
 * @author Dwinanda
 */

/**
 * RouteFinder is an interface for finding the best route between two locations.
 */
public interface RouteFinder {
  /**
   * Finds the best route between the given start and end locations.
   *
   * @param start The starting location.
   * @param end   The destination location.
   */
  void findBestRoute(Location start, Location end);
}

/**
 * WalkingRoute is an implementation of RouteFinder for finding walking routes.
 */
class WalkingRoute implements RouteFinder {

  @Override
  public void findBestRoute(Location start, Location end) {
    System.out.println("Implementation of walking routes");
  }
}

/**
 * DrivingRoute is an implementation of RouteFinder for finding driving routes.
 */
class DrivingRoute implements RouteFinder {

  @Override
  public void findBestRoute(Location start, Location end) {
    System.out.println("Implementation of driving routes");
  }
}

/**
 * PublicTransportRoute is an implementation of RouteFinder for finding public transport routes.
 */
class PublicTransportRoute implements RouteFinder {

  @Override
  public void findBestRoute(Location start, Location end) {
    System.out.println("Implementation of public transport routes");
  }
}

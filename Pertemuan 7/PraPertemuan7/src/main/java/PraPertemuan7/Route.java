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
 * Route is an abstract class representing a route between two locations.
 */
public abstract class Route {

  private final Location start; // The starting location of the route
  private final Location end; // The ending location of the route
  private RouteFinder routeFinder; // The route finder used to find the best route

  /**
   * Constructs a new Route object with the given start and end locations.
   *
   * @param start The starting location of the route.
   * @param end The ending location of the route.
   */
  protected Route(Location start, Location end) {
    this.start = start;
    this.end = end;
  }

  /**
   * Sets the route finder for this route.
   *
   * @param routeFinder The route finder to be set.
   */
  public void setRouteFinder(RouteFinder routeFinder) {
    this.routeFinder = routeFinder;
  }

  /**
   * Prints the best route using the assigned route finder.
   */
  public void printRoute() {
    routeFinder.findBestRoute(start, end);
  }
}

/**
 * Walking is a subclass of Route representing a walking route between two
 * locations.
 */
class Walking extends Route {

  /**
   * Constructs a new Walking object with the given start and end locations.
   *
   * @param start The starting location of the walking route.
   * @param end The ending location of the walking route.
   */
  public Walking(Location start, Location end) {
    super(start, end);
    super.setRouteFinder(new WalkingRoute());
  }
}

/**
 * Driving is a subclass of Route representing a driving route between two
 * locations.
 */
class Driving extends Route {

  /**
   * Constructs a new Driving object with the given start and end locations.
   *
   * @param start The starting location of the driving route.
   * @param end The ending location of the driving route.
   */
  public Driving(Location start, Location end) {
    super(start, end);
    super.setRouteFinder(new DrivingRoute());
  }
}

/**
 * PublicTransport is a subclass of Route representing a public transport route
 * between two locations.
 */
class PublicTransport extends Route {

  /**
   * Constructs a new PublicTransport object with the given start and end
   * locations.
   *
   * @param start The starting location of the public transport route.
   * @param end The ending location of the public transport route.
   */
  public PublicTransport(Location start, Location end) {
    super(start, end);
    super.setRouteFinder(new PublicTransportRoute());
  }
}

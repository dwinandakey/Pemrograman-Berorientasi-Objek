/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan7;

/**
 *
 * @author Dwinanda
 */

/*
 * Location class represents a geographical location with a name and coordinates.
 */
public class Location {

  private String name; // The name of the location
  private double latitude; // The latitude coordinate of the location
  private double longitude; // The longitude coordinate of the location

  /**
   * Constructs a new Location object with the given name and coordinates.
   *
   * @param name      The name of the location.
   * @param latitude  The latitude coordinate of the location.
   * @param longitude The longitude coordinate of the location.
   */
  public Location(String name, double latitude, double longitude) {
    this.name = name;
    this.latitude = latitude;
    this.longitude = longitude;
  }

  /**
   * Gets the name of the location.
   *
   * @return The name of the location.
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the name of the location.
   *
   * @param name The name to set for the location.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets the longitude coordinate of the location.
   *
   * @return The longitude coordinate of the location.
   */
  public double getLongitude() {
    return longitude;
  }

  /**
   * Sets the longitude coordinate of the location.
   *
   * @param longitude The longitude coordinate to set for the location.
   */
  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  /**
   * Gets the latitude coordinate of the location.
   *
   * @return The latitude coordinate of the location.
   */
  public double getLatitude() {
    return latitude;
  }

  /**
   * Sets the latitude coordinate of the location.
   *
   * @param latitude The latitude coordinate to set for the location.
   */
  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  /**
   * Returns a string representation of the Location object.
   *
   * @return A string representation of the Location object.
   */
  @Override
  public String toString() {
    return (
      "Location[name=" +
      name +
      ", coordinates=(" +
      latitude +
      ", " +
      longitude +
      ")]"
    );
  }
}

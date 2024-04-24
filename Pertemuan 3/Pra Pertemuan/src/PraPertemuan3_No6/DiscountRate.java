/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraPertemuan3_No6;

/**
 *
 * @author Dwinanda
 */
public class DiscountRate {

  private static final double serviceDiscountPremium = 0.2;
  private static final double serviceDiscountGold = 0.15;
  private static final double serviceDiscountSilver = 0.1;
  private static final double productDiscountPremium = 0.1;
  private static final double productDiscountSilver = 0.1;
  private static final double productDiscountGold = 0.1;

  public static double getServiceDiscountRate(String type) {
    return switch (type) {
      case "Premium" -> serviceDiscountPremium;
      case "Gold" -> serviceDiscountGold;
      case "Silver" -> serviceDiscountSilver;
      default -> 0;
    };
  }

  public static double getProductDiscountRate(String type) {
    return switch (type) {
      case "Premium" -> productDiscountPremium;
      case "Gold" -> productDiscountGold;
      case "Silver" -> productDiscountSilver;
      default -> 0;
    };
  }
}

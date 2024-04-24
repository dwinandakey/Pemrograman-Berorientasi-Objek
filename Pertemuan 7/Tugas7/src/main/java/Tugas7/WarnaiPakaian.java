/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;

/**
 *
 * @author Dwinanda
 */
public abstract class WarnaiPakaian implements Pakaian {

  protected Pakaian warnai;

  public WarnaiPakaian(Pakaian warnai) {
    this.warnai = warnai;
  }

  @Override
  public void pakai() {
    warnai.pakai();
  }
}

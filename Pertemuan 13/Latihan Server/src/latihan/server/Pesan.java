/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.server;

import java.io.Serializable;

/**
 *
 * @author Dwinanda
 */
public class Pesan implements Serializable {
 private String nama;
 private String pesan;
 public Pesan(String nama, String pesan) {
 this.nama = nama;
 this.pesan = pesan;
 }

 @Override
 public String toString(){
 return "["+nama+"] "+ pesan;
 }
 /**
 * @return the nama
 */
 public String getNama() {
 return nama;
 }
 /**
 * @param nama the nama to set
 */
 public void setNama(String nama) {
 this.nama = nama;
 }
 /**
 * @return the pesan
 */
 public String getPesan() {
 return pesan;
 }
 /**
 * @param pesan the pesan to set
 */
 public void setPesan(String pesan) {
 this.pesan = pesan;
 }
}

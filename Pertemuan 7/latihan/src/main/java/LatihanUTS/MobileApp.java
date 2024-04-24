/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanUTS;

/**
 *
 * @author Dwinanda
 */
import java.util.Scanner;

public class MobileApp {
    public static void kontenType(){
        System.out.println("1. table");
        System.out.println("2. publication");
        System.out.println("3. infografis");
        System.out.println("=== Tipe Konten ===");
        System.out.println("Pilih Tipe Konten (table/publication/infografis) : ");
    }
    public static void kontenTable(){
        System.out.println("1. PDF");
        System.out.println("2. CSV");
        System.out.println("3. Gambar");
    }
    public static void kontenInfografis(){
        System.out.println("1. PDF");
        System.out.println("2. Gambar");
    }
    public static void mediaShare(){
        System.out.println("1. Whatsapp");
        System.out.println("2. Instagram");
        System.out.println("3. Email");
        System.out.println("4. Telegram");
        System.out.println("5. Line");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String contentType, media, format;
        kontenType();

        try {
            contentType = in.nextLine();
            if (!contentType.equals("table") && !contentType.equals("publication") && !contentType.equals("infografis")) {
                throw new IllegalArgumentException("\nInput tidak valid. Silakan pilih antara table, publication, atau infografis.");
            }
            switch (contentType) {
                case "publication" ->                     {
                        Publication content = new Publication();
                        content.display();
                        content.selectContent();
                        content.generateSharedContent();
                        mediaShare();
                        System.out.println("Pilih media : ");
                        try {
                            media = in.nextLine();
                            if (media.equals("whatsapp") || media.equals("instagram") || media.equals("Email") || media.equals("Telegram") || media.equals("Line")) {
                                content.setMedia(media);
                                content.share();
                            }
                        } catch (Exception e) {
                            System.out.println("Media tidak tersedia.");
                        } finally {
                            System.out.println("Terima kasih telah menggunakan layanan kami");
                        }                          }
                case "table" ->                     {
                        Table content = new Table();
                        content.display();
                        content.selectContent();
                        kontenTable();
                        System.out.println("Pilih format: ");
                        format = in.nextLine();
                        content.setFormat(format);
                        content.generateSharedContent();
                        mediaShare();
                        System.out.println("Pilih media : ");
                        try {
                            media = in.nextLine();
                            if (media.equals("whatsapp") || media.equals("instagram") || media.equals("Email") || media.equals("Telegram") || media.equals("Line")) {
                                content.setMedia(media);
                                content.share();
                            }
                        } catch (Exception e) {
                            System.out.println("Media tidak tersedia.");
                        }                          }
                case "infografis" ->                     {
                        Infographic content = new Infographic();
                        content.display();
                        content.selectContent();
                        kontenInfografis();
                        System.out.println("Pilih format: ");
                        format = in.nextLine();
                        content.setFormat(format);
                        content.generateSharedContent();
                        mediaShare();
                        System.out.println("Pilih media : ");
                        try {
                            media = in.nextLine();
                            if (media.equals("whatsapp") || media.equals("instagram") || media.equals("Email") || media.equals("Telegram") || media.equals("Line")) {
                                content.setMedia(media);
                                content.share();
                            }
                        } catch (Exception e) {
                            System.out.println("Media tidak tersedia.");
                        }                          }
                default -> System.out.println("Input salah");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            System.out.println("Terima kasih telah menggunakan layanan kami.");
        }
    }
}

//public class MobileApp {
//    public static void main(String[] args) {
//        // Membuat objek Infographic
//        Infographic infographic = new Infographic();
//        infographic.setFormat("Gambar");
//        infographic.setMedia("Facebook");
//
//        // Berbagi Infographic ke media sosial Facebook
//        System.out.println("1. Infographic sharing process:");
//        infographic.display();
//        infographic.selectContent();
//        infographic.generateSharedContent();
//        infographic.share();
//
//        // Membuat objek Publication
//        Publication publication = new Publication();
//        publication.setFormat("PDF");
//        publication.setMedia("Twitter");
//
//        // Berbagi Publication ke media sosial Twitter
//        System.out.println("\n1. Publication sharing process:");
//        publication.display();
//        publication.selectContent();
//        publication.generateSharedContent();
//        publication.share();
//
//        // Membuat objek Table
//        Table table = new Table();
//        table.setFormat("Excel");
//        table.setMedia("Email");
//
//        // Berbagi Table ke media sosial LinkedIn
//        System.out.println("\n3. Table sharing process:");
//        table.display();
//        table.selectContent();
//        table.generateSharedContent();
//        table.share();
//    }
//}




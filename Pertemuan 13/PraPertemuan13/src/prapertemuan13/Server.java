/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prapertemuan13;

/**
 *
 * @author Dwinanda
 */
import java.io.*;
import java.net.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        BufferedReader in = null;
        PrintWriter out = null;

        try {
            // Membuat server socket pada port 12345
            serverSocket = new ServerSocket(12345);
            System.out.println("Server siap dan menunggu koneksi...");

            // Menerima koneksi dari client
            clientSocket = serverSocket.accept();
            System.out.println("Client terhubung.");

            // Membuat input dan output stream
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            out = new PrintWriter(clientSocket.getOutputStream(), true);

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("Client: " + inputLine);
                String response = getResponse(inputLine);
                out.println(response);
                if (inputLine.equalsIgnoreCase("bye")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) in.close();
                if (out != null) out.close();
                if (clientSocket != null) clientSocket.close();
                if (serverSocket != null) serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static String getResponse(String input) {
        if (input.equalsIgnoreCase("halo")) {
            return "Halo juga";
        } else if (input.equalsIgnoreCase("assalamualaikum")) {
            return "Waalaikumsalam";
        } else if (input.equalsIgnoreCase("apa kabar?")) {
            return "Kabar baik";
        } else if (input.equalsIgnoreCase("siapa namamu?")) {
            return "Nama saya Chatbot";
        } else if (input.equalsIgnoreCase("berapa umurmu?")) {
            return "Saya tidak punya umur, saya hanya sebuah program.";
        } else if (input.equalsIgnoreCase("apa hobimu?")) {
            return "Hobi saya adalah membantu orang dengan informasi.";
        } else if (input.equalsIgnoreCase("makanan favoritmu apa?")) {
            return "Saya tidak makan, tapi saya suka ketika orang berbicara tentang pizza!";
        } else if (input.equalsIgnoreCase("warna favoritmu apa?")) {
            return "Saya suka warna biru, seperti langit yang cerah.";
        } else if (input.equalsIgnoreCase("tanggal berapa hari ini?")) {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            return "Hari ini tanggal " + now.format(formatter);
        } else if (input.equalsIgnoreCase("jam berapa sekarang?")) {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            return "Sekarang pukul " + now.format(formatter);
        } else if (input.equalsIgnoreCase("siapa penciptamu?")) {
            return "Saya diciptakan oleh seorang programmer.";
        } else if (input.equalsIgnoreCase("ceritakan lelucon")) {
            return "Mengapa komputer tidak pernah lelah? Karena mereka butuh sedikit byte untuk tidur!";
        } else if (input.equalsIgnoreCase("film favoritmu apa?")) {
            return "Saya suka film tentang teknologi, seperti 'The Matrix'.";
        } else if (input.equalsIgnoreCase("buku favoritmu apa?")) {
            return "Saya suka buku tentang teknologi dan AI, seperti 'Artificial Intelligence: A Modern Approach'.";
        } else if (input.equalsIgnoreCase("cuaca hari ini bagaimana?")) {
            return "Saya tidak punya akses ke data cuaca saat ini, tapi semoga cuacanya bagus!";
        } else if (input.equalsIgnoreCase("olahraga favoritmu apa?")) {
            return "Saya tidak berolahraga, tapi saya suka mendengar tentang sepak bola.";
        } else if (input.equalsIgnoreCase("lagu favoritmu apa?")) {
            return "Saya suka mendengar 'Bohemian Rhapsody' oleh Queen.";
        } else if (input.equalsIgnoreCase("ceritakan fakta")) {
            return "Tahukah kamu? Lebah berkomunikasi satu sama lain dengan menari.";
        } else if (input.equalsIgnoreCase("bisa main game?")) {
            return "Saya tidak bisa memainkan game, tapi saya bisa membantu dengan informasi tentang game.";
        } else if (input.equalsIgnoreCase("apa tujuanmu?")) {
            return "Tujuan saya adalah membantu kamu dengan informasi dan menjawab pertanyaanmu.";
        } else if (input.equalsIgnoreCase("beri saya kutipan")) {
            return "Kutipan favorit saya adalah: 'The only limit to our realization of tomorrow is our doubts of today.' - Franklin D. Roosevelt";
        } else if (input.equalsIgnoreCase("hewan favoritmu apa?")) {
            return "Saya suka kucing, mereka sangat lucu dan menggemaskan.";
        } else if (input.equalsIgnoreCase("tempat favoritmu apa?")) {
            return "Tempat favorit saya adalah perpustakaan, karena penuh dengan pengetahuan.";
        } else if (input.equalsIgnoreCase("beri saya nasihat")) {
            return "Nasihat terbaik saya adalah untuk selalu tetap belajar dan tidak takut mencoba hal baru.";
        } else if (input.equalsIgnoreCase("acara TV favoritmu apa?")) {
            return "Saya suka acara TV tentang teknologi, seperti 'Black Mirror'.";
        } else if (input.equalsIgnoreCase("bye")) {
            return "bye";
        } else {
            return "Maaf, saya tidak mengerti.";
        }
    }
}

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

public class Client {

    public static void main(String[] args) {
        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;
        BufferedReader stdIn = null;

        try {
            // Terhubung ke server pada port 12345
            socket = new Socket("localhost", 12345);

            // Membuat input dan output stream
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            stdIn = new BufferedReader(new InputStreamReader(System.in));

            String userInput;
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput);
                System.out.println("Server: " + in.readLine());
                if (userInput.equalsIgnoreCase("bye")) {
                    break;
                }
            }
        } catch (UnknownHostException e) {
            System.err.println("Host tidak dikenal");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Tidak dapat terhubung ke server");
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
                if (stdIn != null) {
                    stdIn.close();
                }
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

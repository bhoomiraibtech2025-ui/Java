package Assignment27;

import java.io.*;
import java.net.*;

public class ChatServer {

    public static void main(String[] args) {
        try (
                ServerSocket server = new ServerSocket(5001); BufferedReader keyboard = new BufferedReader(
                        new InputStreamReader(System.in))) {
            System.out.println("Server waiting for client...");

            try (Socket socket = server.accept(); BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())); PrintWriter output = new PrintWriter(
                    socket.getOutputStream(), true)) {

                System.out.println("Client connected!");

                String message;

                while ((message = input.readLine()) != null) {
                    if (message.equalsIgnoreCase("exit")) {
                        break;
                    }

                    System.out.println("Client: " + message);
                    System.out.print("Server reply: ");

                    String reply = keyboard.readLine();
                    if (reply == null) {
                        break;
                    }

                    output.println(reply);

                    if (reply.equalsIgnoreCase("exit")) {
                        break;
                    }
                }
            }

            System.out.println("Server stopped.");

        } catch (BindException e) {
            System.out.println(
                    "Port 5001 is already in use. Stop the old server first.");
        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}

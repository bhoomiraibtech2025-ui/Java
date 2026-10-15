package Assignment27;

import java.io.*;
import java.net.*;

public class ChatClient {

    public static void main(String[] args) {
        try (
                Socket socket = new Socket("localhost", 5001); BufferedReader keyboard = new BufferedReader(
                        new InputStreamReader(System.in)); BufferedReader input = new BufferedReader(
                        new InputStreamReader(socket.getInputStream())); PrintWriter output = new PrintWriter(
                        socket.getOutputStream(), true)) {
            System.out.println("Connected to server!");

            while (true) {
                System.out.print("Enter message: ");
                String message = keyboard.readLine();

                if (message == null) {
                    break;
                }

                output.println(message);

                if (message.equalsIgnoreCase("exit")) {
                    break;
                }

                String reply = input.readLine();

                if (reply == null) {
                    System.out.println("Server disconnected.");
                    break;
                }

                System.out.println("Server: " + reply);

                if (reply.equalsIgnoreCase("exit")) {
                    break;
                }
            }

        } catch (ConnectException e) {
            System.out.println("Cannot connect. Start ChatServer first.");
        } catch (IOException e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}

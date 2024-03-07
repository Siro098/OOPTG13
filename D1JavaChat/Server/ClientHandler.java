package D1JavaChat.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable {

    private ChatServer chatServer;
    private Socket connectionToClient;
    private String name;

    private BufferedReader FromClientReader;
    private PrintWriter toClientWriter;

    public ClientHandler(ChatServer chatServer, Socket coonectionToClient) {
        this.chatServer = chatServer;
        this.connectionToClient = coonectionToClient;

        name = connectionToClient.getInetAddress().getHostAddress();
        start();// Threadstart

    }

    private void start() {
        new Thread(this).start();
    }

    @Override
    public void run() {

        try {
            toClientWriter = new PrintWriter(new OutputStreamWriter(connectionToClient.getOutputStream()));
            FromClientReader = new BufferedReader(new InputStreamReader(connectionToClient.getInputStream()));

            chatServer.broadcastMessage(name + "connected");

            String message = FromClientReader.readLine();
            ;

            while (message != null) {
                chatServer.broadcastMessage(name + ": " + message);
                message = FromClientReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();

        } finally {

            chatServer.removeClient(this);
            chatServer.broadcastMessage(name + "disconnected");
            if (FromClientReader != null) {

                try {
                    FromClientReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            if (toClientWriter != null) {
                toClientWriter.close();
            }
        }

    }

    public void sendMessage(String message) {
        toClientWriter.println(message);
        toClientWriter.flush();
    }

}


package D1JavaChat.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ChatServer {

    private ServerSocket serverSocket;
    private List<ClientHandler> clients;

    public ChatServer(int port) {

        clients = new CopyOnWriteArrayList<>();

        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server started on port: " + port);

            while (true) {
                System.out.println("Waiting on new Client...");
                Socket connectionToClient = serverSocket.accept();
                ClientHandler client = new ClientHandler(this, connectionToClient);
                clients.add(client);
                System.out.println("Accepted new Client");
            }
        } catch (IOException e) {

            e.printStackTrace();
        } finally {

            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {

                    e.printStackTrace();
                }
            }
        }

    }

    public static void main(String[] args) {
        new ChatServer(3141);
    }

    // -------------------------------------------------------------------------------------------------------
    public void broadcastMessage(String message) {
        System.out.println(message);
        if (message != null) {
            for (ClientHandler client : clients) {
                client.sendMessage(message);
            }
        }

    }

    public void removeClient(ClientHandler client) {
        clients.remove(client);
    }

}
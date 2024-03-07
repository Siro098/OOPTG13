package D1JavaChat.Server.ChatClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class ChatClient {
    private String address;
    private int port;

    private Socket connectionToServer;

    public ChatClient(int port) {

        this.port = port;


        address = JOptionPane.showInputDialog("IP-Adresse");

        if (address != null) {
            receivemessages();
        }

    }

    private void receivemessages() {
      try {
        connectionToServer =  new Socket(address, port);
        fromServerReader = new BufferedReader(new InputStreamReader(connectionToServer.getInputStream)); ////////37:18 min
    } catch (IOException e) {
       JOptionPane.showMessageDialog(null, "Verbindung zum Server \"" + address +"\"fehlgeschlagen");
    }
    }

    public static void main(String[] args) {
        new ChatClient(3141);
    }
}

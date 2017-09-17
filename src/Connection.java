import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Connection {


    public static void main(String[] args) {

        Socket soc;
        ObjectOutputStream out = null;
        ObjectInputStream in = null;
        String name = "";

        try {
            soc = new Socket("127.0.0.1", 1234);
            out = new ObjectOutputStream(soc.getOutputStream());
            in = new ObjectInputStream(soc.getInputStream());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Message msg = new Message(name, "Hello!!!");

        sendMessage(msg);
    }



    public void sendMessage(Message msg) {
        try {
            out.flush();
            out.writeObject(msg);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

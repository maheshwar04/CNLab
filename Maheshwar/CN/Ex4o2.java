import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex4o2 {
    public static void main(String[] args) {
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("Local IP Address: " + localhost.getHostAddress());
        } catch (UnknownHostException e) {
            System.err.println("Unable to determine the local IP address.");
        }
    }
}

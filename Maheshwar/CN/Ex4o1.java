import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex4o1 {
    public static void main(String[] args) {
        String website = "github.com";

        try {
            InetAddress ipAddress = InetAddress.getByName(website);
            System.out.println("IP Address for " + website + " is: " + ipAddress.getHostAddress());
        } catch (UnknownHostException e) {
            System.err.println("Unable to find IP address for " + website);
        }
    }
}

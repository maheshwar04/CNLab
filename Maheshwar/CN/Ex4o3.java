import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex4o3 {
    public static void main(String[] args) {
        String ipAddress = "192.168.1.1"; 

        try {
            InetAddress inetAddress = InetAddress.getByName(ipAddress);
            if (inetAddress.getAddress().length == 4) {
                System.out.println(ipAddress + " is an IPv4 address.");
            } else if (inetAddress.getAddress().length == 16) {
                System.out.println(ipAddress + " is an IPv6 address.");
            } else {
                System.out.println(ipAddress + " is of an unknown version.");
            }
        } catch (UnknownHostException e) {
            System.err.println("Unable to determine the IP address version for " + ipAddress);
        }
    }
}

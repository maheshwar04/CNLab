import java.net.*;

public class Ex4o3 {
    public static int getVersion(InetAddress ia) {
        byte[] address = ia.getAddress();
        if (address.length == 4)
            return 4;
        else if (address.length == 16)
            return 6;
        else
            return -1;
    }

    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getByName("172.17.46.173");
            System.out.println(getVersion(ia));
        } catch (UnknownHostException e) {
            System.err.println("Invalid IP address");
        }
    }
}

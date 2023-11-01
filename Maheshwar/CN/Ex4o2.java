import java.net.*;
public class Ex4o2 {
    public static void main(String[] args) {
        try{
            InetAddress add=InetAddress.getLocalHost();
             System.out.println(add);
        }catch(UnknownHostException e){
            System.err.println("not found");
        }
    }
    }


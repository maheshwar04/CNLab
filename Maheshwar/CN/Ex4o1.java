import java.net.*;
public class Ex4o1{
    public static void main(String[] args) {
        try{
        InetAddress add=InetAddress.getByName("www.google.com");
        System.out.println(add);
        /* 
        System.out.println(add.getHostName());
        
       InetAddress[] address=InetAddress.getAllByName("www.facebook.com");
               
       for(InetAddress addres:address){
         System.out.println(addres);
       }
       */
    }catch(UnknownHostException e){
        System.err.println("not found");
    }
}
}
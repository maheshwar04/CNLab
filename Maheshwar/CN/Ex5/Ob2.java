package Ex5;
import java.util.*;
import java.net.*;
import java.net.URL;
public class Ob2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter url");
        Scanner sc=new Scanner(System.in);
        String website=sc.nextLine();
        URL u=new URI(website).toURL();
        Object o=u.getContent();
        System.out.println("I got a"+o.getClass().getName());
    }
}

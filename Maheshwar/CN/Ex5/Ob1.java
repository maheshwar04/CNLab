package Ex5;
//java program for downloading a webpage
import java.net.*;
import java.io.*;
import java.util.*;
import java.net.URL;
public class Ob1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter URL : ");
        Scanner sc=new Scanner(System.in);
        String website=sc.nextLine();
        URL u=new URI(website).toURL();
        BufferedReader in =new BufferedReader(new InputStreamReader(u.openStream()));
        String readLine;
        while((readLine=in.readLine())!=null){
            System.out.println(readLine);
        }
        in.close();
    }
}

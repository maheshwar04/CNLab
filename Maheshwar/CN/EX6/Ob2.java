package EX6;
import java.net.*;
import java.io.*;
import java.util.*;
public class Ob2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter URL : ");
        Scanner sc=new Scanner(System.in);
        String website=sc.nextLine();
        URL u=new URI(website).toURL();
        String encoding="ISO-8859-1";
        URLConnection uc =u.openConnection();
        String contentType=uc.getContentType();
        int start=contentType.indexOf("charset=");
        if(start!=-1){
            encoding=contentType.substring(start+8);
        }
       InputStreamReader in =new InputStreamReader(uc.getInputStream(),encoding);
       int c;
        while((c=in.read())!=-1){
            System.out.print((char)c);
        }
        in.close();
    } 
}


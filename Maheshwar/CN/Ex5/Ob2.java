package Ex5;
import java.net.*;
import java.net.URL;
public class Ob2 {
    public static void main(String[] args) throws Exception {
        try{
        URL www =new URL("https://www.oreilly.com/index.html#p1");
        URL ibiblio= new URL("https://www.oreilly.com/index.html#q2");
        if(ibiblio.equals(www)){
            System.out.println(ibiblio+"  is same as  "+www);
        }
        else{
            System.out.println(ibiblio+"  is not same as   "+www);
        }
    }
    catch(MalformedURLException e){
        System.err.println(e);
    }
    }
}
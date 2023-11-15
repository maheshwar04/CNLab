package Ex5;
import java.io.InputStream;
import java.net.MalformedURLException;
//import java.net.URL;
public class URL {
    public URL(String protocol,String hostname,String file) throws MalformedURLException{
       try{
        URL u=new URL("http","www.eff.org","/")
       }
    }

    public InputStream openStream() {
        return null;
    }
}

package lab5;
import java.net.*;
import java.io.*;
public class DownloadWebpage {

	public static void main(String[] args) {
if (args.length>0) {
InputStream inputStream=null;
try {
	URL url=new URL(args[0]);
	inputStream=url.openStream();
	inputStream=new BufferedInputStream(inputStream);
	Reader r=new InputStreamReader(inputStream);
	 int c;
	 while ((c = r.read())!=-1) {
		 System.out.println((char)c);
	 }
}catch (MalformedURLException ex) {
	System.err.println(args[0]+"is not a parseable URL");
}catch (IOException ex) {
	System.err.println(ex);
}finally {
		if(inputStream != null) {
			try {
				inputStream.close();
			}catch (IOException e) {
		}
	}
}
}

	}

}

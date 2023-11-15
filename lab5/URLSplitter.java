
package lab5;
import java.net.*;
import java.util.*;
public class URLSplitter {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter a URL:");
String url=sc.nextLine();
try {
	URI u=new URI(url);
	System.out.println("Protocol:"+u.getScheme());
	System.out.println("User Info:"+u.getUserInfo());
	String host = u.getHost();
	if(host !=null) {
		System.out.println("Host:"+host);
	}else {
		System.out.println("Invalid URL");
	}
	System.out.println("the port is"+u.getPort());
	System.out.println("the path is"+u.getPath());
	System.out.println("the query string is"+u.getQuery());
}
catch (URISyntaxException ex)
{
	System.err.println(ex);
}
	}
}


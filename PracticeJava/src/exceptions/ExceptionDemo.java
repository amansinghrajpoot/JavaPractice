package exceptions;

import java.net.MalformedURLException;
import java.net.URL;


public class ExceptionDemo {
	
public static void demo() throws MalformedURLException {
	
	try {
		URL url = new URL("google.com");
		System.out.println(url.getPort());
	
	
	}catch (MalformedURLException e) {
		
		System.out.println(e.getLocalizedMessage());
		System.out.println(e.getMessage());
		
	}
	finally
	{
		System.out.println("in finally block");
	}
	
	
		
		URL url = new URL("google.com");
		System.out.println(url.getPort());
	

}
}

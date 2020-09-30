package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResourceDemo {
	
	public static void demo() {
		Scanner scanner = null;
		
		try {
		 scanner = new Scanner(new File("C:\\Oracle\\External\\customer_data.csv1"));
		
		while (scanner.hasNext()) {
			
			System.out.println(scanner.nextLine());
			}
		
		}catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
		    if (scanner != null) {
		        scanner.close();
		    }
		
		}
		//try with resource
		 
		    try ( Scanner sc = new Scanner(new File("C:\\Oracle\\External\\Oscar.java"))){
			
			    while (sc.hasNext()) {	
				   System.out.println(sc.nextLine());
				      }
		        }
		    catch (FileNotFoundException e)
		     {    
		    			System.out.println(e.getMessage());
		     }
		    catch (NullPointerException e) {
		    	e.printStackTrace();
		    }
		    
	}

	}

package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsDemo {

	
	public static void demo() {
	ArrayList<Integer> arr = new ArrayList<>();
    arr.add(10);
    arr.add(20);
    arr.add(30);
    arr.add(3, 40);
    Iterator<Integer> e = arr.iterator();
    
    while (e.hasNext()){
    	System.out.println(e.next());
    	
    }
    System.out.println(arr.size());
    
    System.out.println(arr.lastIndexOf(30));
    
    ArrayList<ArrayList> nesarr = new ArrayList<ArrayList>();
    nesarr.add(arr);
    Iterator<ArrayList> ne = nesarr.iterator();
    
    System.out.println(ne.next());
    System.out.println(arr);
	
    LinkedList<Integer> ll = new LinkedList<Integer>();
    
    ll.add(60);
    System.out.println( ll.contains(60));
    
   
	
	}		
    		
    		

}
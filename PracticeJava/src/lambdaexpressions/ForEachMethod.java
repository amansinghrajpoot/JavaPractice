package lambdaexpressions;

import java.util.ArrayList;

public class ForEachMethod {
	
	public static void main() {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		
		arr.add(3, 40);
		arr.forEach(i -> System.out.println(i));
		
		
	}

}

package lambdaexpressions;

import java.util.function.*;

public class InterfaceWithLambda {
	
	public static void main() {
	
	Animal a;
	
//	a = move(i) ->  System.out.println("inside move + i"); 
	a = () ->
	         { System.out.println("inside sound");
	           System.out.println("walk");
	         };
	         
	a.sound();
	
	
	java.util.function.BiConsumer<Integer, Integer> b = (i, j) -> System.out.println(i +" "+ j);
	                                                              
	b.accept(10, 20);
	
	java.util.function.Predicate<Integer> c ;
	c = i -> true;
	System.out.println(c.test(10));
	c = i -> i < 5;
	System.out.println(c.test(10));
	}  // main method
	
}  //InterfaceWithLambda

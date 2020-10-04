package lambdaexpressions;

public class InterfaceWithLambda {
	
	public static void main() {
	
	Animal a;
	
//	a = move(i) ->  System.out.println("inside move + i"); 
	a = () ->
	         { System.out.println("inside sound");
	           System.out.println("walk");
	         };
	         
	a.sound();
	
	
	}
}

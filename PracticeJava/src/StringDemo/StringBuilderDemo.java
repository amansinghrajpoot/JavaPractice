package StringDemo;

public class StringBuilderDemo {
	
	public static void demo() {
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		
		//
		//sb.setLength(5);
		sb.replace(0,0, "Aman singh rajpoot");
		System.out.println(sb.capacity());
		System.out.println(sb.toString());
		System.out.println(sb.reverse().toString());
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
	}
}

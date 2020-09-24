package wrapperclasses;

public class IntegerDemo {
	
	public static void demo() {
		
		Integer wvar = new Integer(10);
		//a = Integer.parseInt("10", 2);
		System.out.println(wvar);
		System.out.println(wvar.compareTo(8));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(wvar.byteValue());
		System.out.println(wvar.getClass());
		System.out.println(wvar.toString().codePointCount(1, 2));
	}

}

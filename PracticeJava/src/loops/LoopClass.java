package loops;

public class LoopClass {
	
	public static void demo() {
		int c;
		int[] arr = new int[] {41, 42, 43, 44};
		for (int i = 1; i < 6; i ++) {
			System.out.println(i);
		}
		for (c = 1; c < 6; c ++) {
			System.out.println(c);
		}
		while (c < 16) {
			System.out.println(c);
			c ++;
		
		}
		do {
			
			System.out.println(c);
			c++;
			
		}while(c <21);
		
		for ( int x : arr) {
			
			System.out.println(x);
		}
	}

}

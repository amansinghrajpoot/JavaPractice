package StringDemo;

import java.nio.CharBuffer;

public class CharBufferDemo {
	
	
	public static void demo() {
		
		char[][] carry= {{'a','b'},{'c', 'd'}};
		
		System.out.println(carry[1][0]);
		
		CharBuffer chb = CharBuffer.allocate(5);
		chb.append('a');
		chb.append('f');
		
		System.out.println(chb.array());
	
	}

}

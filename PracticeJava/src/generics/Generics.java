package generics;

import java.util.ArrayList;
import java.util.List;

public class Generics<T> {
	
	T var;
	Generics(T value){
		
		this.var = value;
		
	}

	public T getVar() {
		return var;
	}
	
	public static void printCollection(List<?> e) {
		
		e.forEach(i -> System.out.println(i));
		
	}
	
	
	public static void main() {
		
		Generics<Integer> a = new Generics<Integer>(10);
		
		System.out.println(a.getVar());
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(10);
		b.add(20);
		b.add(30);
		
		printCollection(b);
	}
}

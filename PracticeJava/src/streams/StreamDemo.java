package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamDemo {
	
	public static void main() {
				
		Person a = new Person("William Bell", 45, "Male");Person b = new Person("Scralett Witch", 32, "Female");
		Person c = new Person("Paul Goodman", 14, "Male");Person d = new Person("Steve Rogers", 85, "Male");
		Person e = new Person("Emma Stone", 19, "Female");Person f = new Person("Jesse Pinkman", 28, "Male");
		Person g = new Person("Rihana House", 25, "Female");Person h = new Person("Robert Green", 95, "Male");
		Person i = new Person("Bill Smith", 15, "Male");Person j = new Person("Rebecca Jones", 38, "Female");
		Person k = new Person("Julia Graham", 16, "Female");
		
		ArrayList<Person> people = new ArrayList<Person>();
		
		people.add(a);people.add(b);people.add(c);people.add(d);people.add(e);people.add(f);
		people.add(g);people.add(h);people.add(i);people.add(j);people.add(k);
		
		List<Person> peoplelist = new ArrayList<Person>();
		
		long count;
		count = people.stream().count();
		
		System.out.println("Number of person " + count);

		peoplelist = people.stream()
		.filter(person -> person.gender.equals("Female"))
		.sorted(Comparator.comparing(person -> person.name))
		.collect(Collectors.toList());
		
		
		peoplelist.forEach(person -> System.out.println(person.name +" "+ person.age +" " + person.gender));
		
		OptionalInt oi = people.stream()
				.filter(person -> person.gender.equals("Female"))
				.sorted(Comparator.comparing(person -> person.name))
				.mapToInt(person -> person.age)
				.max();
				
		System.out.println("max age " + oi.getAsInt());
	} //main
	

} //StreamDemo

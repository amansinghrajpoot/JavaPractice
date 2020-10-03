package classes;

public class Dog implements Animal{
	
	public Dog(String breed){
		System.out.println("In Dog constructor");
		this.breed = breed;		
	}
	
	public Dog() {
		
	}
	
	
	public String breed = "Generic";
	
	public void move() {
		
		System.out.println("walk");
		
	}
    public void sound() {
    	System.out.println("bark");
    	
    }
}

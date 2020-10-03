package classes;

public class Pomeranian extends Dog {
	
	public Pomeranian(String breed) {
		super(breed);
		System.out.println("In Pomeranian constructor");
		//this.breed = breed;
	}
   public Pomeranian() {
		
	}
	
	public String breed = "Pomeranian";
    public void move() {
		
		System.out.println("Pomeranian walk");
		
	}
    public void sound() {
    	System.out.println("Pomeranian bark");
    	
    }

}

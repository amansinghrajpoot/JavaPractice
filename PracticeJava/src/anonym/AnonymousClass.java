package anonym;

public class AnonymousClass {
	
     public static void demo (String agr[]) {
    	 
    	 
    	 Calci sum = new Calci(){
    		    public void add(int a, int b)
    		    {
    		    	System.out.println(a+b);
    		    }
    	 }; sum.add(2, 4);
    	 
    	 
     }

}

interface Calci	{
	
	public void add( int a, int b );
}
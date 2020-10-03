package classes;

public class OuterClass {

	public float instanceField;
	public static float staticField = 200;
	
	public OuterClass() {
		instanceField = 100;
		System.out.println("Inside OuterClass ");
	}
	
	public static class NestedClass {
		
	    public float instanceField;
		public static float staticField = 400;
		 
	    public NestedClass() {
	    	instanceField = 300;
	    	System.out.println("Inside NestedClass");
	    }

	}
	
    public class InnerClass {
    	
    	public float instanceField;
    	public final static float finalstaticField = 600;
    	
    	public InnerClass() {
    		instanceField = 500;
    		System.out.println("Inside InnerClass");
    		
    	}
		
	}
		
	public static void main() {
		
		OuterClass outerInstance1 = new OuterClass();
		System.out.println(outerInstance1.instanceField);
		System.out.println(OuterClass.staticField);
		
		System.out.println();
		
		OuterClass.NestedClass nestedInstance1 = new NestedClass();
		System.out.println(nestedInstance1.instanceField);
		System.out.println(NestedClass.staticField);
		
		System.out.println();
		
		OuterClass outerInstance2 = new OuterClass();
		OuterClass.InnerClass innerInstance1 = outerInstance2.new InnerClass();
		
		System.out.println(outerInstance2.instanceField);
		System.out.println(innerInstance1.instanceField);
		
		System.out.println(innerInstance1.finalstaticField);
		
		class LocalInner{
			
			public float instanceField;
			public static final float staticField = 800;
			
			
			public LocalInner() {
				instanceField = 700;
				System.out.println("InsideLocalInner");
			}
			
		}
		System.out.println();
		LocalInner localInnerInstance1 = new LocalInner();
		System.out.println(localInnerInstance1.instanceField);
		System.out.println(LocalInner.staticField);
	   
		
	}
	
}

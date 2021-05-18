package main;

import java.util.*;

interface Currency{
	   public void setvalue(int val);
	   public int getval();
	}

class Coin implements Currency{

		int Val;
	    public void setvalue(int val){
	        this.Val = val;
	    }
	    public int getval() {
	    	return Val;
	    }
	}

	class Note implements Currency{
		
		int Val;
	    public void setvalue(int val){
	        this.Val = val;
	    }
	    public int getval() {
	    	return Val;
	    }
	}

	class Bag<T> {
	    
	    private ArrayList<T> items;

	    Bag(){
	    	items = new ArrayList<>();
	    }

	    public void addItem(Currency item){
	        this.items.add((T)item);
	    }
	    
	    public ArrayList<T> getList(){
	    	return (ArrayList<T>) this.items;
	    }
	}


	public class TestClass {

	    public static void main(String args[] ) throws Exception {
	    
	        //BufferedReader
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String Ns = br.readLine();  
	        
	        int N = Integer.parseInt(Ns);
	        
	        String line = null;
	        String[] lines = null;
	        
	        Bag<Coin> coinbag = new Bag<Coin>();
	        Bag<Note> notebag = new Bag<Note>();
	        
	        
	        for( int i = 0; i < N; i++) {
	        	
	        	line = br.readLine();
	        	
	        	lines = line.split(" ");
	        	
	        	if (lines[0].toUpperCase().equals("NOTE")) {
	        		Note note = new Note();
	        		note.setvalue(Integer.parseInt(lines[1]));
	        		
	        		notebag.addItem(note);
	        	}
	        	else if (lines[1].toUpperCase().equals("COIN"))
	        	{
	        		Coin coin = new Coin();
	        		coin.setvalue(Integer.parseInt(lines[1]));
	        		
	        		coinbag.addItem(coin);
	        		
	        	}
	        	
	        }
	        
	        System.out.println("Coins :");
	        coinbag.getList().forEach(e -> System.out.println(e.getval())  );
	        
          System.out.println("Notes :");
	        notebag.getList().forEach(e -> System.out.println(e.getval())  );


	    }
	}

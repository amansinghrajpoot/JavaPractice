package StringDemo;

public class LongestCommonSubstring {
	
 public static String find(String args) {
	 
		int strlen = 0, mid = 0, start = 0, last = 0, mid2 = 0;
		StringBuffer sb = new StringBuffer(args);
		strlen = sb.length();
		mid = strlen/2;
		mid2 = mid;
		last = mid2;
		StringBuffer sub = new StringBuffer();
		StringBuffer ssub = new StringBuffer();
		StringBuffer fsub = new StringBuffer();
		StringBuffer ffsub = new StringBuffer();
		StringBuffer out = new StringBuffer();
	while (start < strlen) {
    while (mid > 1) {
	for(int k = mid; k > 1; k--) {
			
			sub.replace(0, strlen, sb.substring(0, k));
			//System.out.println(sub);
			
			for (int l = start; l < k +1 ; l++) {
		    	ssub.replace(0, strlen, sb.substring(l, k)); 
			    //System.out.println(ssub);
			    mid2 = mid;
			     while (mid2 < strlen) {
			        while (last < strlen) {
			    	 
			        for(int o = strlen ; o > mid2; o--) {
			    			
			    			fsub.replace(0, strlen, sb.substring(mid , o));
			    			//System.out.println(fsub);
                          
			    			for (int n = last ; n < o ; n++) {
			    		    	
			    				ffsub.replace(0, strlen, sb.substring(n, o)); 
			    			    if ( sub.equals(fsub)|| sub.equals(ffsub) ||  ssub.equals(fsub) ||ssub.equals(ffsub)) {
			    			    	
			    			    	return sub.toString();
			    			    }
			    				
			    			    
                     
			    	}	  
			        last = last +1;
			        }	
			    	mid2 = mid2 + 1;
			    	}
			    
			
	         }
			
	mid = mid -1;	  
    }	
	start = start + 1;
	}
    	
    }  
 }
    return out.toString();  
}
}
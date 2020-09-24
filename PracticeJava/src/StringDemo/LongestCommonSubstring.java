package StringDemo;

public class LongestCommonSubstring {
	
 public static String find(String args) {
		int strlen = 0, mid = 0, lastmid = 0;
		StringBuffer sb = new StringBuffer(args);
		strlen = sb.length();
		mid = strlen;
		StringBuffer sub = new StringBuffer();
		StringBuffer ssub = new StringBuffer();
		StringBuffer out = new StringBuffer();
		
		do { 
		while (mid >1) {
			sub.replace(0, sub.length(), sb.substring(0, mid));
			for (int i = mid +1; i < sb.length() ; i++) {
			  if (i < sb.length() - sub.length()+1) {
			   ssub.replace(0, ssub.length(), sb.substring(i, i + sub.length()));
			   
			    if (ssub.toString().equals(sub.toString())) {
			        out.replace(0, sub.length(), sub.toString());
			    	break;
			    }
			   }
			  
			  }
			if (ssub.toString().equals(sub.toString())) {
		    	break;
		    }
		    lastmid = mid;
			mid = (mid/2);
		}
		mid = mid+1;
		}while(lastmid - mid >= 1);
		return out.toString();
	}
		
	}
    
	

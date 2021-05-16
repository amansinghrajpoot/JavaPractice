package base;

import java.util.HashMap;


public class Anagram {

    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<String, Integer>() ;

        String s1 = "ARMY";
        String s2 = "RAMY";

        int val;

        String[] ss1 = s1.split("");
        String[] ss2 = s2.split("");

       for(String i: ss1){
           if (m.containsKey(i)) m.put(i, m.get(i)+1);
           else m.put(i, 1);
        }

        for(String i: ss2){
            if (m.containsKey(i)) m.put(i, m.get(i) - 1);
        }

        m.forEach((k, v) -> {if(v > 0) System.out.println("Not Anagram");});
        

    }
}

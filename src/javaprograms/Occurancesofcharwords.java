package javaprograms;

import java.util.HashMap;
import java.util.Map;

public class Occurancesofcharwords {

	public static void occuracechars(String str)
	{
		
        Map<String, Integer> m = new HashMap<String, Integer>();
        String [] stri = str.split("");
        // Initialize frequency table from command line
        for (String a : stri) {

        	if(m.containsKey(a))
            {
                               
                m.put(a, m.get(a)+1);
            }
            else
            {

                 
                m.put(a, 1);
            }
        }

        System.out.println(m.size() + " distinct words:" + m );
        //System.out.println(m);
	}
	
	public static void occuracewords(String str)
	{
		
        Map<String, Integer> m = new HashMap<String, Integer>();
        String [] stri = str.split(" ");
        // Initialize frequency table from command line
        for (String a : stri) {
        	if(m.containsKey(a))
            {
                               
                m.put(a, m.get(a)+1);
            }
            else
            {

                 
                m.put(a, 1);
            }
        
        }
        
        for(Map.Entry m1:m.entrySet()){  
        	   System.out.println(m1.getKey()+" "+m1.getValue());
        }
        //System.out.println(m.size() + " distinct words:" + m );
        //System.out.println(m);
	}

	public static void main(String[] args)
	{
		occuracechars("delegateabcdefghijklmnopqrstuvwxyz");
		occuracewords("ab yz if it is to be it is up to me to delegat eabcdefg hijklmno pqrstu vwxyz");
	}

}

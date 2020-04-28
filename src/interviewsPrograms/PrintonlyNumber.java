package interviewsPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrintonlyNumber
{

	public static void main(String[] args)
	{
		String a = "hdkhhdks3hdsk3d3jhkj34hk324dnjfs3";
		String number = a.replaceAll("[^0-9]", "");
		System.out.println(number);
		// Step 1: create Map of Character-Integer
		Map<Character, Integer> mapOfRepeatedChar = new HashMap<Character, Integer>();

		// Step 2: convert String into character array using toCharArray()
		// method
		char[] chArray = a.toCharArray();

		for (char ch : chArray)
		{
			if (Character.isDigit(ch))
			{
				System.out.print(ch);
			}

			if (mapOfRepeatedChar.containsKey(ch))
			{
				mapOfRepeatedChar.put(ch,mapOfRepeatedChar.get(ch)+1);
			}
			else
			{
				mapOfRepeatedChar.put(ch,1);
			}
		}
		System.out.println("Charter" + " Repeated time");
		List<String> list = new ArrayList<String>();  
		for(Map.Entry m:mapOfRepeatedChar.entrySet())
		  {  
			   System.out.println(m.getKey()+" "+m.getValue());
			   list.add(m.getValue().toString());
		  }
		
		  System.out.println(list);
		  Collections.reverse(list);
		  System.out.println(list);
		
		  
		  
		// // Step 3: iterate through char[] array
		// for(char ch : chArray) {
		//
		// // Step 4: leave spaces
		// if(ch != ' '){
		//
		// // Step 5: check whether Map contains particular character
		// if(mapOfRepeatedChar.containsKey(ch)){
		//
		// // Step 6: If contains, increase count value by 1
		// mapOfRepeatedChar.put(ch, mapOfRepeatedChar.get(ch) + 1);
		// }
		// else {
		//
		// // Step 7: otherwise, make a new entry
		// mapOfRepeatedChar.put(ch, 1);
		// }
		// }
		// }
		//
		// System.out.println("Char" + "\t" + "Count");
		// System.out.println("====" + "\t" + "=====");
		//
		// // Step 8: get keySet() for iteration
		// Set<Character> character = mapOfRepeatedChar.keySet();
		//
		// // Step 9: print word along with its count
		// for(Character ch : character) {
		// System.out.println(ch + "\t" + mapOfRepeatedChar.get(ch));
		// }

	}

}

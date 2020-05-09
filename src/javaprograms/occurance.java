package javaprograms;

import java.util.Arrays;
import java.util.HashMap;

public class occurance {

	public static void main(String[] args) {
		int inputArray[]= new int[]{4, 5, 4, 5, 4, 6};
		HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();
        
        //checking every element of the inputArray
         
        for (int i : inputArray) 
        {
            if(elementCountMap.containsKey(i))
            {
                //If element is present in elementCountMap, incrementing it's count by 1
                 
                elementCountMap.put(i, elementCountMap.get(i)+1);
            }
            else
            {
                //If element is not present in elementCountMap, 
                //adding this element to elementCountMap with 1 as it's value
                 
                elementCountMap.put(i, 1);
            }
        }
         
        System.out.println("Input Array : "+Arrays.toString(inputArray));
         
        System.out.println("Element Count : "+elementCountMap);
		elementCountMap.put(1, 1);
		elementCountMap.put(2, 2);
		elementCountMap.put(1, 3);
		System.out.println(elementCountMap.size());
		System.out.println(elementCountMap);
	}

}

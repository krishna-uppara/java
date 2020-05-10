package javaprograms;

import java.util.Arrays;
import java.util.List;

public class Arraystolist {

	public static void main(String[] args) {
		
		//Array to List 
		Integer a[] = {10,303,34,34,66,3325,45} ;
		List<Integer> students = Arrays.asList(a);
		System.out.println(students);
		
		// list to array
		
		Object b[] = students.toArray();
		System.out.println(b.length);
		for(Object i : b)
		{
			System.out.println(i);
		}

		
		
		//Array to List 
		String c[] = {"10","303","34","34","66","3325","45"} ;
		List<String> str = Arrays.asList(c);
		System.out.println(students);
		
		// list to array
		
		Object[] str1 = str.toArray();
		System.out.println(b.length);
		for(Object i : b)
		{
			System.out.println(i);
		}
		
		
	}

}

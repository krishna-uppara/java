package collections.Complex;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Complex
{

	public static void main(String[] args)
	{
		String[] str = new String[10]; 
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>(new String [] {"1","2","3"});
		//System.println(list);   
		System.out.println(list);//[1, 2, 3]
		//Get iterator 1
		Iterator<String> itr1 = list.iterator();
		 
		//Add one element and verify list is updated
		list.add("4");
		 
		System.out.println(list);   //[1, 2, 3, 4]
		 
		//Get iterator 2
		Iterator<String> itr2 = list.iterator();
		 
		System.out.println("====Verify Iterator 1 content====");
		 
		itr1.forEachRemaining(System.out :: println);   //1,2,3
		 
		System.out.println("====Verify Iterator 2 content====");
		 
		itr2.forEachRemaining(System.out :: println);   //1,2,3,4
	}

}

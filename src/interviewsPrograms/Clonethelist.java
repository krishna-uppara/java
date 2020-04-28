package interviewsPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Clonethelist
{

	public static void main(String a[])
	{
		 ArrayList<String> list = new ArrayList<String>();
		 list.add("one");
		 list.add("two");
		 List<String> copy = (List<String>)list.clone();
		 System.out.println("Actual vector:"+list);
		
		 System.out.println("After Copy: "+copy);
		Vector<String> vct = new Vector<String>();
		// adding elements to the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		System.out.println("Actual vector:" + vct);
		Vector<String> copyvec = (Vector<String>)vct.clone();
		System.out.println("Cloned vector:" + copyvec);
	}
}

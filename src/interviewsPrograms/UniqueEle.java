package interviewsPrograms;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UniqueEle
{

	public static void main(String[] args)
	{
		 Integer[] numbers = {1, 1, 2, 1, 3, 4, 5};
		  Set<Integer> uniqKeys = new TreeSet<Integer>();
		  uniqKeys.addAll(Arrays.asList(numbers));
		  System.out.println("uniqKeys: " + uniqKeys);
		  String [] name = {"kri","krishna","kri","krishna","Shashi","Shashi"};
		  Set<String> uniqnames = new TreeSet<String>();
		  uniqnames.addAll(Arrays.asList(name));
		  System.out.println(uniqnames);;
	}

}

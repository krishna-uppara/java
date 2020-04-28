package interviewsPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class mergetwoarraysandremoveduplicates
{

	public static void main(String[] args)
	{
		int a[] = {9,2,21,3,4};
		int b[] = {89,45,25,2,3};
		int c [] = new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i] = a[i];
		}
		for(int i=a.length;i<c.length;i++)
		{
			c[i] = b[i];
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		List<Integer>artolist2 = new ArrayList<Integer>();
		for (int i=0;i<a.length;i++)
		{
			artolist2.add(a[i]);
			artolist2.add(b[i]);
		}
		Set<Integer> z = new HashSet<Integer>();
		z.addAll(artolist2);
		for(Object a1 : z)
		{
			System.out.println(a1);
		}
		
	}
		//artolist = Arrays.asList(a[]);
		
//		
//		List<Integer> list1, list2 = null;
//        Integer[] intarr = { 3, 4, 2, 1 };
//        list1 = new ArrayList<Integer>(Arrays.asList(intarr));
//        list1.add(30);
//        list2 = Arrays.asList(intarr);
//        // list2.add(40); Here, we can't modify the existing list,because it's a wrapper
//        System.out.println("List1");
//        Iterator<Integer> itr1 = list1.iterator();
//        while (itr1.hasNext()) {
//            System.out.println(itr1.next());
//        }
//        System.out.println("List2");
//        Iterator<Integer> itr2 = list2.iterator();
//        while (itr2.hasNext()) {
//            System.out.println(itr2.next());
//        }
//
//	}

}

package interviewsPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Listtoarray
{
	public static void main(String a[])
	{
        List<String> arrl = new ArrayList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual ArrayList:"+arrl);
        
        
        System.out.println("convert list to Array");
        // convert list to Array
        String[] strArr = new String[arrl.size()];
        arrl.toArray(strArr);
        for (String x : strArr) 
            System.out.print(x + " ");
        System.out.println("convert array to list");
//      convert array to list
        List<String> arr2 = Arrays.asList(strArr);
        System.out.println("collections reverse");
        Collections.reverse(arr2);
        System.out.println(arr2);
        
        System.out.println("convert list to Array");
     // convert list to Array
        String []er  = new String[arr2.size()];
        String abc [] =arr2.toArray(er);
        System.out.println(abc);
        System.out.println(er);
        
        
        
        System.out.println("vector manupulation");
        Vector<String> vct = new Vector<String>();
		// adding elements to the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		System.out.println("Actual vector:" + vct);
		String[] strArrvec = new String[vct.size()];
		vct.toArray(strArrvec);
        System.out.println("Created Array content:");
        for(String str:strArrvec)
        {
            System.out.println(str);
        }
        
        
        int x[]={10,20,30};
        List<Integer> arraa = new ArrayList<Integer>();
        for(int c:x)
        {
        	System.out.println(c);
        	arraa.add(c);
        }
        System.out.println(arraa);
	}
}

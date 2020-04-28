package collections.Complex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ComplexCollection
{

	
		public static void main(String args[])
		{
			Map<String, ArrayList<Integer>> hm = new HashMap< String,ArrayList<Integer>>();
			ArrayList<Integer> list = new ArrayList<Integer>();
			String a = "raja";
			if(a.equalsIgnoreCase("RAJA"))
			{
				list.add(10);
				list.add(20);
				list.add(30);
				list.add(40);
				list.add(50);
//				list.add(60);
//				list.add(70);
//				list.add(80);
//				list.add(90);
			hm.put("Raja", list);
//            hm.put("Raja1", list);
//            hm.put("Raja2", list);
//            hm.put("Raja3", list);
//            hm.put("Raja4", list);
//            hm.put("Raja5", list);
			}
			
			if(a.equalsIgnoreCase("RAJA"))
			{
//				list.add(10);
//				list.add(20);
//				list.add(30);
//				list.add(40);
//				list.add(50);
				list.add(60);
				list.add(70);
				list.add(80);
				list.add(90);
			hm.put("Raja", list);
//            hm.put("Raja1", list);
//            hm.put("Raja2", list);
//            hm.put("Raja3", list);
//            hm.put("Raja4", list);
//            hm.put("Raja5", list);
			}

//			
//			
//			hm.put("a", new Integer(100));
//			hm.put("b", new Integer(200));
//			hm.put("c", new Integer(300));
//			hm.put("d", new Integer(300));
//
			// Returns Set view	 
			Set< Map.Entry< String,ArrayList<Integer>> > st = hm.entrySet(); 

			for (Map.Entry< String,ArrayList<Integer>> me:st)
			{
				System.out.print(me.getKey()+":");
				System.out.println(me.getValue());
			}
		}
		

}

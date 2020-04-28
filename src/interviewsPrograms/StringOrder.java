package interviewsPrograms;

import java.util.HashMap;
import java.util.Map;

public class StringOrder
{

	public static void main(String[] args)
	{
		String str ="aliveisawesome";

		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++)
		{

			int counter = 0;

			for (int j = 0; j < ch.length; j++)
			{

				if (ch[i] == ch[j])
				{

					counter++;

				}

			}

			System.out.println(ch[i] + "=" + counter);

		}

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : str.toCharArray())
		{

			if (map.containsKey(c))
			{
				map.put(c, map.get(c) + 1);
			}
			else
			{

				map.put(c, 1);

			}

		}
		 for(Map.Entry m:map.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }  

	}
}

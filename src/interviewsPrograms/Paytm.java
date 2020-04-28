package interviewsPrograms;

import java.util.ArrayList;
import java.util.List;

public class Paytm
{

	public static void main(String[] args)
	{

		int array[] ={ 7, 3, 14, 17, 23, 55, 88, 97 };
		int sum = 0, leng = array.length;
		for (int i = 0; i < leng; i++)
		{
			for (int j = i + 1; j < leng; j++)
			{
				sum = array[i] + array[j];

				if (sum == 100)
				{
					System.out.println("sum of two number " + array[i] + "+" + array[j] + " = " + sum);
					break;
				}

			}

		}
		
		
		Paytm p = new Paytm();
		p.StringPaytm();
	}

	public void StringPaytm()
	{
		String str1="gksrek",str2="geeksforgeeks";
		char[] a = new char[30];
		char[] b = new char[30];
		a= str1.toCharArray();
		b= str2.toCharArray();
		int len1 = a.length;
		int len2 = b.length;
		
		List<Character> as = new ArrayList<Character>();
		List<Character> as1 = new ArrayList<Character>();
		for(int i=0;i<len1;i++)
		{
			as.add(a[i]);
		}	
		for(int j=0;j<len2;j++)
		{
			as1.add(b[j]);
		}
		System.out.println(as);
		System.out.println(as1);
		System.out.println(as1.containsAll(as));
	}

}

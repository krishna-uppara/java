package interviewsPrograms;

import java.rmi.AccessException;

public class charactercountinastring
{
	
	
	public static void main(String[] args)
	{
		String sentence = "krishna uppara";
		String [] word = sentence.split(" ");
		System.out.println(word.length);
		char [] count = sentence.toCharArray();
		System.out.println(count.length);
		String word1 = word[0]+word[1];
		System.out.println(word1.length());
		int countchar = count.length;
		System.out.println("dup");
		for(int i=0;i<countchar;i++)
		{
			for(int j=i+1;j<countchar;j++)
			{
				char a = count[i];
				char b = count[j];
				if(a == b)
				{
					System.out.print(a);
				}
			}
		}
		
	}

}

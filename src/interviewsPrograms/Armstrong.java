package interviewsPrograms;

import java.util.Scanner;

public class Armstrong
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double arms = 0;
		int a,temp=num;
		while(num!=0)
		{
			a = num%10;
			num = num/10;
			arms = arms+(a*a*a);
			System.out.println(arms);
			
			
		}
		if(arms==temp)
			System.out.println("armstrong");
		else
			System.out.println("not armstrong");
		
		
	}

}

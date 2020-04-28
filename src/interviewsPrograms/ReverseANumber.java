package interviewsPrograms;

import java.util.Scanner;

public class ReverseANumber
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(),rev=0;
		int temp=number;
		while(number!=0)
		{
			rev = rev*10;//rev = rev*10+(number%10)
			rev = rev+number%10;
			number = number/10;
		}
		if(rev==temp)
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not a palindrom");
		}
		
		
				

	}

}

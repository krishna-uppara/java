package interviewsPrograms;

import java.util.Scanner;

public class InputfromthekeybordPTRby100
{
	public static void main(String[] aa)
	{
		Scanner input1 = new Scanner(System.in);
		System.out.println("please enter the principle");
		double p = input1.nextDouble();
		System.out.println("please enter the time");
		int t = input1.nextInt();
		System.out.println("please enter the rate");
		float r = input1.nextFloat();
		double si = (p*t*r)/100;
		System.out.println(si);	
	}
	

}

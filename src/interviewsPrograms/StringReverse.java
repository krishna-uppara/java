package interviewsPrograms;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class StringReverse
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String temp = name,rev="";
		int leng = name.length();
		for(int i=leng-1;i>=0;i--)
		{
			rev = rev + name.charAt(i);
		}
		if(rev.equals(temp))
			System.out.println("palindrom");
		else
			System.out.println("not a palindrom");
		int n=5,fact=1;
		for(int k = 1 ;k<=6;k++)
		{
			fact= fact*k;
			
		}
		System.out.println(fact);
		int f1=0,f2=1,f3,t=10;
		System.out.println(f1+"\n"+f2);
		for(int r= 2;r<=t;r++)
		{
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
		}

	}

}

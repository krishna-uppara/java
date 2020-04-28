package interviewsPrograms;

public class GreartestofTwoNumber
{

	public static void main(String[] args)
	{
		int i=200,j=300;
		if(i>j)
		
			System.out.println("i greater");
		else
			System.out.println("j is greater");
		
		int  a = (i>j)?i:j; 
		System.out.println(a);
		System.out.println(Math.max(i, j));
		System.out.println((i>j)?i+"i is greater":j+"j is greater");
		
	}

}

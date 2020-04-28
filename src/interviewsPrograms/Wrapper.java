package interviewsPrograms;

public class Wrapper
{

	public static void main(String[] args)
	{
		Long a = new Long("42");
		Long b = new Long(42);
		Short s = new Short("42");
		if(a.equals(s))
			System.out.println("true");
		else
			System.out.println("false");
			
	}

}

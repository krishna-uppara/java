package interviewsPrograms;

public class CompressString
{


	public static void main(String[] args)
	{
		String s = "KrishnaUppara";
		int count =0;
		char temp = s.charAt(0);
		int lenght = s.length();
		for(int i=0;i<s.length();i++)
		{
			if (s.charAt(i)==temp)
			{
				count++;
			}
			else
			{
				System.out.print(temp +""+count);
				count=1;
				temp=s.charAt(i);
			}
		}
		System.out.print(temp +""+count);
	}

}

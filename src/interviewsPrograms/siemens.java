package interviewsPrograms;

public class siemens
{   

	public static void main(String[] args)
	{
		int sum=0,count=0;
		
		// TODO Auto-generated method stub
		do
		{
			if(count % 3==0)continue;
			sum = sum+count;
			System.out.println(count);
			
		}while(count++<11);
		System.out.println(sum);
	}

}

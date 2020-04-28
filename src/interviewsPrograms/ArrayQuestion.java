package interviewsPrograms;

public class ArrayQuestion
{
	

	public static void main(String[] args)
	{
		
		int[] a={1,0,1,1,0,1,0,0};
		int size = a.length;
		int c[] = new int [10];
		for(int i=0; i<size;i++)
		{
			
			int b = a[i];
			if(b==1)
			{
				c[i] = a[i];
				System.out.print(c[i]);
			}
					
		}
		for(int i=0; i<size;i++)
		{
			
			int b = a[i];
			if(b==0)
			{
				c[i] = a[i];
				System.out.print(c[i]);
			}
					
		}
		

	}

}

package basic;

public class bbbb
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("\"selenium\"");
		System.out.println("\'selenium\'");
		System.out.println("print 1");
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("print 2");
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("print 3");
		for(int i=3;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("print 4");
		int g=1;
		for(int i=3;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(g+" ");
				g++;
			}
			System.out.println();
		}
		
		System.out.println("print 5");
		int d=6;
		for(int i=3;i>=1;i--)

		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(d+" ");
				d--;
			}
			System.out.println();
		}
		

		System.out.println("print 6");
		int k=1;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		
		System.out.println("print 6");
		int a=6;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(a+" ");
				a--;
			}
			System.out.println();
		}
		
		

	}

}

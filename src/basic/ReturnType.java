package basic;

public class ReturnType
{
	
	
	public void add()
	{
		System.out.println("hello");
	}
	
	public int subtract()
	{
		
		int a = 10, b = 12, c = b-a;
		return c;
		
	}
	 
	public void divide(int e)
	{
		int f = 10;
		long g = f/e;
		System.out.println(g);
	}
	public static void main(String[] args)
	{
		ReturnType rt = new ReturnType();
		rt.add();
		int d = rt.subtract();
		System.out.println(d);
		rt.divide(rt.subtract());
	}

}

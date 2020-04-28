package ClassesAndObjects;

public class Clone implements Cloneable
{
	String a;
	
	public void name(String a )
	{
		System.out.println(a+"::hello");
	}
	  
	public static void main(String[] args)
	{
		Clone c1 = new Clone();
		System.out.println("without cloning ");
		c1.name(c1.a="ds");
		try
		{
			Clone c2 = (Clone) c1.clone();
			System.out.println("clone C2");
			c2.a="salkdj";
			System.out.println(c2.a);
			c2.name(c2.a="jk");
		}
		catch (CloneNotSupportedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

package ClassesAndObjects;

import java.util.Date;

public class NewInstance
{

	public static void main(String[] args)
	{
		Date d = new Date();
		System.out.println(d.getClass());
		Class cls = d.getClass();
		System.out.println(d.toString());
		
		// new instance
		
		try
		{
			Object obj = cls.newInstance();
			System.out.println(obj);
		}
		catch (InstantiationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

package convertions;


public class Convertion
{

	public static void main(String[] args)
	{
		Integer x = 10;
		// parseint()
		//String to int 
		int foo = Integer.parseInt("1234");
		float fl = Float.parseFloat("222.44");
		double dl = Double.parseDouble("878.97987979");
		String b = Integer.toString(78789);
		System.out.println(b);
		
		// ValueOF()
		// int to string
		String a = String.valueOf(foo);
		System.out.println(a);
		int d = Integer.valueOf(foo);
		System.out.println(a);
		
		//XXXvalue()
		int aa =x.intValue();
		float bb =x.floatValue();
		long cc = x.longValue();
		String dd = x.toString();
		
		System.out.println(dd);
		String ee = dd;
		System.out.println(ee);
		System.out.println(ee.concat("sdjlka"));
		
	}

}

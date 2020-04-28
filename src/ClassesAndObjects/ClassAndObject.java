package ClassesAndObjects;

public class ClassAndObject
{ 
	
	String name = "Krishna";
	public static String student(String a)
	{
		return a;
	}
	
	public void hero()
	{
		System.out.println("hello");
	}
	public static String name(ClassAndObject b)
	{
		String c = student("krishna");
		b.hero();
		return c;
	}
	public static String name1(ClassAndObject b)
	{
		String c = student("krishna");
		b.hero();
		return c;
	}

	public static void main(String[] args)
	{
		
		ClassAndObject aa = new ClassAndObject();
		String a = name(new ClassAndObject());
		System.out.println(a);
		String bb = name(aa);
		System.out.println(bb);
		
	}

}

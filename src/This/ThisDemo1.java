package This;

public class ThisDemo1
{
	private void m()
	{
		System.out.println("hello");
	}
	public void n()
	{
		System.out.println("hi");
		this.m();
	}

	public static void main(String[] args)
	{
		ThisDemo1 a = new ThisDemo1();
		a.n();

	}

}

package This;

public class PrintThisReferenceID
{
	
	public void m()
	{
		// prints the Same reference id 
		System.out.println(this);
	}
 
	public static void main(String[] args)
	{
		PrintThisReferenceID n = new PrintThisReferenceID();
		n.m();

	}

}

package This;

public class ThisStatement
{
	int fee;
	String name;
	long mobile;
	int standard;
	public ThisStatement(int fee,String name,long mobile,int standard)
	{
		this(fee,name,mobile);
		this.fee = fee;
		this.name = name;
		this.mobile = mobile;
		this.standard = standard;
		System.out.println(fee+name+mobile+standard);
		// this() can not be the last statement it should be the First this()
		//this(fee,name,mobile);
				
	}
	
	public ThisStatement(int fee,String name,long mobile)
	{
		this.fee = fee;
		this.name = name;
		this.mobile = mobile;
	
		System.out.println(fee+name+mobile);
	}

	public static void main(String[] args)
	{
		ThisStatement ts = new ThisStatement(200, "krishna", 9731071277l, 5);

	}

}

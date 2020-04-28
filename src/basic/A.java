package basic;
class C
{ int i =30;
	public void main()
	{
		System.out.println(i);
	}
	public void main2()
	{
		System.out.println("parent class");
	}
}
class B extends C
{
	int i = 20;
	public void main()
	{
		System.out.println(i);
	}
	public void main1()
	{
		System.out.println("parent class");
	}
}
public class A extends B
{
	int j = 10;
	// override 
	public void main()
	{
		System.out.println(j);
	}
 public static void main(String[] args)
{
//
//	 A a = new A();
//	 a.main();//20
//	 B b = new B();
//	 b.main();//10
//	 b.main1();
//	 // upcasting 
//	 B override = new A();
//	 // overrided method will be executed(polymorphism)
//	 override.main();//20
//	 override.main1();
//	 //downcast
//	 A a1 = (A)override;
//	 a1.main();//20
//	 a1.main1();
////	 a1.i=100;
////	 a1.j = 200;
////	 System.out.println(a1.i);
////	 System.out.println(a1.j);
//	 // upcast override
//	 C c1 = new A();
//	 c1.main();//10
//	 // upcast override
//	 B b1 = new A();
//	 b1.main();//10
//	 // down cast override
//	 A a1 = (A)c1;
//	 a1.main();//10
//	// down cast override
//	 A a2 = (A)b1;
//	 a2.main();//10
//	 B b2 = (B)c1;
//	 b2.main();//10
//	 A a3 = (A)c1;
//	 a3.main();//10
	 C c2 = new B();
	 c2.main();//20

	 
}
}

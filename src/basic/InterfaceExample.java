package basic;

import java.awt.geom.CubicCurve2D;

interface multiplication
{
	int multiply(int a, int b);
	default int cube(int a)
	{
		return square(a)*a;
	}

	default int square(int a)
	{
		return multiply(a, a);
	}
}

public class InterfaceExample
{

	public static void main(String[] args)
	{

		multiplication mul = new multiplication()
		{

			@Override
			public int multiply(int a, int b)
			{
				// TODO Auto-generated method stub
				return a*b;
			}
		};
		int result = mul.square(10);
		int result1 = mul.cube(10);
		System.out.println(result);
		System.out.println(result1);
	}

}

package javaprograms;


class c
{
	static int i =1111;
	static {
		i=i-- - --i;
	}
	{
		i=i++ + ++i;
	}
}
class b extends c
{

	static {
		i=--i- i--;
	}
	{
		i=++i + i++;
	}
}
public class Visa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b b1 = new b();
		System.out.println(b1.i);

	}

}

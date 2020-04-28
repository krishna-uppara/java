package interviewsPrograms;

public class swaptwonumbersusingbitwiseoperator
{

	public static void main(String[] args)
	{
		int i =10,j=20;
		System.out.println("before swapping i and j i : "+ i +"  j :" +j);
		i = i^j;
		j = i^j;
		i = i^j;
		System.out.println("after swapping i and j  i : "+ i +" j : " +j);
		

	}

}

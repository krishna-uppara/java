
public class missingNumber {

	
	public static int a[] = {1,2,100};
	public static int b = a[0];
	public static void main(String[] args) {
		
		for(int i = 0 ; i<a.length;i++)
		{
			if(b != a[i] )
			{
				while(b<a[i])
				{
					System.out.println(b);
					b++;
				}
			}
			b++;			
		}
		


	}

}

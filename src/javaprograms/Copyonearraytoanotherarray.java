package javaprograms;

public class Copyonearraytoanotherarray {

	public static void main(String[] args) {
	
		int a[]={22,34,56,67,98,44};
		int b[] = new int[a.length];
		for(int i =0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		
		for(int c=0;c<a.length;c++)
		{
			System.out.print(a[c]+" ");
		}
		
		System.out.println();
		
		for(int d=0;d<b.length;d++)
		{
			System.out.print(a[d] +" ");
		}
		
	}

}

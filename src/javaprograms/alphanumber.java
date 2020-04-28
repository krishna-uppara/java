package javaprograms;

public class alphanumber {
//	static String a ="";
	static long temp,res;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd123456@#%%^^7890pqr54897";
		String a="";
		for(int i =0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(Character.isDigit(c))
			{			
			 a = a+str.charAt(i);
							
			}
			else if(Character.isLetter(c))
			{
				System.out.println(c);
			}
			else
				System.out.println(c);
		}
		
		long d = Long.parseLong(a);
		System.out.println(d);
		while(d>0){
			temp = d % 10;
			res = res+temp;
			d= d/10;
			
		}
		
		System.out.println(res);

	}

}

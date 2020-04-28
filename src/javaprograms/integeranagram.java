package javaprograms;

import java.util.Arrays;

public class integeranagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String a="abcd",b="cdab";
a = a.replace("//s","");
b = b.replace("//s","");
if(a.length()!=b.length())
{
	System.out.println("it is not anangram");

}

else 
{
	char [] arr1 = a.toLowerCase().toCharArray();
	char [] arr2 = b.toLowerCase().toCharArray();
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	if(Arrays.equals(arr1, arr2))
	{
		System.out.println(a +" and " + b + "  are anangram");
	}
		
	
}

}
}
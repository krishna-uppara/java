package escape;

public class EscapeSquences
{

	public static void main(String args[])
	{

		System.out.println("abc\ndef"); // abc and def are given in two lines
		System.out.println("abc\\ndef");//abc\ndef
		System.out.println("ab\bcd"); // prints acd
		System.out.println("ab \bcd"); // prints abcd, the space before \b is
										// gone
		System.out.println("abcdefghij"); // prints ab cd, gives 3 spaces
											// between ab and cd
		System.out.println("ab\tcd"); // prints ab cd, gives 3 spaces between ab
										// and cd

		System.out.println("a\"bc\"d"); // prints a"bc"d

		System.out.println("a\'bc\'d"); // prints a'bc'd
		System.out.println("hskjhdkjahskjhdsakjhjsahkjhsakjh"
				+ "\n"
				+"\rjsjaldkjsalkjdlksajdlksajl"
				+"");
	}

}

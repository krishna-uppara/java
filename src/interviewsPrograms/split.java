package interviewsPrograms;

public class split
{

	public static void main(String[] args)
	{
		String a = "as12sddsa21efr312dsa";
		String[]b = a.split("(?<=\\D)(?=\\d)");
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		String number = "";
        String letter = "";
        for (int i = 0; i < a.length(); i++) 
        {
              char c = a.charAt(i);
              //System.out.println("aaa : " + a);
              if (Character.isDigit(c)) {
                  number = number + c;

            } else {
                  letter = letter + c;

            }
     }
     System.out.println("Alphates in string:"+letter);
     System.out.println("Numbers in String:"+number);
     String Quotes ="\""+a+"\"";
     String aa = "\""+a+"\"";
     System.out.println(aa);
     

		
	}

}

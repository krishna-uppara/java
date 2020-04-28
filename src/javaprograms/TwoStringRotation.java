package javaprograms;

public class TwoStringRotation {

	

   
    // Driver method 
    public static void main(String[] args) 
    { 
        String str1 = "AACD"; 
        String str2 = "ACDA"; 
  
        if (str1.length() == str2.length() && ((str1 + str1).contains(str2)) )
            System.out.println("Yes"); 
        else
            System.out.printf("No"); 
    } 
}

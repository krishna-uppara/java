package InputandOutput.StringReader;

import java.io.StringReader;

public class Mark
{

	public static void main(String[] args)
	{
		String srg = "Hello Java!! Welcome to Javatpoint.";
		int strLength = srg.length();
		System.out.println(strLength);
		StringReader reader = new StringReader(srg);
		
		try
		{
			//total 35 characters 
			// read the first 12 chars
			for (int i = 0; i < 12; i++) 
			{
	            char c = (char) reader.read();
	            System.out.print("" + c);
	         }
			// mark the reader at position 12 for maximum 13
			reader.mark(13);
			System.out.println();
			for (int j = 0; j < 23; j++) 
			{
	            char d = (char) reader.read();
	            
	            System.out.print("" + d);
	         }
			 // reset back to marked position
	         reader.reset();
	         System.out.println();
	         
	         // read again the next 23 chars
	         for (int i = 0; i < 23; i++) {
	            char c = (char) reader.read();
	            reader.skip(1);
	            System.out.print("" + c);
	         }
	         
	         
	         // close the stream
	         reader.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		

	}
}
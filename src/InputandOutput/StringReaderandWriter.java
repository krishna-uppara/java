package InputandOutput;

import java.io.IOException;
import java.io.StringReader;

public class StringReaderandWriter
{

	public static void main(String[] args) 
	{
		 String srg = "Hello Java!! \n Welcome to Javatpoint.";  
	        StringReader reader = new StringReader(srg);  
	        
	        int k=0;  
	            try
				{
	       /** boolean ready() ::	It is used to tell whether the stream is ready to be read.*/
	            	Boolean flag = reader.ready();
	            	System.out.println(flag);
	            	//if(flag != true)
	            	if(flag == true)
	            	{
					while((k=reader.read())!=-1){  
					    System.out.print((char)k);  
					}
	            	}
	            	else
	            		System.out.println("Reader is not Ready ");
	            	
	            	reader.mark(2);
	            	System.out.print((char)k);
				}
				catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
	            
	            System.out.println("\n"+reader.markSupported());
	            

	}

}

package javaprograms;

public class UniqueCharacterInString {
	
	public static void main(String[] args) {
		
		
		        String input = "abczabc"; 
		        
		       for(int i=0;i<input.length();i++)
		       {
		    	   boolean unique = true;
		    	   for(int j=i+1 ; j<input.length();j++)
		    	   {

		    		   if(((i!=j && input.charAt(i)==(input.charAt(j)))))
		    		   {unique = false;
		    			   break;
		    			   
		    		   }
		    		   
		    		   
		    	   }
		    	   if(unique){
		    	   System.out.println(input.charAt(i));
		    	   break;
		    	   }
		       }

		            
		        }
		    } 
	
		
	


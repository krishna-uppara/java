package basic;

public class demo
{
	public static int getLineCount(String text){
        
        return text.split("[\n|\r]").length;
    }
 
	public static void main(String[] args)
	{
		for(String t : args)
		{
			System.out.println(t);
			
		}
		
        String str = "line1 dshfsdkj \ndjlkfjs line2 djflkds \nline3 elkhroes \rline4 elrjew";
        System.out.println(str);
        int count = getLineCount(str);
        System.out.println("line count: "+count);
        int charcount=0,wordcount = 0;
        char[] list_character = str.toCharArray();
        String [] words = str.split(" ");
        for(char c : list_character)
        {
        	System.out.println(c);
        	charcount++;
        	
        	
        }

        for(String wcount:words)
        {
        	wordcount++;
        	System.out.println(wcount);
        }
        
        System.out.println("chars count"+charcount);
        System.out.println("word count: "+wordcount);
        System.out.println("line count: "+count);
        
        System.out.println(str.length());
        String[] sl = str.split(" ");
        System.out.println(sl.length);
	}

}

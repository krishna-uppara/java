package interviewsPrograms;

public class Printonlyzeroswithresoecttoposition
{

	public static void main(String[] args)
	{
		 int [][] matrix = new int[][]{
	            {1,2,0,4},
	            {0,6,7,8},
	            {9,9,1,2},
	            {3,4,5,0}
	    };

	    for(int i =0 ; i<matrix.length;i++)
	    {
	    	for(int j=0;j<matrix.length;j++)
	    	{
	    		if(matrix[i][j]==0)
	    		System.out.print("position of zero is at "+i+" row "+j+ " column value "+ matrix[i][j]);

	    		
	    	}
	    	
	    	System.out.println(" ");
	    }
	    System.out.println("number of rows  " + matrix.length);
	    System.out.println("number of columns" + matrix[0].length);
	    

	}

}

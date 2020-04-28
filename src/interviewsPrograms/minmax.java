package interviewsPrograms;

public class minmax
{

	public static void main(String[] args)
	{
		
		    int i;  //loop counter
		    int[] arr=new int[]{10,20,90,50}; //arrays
		    int min=arr[0]; //set values for comparison from start to end of the array
		    int max=arr[0]; //set values for comparison from start to end of the array
		    for (i=0;i<arr.length;i++)
		    {
		        if(arr[i]>max)
		        {
		            max=arr[i];
		        }
		        else if(arr[i]<min)
		        {
		            min=arr[i];
		        }
		    }
		    System.out.println(max);
		    System.out.println(min);
		    
		    
		    int[] arr1={22,33,11,31,34};
		    int t=0;
		    for(int a=0;a<arr1.length;a++)
		    {
		    for(int j=i+1;j<arr1.length;j++)
		    {
		    if(arr1[a]>arr1[j])
		    {
		    t=arr1[a];
		    arr1[a]=arr1[j];
		    arr1[j]=t;

		    }
		    }
		    }

		    for(int k=0;k<arr1.length;k++){
		    System.out.println(arr1[k]);
		    }

			}
		    
		}
	
	



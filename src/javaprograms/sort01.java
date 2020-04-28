package javaprograms;

public class sort01 {

	public static void main(String[] args) {

        int arr[] = new int[]{ 0, 1, 0, 1, 1, 1 }; 
        int n = arr.length; 
		int count = 0; // counts the no of zeros in arr 
	      
        for (int i = 0; i < n; i++) { 
            if (arr[i] == 0) 
                count++; 
        } 
  
        // loop fills the arr with 0 until count 
        for (int i = 0; i < count; i++) 
            arr[i] = 0; 
  
        // loop fills remaining arr space with 1 
        for (int i = count; i < n; i++) 
            arr[i] = 1; 
        
        
        for (int i = 0; i < n; i++) 
        System.out.print(arr[i] + " ");

	}

}

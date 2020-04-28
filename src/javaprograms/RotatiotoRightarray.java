package javaprograms;

public class RotatiotoRightarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 2,7,10,17,78 };
		int rotation= arr[arr.length-1];

		for (int i = arr.length-1; i>0;  i--) {
			arr[i]=arr[i-1];
			
		}
		arr[0] = rotation;
		for (int i = 0; i <arr.length; i++) {
		System.out.println(arr[i]);		}
		
	}

}

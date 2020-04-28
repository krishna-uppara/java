package javaprograms;

public class MissingnumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2,7,10 };
//		int sum = 0, sum1 =0 , missingnumber;
//
//		for (int i = 0; i < arr.length; i++) {
//			sum = sum+arr[i];
//		}
//
//		for (int j = 1; j <= 4; j++) {
//			sum1 = sum1+j;
//		}
//		
//		missingnumber = sum1-sum;
//		System.out.println(missingnumber);
		
		int n=arr.length+1;
		int sum= (n*(n+1))/2;
		for (int i=0;i<arr.length;i++)
		{
			sum = sum-arr[i];
			System.out.println(sum);
		}
		
		System.out.println("missing number " + sum);
		

	}

}

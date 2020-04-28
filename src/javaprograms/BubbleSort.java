package javaprograms;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 10, 45, 55, 89, 67, 33 };
		int temp = 0, n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
		for (int k = 0; k < n; k++) {
			System.out.println(arr[k]);
		}

	}

}
 
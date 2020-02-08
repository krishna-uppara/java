package javaprograms;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 10, 45, 55, 89, 67, 33 };
		int temp = 0, n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int k = 0; k < n; k++) {
			System.out.println(arr[k]);
		}

	}

}

package codingroundpractise.array;

public class Practise21RemoveDuplicateInArrayExample {
	public static int[] removeDuplicateElements(int arr[], int n) {

		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j] = arr[n - 1];

		return temp;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50, 50, 60, 60, 60 };
		int arrnew[] = { 10, 20, 10, 40, 89, 87, 9740, 40 };

		int length = arr.length;
		int[] l1 = removeDuplicateElements(arr, length);
		// printing array elements
		for (int i = 0; i < length; i++) {
			if (l1[i] != 0) {
				System.out.print(l1[i] + " ");
			}

		}

	}
}


import java.util.Arrays;

public class BubbleSort {
	// 1. Bubble Sort
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length ; i++) {
			boolean swap = false;
			for (int j = 0; j < arr.length- i-1; j++) {
				if (arr[j] > arr[j + 1]) {
					arr[j] = arr[j + 1] + arr[j] - (arr[j + 1] = arr[j]);
					swap = true;
				}
			}
			if (!swap)
				break;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 5, 10, 9, 6, 8 };

		System.out.println("Bubble Sort");
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}

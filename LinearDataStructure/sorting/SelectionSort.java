

import java.util.Arrays;

public class SelectionSort {
	
	//2. Selection Sort
		public static void selectionSort(int[] arr) {
			int n = arr.length;
			for(int i=0;i<n;i++) {
				int curr = i;
				
				for(int j=i+1;j<n;j++) {
					if(arr[j]<arr[curr]) {
						curr = j;
					}
				}
				arr[i] = arr[curr]+arr[i]-(arr[curr]=arr[i]);
			}
		}

		public static void main(String[] args) {
			
			
			int[] arr = {5,10,9,6,8};
			
			
			System.out.println("Selection Sort");
			System.out.println(Arrays.toString(arr));
			selectionSort(arr);
			System.out.println(Arrays.toString(arr));
			
			
		}
}

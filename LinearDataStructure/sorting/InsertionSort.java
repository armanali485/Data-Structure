

import java.util.Arrays;

public class InsertionSort {

	
	//3. Insertion Sort
		public static void insertionSort(int[] arr) {
			for(int i=1;i<arr.length;i++) {
				int key = arr[i];
				int j=i-1;
				while(j>=0 && arr[j]>=key) // loop continues until we find the correct position of key 
				{ 
					arr[j+1]=arr[j--]; // decrementing j to search for another value which is still greater
				}
				arr[j+1]=key; // copy the key to next index of j (inserting the key into its correct position)
			}
		}
		
		public static void main(String[] args) {
			
			
			int[] arr = {5,10,9,6,8};
			

			
			System.out.println("Insertion Sort");
			System.out.println(Arrays.toString(arr));
			insertionSort(arr);
			System.out.println(Arrays.toString(arr));
			
			
		}
}

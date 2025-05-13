

import java.util.Arrays;

public class RotateElements {

	// 7.WAP to left rotate the elements

	// 1st Way
	public static int[] leftRotate1(int[] arr) {
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = temp;
		return arr;
	}

	// 2n Way
	public static void leftRotate(int[] arr, int n) 
	{
		n = n % arr.length;// to avoid unnecessary rotations
		if (n > 0) 
		{
			while (n != 0) 
			{
				for (int i = 1; i < arr.length; i++) 
				{
					int temp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = temp;
				}
				n--;
			}
		}
	}
	
	
	// 8.WAP to right rotate the elements
	public static void rightRotate(int[] arr, int n) 
	{
		n = n % arr.length;// to avoid unnecessary rotations
		if (n > 0) 
		{
			while (n != 0) 
			{
				for (int i = arr.length-2; i>=0; i--) 
				{
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
				n--;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		rightRotate(arr,1);
		System.out.println(Arrays.toString(arr));
	}
}

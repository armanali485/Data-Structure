

import java.util.Arrays;

//2.Write a program to merge to Arrays
public class MergeTwoArrays {

	public static int[] mergeTwoArrays(int[] arr1, int[] arr2) {
		int[] res = new int[arr1.length + arr2.length];
		for (int i = 0; i < res.length; i++) {
			if (i < arr1.length) {
				res[i] = arr1[i];
				continue;
			}
			res[i] = arr2[i - arr1.length];
		}
		return res;
	}

	public static void main(String[] args) {

		int[] a = { 1, 7, 9, 5, 4 };
		int[] b = { 6, 3, 7, 8 };
		System.out.println(Arrays.toString(mergeTwoArrays(a, b)));

	}

}



public class FindMissingNumber {

	// 9.find the missing number of consecutive array from 1 to n.

	public static int findMissingNumber(int[] arr) 
	{
		int n = arr.length+1;
		int sumExpected = (n * (n + 1)) / 2;
		int sum = 0;
		for (int i : arr) 
		{
			sum += i;
		}
		return sumExpected - sum;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6};
		System.out.println(findMissingNumber(arr));
	}

}



public class SumOfSubArray {
	//12.WAP to find `maximum sum of SubAaray of size k`.
	public static int sumOfSubArray(int[] arr , int k)
	{
		int maxSum=0;
		for(int i=0;i<=arr.length-k;i++) {
			int sum=0;
			for(int j=i;j<i+k;j++) {
				sum+=arr[j];
			}
			if(sum>maxSum) {
				maxSum=sum;
			}
		}
		return maxSum;
	}
	
	
	public static int sumOfSubArraySlidingWindow(int[] arr,int k) {
		int maxSum=0;
		for(int i=0;i<k;i++) {
			maxSum+=arr[i];
		}
		int currentSum=maxSum;
		for(int i=k;i<arr.length;i++) {
			currentSum = currentSum+arr[i]-arr[i-k];
			maxSum= Math.max( currentSum,maxSum);
		}
		return maxSum;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {2,1,5,1,3,2};
		System.out.println(sumOfSubArray(arr, 3));
		System.out.println(sumOfSubArraySlidingWindow(arr, 3));
	}
}

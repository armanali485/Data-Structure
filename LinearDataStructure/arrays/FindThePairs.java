

import java.util.HashSet;

public class FindThePairs {
	
	//10.find the pairs of number whose sum is equals to given target.
	//1,3,2,4,5,3,8,2  target --> 6 , [{1,5},{3,3},{2,4},{4,2}]
	public static void findPairs(int[] arr,int target)
	{
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]+arr[j]==target) 
				{
					System.out.println("{"+arr[i]+","+arr[j]+"}");
					break;
				}
			}
		}
		
		
	}
	
	public static void findPairs1(int[] arr,int target) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i : arr) {
			if(set.contains(target-i)) {
				System.out.println("{"+(target-i)+","+i+"}");
			}
			set.add(i);
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {1,3,2,4,5,3,8,2 };
		findPairs1(arr, 6);		
	}
	

}

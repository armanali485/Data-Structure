

public class CheckPalindrome {
	
	public static boolean checkPalindrome(int[] arr) 
	{
		for(int i=0,j=arr.length-1;i<j;i++,j--) 
		{
			if(arr[i]!=arr[j])
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] arr = {4,3,2,3,3,4};
		System.out.println(checkPalindrome(arr));
	}

}

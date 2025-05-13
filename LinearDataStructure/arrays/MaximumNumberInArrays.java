

public class MaximumNumberInArrays {
	
	//3.WAP to find first Maximum in Array
	public static int firstMaximumNumberInArray(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i : arr)
			if(i>max) 
				max=i;
		return max;
	}
	
	//4. WAP to find Second Maximum in Array
	public static int secondMaximumNumberInArray(int[] arr) 
	{
		int maxi1 = Integer.MIN_VALUE;
		int maxi2=Integer.MIN_VALUE;
		for(int i : arr)
		{
			if(i>maxi1)
				maxi1=i;
		}
		for(int i : arr) 
		{
			if(i>maxi2 && i!=maxi1)
				maxi2=i;
		}
		return maxi2;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {3,7,9,50,78,-1,7,8,90};
		System.out.println(firstMaximumNumberInArray(arr));
		System.out.println(secondMaximumNumberInArray(arr));
		
	}

}

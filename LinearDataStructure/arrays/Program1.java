


public class Program1 {
	//1.Program to Calculate Sum of all the numbers in array
	
	public static int sumOfAllElementInArray(int[] arr) {
		int sum=0;
		for(int i: arr)
			sum+=i;
		return sum;
	}
	
	
	public static void main(String[] args) {
		System.out.println(sumOfAllElementInArray(new int[]{1,9,0,78,90}));
		
		
	}

}

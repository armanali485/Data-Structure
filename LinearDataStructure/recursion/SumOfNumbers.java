package com.recursion;

public class SumOfNumbers {
	
	//4. WAP to print sum of number from 1-n.
	public static int sumOfNumberFrom1toN(int n) {
		if(n==1)
			return 1;
		return n + sumOfNumberFrom1toN(--n);
	}
	
	//5. WAP to print multiplication of number from 1-n(Factorial).
	public static int findFactorial(int n)
	{
		if(n==1)
			return 1;
		return n*findFactorial(--n);
	}
	
	//6. WAP to print the sum of even number from 1-n.
	
	public static int evenSum(int n) {
		if(n==1)
			return 0;
		if(n==2)
			return 2;
		if(n%2==0)
			return n+evenSum(--n);
		else
			return evenSum(--n);
	}
	//6. WAP to print the sum of odd number from 1-n.
	
		public static int oddSum(int n) {
			if(n==1)
				return 1;
			if(n%2==1)
				return n+oddSum(--n);
			else
				return oddSum(--n);
		}
		
	//8. WAP to find power of a number
		public static int powOfNumber(int base,int power) {
			if(power==1)
				return base;
			return base * powOfNumber(base, --power);
		}
	
	public static void main(String[] args) {
		System.out.println(sumOfNumberFrom1toN(10));
		System.out.println(findFactorial(5));
		System.out.println(evenSum(3));
		System.out.println(oddSum(10));
		System.out.println(powOfNumber(1, 4));
	}

}  

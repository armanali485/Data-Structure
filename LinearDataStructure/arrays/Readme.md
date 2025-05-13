
## Arrays Program
> 1.WAP to Calculate `Sum of all the Elements` in Array.

```java
		public static int sumOfAllElementInArray(int[] arr)
				{
					int sum=0;
					for(int i: arr)
					{
						sum+=i;
					}
					return sum;
				}		
```

> 2.WAP to `Merge two Arrays`.

```java
		public static int[] mergeTwoArrays(int[] arr1, int[] arr2)
		{
			int[] res = new int[arr1.length + arr2.length];
			for (int i = 0; i < res.length; i++)
			{
				if (i < arr1.length)
				{
					res[i] = arr1[i];
					continue;
				}
				res[i] = arr2[i - arr1.length];
			}
			return res;
		}
```

> 3.WAP to find `first Maximum` in Array.

```java
		public static int firstMaximumNumberInArray(int[] arr)
		{
			int max=Integer.MIN_VALUE;
			for(int i : arr)
			{
				if(i>max)
				{
					max=i;
				}
			}
			return max;
		}
```

> 4.WAP to find `Second Maximum` in Array.

```java
		public static int secondMaximumNumberInArray(int[] arr)
		{
			int max1 = Integer.MIN_VALUE;
			int maxi=2=Integer.MIN_VALUE;
			for(int i : arr)
			{
				if(i>max1)
					max1=i;
			}
			for(int i : arr)
			{
				if(i>max2 && i!=max1)
					max2=i;
			}
			return max2;
		}
```
> 5.WAP to find `first Manimum` in Array.

```java
		public static int firstMinimumNumberInArray(int[] arr)
		{
			int min=Integer.MAX_VALUE;
			for(int i : arr)
			{
				if(i<min)
				{
					min=i;
				}
			}
			return min;
		}
```

> 6.WAP to find `Second Minimum` in Array.

```java
		public static int secondMinimumNumberInArray(int[] arr)
		{
			int min1 = Integer.MAX_VALUE;
			int min2=Integer.MAX_VALUE;
			for(int i : arr)
			{
				if(i<min1)
					min1=i;
			}
			for(int i : arr)
			{
				if(i<min2 && i!=min1)
					min2=i;
			}
			return min2;
		}
```
---

## Value Swapping Techniques

### 1. Standard Temp Swap
```java
	
		int temp = a;
		a = b;
		b = temp;
	
```

### 2. Arithmetic Methods
```java
		// Addition/Subtraction
		a = a + b;
		b = a - b;
		a = a - b;

		// Multiplication/Division (y ≠ 0)
		a = a * b;
		b = a / b;
		a = a / b;
```

### 3. Bitwise Operations
```java
		// XOR Swap
		a ^= b;
		b ^= a;
		a ^= b;
```

### 4. Advanced Techniques
```java
		// Compound Assignment
		a = b - a + (b = a);

		// Stack Swap (x86 Assembly)
		__asm {
			push a
			push b
			pop a
			pop b
		}
```


> 7.WAP to `left rotate` the elements in Array `n number of times`.
```java
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
```
> 8.WAP to `right rotate` the elements in Array `n number of times`.
```java
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
```
> 9.WAP to find the `missing number` of consecutive array from 1 to n.
```java
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
```
> 10.WAP to find the `pairs of number` whose sum is equals to given target.

eg: 1,3,2,4,5,3,8,2  target --> 6 , [{1,5},{3,3},{2,4},{4,2}]

```java
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
```

## Two Pointer Approach

### Definition
A technique using two **pointers** (variables) to traverse data structures (typically arrays or strings) to **solve problems efficiently**.


### When to Use
✔️ When you need to check pairs or conditions involving the **beginning** and **end** of an array  
✔️ Using this approch we can solve common problem like palindrome checking check if array has a pair of given target.

> 11.WAP to check a `Arrays is palindrome` or not.
```java
		public static boolean checkPalindrome(int[] arr) 
		{
			for(int i=0,j=arr.length-1;i<j;i++,j--) 
			{
				if(arr[i]!=arr[j])
					return false;
			}
			return true;
		}
```
> 12.WAP to find `maximum sum of SubAaray of size k`.
```java

		public static int sumOfSubArraySlidingWindow(int[] arr,int k) 
		{
			int maxSum=0;
			for(int i=0;i<k;i++) 
			{
				maxSum+=arr[i];
			}
			int currentSum=maxSum;
			for(int i=k;i<arr.length;i++) 
			{
				currentSum = currentSum+arr[i]-arr[i-k];
				maxSum= Math.max( currentSum,maxSum);
			}
			return maxSum;
		}

```
> 13.WAP to `add a Element` in Array at Specific Index.

```java
		public static int[] addingAtSpecificIndex(int[] arr,int value,int index) 
		{
			if(index<0 || index>=arr.length )
				throw new ArrayIndexOutOfBoundsException("Invalid Index");
			else 
			{
				int[] res = new int[arr.length+1];
				for(int i=0;i<res.length;i++) 
				{
					if(i<=index-1)
						res[i]=arr[i];
					else if(i==index)
						res[i]=value;
					else
						res[i]=arr[i-1];
				}
				return res;
			}
			
		}
```

> 14.WAP to `remove Element` from Array At Specific index.

```java
		public static int[] removeAtSpecificIndex(int[] arr,int index) 
		{
			if(index<0 || index>=arr.length )
				throw new ArrayIndexOutOfBoundsException("Invalid Index");
			else 
			{
				int[] res = new int[arr.length-1];
				for(int i=0;i<res.length;i++) 
				{
					if(i<index)
						res[i]=arr[i];
					else
						res[i]=arr[i+1];
				}
				return res;
			}	
		}
```
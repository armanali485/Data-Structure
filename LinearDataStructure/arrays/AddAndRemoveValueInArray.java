

import java.util.Arrays;

public class AddAndRemoveValueInArray {
	//13.WAP to add a value in Array at Specific Index
	public static int[] addingAtSpecificIndex(int[] arr,int value,int index) {
		if(index<0 || index>=arr.length )
			throw new ArrayIndexOutOfBoundsException("Invalid Index");
		else { 
			 int[] res = new int[arr.length+1];
			 for(int i=0;i<res.length;i++) {
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
	
	//14.WAP to remove Element from Array At Specific index.
	public static int[] removeAtSpecificIndex(int[] arr,int index) {
		if(index<0 || index>=arr.length )
			throw new ArrayIndexOutOfBoundsException("Invalid Index");
		else {
			 int[] res = new int[arr.length-1];
			 for(int i=0;i<res.length;i++) {
				 if(i<index)
					 res[i]=arr[i];
				 else
					 res[i]=arr[i+1];
			 }
			 return res;
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {2,1,5,1,3,2};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(addingAtSpecificIndex(arr, 10,3)));
		System.out.println(Arrays.toString(removeAtSpecificIndex(arr,3)));
	}

}

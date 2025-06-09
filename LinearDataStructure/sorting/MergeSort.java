import java.util.Arrays;

public class MergeSort {

    public static void divide(int[] arr, int left, int right){
        if(right>left){
        int mid = left + (right-left)/2;
        divide(arr,left,mid);
        divide(arr,mid+1,right);
        conquer(arr,left,mid,right);
        }
    }
    public static void conquer(int[] arr, int left, int mid, int right){
        int firstHalf = left;
        int secoundHalf = mid+1;
        int[] mergeArray = new int[right-left+1];
        int mergeArrayIndex=0;
        while(firstHalf<=mid && secoundHalf<=right){
            if(arr[firstHalf]<=arr[secoundHalf])
                mergeArray[mergeArrayIndex++]=arr[firstHalf++];
            else
                mergeArray[mergeArrayIndex++]=arr[secoundHalf++];
        }
        while(firstHalf<=mid)
            mergeArray[mergeArrayIndex++]=arr[firstHalf++];
        while(secoundHalf<=right)
            mergeArray[mergeArrayIndex++]=arr[secoundHalf++];
        for(int i=0;i<mergeArray.length;i++,left++){
            arr[left]=mergeArray[i];
        }
    }
	
    public static void main(String[] args) {
        
        int[] arr = {5,10,9,6,8};
			

			
			System.out.println("Merge Sort");
			System.out.println(Arrays.toString(arr));
		    divide(arr, 0, arr.length-1);
			System.out.println(Arrays.toString(arr));
    }
	
	

}

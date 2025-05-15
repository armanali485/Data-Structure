
import java.util.Arrays;


public class QuickSort {

     public static int partation(int[] arr, int low, int high){
        int pivotIndex = low-1;
        int pivot = arr[high];
        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                pivotIndex++;
                arr[pivotIndex]=arr[j]+arr[pivotIndex]-(arr[j]=arr[pivotIndex]);
            }
        }
        pivotIndex++;
        arr[pivotIndex]=arr[high]+arr[pivotIndex]-(arr[high]=arr[pivotIndex]);
        return pivotIndex;
     }
     public static void quickSort(int[] arr,int low,int high){
        if(high>low){
        int pivotIndex=partation(arr, low, high);
        quickSort(arr, low,pivotIndex-1);
        quickSort(arr, pivotIndex+1, high);
        }
     }
    public static void main(String[] args) {
        
        int[] arr = {5,10,9,6,8};
			

			
			System.out.println("Insertion Sort");
			System.out.println(Arrays.toString(arr));
		    quickSort(arr, 0, arr.length-1);
			System.out.println(Arrays.toString(arr));
    }
}



public class BinarySearch {

    public static int binarySearch(int[] arr,int key){
        int low = 0;
        int high = arr.length-1;
        while(high>=low){
            int mid = low+(high-low)/2;
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]<key)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,7,9,45,98,455,9999};
        System.out.println(binarySearch(arr, 9999));
    }
    
}

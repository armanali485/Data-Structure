
import java.util.Scanner;



public class LinearSearch {

    public static int linearSearch(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,9,3,4,10};
        System.out.print("Enter Element to Found :");
        int key = new Scanner(System.in).nextInt();
        int index = linearSearch(arr, key);
        if(index!=-1){
            System.out.println("Element Found At index :"+index);
        }
        else{
            System.err.println("Element Not Found");
        }
        
    }
    
}


import java.util.Arrays;



public class NextGreaterElement {

    public static void nextGreaterElement(int[] arr){
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        int[] res = new int[arr.length];
        for(int i =arr.length-1;i>=0;i--){
            if(stack.isEmpty()){
                stack.push(arr[i]);
                res[i]=-1;
            }
            else if(stack.peek()<=arr[i]){
                stack.pop();
            }
            else if(stack.peek()>=arr[i]){
                stack.push(arr[i]);
                res[i]=stack.peek();
            }
            
        } 
        System.out.println(Arrays.toString(res));
    }

    public static void main(String[] args) {
        int [] arr = {4,5,2,3,25};
        nextGreaterElement(arr);

    }
    
}

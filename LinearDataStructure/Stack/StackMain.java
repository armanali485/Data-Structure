
import java.util.Scanner;




class Stack {

    int top;
    int capacity;
    int[] arr;
    public Stack(int capacity){
        this.arr = new int[capacity];
        this.capacity=capacity;
        this.top=-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==capacity-1;
    }
    public void push(int data){
        if(isFull())
            throw new StackOverFlowException("Stack Overflow");
        arr[++top]=data;
        
    }
    public void pop(){
        if(isEmpty())
            throw new StackUnderFlowException("Stack UnderFlow");
        arr[top--]=0;
    }

    public int peek(){
        if(isEmpty())
            throw new StackUnderFlowException("Stack UnderFlow");
        return arr[top];
    }
    @Override
    public String toString(){
        StringBuilder b = new StringBuilder();
        b.append("[");
        for(int i=0;i<=top;i++){
            if(i==top){
                b.append(arr[i]);
                break;
            }
            b.append(arr[i]).append(", ");
        }
        return b+"]";
    }
}
class StackOverFlowException extends StackOverflowError {

    public StackOverFlowException(String message) {
        super(message);
    }    
}
class StackUnderFlowException extends StackOverflowError {

    public StackUnderFlowException(String message) {
        super(message);
    }  
}

public class StackMain{
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
              System.out.print("Enter Stack Size :");
              int size = sc.nextInt();
              Stack stack = new Stack(size);
              while(true){
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Peek");
                System.out.println("4. isEmpty");
                System.out.println("5. isFull");
                System.out.println("6. Display");
                System.out.println("7. Exit");
                System.out.print("Enter Your Choice :");
                int choice = sc.nextInt();
                switch(choice){
                     case 1 -> {
                         try {
                             System.out.print("Enter Element to Push :");
                             int data = sc.nextInt();
                             stack.push(data);
                             System.out.println(stack);
                         } catch (StackOverFlowException e) {
                             System.out.println(e.getMessage());
                         }}
                          
                     case 2 -> {
                         try {
                             stack.pop();
                             System.out.println(stack);
                         } catch (StackUnderFlowException e) {
                             System.out.println(e.getMessage());
                         }
                      }
                     case 3 -> {
                         try {
                             System.out.println(stack.peek());
                         } catch (StackUnderFlowException e) {
                             System.out.println(e.getMessage());
                         }
                      }
                            
                        case 4 -> System.out.println(stack.isEmpty());
                        case 5 -> System.out.println(stack.isFull());
                        case 6 -> System.out.println(stack);
                        case 7 -> {
                            System.out.println("Exiting...");
                            System.exit(0);
                      }
                     default -> System.err.println("Invalid Choice");
                }
              }
            
       }
   }
}

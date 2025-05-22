
import java.util.Scanner;


class Queue {

    int front = -1;
    int rear = -1;
    int capacity;
    int[] arr;

    public Queue(int capacity) {
        this.capacity=capacity;
        arr = new int[capacity];
    }

    public boolean isEmpty(){
        return (front==-1 || rear==-1);
    }
    public boolean isFull(){
        return (rear+1)%capacity == front;
    }
    public void enqueue(int data) throws QueueException
    {
        if(isFull()){
            throw  new QueueException("Queue OverFlow Exception");
        }
        else{
            if(isEmpty())
                front = rear = 0;
            else
                rear = (rear+1)%capacity;
            arr[rear]=data;
            System.out.println(data + " Enqueued");
        }
    }

    public void dequeue() throws QueueException
    {
        if(isEmpty())
             throw new QueueException("Queue UnderFlow Exception");
        else{
            int data = arr[front];
            if(front==rear)
                front=rear=-1;
            else
                front=(front+1)%capacity;
            System.out.println(data+ " Dequeued");
        }
    }
    public int peek() throws QueueException
    {
         if(isEmpty())
             throw new QueueException("Queue UnderFlow Exception");
        return arr[front];    
    }

    @Override
    public String toString(){
        String s ="[";
        if(!isEmpty()){
            for(int i=front;i!=rear;i=(i+1)%capacity){
                s+=arr[i]+", ";
            }
            s+=arr[rear];
        }
        s+="]";
        return s;

    }
}
class QueueException extends Exception{

    public QueueException(String message) {
        super(message);
    }
    
}

public class QueueDriver{

     public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
              System.out.print("Enter Queue Size :");
              int size = sc.nextInt();
              Queue queue = new Queue(size);
              while(true){
                System.out.println("1. Enqueue");
                System.out.println("2. Dequeue");
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
                             queue.enqueue(data);
                             System.out.println(queue);
                         } catch (QueueException e) {
                             System.out.println(e.getMessage());
                         }}
                          
                     case 2 -> {
                         try {
                             queue.dequeue();;
                             System.out.println(queue);
                         } catch (QueueException e) {
                             System.out.println(e.getMessage());
                         }
                      }
                     case 3 -> {
                         try {
                             System.out.println(queue.peek());
                         } catch (QueueException e) {
                             System.out.println(e.getMessage());
                         }
                      }
                            
                        case 4 -> System.out.println(queue.isEmpty());
                        case 5 -> System.out.println(queue.isFull());
                        case 6 -> System.out.println(queue);
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

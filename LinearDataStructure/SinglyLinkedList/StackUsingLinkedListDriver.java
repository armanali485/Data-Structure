
import java.util.Scanner;

class StackUsingLinkedListDriver{


     public static void main(String[] args) throws InterruptedException {
        try(Scanner sc = new Scanner(System.in)){
              StackUsingLinkedList stack = new StackUsingLinkedList();
              boolean flag = true;
              while(flag){
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Peek");
                System.out.println("4. isEmpty");
                System.out.println("5. Display");
                System.out.println("6. Exit");
                System.out.print("Enter Your Choice :");
                int choice = sc.nextInt();
                switch(choice){
                     case 1 -> {
                         try {
                             System.out.print("Enter Element to Push :");
                             int data = sc.nextInt();
                             stack.push(data);
                             System.out.println(stack);
                         } catch (Exception e) {
                             System.out.println(e.getMessage());
                         }}
                          
                     case 2 -> {
                         try {
                             stack.pop();
                             System.out.println(stack);
                         } catch (Exception e) {
                             System.out.println(e.getMessage());
                         }
                      }
                     case 3 -> {
                         try {
                             System.out.println(stack.peek());
                         } catch (Exception e) {
                             System.out.println(e.getMessage());
                         }
                      }
                            
                        case 4 -> System.out.println(stack.isEmpty());
                        case 5 -> System.out.println(stack);
                        case 6 -> {
                            String exit = "...........";
                            System.out.print("Exiting");
                        for(char c : exit.toCharArray()){
                            Thread.sleep(400);
                            System.out.print(c);
                        }
                        flag=false;
                      }
                     default -> System.err.println("Invalid Choice");
                }
              }
            
       }

    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        try(Scanner sc = new Scanner(System.in)){
            boolean flag = true;
            SinglyLinkedList list = new SinglyLinkedList();
            do{
               
                System.out.println("1.addLast\n2.addFirst\n3.addAtPosition\n4.removeFirst\n5.removeLast\n6.removeAtPosition\n7.Exit");
                System.out.print("Enter your Choice :");
                switch (sc.nextInt()) {
                    case 1 -> {
                        System.out.print("Enter the data to insert at Last: ");
                        list.addLast(sc.nextInt());
                    }
                    case 2 ->{
                        System.out.print("Enter the data to insert at First: ");
                        list.addFirst(sc.nextInt());
                    }
                    case 3 ->{
                        System.out.print("Enter the index and data to insert Followed by Space: ");
                        list.addAtPos(sc.nextInt(), sc.nextInt());
                    }
                    case 4 ->{
                        list.removeFirst();
                    }
                    case 5 ->{
                        list.removeLast();
                    }
                    case 6 ->{
                        System.err.print("Enter Index to remove Element: ");
                        list.removeAtPos(sc.nextInt());
                    }
                    case 7 ->{
                        
                        String exit = "Exiting...........";
                        for(char c : exit.toCharArray()){
                            Thread.sleep(400);
                            System.out.print(c);
                        }
                        flag=false;
                    }
                    default ->
                        System.out.print("Invalid Input");                    
                }
            
            }while(flag);
        }
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        try(Scanner sc = new Scanner(System.in)){
            boolean flag = true;
            DoublyLinkedList list = new DoublyLinkedList();
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
                        try {
                            list.addAtPos(sc.nextInt(), sc.nextInt());
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    case 4 ->{
                        try{
                            list.removeFirst();
                        }
                        catch(RuntimeException e){
                            System.out.println(e.getMessage());
                        }
                    }
                    case 5 ->{
                        try{
                            list.removeLast();
                        }
                        catch(RuntimeException e){
                            System.out.println(e.getMessage());
                        }
                    }
                    case 6 ->{
                        try{
                            System.out.print("Enter index value: ");
                            list.removeAtPos(sc.nextInt());
                        }
                        catch(RuntimeException e){
                            System.out.println(e.getMessage());
                        }
                    }

                    case 7 ->{
                        
                        System.out.print("Exiting");
                        String exit = "...........";
                        for(char c : exit.toCharArray()){
                            Thread.sleep(400);
                            System.out.print(c);
                        }
                        flag=false;
                    }
                    default ->
                        System.out.println("Invalid Input");                    
                }
            
            }while(flag);
        }
        
    }
}

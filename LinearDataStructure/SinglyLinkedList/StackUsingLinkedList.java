public class StackUsingLinkedList {
   
    private Node head;
    private Node tail;
    private int size;

    public boolean isEmpty(){
        return head==null;
    }

    public void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head=tail=newNode;
            size++;
        }
        else{
            tail.next=newNode;
            tail=tail.next;
            size++;
        }
    }
    public void pop(){
        if(isEmpty())
            throw new RuntimeException("Stack Underflow Exception");
        Node temp = head;
        if(temp.next==null){
            head=null;
            tail=null;
            size--;
            return;
        }
        while(temp.next.next!=null)
            temp=temp.next;
        temp.next=null;
        tail=temp;
        size--;
    }
    public int peek(){
        if(isEmpty())
            throw new RuntimeException("Stack Underflow Exception");
        return tail.data;
    }

     @Override
    public String toString(){
        String s = "[";
        Node temp=this.head;
        while(temp!=null){
            s+=temp.next!=null?temp.data+", ":temp.data;
            temp=temp.next;
        }
        return s+"]";
    }
    
}

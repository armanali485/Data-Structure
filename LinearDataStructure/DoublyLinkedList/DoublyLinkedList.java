

public class DoublyLinkedList{

    private Node head;
    private Node tail;
    private int size;
    public boolean isEmpty(){
        return this.head==null;
    }
    public int getSize(){
        return this.size;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            this.head=this.tail=newNode;
        }
        else{
            newNode.prev=tail;
            this.tail=this.tail.next=newNode;
        }
        this.size++;
        System.out.println(this);
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            this.head=this.tail=newNode;
        }
        else{
            this.head.prev=newNode;
            newNode.next=this.head;
            this.head=newNode;
        }
        this.size++;
        System.out.println(this);
    }
    public void addAtPos(int index,int data){
         if(index>=this.size || index<0)
                throw new IndexOutOfBoundsException("Index Out of Bound Exception");
        else if(index==0)
            this.addFirst(data);
        else{
            int count =0;
            Node temp = this.head;
            while(count!=index-1){
                temp=temp.next;
                count++;
            }
            Node newNode = new Node(data);
            newNode.prev=temp;
            temp.next.prev=newNode;
            newNode.next = temp.next;
            temp.next =  newNode;
            size++;
            System.out.println(this);
        }
            
    }
    

    public void removeFirst(){
        if(isEmpty()){
            throw new RuntimeException("LinkedList Underflow Exception");
        }
        else if(head.next==null)
            head=tail=null;
        else{

            head=head.next;
            head.prev.next=null;
            head.prev=null;
        }
        size--;
        System.out.println(this);
    }

    public void removeLast(){
        if(isEmpty()){
            throw new RuntimeException("LinkedList Underflow Exception");
        }
        else if(head.next==null)
            head=tail=null;
        else{
            tail=tail.prev;
            tail.next.prev=null;
            tail.next=null;


        }
        size--;
        System.out.println(this);
    }


    public void removeAtPos(int index){
         if(index>=this.size || index<0)
                throw new IndexOutOfBoundsException("Index Out of Bound Exception");
        else if(index==0)
            this.removeFirst();
        else if(index==this.size-1)
            removeLast();
        else{
            int count =0;
            Node temp = this.head;
            while(count!=index){
                temp=temp.next;
                count++;
            }
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
            temp.next=temp.prev=null;
            size--;
            System.err.println(this);
        }
        
            
    }


    public int contains(int data){
        Node temp= head;
        int count=0;
        while(temp!=null){
            if(temp.data==data){
                return count;
            }
            count++;
            temp=temp.next;
        }
        return -1;
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
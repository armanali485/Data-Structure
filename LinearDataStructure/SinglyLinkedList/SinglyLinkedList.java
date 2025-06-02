
import java.util.NoSuchElementException;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public int getSize(){
        return size;
    }

    //For Check Linked List is Empty
    public boolean isEmpty(){
        return head==null;
    }

    public void addLast(int data){
        Node temp = new Node(data);
        if(isEmpty()){
            this.head=this.tail=temp;
        }
        else{
            this.tail=this.tail.next=temp;
        }
        this.size++;
        System.err.println(this);
    }
    public void addFirst(int data){
        Node temp = new Node(data);
        if(isEmpty()){
            this.head=this.tail=temp;
        }
        else{
            temp.next=this.head;
            this.head=temp;
        }
        this.size++;
        System.err.println(this);
    }

    public void addAtPos(int index,int data){
        if(index<this.size && index>=0){
            if(index==0)
                this.addFirst(data);
            else if(index==size-1)
                this.addLast(data);
            else{
                int count =0;
                Node temp = this.head;
                while(count<index){
                    temp=temp.next;
                    count++;
                }
                Node newNode = new Node(data);
                newNode.next = temp.next;
                temp.next =  newNode;
                size++;
                System.err.println(this);
            }

        }
    }

    public void removeLast()
	{
		if(isEmpty())
			throw new NoSuchElementException();
		else if(getSize()==1)
			head = tail = null;
		else
		{
			Node temp = head;
			while(temp.next!=tail)
			{
				temp = temp.next; // moving the temp pointer at second last
			}
			
			temp.next = null ; // removing the last node
			tail = temp; // updating tail to loc temp
		}
		size--;// decrementing size
		System.err.println(this);
	}
	
	public void removeFirst()
	{
		if(isEmpty())
			throw new NoSuchElementException();
		else if(getSize()==1)
			head = tail = null; // if list have only 1 node
		else
		{
			Node temp = head.next; // moving temp to head's next loc
			head.next = null; // making head's next null ( dereferencing)
			head = temp; // moving head to temp's loc
			
		}
		size--;
		System.err.println(this);
		
	}
	
	public void removeAtPos(int index)
	{
		if(isEmpty())
			throw new NoSuchElementException();
		else if(index==0)
			removeFirst();
		else if(index==getSize()-1)
			removeLast();
		else
		{
			int count = 0;
			Node temp = head;
			while(count!=index-1)
			{
				temp = temp.next;
				count++;
			}
			
			Node x = temp.next;
			temp.next = temp.next.next;
			x.next = null;
			size--;
			System.err.println(this);
		}
		
		
	}

    //Search in Linked List.
    public int search(int key){
        int count =0;
        Node temp = head;
        while(temp!=null){
            if(temp.data==key)
                return count;
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

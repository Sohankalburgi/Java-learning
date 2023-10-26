class LinkedList{
    Node head;
    class Node
    {
        Node next;
        int data;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }

    public void insertionAtEnd(int newdata)
    {
        Node newNode = new Node(newdata);
        if(head==null)
        {
            head = new Node(newdata);
            return;
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    //floy's detection algorithm
    public void detectloop()
    {
        Node slow = head;
        Node fast = head;
        int flag=0;
        while (slow!=null && fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                flag = 1;
                break;
            }
            
        }
        if(flag==0)
        {
            System.out.println("the cycle not detected");
        }
        else{
        System.out.println("cycle detected");
    }
}

    
    public void displayLL()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
    }
    public void createcycle()
    {
        Node temp = head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head;
    }
}
public class detectcycle {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertionAtEnd(2);
        ll.insertionAtEnd(4);
        ll.insertionAtEnd(8);
        ll.insertionAtEnd(12);
        ll.insertionAtEnd(3);
        
        
        ll.displayLL();
        //ll.createcycle();
        ll.detectloop();
    }
}

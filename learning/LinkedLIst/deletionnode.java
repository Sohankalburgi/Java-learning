class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        
        Node(int d)
        {
            data=d;
            next=null;
        }
        
    }

    //implementation of insertion of node at end
    public void InsertAtEnd(int newdata)
    {
        Node newNode = new Node(newdata);
        // when linkedlist is empty
        if(head==null)
        {
            head = new Node(newdata);
            return;
        }
        
        // when linkedlist is not empty
        Node temp = head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;  
        return;
    }

    public void deletion(int pos)
    {
        if(head==null)
        {
            return;
        }
        Node temp = head;
        if(pos==0)
        {
            temp=temp.next;
            return;
        }
        for(int i=0;temp!=null && i<pos-1;i++)
        {
            temp= temp.next;
        }
        if(temp==null && temp.next!=null)
        {
            return;
        }
        temp.next=temp.next.next;

    }

    // display the linkedlist
    public void displayLL()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
}

public class deletionnode {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.InsertAtEnd(5);
        ll.InsertAtEnd(6);
        ll.InsertAtEnd(9);
        ll.InsertAtEnd(56);
        ll.InsertAtEnd(53);
        ll.displayLL();
        System.out.println();
        ll.deletion(1);
        ll.displayLL();
        System.out.println();
        ll.deletion(2);
        ll.displayLL();
    }
}

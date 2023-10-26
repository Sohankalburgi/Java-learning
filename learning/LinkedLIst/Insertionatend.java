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

public class Insertionatend
{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.InsertAtEnd(5);
        list.InsertAtEnd(6);
        list.InsertAtEnd(1);
        list.InsertAtEnd(23);
        list.displayLL();
    }
}
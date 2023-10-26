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

    public void reverseLL()
    {
        Node curr = head;
        Node prev = null;
        Node nxt = null;
        while(curr!=null)
        {
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        head=prev;
        return;
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
}
public class reverselinkedlist {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertionAtEnd(5);
        ll.insertionAtEnd(4);
        ll.insertionAtEnd(3);
        ll.insertionAtEnd(2);
        ll.insertionAtEnd(1);
        ll.displayLL();
        System.out.println();
        ll.reverseLL();
        ll.displayLL();
    }
}

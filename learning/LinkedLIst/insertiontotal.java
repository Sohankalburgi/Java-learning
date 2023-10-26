class LinkedList{
    Node head;
    class Node
    {
        int data;
        Node next;
        
        Node(int d)
        {
            data=d;
            next = null;
        }
    }
    // at end
    public void insertAtEnd(int newdata)
    {
        Node newnode = new Node(newdata);
        if(head==null)
        {
            head=new Node(newdata);
            return;
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
    }

    // at beginning
    public void insertAtBegin(int newData)
    {
        Node newnode = new Node(newData);
        newnode.next=head;
        head=newnode;
    }

    // at specific location after the node
    public void insertAtlocation(Node prevNode,int newdata)
    {
        Node newnode = new Node(newdata);
        if(prevNode==null)
        {
            System.out.println("the previous node can't contain null");
            return;
        }
        newnode.next=prevNode.next;
        prevNode.next = newnode;
    }

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
public class insertiontotal {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(8);
        ll.insertAtEnd(10);
        ll.displayLL();
        System.out.println();
        ll.insertAtlocation(ll.head.next.next, 6);
        ll.displayLL();
    }
    
}

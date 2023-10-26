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

    public void insertAtEnd(int newdata)
    {
        Node newnode = new Node(newdata);
        if(head==null)
        {
            head=new Node(newdata);
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
    }

    public void insertAtBegin(int newData)
    {
        Node newnode = new Node(newData);
        newnode.next=head;
        head=newnode;
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
public class insertionatbegin {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(7);
        ll.displayLL();
        System.out.println();
        ll.insertAtBegin(1);
        ll.insertAtBegin(3);
        ll.displayLL();
    }
}

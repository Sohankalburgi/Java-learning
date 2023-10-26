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

    public int midnodedata()
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
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

public class middlenodeinlinkedlist {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertionAtEnd(2);
        ll.insertionAtEnd(3);
        ll.insertionAtEnd(4);
        ll.insertionAtEnd(6);
        System.out.println("for the even no of nodes :"+ll.midnodedata());
        ll.insertionAtEnd(9);
        ll.insertionAtEnd(10);
        System.out.println("for the odd no of nodes :"+ll.midnodedata());
    }
}

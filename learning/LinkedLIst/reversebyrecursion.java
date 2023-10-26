class LinkedList
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null; 
        }
    }

    public void insertatend(int newdata)
    {
        Node newNode = new Node(newdata);
        if(head == null)
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

    public void reverseRe(Node curr,Node prev)
    {
        if(curr.next == null)
        {
            head = curr;
            curr.next = prev;
            return;
        }

        Node nxtptr = curr.next;
        curr.next = prev;
        reverseRe(nxtptr, curr);
    }

    public void displayLL()
    {
        Node temp =head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
}

class reversebyrecursion{
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.insertatend(5);
        ll.insertatend(6);
        ll.insertatend(7);
        ll.insertatend(8);
        ll.displayLL();
        System.out.println();
        ll.reverseRe(ll.head,null);
        ll.displayLL();
    }
}
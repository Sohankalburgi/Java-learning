import java.util.Scanner;

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
    public void insertAtEnd(int newData)
    {
        Node newNode = new Node(newData);
        if(head==null)
        {
            head=new Node(newData);
            return;
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void insertAt(int pointer,int value)
    {
        Node newNode = new Node(value);
        int i=0;
        Node temp = head;
        if(pointer==0)
        {
            newNode.next =head;
            head = newNode;
            return;
        }
        while(i<pointer-1 && temp!=null)
        {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }

    public Node reverse(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node curr = head;
        Node prev = null;
        Node nxt = null;
        while(curr!=null)
        {
            nxt=curr.next;
            curr.next = prev;
            prev=curr;
            curr=nxt;
        }
        head=prev;
        return head;
    }

    public Node getright(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast=fast.next.next;
        }
        return slow.next;
    }


    public boolean checkpalindrome()
    {
        Node p1 = head;
        Node p2 = reverse(getright(head));
        while(p1!=null && p2!=null)
        {
            if(p1.data!=p2.data)
            {
                return false;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return true;
    }
    public void removedup(Node h)
    {
        Node temp = h;
        while(temp.next!=null )
        {
            if(temp.data==temp.next.data)
            {
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return;
    }

    public boolean findele(int x)
    {
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data==x)
            {
                return true;
            }
            temp=temp.next;
        }
        return false;
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

class search
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        System.out.println("enter the no of elements in linked list");
        int n = sc.nextInt();
        System.out.println("enter the element in linkedlist");
        for(int i=0;i<n;i++)
        {
            ll.insertAtEnd(sc.nextInt());
        }
        System.out.println("enter the element to be found");
        int x = sc.nextInt();
        System.out.println("the linked list is :");
        ll.displayLL();
        System.out.println();
        if(ll.findele(x))
        {
            System.out.println("ELement is found : Yes");
        }
        else{
            System.out.println("Element is found : No");
        }

    }
}
import java.util.Scanner;

public class q5_sumoftwolist {

    static int sumoflists(LinkedList.Node head1,LinkedList.Node head2)
    {
        int i=100;
        int n1 = 0;
        int n2 = 0;
        LinkedList.Node temp1=head1;
        LinkedList.Node temp2 = head2;
        while(i>0)
        {
            n1+=temp1.data*i;
            n2+=temp2.data*i;
            i/=10;
            temp1=temp1.next;
            temp2=temp2.next;
        }

        return n1+n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        System.out.println("enter the elements of the linked list 1 (enter only 3 elements)");
        for(int i=0;i<3;i++)
        {
            l1.insertAtEnd(sc.nextInt());
        }
        System.out.println("enter the elements of the linked list 2 (enter only 3 elements)");
        for(int i=0;i<3;i++)
        {
            l2.insertAtEnd(sc.nextInt());
        }

        l1.displayLL();
        System.out.println();
        l2.displayLL();
        System.out.println();

        int ans = sumoflists(l1.head,l2.head);
        System.out.println("the sum of digits of linkedlist elements :"+ans);

    }
}

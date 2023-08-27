import java.util.Scanner;

 class q2_eleinsertionatposition {
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
        ll.displayLL();
        System.out.println();
        System.out.println("enter the position and value");
        int pos = sc.nextInt();
        int val = sc.nextInt();
        ll.insertAt(pos,val);

        ll.displayLL();

    }
}
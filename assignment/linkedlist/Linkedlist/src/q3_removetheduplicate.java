import java.util.Scanner;

public class q3_removetheduplicate {


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0;i<n;i++)
        {
            ll.insertAtEnd(sc.nextInt());
        }
        ll.displayLL();
        ll.removedup(ll.head);
        System.out.println();
        ll.displayLL();
    }
}

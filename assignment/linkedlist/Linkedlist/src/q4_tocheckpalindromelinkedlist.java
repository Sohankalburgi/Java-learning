import java.util.Scanner;

public class q4_tocheckpalindromelinkedlist {
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
        System.out.println("the linked list is :");
        ll.displayLL();
        System.out.println();
        if(ll.checkpalindrome())
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("NO");
        }
    }
}

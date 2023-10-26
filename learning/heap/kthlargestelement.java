import java.util.PriorityQueue;
import java.util.Scanner;

public class kthlargestelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        PriorityQueue <Integer> minheap = new PriorityQueue<>();
        for(int i : arr)
        {
            // ADDING THE MINHEAP OR BULIDING THE MINHEAP
            minheap.add(i);

            // DELETING THE ELEMENT IN THE MINHEAP
            if(minheap.size()>k)
                minheap.remove();
        }
        //  TO ACCESS THE ROOT NODE OF THE MINHEAP
        System.out.println(minheap.peek());

    }
}

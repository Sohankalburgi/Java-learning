import java.util.Scanner;

public class tofindtheindexofele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of element in array");
        int n = sc.nextInt();
        System.out.println("enter the element to find");
        int e = sc.nextInt();
        System.out.println("enter array elements");
        int b[] = new int [n];
        for(int i=0;i<n;i++)
        {
            b[i] = sc.nextInt();
        }

        for (int i=0;i<n;i++)
        {
            if(b[i]==e)
            {
                System.out.println(i);
                break;
            }
        }

    }
}

import java.util.Scanner;

public class q1_linearsearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = sc.nextInt();

        int a[] =new int [n]; 
        System.out.println("enter the search element:");
        int k = sc.nextInt();
        System.out.println("enter the array elements");
        for(int i=0;i<n;i+=1)
        {
            a[i] = sc.nextInt();
        }
        boolean flag = false;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k)
            {
                System.out.println("it is found at index "+i);
                flag = true;
                break;
            }
        }
        if(flag == false)
        {
            System.out.println("it is not found ");
        }

    }
}
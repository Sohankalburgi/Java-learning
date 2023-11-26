import java.util.*;
public class q5_intervalOverlapping {

    private static class Interval{
        int start;
        int end;
        public Interval(int start,int end)
        {
            this.start = start;
            this.end = end;
        }
    }

    public static boolean IsIntersect(Interval arr[],int n)
    {
        int maxele = 0;
        // find the overall maximum limit
        for(int i=0;i<n;i++)
        {
            maxele = Math.max(arr[i].end,maxele);
        }

        // Initialise array with the size of maxelement +1
        int []aux = new int[maxele+1];
        for(int i=0;i<n;i++)
        {
            // starting point of the interval 
            int x = arr[i].start;

            // end point of the interval
            int y = arr[i].end;
            aux[x]++;
            aux[y]--;
        }
        for (int i = 1; i <= maxele; i++)
        { 
            // Calculating the prefix Sum 
            aux[i] += aux[i - 1]; 
    
            // Overlap 
            if (aux[i] > 1) 
                return true; 
        } 
 
        // If we reach here, then no Overlap 
        return false; 
    }

    public static void main(String[] args) {
        Interval arr[]= { new Interval(1,3), new Interval(5,7), new Interval(2,4), new Interval(6,8)};
        int n1 = arr.length;

        if(IsIntersect(arr,n1))
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}

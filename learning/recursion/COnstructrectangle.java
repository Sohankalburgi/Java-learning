import java.util.*;

public class COnstructrectangle {

    public static int[] Constructrectangle(int area)
    {
        int sqrt = (int) Math.sqrt(area);
        if(sqrt*sqrt==area)
        {
            return new int[]{sqrt,sqrt};
        }
        else{
            int []arr = new int[2];
            Orcase(arr,area,sqrt);
            return arr;
        }
    }
    public static void Orcase(int []arr,int area,int sqrt)
    {
        if(area %(sqrt)==0)
        {
            arr[0] = area/sqrt;
            arr[1] = sqrt;
            return;
        }
        Orcase(arr, area, sqrt-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area = sc.nextInt();
        int []res = Constructrectangle(area);
        for(int i:res)
        {
            System.out.print(i+" ");
        }
    }
}
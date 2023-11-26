import java.util.Arrays;

public class TocreteNonOverlappinginterval {
    
    static class  Interval{
        int start;
        int end;
        Interval(int start,int end)
        {
            this.start = start;
            this.end = end;
        }
    }

    public static void NoofNonoverlapping(Interval []intervals)
    {
        
        Arrays.sort(intervals,(a,b)->  a.start-b.start);
        int j = 0;
        int count =0;
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i].start<intervals[j].end)
            {
                count++;
            }
            else{
            j=i;
            }
        }
        System.out.println(count);
    }
    
    public static void main(String[] args) {
        Interval [] intervals1 = {new Interval(1, 2), new Interval(2,3), new Interval(3, 4), new Interval(1, 3)};

        Interval [] intervals2 = {new Interval(1,2),new Interval(1, 2),new Interval(1, 2)};
        NoofNonoverlapping(intervals1);
        NoofNonoverlapping(intervals2);
        
}
}

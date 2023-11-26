import java.util.*;

public class startandfinishactivites {

    static class Interval{
        int start;
        int end;
        int idx;
        Interval(int start,int end,int idx){
            this.start = start;
            this.end = end;
            this.idx = idx;
        }
    }

    public static void main(String[] args) {
        int []start = {1,3,0,5,8,5};
        int []finish = {2,4,6,7,9,9};
        int n = start.length;
        Interval []activites = new Interval[n];
        for(int i=0;i<n;i++)
        {
            activites[i] = new Interval(start[i],finish[i],i);
        }

       
        Arrays.sort(activites, new Comparator<Interval>() {
            public int compare(Interval a,Interval b)
            {
                return a.end-b.end;
            }
        });

      
        int j=0;
        System.out.print(activites[0].idx+"\t");
        for(int i=1;i<n;i++)
        {
            if(activites[i].start >= activites[j].end)
            {
                System.out.print(activites[i].idx+"\t");
                j=i;
            }
            
        }
        System.out.println();


    }
    



}

import java.util.ArrayList;
import java.util.Collections;
// time complexity O(n^2)
// space complexity O(n)
public class jobscheduling {

    char id;
    int deadline;
    int profit;
    public jobscheduling()
    {}
    public jobscheduling(char id,int deadline,int profit)
    {
        this.id=id;
        this.deadline = deadline;
        this.profit = profit;
    }

    void printJobSequence(ArrayList<jobscheduling> arr,int maxDeadline)
    {
        int n = arr.size();
        // 1. sort the jobs in the decreasing order of profit
        // use of lambda expression 
        Collections.sort(arr,(a,b)-> b.profit-a.profit); // O(nlogn)

        // keep track of slots
        boolean result[] = new boolean[maxDeadline];

        // to store the job ids
        char[] jobs = new char[maxDeadline];

        // we need to store the job id according to deadline
        for(int i=0;i<n;i++) //O(n^2)
        {
            for(int j=Math.min(maxDeadline-1,arr.get(i).deadline-1);j>=0;j--)
            {
                if(result[j]==false)
                {
                    result[j]=true;
                    jobs[j]=arr.get(i).id;
                    break;
                }
            }
        }
        for(char id :jobs)
        {
            System.out.println(id+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<jobscheduling> arr = new ArrayList<>();
        arr.add(new jobscheduling('1', 5, 55));
        arr.add(new jobscheduling('2', 2, 65));
        arr.add(new jobscheduling('3', 7, 75));
        arr.add(new jobscheduling('4', 3, 60));
        arr.add(new jobscheduling('5', 2, 70));
        arr.add(new jobscheduling('6', 1, 50));
        arr.add(new jobscheduling('7', 4, 85));
        arr.add(new jobscheduling('8', 5, 68));
        arr.add(new jobscheduling('9', 3, 45));
        System.out.println("job sequences to get maximum profit");
        jobscheduling obj = new jobscheduling();
        obj.printJobSequence(arr,7);
    }
}

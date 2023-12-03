import java.util.Arrays;

public class Boatstosavepeople {

    public static int numRescueBoats(int[] people, int limit) {
        int i = 0;
        int j = people.length-1;
        int count = 0;
        Arrays.sort(people);
        while(i<=j)
        {
            if(people[i]+people[j]<=limit)
            {
                count++;
                i++;
                j--;
            }
            else
            {
                count++;
                j--;
            }
        }
        return count;
    }
    public static void  main(String[] args) {
        int [] people = {3,2,2,1};
        int limit = 3;
        System.out.println(numRescueBoats(people,limit));
    }
}

import java.util.ArrayList;
import java.util.List;

public class combination {

    public static void backtrack(List<List<Integer>> result,int n,int k,List<Integer> comb,int inc )
    {
        if(comb.size()==k)
        {
            result.add(new ArrayList<>(comb));
            return;
        }
        for(int i=inc;i<=n;i++)
        {
            comb.add(i);
            backtrack(result, n, k, comb, i+1);
            comb.remove(comb.size()-1);
        }

    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,n,k,new ArrayList<>(),1);
        return result;
    }
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        System.out.println(combine(n,k));
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class allpermutationofString {
    static public void swap(int i,int j,char[]perm)
    {
        char temp = perm[i];
        perm[i] = perm[j];
        perm[j] = temp;
    }
    
    static public void permutation(List<String> res,char[] s,int idx)
    {
        if(idx>=s.length)
        {
            if(!res.contains(s))
                res.add(new String(s));
            return;
        }
        for(int i=idx;i<s.length;i++)
        {
            swap(idx,i,s);
            permutation(res,s,idx+1);
            swap(idx,i,s);
        }
        
    }
    
    static public List<String> find_permutation(String S) {
        // Code here
        List<String> res = new ArrayList<>();
        char c[]= S.toCharArray();
        Arrays.sort(c);
        permutation(res,c,0);
        return res;
    }
    public static void main(String[] args) {
        String s = "ABC";
        System.out.println(find_permutation(s));
    }
}

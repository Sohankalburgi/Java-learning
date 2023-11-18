import java.util.*;

public class phonekeypad {
     static public void backtrack(String[]lettersMap,String digits,int idx,List<String> ans,StringBuilder container)
    {
        if(idx==digits.length())
        {
            ans.add(container.toString());
            return;
        }
        int len = lettersMap[Character.getNumericValue(digits.charAt(idx))].length();
        for(int i=0;i<len;i++)
        {
            container.append(lettersMap[Character.getNumericValue(digits.charAt(idx))].charAt(i));
            backtrack(lettersMap,digits,idx+1,ans,container);
            container.deleteCharAt(container.length()-1);

        }

    }

    static public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if(digits==null || digits.length()==0)
            return ans;
        String [] lettersMap = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        backtrack(lettersMap,digits,0,ans,new StringBuilder(""));
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<String> ans = letterCombinations(s);
        System.out.println(ans);
    }
}

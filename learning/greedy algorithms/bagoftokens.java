import java.util.Arrays;

public class bagoftokens {
    public static int bagOfTokensScore(int[] token, int power) {
        Arrays.sort(token);

        int res = 0;
        int points = 0;
        int i=0,j=token.length-1;
        while(i<=j)
        {
            if(power>=token[i]){
                power -= token[i++];
                points++;
                res = Math.max(res,points);
            }
            else if(points>0)
            {
                power+=token[j--];
                points--;
            }
            else{
                return res;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] tokens = {100,200,300,400};
        int power = 200;
        System.out.println(bagOfTokensScore(tokens, power));
    }
}

public class lemonade {

    static boolean lemonadeChange(int N, int bills[]) {
        // code here
        int count5=0;
        int count10=0;
        int count20=0;
        
        for(int i=0;i<N;i++)
        {
            if(bills[i]==5)
            {
                count5++;
            }
            else if(bills[i]==10)
            {
                if(count5!=0)
                {
                    count5--;
                    count10++;
                }
                else{
                    return false;
                }
            }
            else if(bills[i]==20)
            {
                if(count10>=1 && count5>=1)
                {
                    count10--;
                    count5--;
                    count20++;
                }
                else if(count10==0 && count5>=3)
                {
                    count5 = count5 - 3;
                    count20++;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 5;
        int []bills = {5,5,5,10,20};
        System.out.println(lemonadeChange(n, bills));
    }
}
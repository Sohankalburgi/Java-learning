public class gasCostcircuit {

   
    public static void main(String[] args) {
        int []gas = {1,2,3,4,5};
        int []cost = {3,4,5,1,2};

        int totalGas =0;
        int totalcost = 0;
        for(int i=0;i<gas.length;i++)
        {
            totalGas += gas[i];
            totalcost += cost[i];
        }

        if(totalGas<totalcost)
        {
            System.out.println(-1);
        }
        int hasGas = 0;
        int start = 0;
        for(int i=0;i<gas.length;i++)
        {
            hasGas+= gas[i]-cost[i];
            if(hasGas<0)
            {
                start =i+1;
                hasGas = 0;
            }
        }
        System.out.println(start);
       
    }
}
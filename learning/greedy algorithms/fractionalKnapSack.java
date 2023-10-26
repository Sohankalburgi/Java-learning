import java.util.Arrays;
import java.util.Comparator;

public class fractionalKnapSack
{
    static class itemValue
    {
        int profit,weight;
        public itemValue(int profit,int weight)
        {
            this.profit=profit;
            this.weight=weight;
        }
    }

    public static double getMaxValue(itemValue []arr,int capacity)
    {
        Arrays.sort(arr, new Comparator<itemValue>() {
            public int compare(itemValue item1,itemValue item2)
            {
                double cpr1 = Double.valueOf(item1.profit/item1.weight);
                double cpr2 = Double.valueOf(item2.profit/item2.weight);
     
                if (cpr1 < cpr2)
                    return 1;
                else
                    return -1;
            }
        });
        double totalValue =0;
        for(itemValue i:arr)
        {
            int curWt =(int)i.weight;
            int curprof=(int)i.profit;
            if(capacity -curWt >=0)
            {
                capacity = capacity -curWt;
                totalValue += curprof;
            }
            else{
                double fraction = ((double)capacity /(double)curWt);
                totalValue += (curprof*fraction);
                capacity =(int)(capacity -(curWt*fraction));
                break; 
            }
        }
        return totalValue;
    }

    public static void main(String args[])
    {
        itemValue []arr = {new itemValue(25, 5), new itemValue(75, 10),
                           new itemValue(100, 12), new itemValue(50, 4),
                           new itemValue(45, 7),new itemValue(90,9),
                           new itemValue(30, 3)};
        int capacity = 37;
        double maxValue = getMaxValue(arr,capacity);

        System.out.println("the Maximum profit :"+maxValue);
    }
}
import java.util.Scanner;

public class Flowerbed {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n==0){
            return true;
        }
        int t = flowerbed.length-1;

        if(t+1==1)
        {
            if(flowerbed[0]==0 && n<=1)
            {
                return true;
            }
        }
        if(t+1==2)
        {
            if(flowerbed[0]==0 && flowerbed[1]==0 && n<=1)
            {
                return true;
            }
        }
        if(flowerbed[0]==0 && flowerbed[1]==0)
        {
            flowerbed[0] = 1;
            n--;
            if(n==0)
            {
                return true;
            }
        }
        
        for(int i=1;i<flowerbed.length-1;i++)
        {
            if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0)
            {
                flowerbed[i] = 1;
                n--;
                if(n==0)
                {
                    return true;
                }
            }
        }
        
        if(n>0)
        {
            if(flowerbed[t]==0 && flowerbed[t-1]==0 )
            {
                flowerbed[t] =1;
                n--;
                if(n==0)
            {
                return true;
            }
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int []flowerbed = new int[length];

        for(int i=0;i<length;i++)
        {
            flowerbed[i] = sc.nextInt();
        }
        
        int n = sc.nextInt();

        System.out.println(canPlaceFlowers(flowerbed,n));
    }
}

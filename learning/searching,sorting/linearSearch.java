public class linearSearch{
    public static void main(String[] args) {
        int a[] = {1,5,8,6,2,3,0,-1};
        int k = 3;
        boolean flag = false;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k)
            {
                System.out.println(i);
                flag = true;
                break;
            }
        }
        if(flag == false)
        {
            System.out.println(-1);
        }

    }
}
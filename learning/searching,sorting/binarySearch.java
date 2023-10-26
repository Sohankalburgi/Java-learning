public class binarySearch {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int low = 0;
        int high = 6-1;
        int ele = 5;
        int flag =0;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(a[mid]==ele)
            {
                flag =1;
                System.out.println(mid);
                break;
            }
            else if(a[mid]>ele)
            {
                high=mid-1;
            }
            else{
                low= mid+1;
            }
        }
        if(flag==0)
        {
            System.out.println(-1);
        }
    }
}

// time complexity  O (n)
// Space complexity O (n)
// max heap
class BuildHeap
{
    public static void buildHeap(int []arr,int n)
    {
        int startidx = (n/2) - 1;

        for(int i=startidx ;i>=0; i--)
        {
            heapify(arr,n,i);
        }
    }

    public static void heapify(int []arr,int n,int i)
    {
        // the assumption - the parent node is largest data
        int largest = i;
        int leftidx = 2*i + 1;
        int rightidx = 2*i + 2;
        
        if(leftidx<n && arr[leftidx] > arr[largest])
        {
            largest = leftidx;
        }

        if(rightidx<n && arr[rightidx] > arr[largest])
        {
            largest = rightidx;
        }
        if(largest!=i)
        {
            // swap(i,largest)
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            //recursion
            heapify(arr,n,largest);
        }
        

    }

    public static void displayHeap(int []arr,int n)
    {
        System.out.println("Array Representation of Maxheap");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
// driver code
    public static void main(String[] args) {
        int []arr = {1,3,5,4,6,13,10,9,8,15,17};
        int n = arr.length;

        buildHeap(arr,n);
        displayHeap(arr,n);
    }
}
class buildHeap
{
    public static void buildHeap(int []arr,int n)
    {
        int startidx = (n/2) - 1;

        for(int i=startidx ;i>=0; i--)
        {
            heapify(arr,n,i);
        }
    }

    public static void HeapSort(int arr[],int n)
    {
        // 1. CONSTRUCT THE MAX HEAP
        buildHeap(arr, n);

        // 2. HEAPSORT
        for(int i=n-1;i>=0;i--)
        {
            // SWAP(arr(0),arr(i))
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // heapify function call
            heapify(arr, i, 0);
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
        System.out.println("Array Representation of Sorted Maxheap");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
public class heapsort {
    public static void main(String[] args) {
        int []arr = {1,3,5,4,6,13,10,9,8,15,17};
        int n = arr.length;

        // heap sort technique function definition
        buildHeap.HeapSort(arr,n);
        buildHeap.displayHeap(arr,n);
    }
    
}

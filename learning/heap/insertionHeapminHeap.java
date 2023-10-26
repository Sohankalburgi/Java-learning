// COMPLEXITY SIMILAR TO MAX HEAP 

class buildHeapMin{
    
    public static void displayHeap(int arr[],int n)
    {
        // IT IS BASICALLY THE PRINTING OF AN ARRAY
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // HEAP TRAVERSAL
    public static void buildHeap(int []arr,int n)
    {
        int start = n/2 - 1;
        // HEAPIFY FUNCTION IS DIFFERENT IN MIN AND MAX HEAP (RELATION OPERATOR)//
        for(int i = start; i>=0 ; i--)
        {
            heapify(arr,n,i);
        }
    }
    
    public static void heapify(int []arr,int n,int i)
    {
        // ASSUME THE CURRENT INDEX ELEMENT AS MINIIMUM 
        int smallest = i;
        int leftidx = 2*i + 1;
        int rightidx = 2*i + 2;
        if(leftidx<n && arr[smallest] > arr[leftidx])
        {
            smallest = leftidx;
        }
        if(rightidx<n && arr[smallest] > arr[rightidx])
        {
            smallest = rightidx;
        }

        if(smallest!=i)
        {
            //  THEN SWAP WITH ARR(SMALLEST) AND ARR(I)
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            //  RECURSIVE CALL TO THE CURRENT LEVEL TO CHECK AGAIN AND RETURN THE CORRECT TREE
            heapify(arr,n,smallest);
        }
    }

}

public class insertionHeapminHeap {
    public static void main(String[] args) {
        int []arr = {1,3,5,4,6,13,10,9,8,15,17};
        int n = arr.length;
        // BUILD HEAP IT CONTAINS HEAPIFY FUNCTION
        buildHeapMin.buildHeap(arr,n);
        // TO PRINT THE HEAP 
        buildHeapMin.displayHeap(arr,n);
    }
}

import java.util.PriorityQueue;
import java.util.Scanner;
class Solution{

    class Point implements Comparable<Point>{

        int x;
        int y;
        double distance;
        int i;

        public Point(int x,int y,double distance,int i)
        {
            this.x = x;
            this.y = y;
            this.distance = distance;
            this.i = i;
        }
        @Override
        public int compareTo(Point p1)
        {
            return Double.compare(this.distance, p1.distance);
        }
    }

    public int[][] kClosest(int[][] points, int k) 
    {
        
        PriorityQueue <Point> minheap = new PriorityQueue<>();
        for(int i=0;i<points.length;i++)
        {
            double distance = Math.sqrt(points[i][0]*points[i][0] + points[i][1]*points[i][1]);
            minheap.add(new Point(points[i][0],points[i][1],distance,i));
        }

        // deletion of points in minheap until k times
        int [][]res = new int[k][];
        for(int i=0;i<k;i++)
        {
            Point point = minheap.remove();
            res[i] = new int []{points [point.i][0],points [point.i][1]};
        }
        return res;
    }
}
public class Kthclosestpoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [][] points = new int[n][2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                points[i][j] = sc.nextInt();
            }
        }
        Solution s = new Solution();
        System.out.println("the closest point is :"+ s.kClosest(points,k));
    }
}

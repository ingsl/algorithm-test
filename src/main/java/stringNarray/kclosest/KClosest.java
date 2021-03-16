package stringNarray.kclosest;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KClosest {
    public static void main(String[] args) {
        KClosest kClosest = new KClosest();
        int k = 1;
        int points[][] = {
                {1,3},
                {-2,2}
        };

        int[][] result = kClosest.solve(points, k);
        kClosest.print(result);
    }


    public int[][] solve(int[][] points, int k) {
        //Queue<int[]> queue = new PriorityQueue<>(points.length, comp);
        Queue<int[]> queue = new PriorityQueue<>((a,b) -> (a[0]*a[0]+a[1]*a[1]) - (b[0]*b[0]+b[1]*b[1]));
        int result[][] = new int[k][2];
        int index=0;

        for(int[] p : points) {
            queue.offer(p);
        }

        while(index < k ) {
            result[index] = queue.poll();
            index++;
        }

        return result;
    }

    Comparator<int[]> comp = new Comparator<int[]>() {
        @Override
        public int compare(int[] o1, int[] o2) {
            return (o1[0]*o1[0]+o1[1]*o1[1]) - (o2[0]*o2[0]+o2[1]*o1[1]);
        }
    };

    public void print(int[][] result) {
        int m = result.length;
        int n = result[0].length;

        for(int i = 0; i< result.length; i++) {
            for(int j = 0; j < result[i].length; j++) {
                System.out.println(result[i][j]);
            }
        }
    }
}

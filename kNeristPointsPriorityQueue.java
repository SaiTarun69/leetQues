package sample;

import java.util.Comparator;
import java.util.PriorityQueue;

public class kNeristPointsPriorityQueue {
	 public int[][] kClosest(int[][] points, int K) {
	        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(a -> -a[0] * a[0] - a[1] * a[1]));
	        for (int[] p : points) { 
	            pq.offer(p); 
	            if (pq.size() > K) { pq.poll(); } // poll out  the farthest among the K + 1 points.
	        }
	        int[][] ans = new int[K][2];
	        while (K-- > 0) { ans[K] = pq.poll(); }
	        return ans;
	    }
}

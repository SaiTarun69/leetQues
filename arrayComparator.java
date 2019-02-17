package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class arrayComparator {
	public int[][] reconstructQueue(int[][] people) {
        if(people == null || people.length == 0) return new int[0][0];
        
        Arrays.sort(people, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                if(a[0] == b[0]) return a[1] - b[1];
                return b[0] - a[0];
            }
        });
        List<int[]> res = new ArrayList<>();
        for(int[] p: people){
            res.add(p[1], p);
        }
        return res.toArray(new int[0][0]);
    }
}

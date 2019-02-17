package sample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class queueByHeight {
	public int[][] reconstructQueue(int[][] people) {
        Map<Integer, LinkedList<int[]>> map=new TreeMap<Integer, LinkedList<int[]>>();
        for(int[] a:people){
            if(!map.containsKey(a[0])){
                LinkedList<int[]> temp=new LinkedList<int[]>();
                temp.add(a);
                map.put(a[0], temp);
            }
            else{
                LinkedList<int[]> li=fun(map.get(a[0]), a);
                map.put(a[0], li);
            }
        }
        
        int[][] res=new int[people.length][2];
        LinkedList<int[]> resli=new LinkedList<>();
        List<Integer> keyli=new ArrayList<>(map.keySet());
        for(int j=keyli.size()-1; j>=0; j--){
             LinkedList<int[]> sortli= map.get(keyli.get(j));
            for(int i=0; i<sortli.size(); i++){
                int[] ar=sortli.get(i);
                //System.out.println(ar[0]+"        "+ar[1]);
                //System.out.println(resli.size());
                if(j==keyli.size()-1) resli.add(ar);
                else{
                    //fun2(resli, ar);
                    resli.add(ar[1],ar);
                }
            }
        }
        
        for(int i=0; i<resli.size(); i++) res[i]=resli.get(i);
        
        return res;
    }
    
    public LinkedList<int[]> fun(LinkedList<int[]> li, int[] a){
        int i=0;
        while(i<li.size()&&li.get(i)[1]<a[1]) i++;
        li.add(i, a);
        return li;
    }
}

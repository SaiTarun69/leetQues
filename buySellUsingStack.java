package sample;

import java.util.Stack;

public class buySellUsingStack {
	public int maxProfit(int[] prices) {
        int max=0;
        Stack<Integer> res= new Stack<>();
        for(int i: prices){
            if(res.empty()) res.push(i);
            else if(res.peek()>i){
                //res.pop();
                res.push(i);
            }
            else{
                Integer temp=res.peek();
                max=Math.max(max, i-temp);
            }
        }
        return max;
    }
}

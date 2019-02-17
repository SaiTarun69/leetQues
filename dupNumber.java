package sample;

import java.util.HashSet;
import java.util.Set;

public class dupNumber {
	public int findDuplicate(int[] nums) {
        Set<Integer> loop=new HashSet<Integer>();
        int i=0;
        while(loop.add(nums[i])) i++;
        return nums[i];
    }
}

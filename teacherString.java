package sample;

import java.util.ArrayList;
import java.util.List;

public class teacherString {
	
	public static void mian(String[] args) {
		List<String> li=subStringLessKDist("awagik", 4);
		System.out.println(li);
	}
	
	public static List<String> subStringLessKDist(String s, int k){
		List<String> li=new ArrayList<>();
		if(s.length()==0||s==""||s.length()<k) return li;
		int[] chArr=new int[26];
		int count=0;
		for(int i=0; i<s.length(); i++) {
			if(chArr[s.charAt(i)-'a']==0) count++;
			chArr[s.charAt(i)-'a']++;
			if(i>k-1) {
				int sIndex=i-k+1;
				if(count==k-1) li.add(s.substring(sIndex, k));
				chArr[s.charAt(sIndex)-'a']--;
				if(chArr[s.charAt(sIndex)-'a']==0) count--;
			}
		}
		return li;
	}
}

package sample;

public class countSubStringsOfBinaryValues {
	 public int countBinarySubstrings(String s) {
	        if(s.length()==0) return 0;
	        int cur=1, prev=0, count=0;
	        for(int i=0; i<s.length()-1; i++){
	            if(s.charAt(i)==s.charAt(i+1)) cur++;
	            else{
	                prev=cur;
	                cur=1;
	            }
	            if(prev>=cur) count++;
	        }
	        return count;
	    }
}

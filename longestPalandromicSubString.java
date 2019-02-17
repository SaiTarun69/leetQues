package sample;

public class longestPalandromicSubString {
	int start, maxlen;
    
    public String longestPalindrome(String s) {
        
        int len = s.length();
        
        if (len < 2) {
            return s;
        }
        
        for (int i = 0; i < s.length(); i++) {
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i+1);
        }
        
        return s.substring(start, start + maxlen); 
    }
    
    private void extendPalindrome(String s, int j, int k) {
        while(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        
        if (maxlen < (k - j - 1)) {
            maxlen = k - j - 1;
            start = j + 1;
        }
    }

}

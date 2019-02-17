package sample;

public class alienStringOrder {
	public boolean isAlienSorted(String[] words, String order) {
        if(words.length==0) return true;
        String str=words[0];
        for(String s:words){
            if(str.equals(s)) continue;
            int s1=str.length();
            int s2=s.length();
            int i=0, j=0, comp=0;
            for( ; i<s1&&j<s2&&comp==0; i++, j++){
                comp=order.indexOf(str.charAt(i))-order.indexOf(s.charAt(j));
            }
            comp=comp==0?s1-s2:comp;
            if(comp>0) return false;
            str=s;
        }
        return true;
    }
}

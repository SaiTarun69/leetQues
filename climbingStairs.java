package sample;

public class climbingStairs {
	public int climbStairs(int n) {
        int[] pal=new int[n];
        pal[0]=1;
        if(n==1) return pal[0];
        pal[1]=2;
        if(n==2) return pal[1];
        for(int i=2;i<n;i++){
            pal[i]=pal[i-1]+pal[i-2];
        }
        return pal[n-1];
    }
}

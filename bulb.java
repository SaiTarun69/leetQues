package sample;

public class bulb {

	public static void main(String[] args) {
		int[] A= {1,3,4,2,5};
		int i=bulbFun(A);
		System.out.println("vaue is"+i);

	}
	
	public static int bulbFun(int[] A) {
		int count=0;
		int[] temp=new int[A.length];
		for(int i=0; i<A.length; i++) {
			int j=A[i];
			temp[A[i]-1]=-1;
			if(j==1) count=1;
			else {
				boolean flag=true;
				while(j>0) {
					//System.out.println(temp[j-1]);
					if(temp[j-1]!=-1) {
						flag=false;
						break;
					}
					j--;
				}
				if(flag==true) {
					count++;
					//System.out.println(A[i]);
				}
			}
		}
		return count;
	}

}

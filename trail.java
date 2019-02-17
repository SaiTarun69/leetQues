package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class trail {

	public static void main(String[] args) throws IOException{
		/*LinkedList<Integer> list = new LinkedList<>();
	    list.add(7);
	    list.add(7);
	    list.add(1,6);
	    list.add(0,5);
	    list.add(1,5);
	    list.add(4,4);
	    System.out.println(list);*/
		
		/*String a="8+-7i+67p";
		int[] s1=Stream.of(a.split("\\+|i\\+|p")).mapToInt(Integer::parseInt).toArray();
		for(int i=0; i<s1.length; i++) System.out.println(s1[i]);*/
		/*int l=90;
		System.out.println(Integer.toBinaryString(l));
		l=7;
		System.out.println(Integer.toBinaryString(l));
		l=83;
		System.out.println(Integer.toBinaryString(l));*/
		InputStreamReader re=new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in=new BufferedReader(re);
		String line=in.readLine();
		boolean intflag=false;
		boolean charflag=false;
		//int prev=
		//List<Integer> intli=new ArrayList<>();
		//List<Character> charli=new ArrayList<>();
		/*while((line=in.readLine())!=null) {
			System.out.println(line);
		}*/
		//System.out.println(line);
		for(int i=0; i<line.length(); i++) {
			if(line.charAt(i)>=40&&line.charAt(i)<=47) {
				charflag=true;
				intflag=false;
			}
			if(line.charAt(i)>=48&&line.charAt(i)<=57) {
				charflag=false;
				intflag=true;
			}
			if(charflag) {
				
				//charli.add(line.charAt(i));
			}
//			if(intflag) {
//				int temp=line.charAt(i)-48;
//				if(intli.size()==0) {
//					intli.add(temp);
//				}
//				else if(){
//					
//				}
//			}
		case '^': return Math.pow(a, b);
			System.out.println("ksd"+String.valueOf(5^6));
		}
	}

}

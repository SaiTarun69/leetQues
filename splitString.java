package sample;

import java.util.stream.Stream;

public class splitString {
	public String complexNumberMultiply(String a, String b) {
        int[] s1=Stream.of(a.split("\\+|i")).mapToInt(Integer::parseInt).toArray();
        int[] s2=Stream.of(b.split("\\+|i")).mapToInt(Integer::parseInt).toArray();
        return (s1[0]*s2[0]-s1[1]*s2[1])+"+"+(s1[0]*s2[1]+s1[1]*s2[0])+"i";
    }
}

package Programming;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String str1 = "army";
		String str2 = "maary";
		
		char[] str11 = str1.toCharArray();
		char[] str22 = str2.toCharArray();
		Arrays.sort(str11);
		Arrays.sort(str22);
		if(Arrays.equals(str11, str22)) {
			System.out.println("Given String Anagram");
		}else {
			System.out.println("Given String Not a Anagram");
		}
	}
}
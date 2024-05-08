package Programming;

import java.util.HashMap;

public class NumOfWordsPresentInGivenString {

	public static void main(String[] args) {
		
		String str = "Hi Hello How here are Hi you comes to meet here";
		
		int count = 1;
	//	String[] arr = str.split(" ");
		char[] arr = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<arr.length;i++) {
			
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		for(Character x:map.keySet()) {
			System.out.println("count of words:"+ x+ "=" + map.get(x));
		}

	}

}


public class Programms {

	public static void main(String[] args) {
	
		String str = "welcomes you on site";
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Reverse:"+sb.reverse());
		
		String[] arr = str.split(" ");
		for (String word : arr) {
			String rev ="";
			int j = word.length()-1;
			
			while(j>=0) {
				 char ch = word.charAt(j);
				 
				 rev = rev + ch;
				 j--;
			}
			System.out.print(rev + " ");
			
		}
		
//		Uppercase(str);
//		String[] str1 = {"welcomes", "you", "on", "site"};
//		System.out.println(String.join("", str1));
//		String s = String.join("|", str1);
	}
	
	
	public static void Uppercase(String str) {
		String rev ="";
		String[] arr = str.split(" ");
		
		for(String word: arr) {
			
			String firstChar = word.substring(0, 1).toUpperCase();
		    String second =  word.substring(1);
		    rev = rev + firstChar + second + " ";
		}
		System.out.println(rev);
	}

}

package Programming;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str = "Hi Hello How are you";
		String[] arr =  str.split(" ");
		String result ="";
		for(String word:arr) {
			String rev = "";
			int j = word.length()-1;
			while(j>=0) {
			  char ch = word.charAt(j);
			  rev =  rev + ch +"";
			  j--;
			}
			result = result + rev + " ";
			System.out.print(rev+ " ");
			
		}
		
		//System.out.println(result);
		
	}
}
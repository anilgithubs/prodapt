package Programming;

public class CharAccuranceGivenString {

	public static void main(String[] args) {
		String str = "Hi Hello How here are Hi you comes to meet here";
		
		int result = str.length()-str.replaceAll("e", "").length();
		System.out.println(result);
	}
}

package Programming;

public class AlphaNumeric {

	public static void main(String[] args) {
		String str = "1dhdnJSFSK@#$^&##%2353GDsnd";
		String alpha ="";
		String spl ="";
		String numeric ="";
		
		for(int i=0;i<str.length();i++) {
			
			if((str.charAt(i)>='a'&& str.charAt(i)<='z') || (str.charAt(i)>='A'&& str.charAt(i)<='Z')) {
				
				alpha = alpha+str.charAt(i);
			}else if ((str.charAt(i)>= '0' && str.charAt(i)<='9')) {
				numeric = numeric + str.charAt(i);
			}else {
				spl = spl + str.charAt(i);
			}
		}
		
		System.out.println(alpha);
		System.out.println(spl);
		System.out.println(numeric);
	}
}

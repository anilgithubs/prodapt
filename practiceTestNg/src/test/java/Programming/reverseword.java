package Programming;

public class reverseword {

	public static void main(String[] args) {
		
		String str = "Hi hello";
		String[] rev = str.split(" ");
		String revs1 ="";
		for(int i=str.length()-1;i>=0;i--){
			
	     revs1 = revs1 + str.charAt(i);
		
		}
		System.out.println(revs1);
	}
	
}

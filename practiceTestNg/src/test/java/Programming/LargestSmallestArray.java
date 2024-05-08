package Programming;

public class LargestSmallestArray {

	public static void main(String[] args) {
		int[] arr = {5,6,7,8,9,10,12,24};
		
		int largest = arr[0];
		int smallest = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}else if(arr[i]>smallest) {
				smallest = arr[i];
			}
		}
		
		System.out.println(largest);
		System.out.println(smallest);
		
	}
}

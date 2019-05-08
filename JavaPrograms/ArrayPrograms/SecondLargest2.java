package ArrayPrograms;

public class SecondLargest2 {

	public static void main(String[] args) {
		
		int[] a = {8,5,2,3,4,7,10,11};
		
		int largest = Integer.MIN_VALUE;
		int second_largest = Integer.MIN_VALUE;
		
		for(int i =0;i<a.length;i++) {
			
			if(a[i]>largest) {
				
				second_largest = largest;
				largest = a[i];
			}
			else if(a[i]>second_largest && a[i]!=largest) {
				
				second_largest = a[i];
			}
		}
		System.out.println("The Second Largest number in given array is: "+second_largest);
		
	}
}

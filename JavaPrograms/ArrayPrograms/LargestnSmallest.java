package ArrayPrograms;

public class LargestnSmallest {

	public static void main(String[] args) {
		
		int[] a = {32,64,23,12,34,55,41,97};
		
		int largest = a[0];
		int smallest = a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]>largest) {
				
				largest = a[i];
				
			}
			else if(a[i]<smallest) {
				
				smallest = a[i];
			}
		}
		System.out.println("The Largset nmber is: "+largest);
		
		System.out.println("The smallest nmber is: "+smallest);
		
	}

}

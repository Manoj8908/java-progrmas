package ArrayPrograms;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] a = {8,5,2,3,4,7,10,11};
		
		int temp;
		
		for(int i =0;i<a.length;i++) {
			
			for(int j = i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i =0;i<a.length;i++) {
			
			System.out.println(a[i]+"");
		}
		System.out.println("The second largest number is:"+a[1]);

	}

}

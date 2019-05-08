package Programs;

public class SwapNumber {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		System.out.println("Before Swapping the values are x:"+x+"y:"+y);
		
		x = x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After Swapping x:"+x+"y:"+y);
	}

}

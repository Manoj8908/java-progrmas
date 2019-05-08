package ArrayPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int number = 54324;
		int rem,rev=0;
		
		while(number!=0) {
			
			rem = number/10;
			
			rev = rev*10+rem;
			
			number = number%10;
		}
		System.out.println("The Reverse number is:"+rev);
	}

}

package Programs;

import java.util.Scanner;

public class Febonacci {

	public static void main(String[] args) {
		
		System.out.println("Enter the starting Range:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the End Range:");
		int r = sc.nextInt();
		
		int res = 0;
		
		if (n % 2 == 0) {
			
			n += 1;
		for(int i = n;i<=r;i+=2) {
			if (isPerfectSquare(5 * i * i + 4) || isPerfectSquare(5 * i * i - 4))
                res = i;
			
			 }
		System.out.println("The largest odd number in the range is"+"  "+res);
	}
		}
	
	 public static boolean isPerfectSquare(int num) {
	        double sqrt = Math.sqrt(num);
	        int x = (int)sqrt;
	        return Math.pow(sqrt, 2) == Math.pow(x, 2);
	    }
	}



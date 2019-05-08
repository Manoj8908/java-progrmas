package moolya;

import java.util.Scanner;

public class febonacy {

	public static void main(String[] args) {
		
		System.out.println("Enter the starting Range:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the Ending Range:");
		int r = sc.nextInt();
		
		int res = 0;
		if(n%2==0) {
			
			n+=1;
			for(int i = n;i<=r;i++) {
				if(isPerfectSquare(5*i*i+4)|| isPerfectSquare(5*i*i-4)) {
					res = i;
				}
			}
			System.out.println("The largest odd febo num:"+res);
		}

	}
	public static boolean isPerfectSquare(int num)
	{
		double sqrt = Math.sqrt(num);
		int x = (int)sqrt;
		return Math.pow(sqrt, 2) == Math.pow(x,2);
	}
}

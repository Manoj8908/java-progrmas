package moolya;

import java.util.Scanner;

public class mutiplethree {

	public static void main(String[] args) {
		
		System.out.println("Enter the starting Range:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the ending Range:");
		int r = sc.nextInt();
		
		for(int i = n;i<=r;i++) {
			
			if(i%3==0) {
				System.out.println("CLOUD");
			}
			else if(i%7==0) {
				System.out.println("NIX");
			}
			else if(i%3==0 && i%7==0) {
				System.out.println("CLOUDNIX");
			}
			else {
			System.out.println(i);
		}
	}
	}
}


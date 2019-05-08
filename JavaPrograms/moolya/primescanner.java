package moolya;

import java.util.Scanner;

public class primescanner {

	public static void main(String[] args) {
		
		int temp=0,i,j;
		
		System.out.println("Enter the Start Range:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the end Range:");
		int r = sc.nextInt();
		
		for(i=n;i<=r;i++) {
			
			for(j=2;j<i;j++) {
				
				if(i%j==0) {
					temp=0;
					break;
				}
				else {
					
					temp = 1;
				}
			}
			if(temp==1) {
				System.out.println(i);
			}
		}
	}

}

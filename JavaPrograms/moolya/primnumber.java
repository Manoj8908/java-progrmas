package moolya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class primnumber {

	public static void main(String[] args) throws IOException {
		
		BufferedReader prime = new BufferedReader(new InputStreamReader(System.in));
		String CPN; 
        int i,x,Number; 
        System.out.print("Check Number to Prime or Not : "); 
        CPN=prime.readLine(); 
        Number=Integer.parseInt(CPN); 
        x=0; 
        for(i=2;i<=Number-1;i++) 
        { 
                   if(Number%i==0) {
                	   
                	   x=x+1;
                   }
        } 
        if(x==0) {
        	System.out.println(Number+"is a prime number");
        }
        else {
        	System.out.println(Number+"is not a prime number");
        }
		
	
		
	}

}

package Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int n,f1,f2,f3;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no.of elements in Fibonacci series: ");
        n = Integer.parseInt(br.readLine());
        f1=4000;
        f2=11000;
        if(n>0)
        {
            System.out.println("Fibonacci Series:");
            for(int i=0; i<n; i++)
            {
                System.out.println("\t"+f1);
                f3=f1+f2;
                f1=f2;
                f2=f3;
            }
        }
        else
            System.out.println("You Entered the Wrong Number...");
	}

}

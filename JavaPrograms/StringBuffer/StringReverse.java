package StringBuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StringReverse {

	public static void main(String[] args) throws IOException {
		
		BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
		
		String SPN ;
		
		System.out.println("Enter the String to reverse:");
		
		SPN = str.readLine();
		
		StringBuffer bf = new StringBuffer(SPN);
		System.out.println("The Reversed String is ***");
		bf.reverse();
		System.out.println(bf);
	}

}

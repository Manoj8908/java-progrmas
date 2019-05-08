package Programs;

import java.io.FileInputStream;

public class ReverseByBuffer {

	public static void main(String[] args) {
		
		StringBuffer bf = new StringBuffer("Hello");
		bf.reverse();
		System.out.println(bf);

	}

}

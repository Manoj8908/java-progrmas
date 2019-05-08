package JavafileHandle;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		
		try {
			FileOutputStream Fops = new FileOutputStream("E:\\Selinium\\Java programs\\IOFolder\\testout.txt");
			
			String s = "Welcome this is FileHandling Output Text";
			
			byte b[] = s.getBytes();
			
			Fops.write(b);
			Fops.close();
			System.out.println("Entered text ");
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e);
		}

	}

}

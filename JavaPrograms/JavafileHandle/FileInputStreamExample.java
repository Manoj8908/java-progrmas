package JavafileHandle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) throws IOException {
		
		try {
			FileInputStream fis = new FileInputStream("E:\\Selinium\\Java programs\\IOFolder\\testout.txt");
			
			int i =0;
			while((i=fis.read())!=-1) {
				System.out.println((char)i);
						}
			
			fis.close();
		} catch (FileNotFoundException e) {
			
			System.out.println(e);
		}
	}

}

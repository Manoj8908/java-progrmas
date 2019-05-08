package JavafileHandle;

import java.io.BufferedOutputStream;

import java.io.FileOutputStream;

public class BufferedOutputStreamExamp {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fis = new FileOutputStream("E:\\Selinium\\Java programs\\IOFolder\\testout.txt");
		BufferedOutputStream bfs = new BufferedOutputStream(fis);
		
		String S = "Buffered example";
		byte b[] = S.getBytes();
		
		bfs.write(b);
		bfs.flush();
		bfs.close();
		
		fis.close();
		
		System.out.println("Succes");
	}

}

package psr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		parse(null);

	}
	
	public static void parse(File file) throws IOException {
		   RandomAccessFile input = null;
		   String line = null;
		   try {
		       input = new RandomAccessFile(file, "r");
		       while ((line = input.readLine()) != null) {
		           System.out.println(line);
		       }
		       return;
		   } finally {
		       if (input != null) {
		           input.close();
		       }
		   }
		}

}

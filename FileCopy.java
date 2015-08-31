package edu.wbqa.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream instream = new FileInputStream("C:/Users/Prashanti/Desktop/1.txt");
		FileOutputStream outstream = new FileOutputStream("C:/Users/Prashanti/Desktop/2.txt");
		try {
			byte[] buffer = new byte[1024];

			int length;
			while ((length = instream.read(buffer)) > 0) {
				outstream.write(buffer, 0, length);
			}

			instream.close();
			outstream.close();

			System.out.println("File copied successfully!!");

		} catch (IOException io) {
			io.printStackTrace();
		}
	}
}

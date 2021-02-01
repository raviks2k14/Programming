package Filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaByteStreamsReadWrite {

	public static void main(String[] args) {
		String inputFilePath = "/Users/ravikumarks/Desktop/Reading/filesforprograms/input.txt";
		String outputFilePath = "/Users/ravikumarks/Desktop/Reading/filesforprograms/output.txt";

		JavaByteStreamsReadWrite obj = new JavaByteStreamsReadWrite();
		try {
			obj.writeToFile(inputFilePath, outputFilePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void writeToFile(String inputFilePath, String outputFilePath)
			throws IOException {
		FileInputStream fis = null; // Used to read 8 bit byte
		FileOutputStream fos = null; // Used to write 8 bit byte

		try {
			System.out
					.println("Started initializing the File input and output streams...");
			fis = new FileInputStream(new File(inputFilePath));
			fos = new FileOutputStream(new File(outputFilePath));
			int c = 0;
			System.out.println("Started reading, writing to files...");
			while ((c = fis.read()) != -1) {
				fos.write(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				fos.close();
			}
			if (fis != null) {
				fis.close();
			}
		}

	}
}

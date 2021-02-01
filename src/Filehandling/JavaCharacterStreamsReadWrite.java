package Filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaCharacterStreamsReadWrite {

	public static void main(String[] args) {
		String inputFilePath = "/Users/ravikumarks/Desktop/Reading/filesforprograms/input.txt";
		String outputFilePath = "/Users/ravikumarks/Desktop/Reading/filesforprograms/output.txt";

		JavaCharacterStreamsReadWrite obj = new JavaCharacterStreamsReadWrite();
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
		FileReader fr = null; // Used to read 16 bit unicode
		FileWriter fw = null; // Used to write 16 bit unicode

		try {
			System.out
					.println("Started initializing the File input and output streams...");
			fr = new FileReader(new File(inputFilePath));
			fw = new FileWriter(new File(outputFilePath));
			int c = 0;
			System.out.println("Started reading, writing to files...");
			while ((c = fr.read()) != -1) {
				fw.write(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				fw.close();
			}
			if (fr != null) {
				fr.close();
			}
		}

	}
}

package Filehandling;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInputStreamReaderStandardStreams {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = null; // Used to read bytes and decodes it to
										// char

		try {
			isr = new InputStreamReader(System.in); // Standard input : reading from Keyboard
													// input
			System.out.println("Enter the characters and when done, press 'q' to quit");
			char c;
			do {
				c = (char) isr.read();
				System.out.println(c); //Standard Output
			} while (c != 'q');

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (isr != null) {
				isr.close();
			}
		}

	}

}

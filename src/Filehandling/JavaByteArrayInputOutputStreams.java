package Filehandling;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class JavaByteArrayInputOutputStreams {

	public static void main(String[] args) throws IOException {
		// The ByteArrayInputStream class allows a buffer in the memory to be
		// used as an InputStream. The input source is a byte array.
		ByteArrayOutputStream bOutput = new ByteArrayOutputStream(5);

		while (bOutput.size() < 5) {
			bOutput.write("hello".getBytes());
		}

		// byte b[] = "hello".getBytes(); --> This is the easy way
		byte b[] = bOutput.toByteArray();

		System.out.println("Print the content");

		for (int x = 0; x < b.length; x++) {
			// printing the characters
			System.out.print((char) b[x] + "   ");
		}
		System.out.println("   ");

		int c;
		ByteArrayInputStream bInput = new ByteArrayInputStream(b);
		System.out.println("Converting characters to Upper case ");

		while ((c = bInput.read()) != -1) {
			System.out.println(Character.toUpperCase((char) c));
		}

	}

}

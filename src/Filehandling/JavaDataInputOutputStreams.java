package Filehandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaDataInputOutputStreams {

	public static void main(String[] args) throws IOException {

		DataOutputStream dOutput = new DataOutputStream(
				new FileOutputStream(
						"/Users/ravikumarks/Desktop/Reading/filesforprograms/input.txt"));
		DataInputStream dataIn = null;
		try {
			dOutput.writeUTF("Hello");

			// Reading data from the same file
			dataIn = new DataInputStream(
					new FileInputStream(
							"/Users/ravikumarks/Desktop/Reading/filesforprograms/input.txt"));
			while (dataIn.available() > 0) {
				String k = dataIn.readUTF();
				System.out.print(k + " ");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(dataIn != null){
				dataIn.close();
			}
			if(dOutput != null){
				dOutput.close();
			}
		}

	}

}

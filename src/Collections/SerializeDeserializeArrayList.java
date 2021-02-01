package Collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeDeserializeArrayList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		List<String> al = new ArrayList<String>();
		al.add("Boston");
		al.add("Dallas");
		al.add("New York");

		System.out.println("Arraylist to serialize\n");
		for (String str : al) {
			System.out.println(str);
		}

		// Serialization starts

		System.out.println("\nSerialization starts\n");
		try {
			FileOutputStream fos = new FileOutputStream(
					"/Users/ravikumarks/Documents/Practice/Programming/inputfile");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			oos.close();
			fos.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		System.out.println("\nSerialization ends :) \n");
		
		// De-serialization starts
		List<String> arraylist = new ArrayList<String>();
		System.out.println("\nDe-serialization starts\n");
		try {

			FileInputStream fis = new FileInputStream(
					"/Users/ravikumarks/Documents/Practice/Programming/inputfile");
			ObjectInputStream ois = new ObjectInputStream(fis);
			arraylist = (ArrayList<String>) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\nDe-serialization ends :)\n");

		System.out.println("\nArraylist de-serialized\n");

		for (String str : arraylist) {
			System.out.println(str);
		}

	}

}

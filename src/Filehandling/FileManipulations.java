package Filehandling;

import java.io.File;
import java.io.IOException;

public class FileManipulations {

	public static void main(String[] args) throws IOException {
		File file = null;
		String strArray[] = new String[] {
				"/Users/ravikumarks/Desktop/Reading/filesforprograms/input.txt",
				"/Users/ravikumarks/Desktop/Reading/filesforprograms/output.txt" };
		try {
			for (String s : strArray) {
				file = new File(s);
				System.out.println("\nFile :" + file);
				System.out.println("Can Execute? " + file.canExecute());
				System.out.println("Can Read? " + file.canRead());
				System.out.println("Can Write? " + file.canWrite());
				System.out.println("Exists? " + file.exists());
				System.out.println("Absolute Path: " + file.getAbsolutePath());
				System.out.println("Canonical Path: " + file.getCanonicalPath());
				System.out.println("File Name: " + file.getName());
				System.out.println("Parent: " + file.getParent());
				System.out.println("Path: " + file.getPath());
				System.out.println("Total Space: " + file.getTotalSpace());
				System.out.println("is directory? " + file.isDirectory());
				System.out.println("is file? " + file.isFile());
				System.out.println("is hidden? " + file.isHidden());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

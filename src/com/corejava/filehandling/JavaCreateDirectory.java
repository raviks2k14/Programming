package com.corejava.filehandling;

import java.io.File;

public class JavaCreateDirectory {

	public static void main(String[] args) {
		String dirString = "/Users/ravikumarks/Desktop/Demo/Dir1/Dir2/Dir3";
		File file = null;

		try {
			file = new File(dirString);
			file.mkdirs();
			//file.mkdir(); --> For creating a single directory but the above directory path should be proper
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

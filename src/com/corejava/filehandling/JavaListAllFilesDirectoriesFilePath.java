package com.corejava.filehandling;

import java.io.File;

public class JavaListAllFilesDirectoriesFilePath {

	public static void main(String[] args) {
		File file = null;
		String strs[] = new String[200];
		try{
			file = new File("/Users/ravikumarks/Desktop/Personal");
			strs = file.list();
			System.out.println("Printing file names under above file path...");
			for(String str : strs){
				System.out.println(str);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

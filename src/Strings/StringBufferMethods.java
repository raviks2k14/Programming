package Strings;

import java.util.Scanner;

public class StringBufferMethods {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inp = null;
		String demoStr = null;
		try {
			System.out.println("Enter the demo string");
			demoStr = scanner.next();
			System.out.println("Enter the action to be performed");
			if (scanner.hasNext())
				inp = scanner.next();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}

		switch (inp) {
		case "append":
			appendToString(demoStr, "Hello Ravi!!!");
		}
	}

	public static void appendToString(String actualStr, String strToAppend) {
		StringBuffer sb = new StringBuffer(actualStr);
		System.out.println(sb.append(strToAppend));
	}

}

package Miscellaneous;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {

	public static void main(String[] args) {
		Date date = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

		System.out.println("Current Date and Time using simple date format : " + sdf.format(date));
		
		//Note : sdf.parse(String) - This is used to parse string date to the required date format
	}

}

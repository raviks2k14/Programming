package com.corejava.miscellaneous;

public class JavaArmstrong {

	public static void main(String[] args) {
		isNumberArmstrong(372);
	}
	
	public static void isNumberArmstrong(Integer number){
		String str = number.toString();
		int eachDigitVal = 0;
		Integer intArray[] = new Integer[str.length()];
		for(int i = 0 ; i< str.length() ; i++){
			eachDigitVal = Integer.parseInt(Character.toString(str.charAt(i)));
			eachDigitVal = eachDigitVal*eachDigitVal*eachDigitVal;
			intArray[i] = eachDigitVal;
			eachDigitVal = 0;
		}
		
		int finalCount = 0;
				
		for(int j : intArray){
			finalCount += j;
		}
				
		if(number == finalCount){
			System.out.println("The number "+number+" is a Armstrong number");
		}else{
			System.out.println("The number "+number+" is NOT a Armstrong number");
		}
		
	}

}

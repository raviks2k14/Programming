package com.corejava.strings;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MaxOccuringCharInString {

	public static void main(String[] args) {
		String testString = "The earliest meaning of English bully was “sweetheart.” The word was probably borrowed from Dutch boel, “lover.” Later bully was used for anyone who seemed a good fellow, then for a blustering daredevil. Today, a bully is usually one whose claims to strength and courage are based on the intimidation of those who are weaker.";
		String replacedString  = testString.replaceAll("\\s", ""); //Regex for whitespace is \\s
		
		//Convert the string to char array
		char[] charArray = replacedString.toCharArray();
		
		//declare the hashmap to store the char as the key and the occurance as its value
		HashMap<Character, Integer> hashMapString = new HashMap<>();
		
		//Iterate through the char array and store the data to the hash map
		for(char c : charArray){
			if(!(hashMapString.containsKey(c))){
				hashMapString.put(c, 1);
			}else{
				hashMapString.put(c, hashMapString.get(c)+1);
			}
		}
				
		//Convert HashMap to Entry Set to iterate
		Set<Entry<Character, Integer>> entrySet = hashMapString.entrySet();
		HashMap<Character, Integer> charsWithSameCount = new HashMap<>();
		int maxCountofCharacter = 0;
		
		for(Entry<Character, Integer> entry : entrySet){
			if((int)entry.getValue() == maxCountofCharacter){
				charsWithSameCount.put((char)entry.getKey(), (int)entry.getValue());
			}
			else if((int)entry.getValue() > maxCountofCharacter){
				maxCountofCharacter = (int)entry.getValue();
				charsWithSameCount.clear();
				charsWithSameCount.put((char)entry.getKey(), (int)entry.getValue());
			}
		}
				
		Set<Entry<Character, Integer>> finalEntrySet = charsWithSameCount.entrySet();
		System.out.println("The maximum occuring character(s) and their count in the below String \n\""+testString+"\" \nis : "+finalEntrySet.toString());
		
	}

}

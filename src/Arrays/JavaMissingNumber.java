package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaMissingNumber {

	static List<Integer> iList = null;

	public void buildList(Integer[] testArray) {
		iList = new ArrayList<Integer>();

		for (int i = 0; i < testArray.length + 1; i++) {
			iList.add(i);
		}

		checkMissingNumber(testArray);
	}

	public void checkMissingNumber(Integer[] testArray) {
		List<Integer> srcList = Arrays.asList(testArray);
		
		for(Integer checkInt : iList) {
			if(!srcList.contains(checkInt)) {
				System.out.println("The missing number is : "+checkInt);
			}
		}
		
	}

	public int getMissingNumber(Integer[] testArray) {
		Arrays.sort(testArray);
		for (int i = 0; i < testArray.length; i++) {
			if (i < testArray.length - 1) {
				int diff = testArray[i + 1] - testArray[i];
				if (diff > 1) {
					return testArray[i] + 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		JavaMissingNumber jmn = new JavaMissingNumber();
		Integer[] testArray = new Integer[] { 0};
		jmn.buildList(testArray);
		//System.out.println(jmn.getMissingNumber(testArray));
	}

}

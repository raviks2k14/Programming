package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPrograms {

	public static void main(String[] args) {
		
		Set<String> strSet = new HashSet<>();
		strSet.add("Apple");
		strSet.add("Infosys");
		strSet.add("CTS");
		strSet.add("Wipro");
		strSet.add("TCS");
		strSet.add("TCS");//This value wont be added since hashset doesn't allow duplicates.
		
		//1st way of iteration
		Iterator<String> i = strSet.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		System.out.println("\n");
		
		//2nd way of iteration
		for(String str : strSet){
			System.out.println(str);
		}
		
	}

}

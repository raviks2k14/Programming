package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBasics {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<>();
		alist.add("Ravi");
		alist.add("Greeshu");
		alist.add("Pratibha");
		alist.add("Appaji");
		alist.add("Mummy");
		alist.add("Pavan");

		for (String str : alist) {
			System.out.println(str);
		}

		System.out.println(alist.get(3));

		//clone arraylist
		ArrayList<String> clist1 = (ArrayList<String>) alist.clone();

		System.out.println("Cloned Arraylist : "+clist1);

		alist.add(6, "New member");

		System.out.println("Original Arraylist : "+alist);
		
		//check if it contains the string
		System.out.println(alist.contains("Ravi"));
		
		//The ensureCapacity() method is used to increase the capacity of this ArrayList instance, 
		//if necessary, to ensure that it can hold at least the number of elements 
		//which is not smaller than the specified size. Here 6 is the minimum capacity the arraylist should have. 
		//Anything less than this number will result in an exception
		alist.ensureCapacity(6);
		
		alist.add(7, "New member");
		
		System.out.println("Original Arraylist : "+alist);
		
		//Sublist of the arraylist
		List<String> subList = alist.subList(0, 2);
		
		System.out.println("Sub list : "+subList);
		
		//Conversion of an arraylist to an array using toArray() method
		String strArray[] = alist.toArray(new String[alist.size()]);
		
		System.out.println("String Array : "+strArray.length);
		
		List<String> newList = Arrays.asList(strArray);
		
		System.out.println("List : "+newList);
		
		alist.clear();
		
		System.out.println("Original Arraylist : "+alist);
		
	}

}

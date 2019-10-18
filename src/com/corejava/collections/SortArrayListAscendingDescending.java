package com.corejava.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayListAscendingDescending {

	public static void main(String[] args) {
		 /*Creating String ArrayList Object*/
	    ArrayList<String> countrieslist = new ArrayList<String>();
	    countrieslist.add("USA");
	    countrieslist.add("UK");
	    countrieslist.add("India");
	    countrieslist.add("Canada"); 
	    countrieslist.add("Japan"); 
	    
	    /*Unsorted Countries List*/
	    System.out.println("\nCountries List Before Sorting:");
	    for(String counter: countrieslist){
	        System.out.println(counter);
	    }

	    /* Sort ArrayList using 
	       Collections.sort(list) method*/
	    Collections.sort(countrieslist);

	    /* Ascending Sorted Countries List*/
	    System.out.println("\nCountries List After Sorting:");
	    for(String counter: countrieslist){
	       System.out.println(counter);
	    }
	    
	    Collections.sort(countrieslist, Collections.reverseOrder());
	    
	    /* Descending Sorted Countries List*/
	    System.out.println("\nCountries List After Sorting Descending:");
	    for(String counter: countrieslist){
	       System.out.println(counter);
	    }

	}

}

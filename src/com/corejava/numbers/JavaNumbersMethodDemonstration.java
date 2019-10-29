package com.corejava.numbers;

public class JavaNumbersMethodDemonstration {

	public static void main(String[] args) {
		Integer x = 10;

		// xxxValue() 
		System.out.println("Demonstrating intValue() method : " + x.intValue());
		System.out.println("Demonstrating floatValue() method : " + x.floatValue());
		System.out.println("Demonstrating longValue() method : " + x.longValue());
		System.out.println("Demonstrating byteValue() method : " + x.byteValue());
		System.out.println("Demonstrating doubleValue() method : " + x.doubleValue());

		// compareTo() 
		Integer a = 3;
		Integer b = 10;
		Integer c = 15;
		
		System.out.println(x.compareTo(a)); //Prints 1 since 10>3
		System.out.println(x.compareTo(b)); //Prints 0 since 10=10
		System.out.println(x.compareTo(c)); //Prints -1 since 10<15
		System.out.println(Integer.compare(b, a));
		
		// equals() 
		Short d = 12;
		System.out.println(x.equals(a)); //false
		System.out.println(x.equals(b)); //true
		System.out.println(x.equals(c)); //false
		System.out.println(x.equals(d)); //false : since the data types doesn't match
		
		//valueOf() 
		Integer e = Integer.valueOf(10); //Converts int primitive 10 to Integer object
		Double f = Double.valueOf(5); //Converts double primitive 5 to Double object
	    Float g = Float.valueOf("80"); //Converts string "80" to Float object
	    Integer h = Integer.valueOf("444",16); //This returns an Integer object holding the integer value of the specified string representation, parsed with the value of radix.
	    
	    System.out.println(e);System.out.println(f);System.out.println(g);System.out.println(h);
	    
	    //toString() - String equivalent of String
	    System.out.println(x.toString());
	    System.out.println(Integer.toString(12));
	    
	    //parseInt() - String to int primitive
	    String s = "10";
	    System.out.println(Integer.parseInt("20"));
	    System.out.println(Integer.parseInt(s));
	    double j = Double.parseDouble("5");
	    
	    float p = 5.85f;
	    double q = 100.865;
	    
	    System.out.println(Math.floor(p));
	    System.out.println(Math.ceil(p));
	    System.out.println(Math.floor(q));
	    System.out.println(Math.ceil(q));
	    
	    //random()
	    System.out.println(Math.random()); // Returns a double value >0.0 and <1.0 
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}

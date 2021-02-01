package Miscellaneous;

public class JavaFactorial {

	// method to find factorial of given number 
    static int factorial(int n) 
    { 
        if (n != 0) {
        	return n * factorial(n - 1);  
        } else {
        	return 1;
        }
        
    } 
  
    // Driver method 
    public static void main(String[] args) 
    { 
        int num = 5; 
        System.out.println( 
            "Factorial of " + num 
            + " is " + factorial(5)); 
    } 

}

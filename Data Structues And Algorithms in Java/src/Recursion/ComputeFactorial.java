package Recursion;
//Program for computing the factorial of user input

import java.util.Scanner;

public class ComputeFactorial {
	//Program for computing the factorial of user input
	
	public static void main(String[] args) {
		//Create Scanner for user input
		Scanner input = new Scanner(System.in); 
		System.out.println("FACTORIAL CALCULATOR\n Enter a nonnegative integer:");
		int n = input.nextInt();
		
		//Display factorial 
		System.out.println("The factorial of " + n + " is " + factorial(n));
	} //end main()
	
	//Return the factorial for the specified number
	public static long factorial(int n) { //This method runs until n = 0, in which case 1 will be returned
		if(n == 0) //Base case. 0! = 1
			return 1; 
		else
			return n * factorial(n-1); //Recursive call (function calls itself)
		
		/*NOTE: A Recursive method must has a Base Case specified to avoid an infinite recursion.
		 * Infinite Recursion leads to StackOverflowError*/
	} //end factorial()
	
//..........................................
}

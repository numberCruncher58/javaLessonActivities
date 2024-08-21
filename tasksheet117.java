/*
	
	T A S K    S H E E T   1 - 1 - 7
	21 / 08 / 24

*/

import java.util.Scanner;

public class tasksheet117{
	
	public static void main(String[] args){
		
		int arrayIndexOfTheLargestNumber = -1;
		int[] arrayOfNumbers = new int[3];
		Scanner numberInput = new Scanner(System.in);
		
			
		// accept 3 number inputs
		System.out.print("Enter your first number: ");
		arrayOfNumbers[0] = numberInput.nextInt();
		
		System.out.print("Enter your second number: ");
		arrayOfNumbers[1] = numberInput.nextInt();
		
		System.out.print("Enter your third number: ");
		arrayOfNumbers[2] = numberInput.nextInt();
		
		// compare first if they're all have the same number
		if ((arrayOfNumbers[0] == arrayOfNumbers[1]) && (arrayOfNumbers[1] == arrayOfNumbers[2])){			
			System.out.print("All numbers are equal.");
		} else {																							
		// if not then find the largest number and print it on the console
			if (arrayOfNumbers[1] > arrayOfNumbers[0]){
				arrayIndexOfTheLargestNumber = 1;
			} 
			
			if (arrayOfNumbers[2] > arrayOfNumbers[1]){
				arrayIndexOfTheLargestNumber = 2;
			}
			
			if (arrayOfNumbers[0] > arrayOfNumbers[2]){
				arrayIndexOfTheLargestNumber = 0;
			}
			
			System.out.println("The largest value is " + arrayOfNumbers[arrayIndexOfTheLargestNumber]);
			
		}
		
	}
	
};

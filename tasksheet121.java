import static java.lang.Math.*;
import java.util.Scanner;

class Task119{
	
	private static int firstNumber  = 0;
	private static int secondNumber = 0;
	
		public static void main(String[] args){
		
			Scanner numericalInput = new Scanner(System.in);
		
			System.out.print("Enter first number: ");
			firstNumber = numericalInput.nextInt();
		
			System.out.print("Enter second number: ");
			secondNumber = numericalInput.nextInt();
			
			System.out.println();
			
			System.out.println("Sum: " + add(firstNumber, secondNumber));
			System.out.println("Difference: " + subtract(firstNumber, secondNumber));
			System.out.println("Product: " + multiply(firstNumber, secondNumber));
			System.out.println("Quotient: " + divide(firstNumber, secondNumber));
			
			System.out.println();
			
		}
	
		public static int add(int a, int b){
			return Math.addExact(a, b);
		}
		
		public static int subtract(int a, int b){
			return Math.subtractExact(a, b);
		}
		
		public static int multiply(int a, int b){
			return Math.multiplyExact(a, b);
		}
		
		public static float divide(int a, int b){
			return Math.floorDiv(a, b);
		}
	
};
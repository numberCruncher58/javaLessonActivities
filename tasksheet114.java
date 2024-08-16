/*

	TASKSHEET 1-1-4

	INSTRUCTION: Given a function of " (i%2==0) ? 'even' : 'odd' ; ",you should be able to write a program that will check each number if the given numbers are odd or even numbers, print them, and compile it to run in a java virtual machine without errors following Java Standard Edition specification.

*/


public class tasksheet114 {
	
	static final int     check_number = 10;
	static       String  message;
	
	public static void main(String[] args) {
		
		for (byte i = 1; i <= check_number; i++){
		
			message = ((i % 2) == 0) 
			          ? 
			             i + " is an even number"
			          :
			             i + " is an odd number";
			
			System.out.println(message);
		
		}
		
	}
	
};

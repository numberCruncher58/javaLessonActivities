public class tasksheet116 {
	
	public static void main(String[] args) {
		
		String stringInput = "bob";
		StringBuilder reverseString = new StringBuilder(stringInput);
		
		/////
		
		reverseString.reverse();
		
		if (reverseString.toString().equals(stringInput)){
			System.out.println("The input string is a palindrome.");	
		} else {
			System.out.println("The input string is not a palindrome.");	
		}
			
	}
	
};

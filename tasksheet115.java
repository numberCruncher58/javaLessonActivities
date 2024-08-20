public class tasksheet115 {
	
	public static void main(String[] args) {
		
		/* Both object 'a' and 'b' refer to the same 
		string on same memory loc.*/
		String a = "Wow";       
		String b = a;       
		
		/* Make object 'c' to have a unique string */
		String c = "tasksheet115";    
		
		/* Make object 'd' to have the same string as 
		object 'b' but with a concatenated exclamation mark */
		String d = b + "!";      

		/* Bool primitives should contains 'true' values */
		boolean b1 = a == b;
		boolean b2 = d.equals(b + "!");       
		boolean b3 = !c.equals(a);        

		if (b1 && b2 && b3) {
			System.out.println("Success!");   
		}
		
	}
	
};

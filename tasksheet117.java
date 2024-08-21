package World;

public class Human {
	
	private int ageOfHuman;
	private String statusOfHuman;
	
	public Human(int a, String s){
		ageOfHuman = a;
		statusOfHuman = s;
	}
	
	public int getAge(){
		return ageOfHuman;
	}
	
	public void setAge(int a){
		ageOfHuman = a;
	}
	
};
class Tasksheet125{
	
	public static void main(String[] args){
		
		Car firstCar = new Car("Porshe", "997 GT3", 2008, 2);
		
			System.out.println(firstCar.displayDetails());
		
	}
	
};

class Vehicle{
	
	protected String make;
	protected String model;
	protected Integer year;
	
		public Vehicle(String mk, String md, Integer y){
			
			this.make = mk;
			this.model = md;
			this.year = y;
			
		}
	
}

class Car extends Vehicle{
	
	private Integer numberOfDoors;
	
		public Car(String carBrand, String carModel, Integer yearReleased, Integer doors){
			
			super(carBrand, carModel, yearReleased);
			/*super.make = carBrand;
			super.model = carModel;
			super.year = yearReleased;*/
			this.numberOfDoors = doors;
			
		}
		
		public String displayDetails(){
			
			StringBuilder sb = new StringBuilder();
			
				sb.append("**** Car Details ****");
					sb.append(System.lineSeparator());
				sb.append("Make: "); sb.append(super.make);
					sb.append(System.lineSeparator());
				sb.append("Model: "); sb.append(super.model);
					sb.append(System.lineSeparator());
				sb.append("Year: "); sb.append(Integer.toString(super.year));
					sb.append(System.lineSeparator());
				sb.append("Number of Doors: "); sb.append(Integer.toString(this.numberOfDoors));
					sb.append(System.lineSeparator());
				
			return sb.toString();
			
		}
	
}
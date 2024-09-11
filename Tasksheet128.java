class Tasksheet128{
	
	public static void main(String[] args){
		
		Circle c1 = new Circle("Red", 7.0);
		Rectangle r1 = new Rectangle("Red", 7.0, 14.0);
		
		System.out.println(c1.toString());
		System.out.println(r1.toString());
		
	}
	
}

public interface Shape{
	
	public Double calculateArea();
	public Double calculatePerimeter();
	
}

abstract class AbstractShape implements Shape{
	
	protected String color;
	protected Double length;
	protected Double width;
	
		public AbstractShape(String c, Double l, Double w){
			this.color = c;
			this.length = l;
			this.width = w;
		}
		
		public Double calculateArea(){
			return 0.0;
		}
		
		public Double calculatePerimeter(){
			return 0.0;
		}
	
}

class Circle extends AbstractShape{
	
	private Double radius;
	
		public Circle(String c, Double r){
			super(c, 0.0, 0.0);
			this.radius = r;
		}
		
		@Override public Double calculateArea(){
			return Math.PI * (radius * radius);
		}
		
		@Override public Double calculatePerimeter(){
			return (2 * Math.PI * radius);
		}
		
		public String toString(){
			StringBuilder sb = new StringBuilder();
			
				sb.append(System.lineSeparator());
			sb.append("CIRCLE ===============================");
				sb.append(System.lineSeparator());
				sb.append('\t');
			sb.append("Area: "); sb.append(Double.toString(calculateArea()));
				sb.append(System.lineSeparator());
				sb.append('\t');
			sb.append("Perimeter: "); sb.append(Double.toString(calculatePerimeter()));
				sb.append(System.lineSeparator());
			
			return sb.toString();
		}
	
}

class Rectangle extends AbstractShape{
	
		Rectangle(String c, Double l, Double w){
			super(c, l, w);
		}
		
		@Override public Double calculateArea(){
			return super.length * super.width;
		}
		
		@Override public Double calculatePerimeter(){
			return (super.length + super.width) * 2;
		}
		
		public String toString(){
			StringBuilder sb = new StringBuilder();
			
				sb.append(System.lineSeparator());
			sb.append("RECTANGLE ============================");
				sb.append(System.lineSeparator());
				sb.append('\t');
			sb.append("Area: "); sb.append(Double.toString(calculateArea()));
				sb.append(System.lineSeparator());
				sb.append('\t');
			sb.append("Perimeter: "); sb.append(Double.toString(calculatePerimeter()));
				sb.append(System.lineSeparator());
			
			return sb.toString();
		}
}
/*

	T A S K  S H E E T  1 2 3
	04 / 09 / 2024

*/

class tasksheet123{
		public static void main(String[] args){
			Book[] arrayOfBooks = new Book[]{
				new Book("Java Programming", "John Smith", 2021, 39.99),
				new Book("Python Basics", "Jane Doe", 2020, 29.99),
				new Book("C++ Essentials", "Michael Johnson", 2019, 49.99)
			};
			
			for (int b = 0; b < arrayOfBooks.length; b++){
				System.out.println("Book " + (b + 1) + ":" + arrayOfBooks[b].toString());
			}
			
		}
};


class Book{
	
	private String title;
	private String author;
	private int    yearPublished;
	private double price;
	
		public Book(String t, String a, int y, double p){
			title = t;
			author = a;
			yearPublished = y;
			price = p;
		}
		
		public String toString(){
			StringBuilder sb = new StringBuilder();
			
				sb.append(System.lineSeparator());
			sb.append("Title: "); sb.append('"'); sb.append(title); sb.append('"');
				sb.append(System.lineSeparator());
			sb.append("Author: "); sb.append('"'); sb.append(author); sb.append('"');
				sb.append(System.lineSeparator());
			sb.append("Year Published: "); sb.append(Integer.toString(yearPublished));
				sb.append(System.lineSeparator());
			sb.append("Price: "); sb.append('$'); sb.append(Double.toString(price)); 
				sb.append(System.lineSeparator());
			
			return sb.toString();
		}
};
package problem1;

public class Book {
	private String title;
	private String author;
	private double price;
	
	
	public void setName(String title) {
		if(title.equals("")) {
			this.title = "Unkown";
		}else {
			this.title = title;
		}
	}
	public String getName() {
		return this.title;
	}
	
	public void setAuth(String author) {
		if(author.equals("")) {
			this.author = "Unkown";
		}else {
			this.author = author;
		}
	}
	public String getAuth() {
		return this.author;
	}
	
	public void setPrice(double price) {
		if(price>0.00 && price < 200.00) {
			this.price = price;
		}else {
			this.price = 0.00;
		}
		if(price < 0 || price > 200) {
		System.out.println("Invalid");
		
		}
	}
	public double getPrice() {
		return this.price;
	}
	public Book(String title, String author, double price) {
		this.setName(title);
		this.setAuth(author);
		this.setPrice(price);
	}
	public void show() {
		System.out.println("Book Details:");
		System.out.println("Title:" + title);
		System.out.println("Author:" + author);
		System.out.printf("Price: $%.2f\n", price);
		System.out.println("-------------------------------");
	}

}

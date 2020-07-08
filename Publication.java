package ee219;


public class Publication {
	
	private String author,title,year;
	
	public Publication(String a, String b, String c) { // class constructor
		author = a;
		title = b;
		year=c;
	}
	
	
	public void display() {
		System.out.println("\nAuthor: " + author + "\nTitle: " + title + "\nYear: " + year);
	}
	

	
	
}
		
		
	


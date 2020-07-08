package ee219;

public class Book extends Publication {
	
	public String publisher;
	
	public Book(String a, String b, String c, String d) {
		super(a, b, c);
		publisher = d;
	}

	public void display() {
		super.display();
		System.out.println("Publisher: " + publisher );
	}
	
	
	public static void main(String args[]) {
		
    Publication[] books;  // reference to an array (which contains Student references)
	books = new Publication[3]; // create/allocate the array
	books[0] = new Book("jim dolan","Knicks","1958","NBA"); // create Student objects
	books[1] = new Book("yer wan","the climb","2001","penguin");
	books[2] = new Book("Tom Hardy","Warrior","2015","warner");
	
	for (int i=0; i<3; i++)
		books[i].display();
		}

	
}
package ee219;

public class Print2 implements Printable {
	public void print() {
	   
	    System.out.println("Print 2");
	  }

	public static void main(String[] args) {
	   
		
		Printable[] book;  // reference to an array (which contains Student references)
		book = new Printable[3]; // create/allocate the array
		book[0] = new print1(); // create Student objects
		book[1] = new Print2();
		book[2] = new Print2();
		
		for (int i=0; i<3; i++)
			book[i].print();
			}
		
		
		
		
		
		
		
}







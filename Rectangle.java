package ee219;


public class Rectangle {
	
	private double len,wid;
	
	public Rectangle(double l, double w) { // class constructor
		len = l;
		wid = w;
	}
	
	public Rectangle(double x1, double y1, double x2, double y2) { // class constructor
		len = x2-x1;
		wid = y2-y1;
	}
	
	public double perimeter() {
		return len*2+wid*2;
	}
	
	public void printInfo() {
		System.out.println("Lenght: " + len + " Width: " + wid + " Perimeter: " + perimeter());
	}
	
	public static void main(String args[]) {
		
		Rectangle square = new Rectangle( 2, 2 );
		Rectangle rec1 = new Rectangle( 2, 2, 4, 5 );
		square.printInfo();
		rec1.printInfo();
	}
}


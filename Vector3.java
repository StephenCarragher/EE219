package ee219;

public class Vector3 {

	private double i,j,k;
	
	public Vector3(double a, double b, double c) { // class constructor
		i = a;
		j = b;
		k = c;
	}
	
	Vector3 crossProduct(Vector3 vec) {
	
		return new Vector3(j*vec.k-(k*vec.j),k*vec.i-(i*vec.k),i*vec.j-(j*vec.i));
		
	}
	
	public void display() {
		System.out.print( i + "i + " + j + "j + " + k + "k ");
		
		
	}

	
	public static void main(String args[]) {
		
		Vector3 vec1 = new Vector3( 2, 4 , 3 );
		Vector3 vec2 = new Vector3( 6, 7, 5 );
		Vector3 vec3 = vec1.crossProduct(vec2);
				
				
		vec3.display();
	}
	
	

}

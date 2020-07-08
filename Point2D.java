package ee219;

public class Point2D {

private double x,y;
	
	public Point2D(double a, double b) { // class constructor
		x = a;
		y = b;
		
	}
	
	public Point2D midPoint(Point2D p) {
		
		return new Point2D((x+p.x)/2,(y+p.y)/2);
	} 
	
	
	public static Point2D farthestFromOrigin(Point2D[] points){
		double dist=0;
		int num=0;
		for (int i=0; i<points.length; i++) {
			if(Math.sqrt(points[i].x*points[i].x+points[i].y*points[i].y)>dist) {
				dist=Math.sqrt(points[i].x*points[i].x+points[i].y*points[i].y);
				num = i;
			}
		}
	return points[num];
	}
	
	
	
	public String toString() {
		 return "x: " + x + " y: " + y;
		 
	 }
	

	public static void main(String args[]) {
		   Point2D p1 = new Point2D(1,1);
		   Point2D p2 = new Point2D(6,3);
		   Point2D p3 = new Point2D(12,4);
		   Point2D p4 = new Point2D(10,2);
		   System.out.println(p1.midPoint(p2));
		   Point2D[] arr1 = {p1,p2,p3,p4};
		   System.out.println(farthestFromOrigin(arr1));
		}

}

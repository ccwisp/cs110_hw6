import shapes.Square;
import shapes.Rectangle;
import utils.Math;
public class Driver {
	
	public static void main(String[] args) {
		Square a = new Square(100) ;
		System.out.println(a.getArea());
		
		Rectangle b = new Rectangle(50, 80);
		System.out.println(b.getArea());
	
	double num = 4.9;
	
	System.out.println(Math.rfactorial((int)num));
	System.out.println(Math.lfactorial((int)num));
	
	}
}



//Example of Polymorphism

package test;

class Shape {
	public double result() {
		return 0;
	}
}

class TwoDimshape extends Shape {
	private double x, y, h;

	double getArea(double x, double y, double h) {
		return (x * y) / h;
	}

	double getArea(double x) {
		return x * x * 3.14;
	}
}

class Ellipse extends TwoDimshape {
	private double x;

	public Ellipse(double x, double y) {
		this.x = x;
		System.out.println("This is Ellipse");
	}

	public double result() {
		return super.getArea(x);
	}
}

class Rectangle extends TwoDimshape {
	private double x, y;

	public Rectangle(double x, double y) {
		this.x = x;
		this.y = y;
		System.out.println("This is Rectangle");
	}

	public double result() {
		return super.getArea(x, y, 1);
	}
}

class Triangle extends TwoDimshape {
	private double x, y;

	public Triangle(double x, double y) {
		this.x = x;
		this.y = y;
		System.out.println("This is Triangle");
	}

	public double result() {
		return super.getArea(x, y, 2);
	}
}

class ThreeDimshape extends Shape {
	double getVolume(double x, double y, double h) {
		return (x * y) * h;
	}

	double getVolume(double x) {
		return (4 * 3.14 * x * x * x) / 3;
	}
}

class Shpere extends ThreeDimshape {
	private double x;

	public Shpere(double x) {
		this.x = x;
		System.out.println("This is Shpere");
	}

	public double result() {
		return super.getVolume(x);
	}
}

class Cube extends ThreeDimshape {
	private double x, y, h;

	public Cube(double x, double y, double h) {
		this.x = x;
		this.y = y;
		this.h = h;
		System.out.println("This is Cude");
	}

	public double result() {
		return super.getVolume(x, y, h);
	}
}

class Cylinder extends ThreeDimshape {
	private double x, y;

	public Cylinder(double x, double y) {
		this.x = x;
		this.y = y;
		System.out.println("This is Cylinder");
	}

	public double result() {
		return super.getVolume(x * x, 3.14, y);
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Shape[] s = new Shape[5];
		s[0] = new Rectangle(3, 5);
		s[1] = new Cylinder(2.5, 6);
		s[2] = new Triangle(5, 10);
		s[3] = new Shpere(4.5);
		s[4] = new Cube(4, 3.5, 8);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].result());
		}
	}
}

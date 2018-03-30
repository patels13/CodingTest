
public class Triangle implements Shape {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(double side1, double side2, double side3){
		if (side1<0 || side2<0 || side3<0){side1=Double.NaN;side2=Double.NaN;side3=Double.NaN;}
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	
	@Override
	public double getArea() {
		//using Heron's formula to find area given three sides of triangle
		double x=getPerimeter()*.5;
		return Math.sqrt(x*(x-side1)*(x-side2)*(x-side3));
	}

	@Override
	public double getPerimeter() {
		return side1+side2+side3;
	}

}

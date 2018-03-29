
public class Triangle implements Shape {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(double s1_length, double s2_length, double s3_length){
		side1=s1_length;
		side2=s2_length;
		side3=s3_length;
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

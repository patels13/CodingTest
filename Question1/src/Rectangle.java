
public class Rectangle extends Quadrilateral implements Shape{
	private double length;
	private double width;
	
	public Rectangle(double length, double width){
		super(length,width,length,width);
		this.length=length;
		this.width=width;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*width;
	}

//	@Override
//	public double getPerimeter() {
//		// TODO Auto-generated method stub
//		return (2*length)+(2*width);
//	}

}

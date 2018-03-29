
public class Circle extends Ellipse implements Shape{
	private double radius;
	
	public Circle(double r){
		super(r,r);
		radius=r;
	}
	
//	@Override
//	public double getArea() {
//		// TODO Auto-generated method stub
//		return (2*radius*radius*(Math.PI));
//	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (2*radius*(Math.PI));
		
	}
	
}

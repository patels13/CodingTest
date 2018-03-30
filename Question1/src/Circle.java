
public class Circle extends Ellipse implements Shape{
	private double radius;
	
	public Circle(double radius){
		super(radius,radius);
		if (radius<0){radius=Double.NaN;}
		this.radius=radius;
	}

	@Override
	public double getPerimeter() {
		return (2*this.radius*(Math.PI));
	}
	
}


public class Rectangle extends Quadrilateral implements Shape{
	private double length;
	private double width;
	
	public Rectangle(double length, double width){
		super(length,width,length,width);
		if (length<0 || width<0){length=Double.NaN;width=Double.NaN;}
		this.length=length;
		this.width=width;
	}
	
	@Override
	public double getArea() {
		return this.length*this.width;
	}


}

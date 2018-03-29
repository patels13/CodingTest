
public abstract class Ellipse implements Shape{
	public double r1;
    public double r2;
    
	public Ellipse(double r1, double r2) {
		this.r1=r2;
		this.r2=r2;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*r1*r2;
	}
}

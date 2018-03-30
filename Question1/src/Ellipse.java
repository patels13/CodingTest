
public abstract class Ellipse implements Shape{
	public double r1;
    public double r2;
    
	public Ellipse(double r1, double r2) {
		if (r1<0 || r2<0){ r1=Double.NaN; r2=Double.NaN;}
		this.r1=r1;
		this.r2=r2;
	}
	
	@Override
	public double getArea() {
		return Math.PI*r1*r2;
	}
	

}


public abstract class Quadrilateral implements Shape{
	public double s1;
	public double s2;
	public double s3;
	public double s4;
	
	public Quadrilateral(double s1, double s2, double s3, double s4){
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		this.s4=s4;
	}
	
	@Override
	public double getPerimeter(){
		return (s1+s2+s3+s4);
	}	
	
}

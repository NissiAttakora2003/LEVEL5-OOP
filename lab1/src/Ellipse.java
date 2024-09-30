
public class Ellipse extends Shape {
	private double r1 ;
	private double r2;
	
	public void setR1(double r1){this.r1=r1;}
	public void setR2(double r2) {this.r2=r2;}
	public double getR1() {return this.r1;}
	public double getR2() {return this.r2;}

	Ellipse() {
		super(1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		double height = getR1()/2;
		double width = getR2()/2;
		// TODO Auto-generated method stub
		return  Math.PI*height*width;
	}

}

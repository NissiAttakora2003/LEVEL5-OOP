
public class Circle extends Shape {
	private double radius;

	

	Circle() {
		super(1);
		// TODO Auto-generated constructor stub
	}
	
	public void setRadius(double radius){
		this.radius=radius;
	}
	public double getRadius() {return this.radius;}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
		
	}
	

}

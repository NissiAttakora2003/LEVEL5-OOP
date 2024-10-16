
public class Rectangle extends Shape 
{
	private double width; 
	private double height;
	private double area;
	
	
	
	public void setWidth(double width){this.width=width;}
	
	public double getWidth() {return this.width;}
	

	public void setHeight(double height) {this.height=height;}
	
	public double getHeight() {return this.height;}
	
	Rectangle() 
	{
		super(4);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea(){
		
		// TODO Auto-generated method stub
		area=(this.width*this.height);
		return  area;
	}
	

}

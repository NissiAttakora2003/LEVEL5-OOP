
public class Driver {

	public static void main(String[] args) {
		double shapeArea;
		Rectangle driver = new Rectangle();
		driver.setHeight(4);
		driver.setWidth(5);
		shapeArea=driver.getArea();
		System.out.println(shapeArea);
		// TODO Auto-generated method stub
		
		 Circle circle = new Circle();
		 circle.setRadius(5);
		 circle.getRadius();
		 System.out.println(circle.getArea());
		 
		 Ellipse ellipse = new Ellipse();
		 ellipse.setR1(10);
		 ellipse.setR2(5);
		 ellipse.getR2();
		 System.out.print(ellipse.getArea());

	}

}

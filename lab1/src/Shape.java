
abstract class Shape {
	private int sides;
	
	Shape(int side){
		sides=side;
	}
	
	public int getSides() {return sides;}
	public void setSides(int side) {sides=side;}
	
	abstract public double getArea ();

}

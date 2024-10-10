package lab4;

abstract public class Subject 
{
	private String name=new String ("");
	private String description=new String("");
	
	abstract int getCredit();//abstract method
	
	Subject(String name, String description)
	{
		this.name=name;
		this.description=description;
	}
	
	String getName(){return this.name;}
	
	String description(){return this.description;}

}

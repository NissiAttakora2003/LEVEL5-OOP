package lab4;

public class Languages extends Social
{
	private String description;
	private String name;

	Languages(String subjtName, String subjtDesc) 
	{
		super(subjtName, subjtDesc);
		this.description=subjtDesc;
		this.name=subjtName;
		// TODO Auto-generated constructor stub
	}
	public void setDescription(String description) {this.description=description;}
	public String getDescription() {return "Subject description: "+this.description;}
	public String getname() {return "Subject name: "+this.name;};
	public int setCredit(int credit) {return 0;}

}

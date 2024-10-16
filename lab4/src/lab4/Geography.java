package lab4;

public class Geography extends Social{
	private String description;
	private String name;

	Geography(String subjtName, String subjtDesc) {
		super(subjtName, subjtDesc);
		this.description=description;
		// TODO Auto-generated constructor stub
	}
	
	public void setDescription(String description) {this.description=description;}
	public String getDescription() {return "Subject description: "+this.description;}
	public String getname() {return "Subject name: "+this.name;};
	public int setCredit(int credit) {return 0;}

}

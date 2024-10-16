package lab4;

public class History extends Social {
	private String description;
	private String name;

	History(String subjtName, String subjtDesc) {
		super(subjtName, subjtDesc);
		// TODO Auto-generated constructor stub
		this.description=subjtDesc;
		this.name=subjtName;
	}
	public void setDescription(String description) {this.description=description;}
	public String getDescription() {return "Subject description: "+this.description;}
	public String getname() {return "Subject name: "+this.name;};
	public int setCredit(int credit) {return 0;}

}

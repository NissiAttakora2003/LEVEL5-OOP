package lab4;

public class Chemistry extends Science {
	private String name;
	private String description;

	Chemistry(String name, String description) {
		super(name, description);
		this.description=description;
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	public void setDescription(String description) {this.description=description;}
	public String getDescription() {return "Subject description: "+this.description;}
	public String getname() {return "Subject name: "+this.name;};
	public int setCredit(int credit) {return 0;}


}

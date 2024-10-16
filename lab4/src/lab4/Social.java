package lab4;

public class Social extends Subject {
	private String name;
	private String description;
	

	Social(String subjtName, String subjtDesc) {
		super(subjtName, subjtDesc);
		this.name=subjtName;
		this.description=subjtDesc;
		// TODO Auto-generated constructor stub
	}
	
	public void setDescription(String description) {this.description=description;}
	public String getDescription() {return "Subject description: "+this.description;}
	public String getname() {return "Subject name: "+this.name;};
	public int setCredit(int credit) {return 0;}

	@Override
	public
	int getCredit() {
		// TODO Auto-generated method stub
		return 0;
	}

}

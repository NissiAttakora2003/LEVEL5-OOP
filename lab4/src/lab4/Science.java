package lab4;

public class Science extends Subject {
	private String name;
	private String description;
	

	Science(String name, String description) {
		super(name, description);
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

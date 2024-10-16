package lab4;

abstract public class Subject implements Delivery
{
	private String name;
    private String description;
    private String tutor;
    private String room;
    
    // Constructor
    Subject(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Abstract method to be implemented by subclasses
    abstract public int getCredit();

    // Getter methods for name and description
    public String getName() {
        return "Subject name : " + this.name;
    }

    public String getDescription() {
        return "Subject description: " + this.description;
    }

    // Delivery interface methods with default implementations
    @Override
    public String getTutor() {
        return "Tutor: " + this.tutor;
    }

    @Override
    public void setTutor(String tutorName) {
        this.tutor = tutorName;
    }

    @Override
    public void setRoom(String roomNum) {
        this.room = roomNum;
    }

    @Override
    public String getRoom() {
        return "Room: " + this.room;
    }

}

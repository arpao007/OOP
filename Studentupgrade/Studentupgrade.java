package Op;

public class Studentupgrade {
	private String id;
	private String name;
	
	public Studentupgrade(String id, String name) {
		this.id = id;
		this.name =name;
	}
	public String getId() { return id;}
	public String getName() { return name;}
	
	public void displayInfo() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
	}
}

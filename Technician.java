
public class Technician extends Employee {
	
	int senior;

	public Technician(String name, String email, String DoB, double salary,int senior) {
		super(name, email, DoB, salary);
		this.senior = senior;
		
	}

	public int getSenior() {
		return senior;
	}

	public void setSenior(int senior) {
		this.senior = senior;
	}

}

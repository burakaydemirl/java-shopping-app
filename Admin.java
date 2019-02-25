
public class Admin extends Employee {
	
	
	String pass;

	public Admin(String name, String email, String DoB, double salary,String pass) {
		super(name, email, DoB, salary);
		this.pass=pass;
	
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	

		
	}
	
	


		
		
	





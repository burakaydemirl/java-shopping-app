
public class Employee extends Person {
	
	double salary;

	public Employee(String name, String email, String DoB,double salary) {
		super(name, email, DoB);
		this.salary=salary;

	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

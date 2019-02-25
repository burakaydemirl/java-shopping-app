
public class Customer extends Person{
	int customerID;
	String password;
	double balance;
	public enum Status{
		CLASSIC,
		SILVER,
		GOLDEN
	};
	Status status;

	public Customer(String name, String email, String DoB,int customerID,double balance,String password,Status status) {
		super(name, email, DoB);
		this.balance=balance;
		this.password=password;
		this.customerID=customerID;
		this.status=status;
	
		
	}

	// Getters and Setters-----------

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	

	//------------------



	
	



}

/**
 * 
 * @author Burak
 *
 */
public class Person {
	
	/**
	 * @param name Person name
	 * @param email Person email
	 * @param DoB Person date of birth
	 */
	
	
	String name;
	String email;
	String DoB;
	
	public Person(String name,String email,String DoB){
		this.name=name;
		this.email=email;
		this.DoB=DoB;
	}
	
	//Getters Setters------
	/**
	 * 
	 * @return getName - Get person name
	 */
	
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return setName - Setting person name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @return getEmail - Get the person email
	 */

	public String getEmail() {
		return email;
	}
	/**
	 * 
	 * @return setEmail - Setting person email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 
	 * @return getDoB - Get the person date of birth
	 */
	public String getDoB() {
		return DoB;
	}
	/**
	 * 
	 * @return setDoB - Setting the person date of birth
	 */
	public void setDoB(String doB) {
		DoB = doB;
	}
	//-------------
	
	

}

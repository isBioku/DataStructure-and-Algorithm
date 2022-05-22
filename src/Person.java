
public class Person {
	String firstName;
	String lastName;
	String eMail;
	int houseNumber;
	long phoneNumber;
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName (String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmail(String eMail) {
		this.eMail = eMail;
	}
	
	public void setHouseNumber (int houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	public void setPhoneNumber (long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getFirstName () {
		return this.firstName;
	}
	
	public String getlastName () {
		return this.lastName;
	}
	
	public String getEmail () {
		return this.eMail;
	}
	
	public int getHouseNumber () {
		return this.houseNumber;
	}
	
	public long getPhoneNumber () {
		return this.phoneNumber;
	}
	
	//Constructor
	public Person(String firstName, String lastName, String eMail, int houseNumber, long phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.houseNumber = houseNumber;
		this.phoneNumber = phoneNumber;
	}
	
	
	
}

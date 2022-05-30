package addressbook;

import java.util.Objects;

public class User {
	private int no;
	private String firstName;
	private String phone;
	private String zipCode;
	private String email;
	private String lastName;
	private String Address;
	private String State;
	private String City;

	public User(int no, String firstName, String lastName, String Address, String State, String City, String phone,
			String zipCode, String email) {
		this.no = no;
		this.firstName = firstName;
		this.phone = phone;
		this.zipCode = zipCode;
		this.email = email;
		this.lastName = lastName;
		this.Address = Address;
		this.State = State;
		this.City = City;
	}
	

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}

	public String getcity() {
		return City;
	}

	public void setcity(String City) {
		this.City = City;
	}

	public String getstate() {
		return City;
	}

	public void setstate(String state) {
		this.State = state;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getzipCode() {
		return zipCode;
	}

	public void setzipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "User{" + "no=" + no + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\''
				+ ", Address='" + Address + '\'' + ", City='" + City + '\'' + ", State='" + State + '\'' + ", phone='"
				+ phone + '\'' + ", zipCode='" + zipCode + '\'' + ", email='" + email + '\'' + '}';
	}
}
package co.gc.CoffeeShopLab24.model;

public class Person {

	private String name;
	private String email;
	private String phoneNum;
	private String password;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String email, String phoneNum, String password) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNum = phoneNum;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", phoneNum=" + phoneNum + ", password=" + password + "]";
	}

}

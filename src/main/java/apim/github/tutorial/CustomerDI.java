package apim.github.tutorial;

public class CustomerDI {

	private int id;
	private String name;
	private int balance;
	private Address address;

	public CustomerDI(Address address) {
		this.address = address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public CustomerDI() {
	}

	public CustomerDI(int id, String name, int balance, Address address) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Address getAddress() {
		return address;
	}
}
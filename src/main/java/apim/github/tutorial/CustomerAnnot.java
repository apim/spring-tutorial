package apim.github.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerAnnot {

	private int id;
	private String name;
	private int balance;

	@Autowired
	private AddressAnnot address;

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

	public AddressAnnot getAddress() {
		return address;
	}

	public void setAddress(AddressAnnot address) {
		this.address = address;
	}

}
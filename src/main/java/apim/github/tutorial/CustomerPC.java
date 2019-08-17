package apim.github.tutorial;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class CustomerPC {

	private int id;
	private String name;
	private int balance;

	@PostConstruct
	public void customInit() {
		System.out.println("Custom Bean Initialisation via annotation...");
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

}
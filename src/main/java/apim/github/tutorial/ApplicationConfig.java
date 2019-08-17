package apim.github.tutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public CustomerAnnot customer() {
		CustomerAnnot cust = new CustomerAnnot();
		cust.setId(1);
		cust.setName("APIM");
		cust.setBalance(500);
		return cust;
	}

	@Bean
	public AddressAnnot address() {
		AddressAnnot address = new AddressAnnot();
		address.setLocation("Santa Clara");
		address.setCity("At US");
		return address;
	}
}
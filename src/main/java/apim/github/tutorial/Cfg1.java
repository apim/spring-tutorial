package apim.github.tutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Cfg1 {

	@Bean
	public CustomerAnnot customer() {
		CustomerAnnot cust = new CustomerAnnot();
		cust.setId(10);
		cust.setName("APIM");
		cust.setBalance(3500);
		return cust;
	}
}
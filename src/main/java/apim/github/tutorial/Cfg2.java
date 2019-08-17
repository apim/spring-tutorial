package apim.github.tutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Cfg2 {

	@Bean
	public AddressAnnot address() {
		AddressAnnot address = new AddressAnnot();
		address.setLocation("A town");
		address.setCity("A city");
		return address;
	}
}
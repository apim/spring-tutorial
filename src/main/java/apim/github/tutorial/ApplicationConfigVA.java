package apim.github.tutorial;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ Cfg1.class, Cfg2.class })
public class ApplicationConfigVA {

}
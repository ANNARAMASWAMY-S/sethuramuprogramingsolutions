import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	@GetMapping("/hello")
	public String sayHello()
	{
		logger.info("Starting......");
		logger.info("ending..........");
		return("Hello World!");
		
	}
}

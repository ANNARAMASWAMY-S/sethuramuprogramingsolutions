import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;



@SpringBootApplication
public class Application {
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	public static void main(String[] args) {
		logger.info("Starting......");
		logger.info("ending..........");
		SpringApplication.run(Application.class, args);
		
		displayCountry();
		
	}
	
	
	
	
	public static void displayCountry()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 
		 String Beans[]=context.getBeanDefinitionNames();
		Country c1=(Country) context.getBean("beandemo");
		for(int i=0;i<Beans.length;i++)
		{
			System.out.println(Beans[i]);
			Country c=(Country) context.getBean(Beans[i]);
			System.out.println(c.getCode()+' '+c.getName());
		}
		
	}

}

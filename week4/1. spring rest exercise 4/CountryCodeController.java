
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CountryCodeController 
{
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	 
	 String Beans[]=context.getBeanDefinitionNames();
	 
	@GetMapping("/countrys/{code}")
	public Country testing(@PathVariable String code)
	{
		for(int i=0;i<Beans.length;i++)
		{
			Country c=(Country) context.getBean(Beans[i]);
			if(code.equalsIgnoreCase(c.getCode()))
			{
				System.out.println(Beans[i]);
				System.out.println(c.getCode()+' '+c.getName());
				return(c);
			}
		}
		Country c=new Country();
		c.setCode("not found");
		c.setName("not found");
		return(c);
	}
}

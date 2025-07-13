import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/country")
public class CountryController 
{
	 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	 
	 String Beans[]=context.getBeanDefinitionNames();
	
	@GetMapping
	public Country getCountry()
	{
		Country c1=(Country) context.getBean("beandemo");
		for(int i=0;i<Beans.length;i++)
		{
			System.out.println(Beans[i]);
			Country c=(Country) context.getBean(Beans[i]);
			System.out.println(c.getCode()+' '+c.getName());
		}
		return(c1);
	}
}

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Application {
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
    private static CountryService countryService;

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(Application.class, args);
		LOGGER.info("Inside main");
		countryService = context.getBean(CountryService.class);
		countryService.newcountries(new Country("UK","United Kingdom"));
		countryService.deletecountry("UK");
		Country c11=countryService.getcountry("IN");
		System.out.println(c11.getCode()+" "+c11.getName());
		countryService.updatecountry("IN", "INDIA");
		List<Country> c16=countryService.findbypartialmatch("Ind");
		Country c15=countryService.findbypartialmatchcode("N");
		
		countryService.jpaexample();
		
		testGetAllCountries();
	}
	
	
	
	private static void testGetAllCountries() {
        LOGGER.info("Start");
        List<Country> countries = countryService.getAllCountries();
        for(int i=0;i<countries.size();i++)
        {
        	System.out.println(countries.get(i).getCode()+' '+countries.get(i).getName());
        }
        LOGGER.debug("countries={}", countries);
        LOGGER.info("End");
    }

}

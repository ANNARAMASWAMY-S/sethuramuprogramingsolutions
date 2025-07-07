

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import jakarta.transaction.Transactional;




@Service
public class CountryService 
{
	@Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries() {
    	System.out.println("Hello");
        return countryRepository.findAll();
    }
    
    @Transactional
    public String newcountries(Country c)
    {
    	countryRepository.save(c);
    	return("saved");
    }
    
    
   @Transactional
   public String deletecountry(String code)
   {
	   countryRepository.deleteById(code);
	   return("Deleted");
   }
   
   
   @Transactional
   public Country getcountry(String code)
   {
	   System.out.println("Fine");
	   return(countryRepository.findById(code).orElseThrow(()-> new RuntimeException("Error")));
   }
   
   
   
   @Transactional
   public String updatecountry(String code,String name)
   {
	   Country c=countryRepository.findById(code).orElseThrow(()-> new RuntimeException("Error"));
	   c.setCode(code);
	   c.setName(name);
	   countryRepository.save(c);
	   return("Updated");
   }
   
   
   @Transactional
   public List<Country> findbypartialmatch(String name)
   {
	   List<Country> l =new ArrayList<Country>();
	   
	   List<Country> l1=countryRepository.findAll();
	   
	   for(int i=0;i<l1.size();i++)
	   {
		   if(l1.get(i).getName().equalsIgnoreCase(name))
		   {
			   l.add(l1.get(i));
			   System.out.println(l1.get(i).getCode()+' '+l1.get(i).getName());
		   }
	   }
	   
	   return(l);
   }
   
   
   
   
   
   
   
   
   
   
   
   @Transactional
   public Country findbypartialmatchcode(String name)
   {
	   List<Country> l =new ArrayList<Country>();
	   
	   List<Country> l1=countryRepository.findAll();
	   
	   for(int i=0;i<l1.size();i++)
	   {
		   if(l1.get(i).getCode().equalsIgnoreCase(name))
		   {
			   
			   System.out.println(l1.get(i).getCode()+' '+l1.get(i).getName());
			   return(l1.get(i));
		   }
	   }
	   
	   return(null);
   }
   
   
   
   
   
   
   
   
}

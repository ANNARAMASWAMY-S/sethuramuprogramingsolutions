import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmployeeService 
{
	@Autowired
	EmployeeRepository er;
	
	
	
	public double getavgsalaryhql()
	{
		return(er.getAvgsalary());
	}
	
	
	public double getavgsalarynq()
	{
		return(er.getAvgsalary1());
	}
	
	
	
	public void addemployee(Employee e)
	{
		er.save(e);
	}
}



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{
	@Query(value="select avg(e.salary) from Employee e")
	double getAvgsalary() ;
	
	
	@Query(value="select avg(e.salary) from employee e",nativeQuery=true)
	double getAvgsalary1() ;
}

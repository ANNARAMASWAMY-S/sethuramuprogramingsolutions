

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 EmployeeService es=(EmployeeService)context.getBean(EmployeeService.class);
		 System.out.println(es.getavgsalaryhql());
		 System.out.println(es.getavgsalarynq());
	}

}

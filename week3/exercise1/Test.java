package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import repository.BookRepository;
import service.BookService;

public class Test 
{
	public static void main(String args[])
	{
		
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		BookService newbook = (BookService) context.getBean("bookService");
		
		
		System.out.println(newbook.getName());
		
		
		 
		newbook.getBr().setId(1);
		
		System.out.println(newbook.getBr().getId());
		
		
			
			((ClassPathXmlApplicationContext) context).close();
			
			
			
		
		
		
	}
}

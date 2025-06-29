package CalculatorTest;







import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Calculator.Calculator;

public class CalculatorTest 
{
	private Calculator c;
	
	@BeforeEach
	public void setup()
	{
		System.out.println("Setting up");
		c=new Calculator();
	}
	
	
	@Test
	public void test()
	{
		assertEquals(10,c.add(3, 7));
		
	}
	
	@Test
	public void test1()
	{
		assertEquals(4,c.sub(7, 3));
		
	}
	
	@Test
	public void test3()
	{
		assertEquals(21,c.mul(3, 7));
		
	}
	
	@AfterEach
	public void tearDown() 
	{
		System.out.println("Test Cases Finished");
		c=null;
	}
}

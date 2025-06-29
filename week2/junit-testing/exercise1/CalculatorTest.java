package CalculatorTest;







import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.After;
import org.junit.jupiter.api.Before;
import org.junit.jupiter.api.Test;

import Calculator.Calculator;

public class CalculatorTest 
{
	private Calculator c;
	
	@Before
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
	
	@After
	public void tearDown() 
	{
		System.out.println("Test Cases Finished");
		c=null;
	}
}

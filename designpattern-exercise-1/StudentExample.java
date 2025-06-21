package exercisedesignpattern.Student;

import exercisedesignpattern.SingletonPatternExample;

public class StudentExample 
{
	public static void main(String args[])
	{
		SingletonPatternExample spe = SingletonPatternExample.getInstance();
		
		SingletonPatternExample spe1 = SingletonPatternExample.getInstance();
	
		System.out.println(spe.equals(spe1));
	}
	
}

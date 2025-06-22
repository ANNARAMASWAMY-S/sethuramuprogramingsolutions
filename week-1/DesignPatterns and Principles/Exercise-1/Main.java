package singletonpatternexample.Student;

import singletonpatternexample.Logger;

public class Main 
{
	public static void main(String args[])
	{
		Logger spe = Logger.getInstance();
		
		Logger spe1 = Logger.getInstance();
	
		System.out.println(spe.equals(spe1));
	}
	
}

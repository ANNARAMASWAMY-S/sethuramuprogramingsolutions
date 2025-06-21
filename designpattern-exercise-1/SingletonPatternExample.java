package exercisedesignpattern;

public  class SingletonPatternExample 
{
	static SingletonPatternExample spe=null;
	
	
	public static SingletonPatternExample getInstance()
	{
		if(spe==null)
		{
			spe=new SingletonPatternExample();
			return(spe);
		}
		return spe;
	}
}

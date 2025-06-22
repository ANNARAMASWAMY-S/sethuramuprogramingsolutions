package singletonpatternexample;

public  class Logger
{
	static Logger spe=null;
	
	
	public static Logger getInstance()
	{
		if(spe==null)
		{
			spe=new Logger();
			return(spe);
		}
		return spe;
	}
}

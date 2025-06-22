package financialforecast;

public class FinancialForeCast 
{
	public static double forecastValue(double currentValue,double growthRate,int years)
	{
		if(years==0)
		{
			return(currentValue);
		}
		return(forecastValue(currentValue*(1+growthRate),growthRate,years-1));
	}
}

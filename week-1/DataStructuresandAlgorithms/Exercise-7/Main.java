package financialforecast;

public class Main 
{
	public static void main(String args[])
	{
		double presentValue=1000.0;
		double growthRate=0.05;
		int years=5;
		
		double futureValue=FinancialForeCast.forecastValue(presentValue, growthRate, years);
		System.out.printf("Future Value after %d years: %.2f",years,futureValue);
	}
}

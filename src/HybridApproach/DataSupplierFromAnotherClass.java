package HybridApproach;

import org.testng.annotations.DataProvider;

public class DataSupplierFromAnotherClass 
{
	@DataProvider(name="testData")
	public String[][] testData()
	{
		String[][]cred= {{"abcd","abcd@123"},{"xyz","xyz@123"},{"admin","admin@123"},{"user","user@123"}};
		return cred;		
	}
}

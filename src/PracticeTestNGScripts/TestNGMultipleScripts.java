package PracticeTestNGScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGMultipleScripts 
{
	@Test
	public void t1()
	{
		Reporter.log("Shobhith's Test1",true);
	}
	@Test
	public void t2()
	{
		Reporter.log("Shobhith's Test2",true);	
	}
	@Test
	public void t3()
	{
		Reporter.log("Shobhith's Test3",true);
	}
}

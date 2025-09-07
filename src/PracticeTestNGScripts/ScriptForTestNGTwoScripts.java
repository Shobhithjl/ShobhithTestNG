package PracticeTestNGScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ScriptForTestNGTwoScripts 
{
	@Test
	public void t1()
	{
		Reporter.log("Shobith's first test1",true);
	}
	
	@Test
	public void t2() 
	{
	    Reporter.log("Shobith's second test2",true);	
	}
}

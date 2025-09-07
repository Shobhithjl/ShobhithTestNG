package HybridApproach;

import org.testng.annotations.Test;

public class GroupsExcludeSignup 
{
	@Test(groups = "SmokeTC")
	public void tc1() //Smoke
	{
		System.out.println("This is TC1");
	}
	@Test(groups={"FunctionalTC","SmokeTC"})
	public void tc2() //Functional,Smoke
	{
		System.out.println("This is TC2");
	}
	@Test(groups = {"IntegrationTC" ,"SmokeTC"})
	public void tc3() //Integration,Smoke
	{
		System.out.println("This is TC3");	
	}
	@Test(groups="E2ETC")
	public void tc4()  //E2ETC
	{
		System.out.println("This is TC4");
	}


}

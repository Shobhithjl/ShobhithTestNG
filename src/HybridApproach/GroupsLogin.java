package HybridApproach;

import org.testng.annotations.Test;

public class GroupsLogin 
{
	@Test(groups = "SmokeTC")
	public void tc1() //Smoke
	{
		System.out.println("This is TC1");
	}
	@Test(groups="FunctionalTC")
	public void tc2() //Functional
	{
		System.out.println("This is TC2");
	}
	@Test(groups = "IntegrationTC")
	public void tc3() //Integration
	{
		System.out.println("This is TC3");	
	}
	@Test(groups="E2ETC")
	public void tc4()  //E2ETC
	{
		System.out.println("This is TC4");
	}

}

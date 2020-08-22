package utilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook1 {
	@Before(order=0)
	public void beforeScenarioStart()
	{
		System.out.println("-----start scenario-----");
	}
	@Before(order=1)
	public void beforeScenario()
	{
		System.out.println("This will run before the every scenario");
	}
	@After(order=1)
	public void afterScnario() {
		System.out.println("This will run after the every scenario");
	}
	@After(order=0)
	public void afterScenarioFinish() {
		System.out.println("-----End of scenario-----");
	}

}

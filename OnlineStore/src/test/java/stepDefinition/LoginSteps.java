//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class LoginSteps {
//	WebDriver driver;
//	@Given("^user entered the url$")
//	public void user_entered_the_url() throws Throwable {
//	    System.setProperty("webdriver.chrome.driver", "H:\\ELF-5 selenium\\OnlineStore\\Drivers\\chromedriver.exe");
//	    driver=new ChromeDriver();
//	    driver.get("https://opensource-demo.orangehrmlive.com/");
//	    driver.manage().window().maximize();
//	}
//
//	@When("^logIn page is displayed$")
//	public void login_page_is_displayed() throws Throwable {
//	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	}
//
//	@When("^enter valid user name \"([^\"]*)\"$")
//	public void enter_valid_user_name(String username) throws Throwable {
//	    driver.findElement(By.id("txtUsername")).sendKeys(username);
//	}
//
//	@When("^enter valid password \"([^\"]*)\"$")
//	public void enter_valid_password(String password) throws Throwable {
//	   driver.findElement(By.id("txtPassword")).sendKeys(password);
//	}
//
//	@When("^enter submit$")
//	public void enter_submit() throws Throwable {
//	  driver.findElement(By.id("btnLogin")).click();
//	}
//
//	@Then("^home page is displayed$")
//	public void home_page_is_displayed() throws Throwable {
//	    String title=driver.getTitle();
//	    System.out.println(title);
//	}
//
//}

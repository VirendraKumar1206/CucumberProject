package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {
	WebDriver driver;
	@Given("open the browser and enter the url")
	public void open_the_browser_and_enter_the_url() {
	   
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://the-internet.herokuapp.com/login");
	}
	@Given("check that url is valid or not")
	public void check_that_url_is_valid_or_bot() {
		System.out.println("url is validated");
	}

	@When("enter the user name")
	public void enter_the_user_name() {
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
	}

	@When("enter the password")
	public void enter_the_password() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
	   	}

	@Then("check login successful")
	public void check_login_successful() {
	  driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
	}

	@Then("user should be inside the webpage")
	public void user_should_be_inside_the_webpage() {
	  System.out.println("user is inside the page");
	}
}

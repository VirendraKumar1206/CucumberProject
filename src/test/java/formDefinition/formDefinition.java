package formDefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class formDefinition {
	 WebDriver driver;
	@Given("open the browser and enter url")
	public void open_the_browser_and_enter_url() {
	    // Write code here that turns the phrase above into concrete actions
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  driver = new ChromeDriver();
	   driver.get("https://v1.training-support.net/selenium/simple-form");
	   driver.manage().window().maximize();
	}

	@When("enter first name")
	public void enter_first_name() {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Avinash");
	}

	@When("enter last name")
	public void enter_last_name() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Ckravarti");
	}

	@When("enter E-mail id")
	public void enter_E_mail_id() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ckravartiavinash121@gmial.com");
	}

	@When("enter contact number")
	public void enter_contact_number() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("8448037120");
	}

	@When("write the message")
	public void write_the_message() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//textarea[@rows='2']")).sendKeys("My details.....");
	}

	@Then("submission should be successfull")
	public void submission_should_be_successfull() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@class='ui green button']")).click();
	}

	@Then("thank you for reaching us pop-up should be displayed")
	public void thank_you_for_reaching_us_pop_up_should_be_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    Alert alert = driver.switchTo().alert();
	    Thread.sleep(3000);
	    alert.accept();
	}
}

package test.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	WebDriver driver;
	@Given("user is on facebook page")
	public void user_is_on_facebook_page() {
		System.setProperty("webdriver.gecko.driver", "D:\\Cucumberday1\\Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
	   driver.get("https://www.facebook.com/");
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String name, String pass) {
		WebElement usertxt = driver.findElement(By.id("email"));
		usertxt.sendKeys(name);
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys(pass);
	   
	}

//	@Then("user should click login button")
//	public void user_should_click_login_button() {
//	    
//	}

}

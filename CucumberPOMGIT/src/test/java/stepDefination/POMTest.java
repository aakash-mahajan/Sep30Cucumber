package stepDefination;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POMTest {
	WebDriver driver;
	@Given("User is on HerukoApp")
	public void user_is_on_HerukoApp() {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/login");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		
		LoginOR Obj = new LoginOR(driver);
		
		Obj.usern.sendKeys("tomsmith");
		Obj.pass.sendKeys("SuperSecretPassword!");
		Obj.login.click();
		
		/*driver.findElement(By.id("username")).sendKeys("tomsmith");
	    driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
	    driver.findElement(By.className("radius")).click();*/
	}

	@Then("user logged in successfully")
	public void user_logged_in_successfully() {
		System.out.println("User logged in successfully");
	}

}

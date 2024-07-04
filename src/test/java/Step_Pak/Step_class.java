package Step_Pak;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Base_pak.Base_class;
import Pom.Pom_class;
import Runner_Pak.Runner_class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_class extends Base_class {
	
	
	
	WebDriver driver=Runner_class.driver;
	Pom_class pg=new Pom_class(driver);
	
	
	@Given("user launches the url and user is on the home page")
	public void user_launches_the_url_and_user_is_on_the_home_page() {
		driver.get("https://magento.softwaretestingboard.com/");
		
	    maximize(driver);
	}

	@Given("user clicking the sign in link")
	public void user_clicking_the_sign_in_link() {
		clk(pg.getSignin());
	    
	}
	@When("user enters the valid {string} and valid {string}")
    public void user_enters_the_valid_and_valid(String string, String string2) {
    Credentials(pg.getEnteringemail(), string);
	Credentials(pg.getEnteringpwd(), string2);
	
	    
	}

	@When("user clicking the sign in button")
	public void user_clicking_the_sign_in_button() {
		clk(pg.getLoginbutton());
	   
	}

	@When("user is on the home page take screenshot")
	public void user_is_on_the_home_page_take_screenshot() throws IOException, InterruptedException {
		Thread.sleep(3000);
	Screenshot(driver, "homepage");
	}
	    
	

	@Then("user should be able to logout of the page")
	public void user_should_be_able_to_logout_of_the_page() {
	   
	}


	
	

}

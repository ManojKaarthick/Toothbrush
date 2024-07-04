package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class {
	
	public static WebDriver driver;
	
	
	@FindBy(xpath = "//a[contains(text(),'Sign In')]")
	private WebElement signin;
	
	@FindBy(xpath = "//input[@id=\"email\"]")
	private WebElement Enteringemail;
	
	
	@FindBy(xpath = "(//input[@type=\"password\"])[1]")
	private WebElement Enteringpwd;
	
	
	@FindBy(xpath = "(//button[@type=\"submit\"])[2]")
	private WebElement loginbutton;


	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getSignin() {
		return signin;
	}


	public WebElement getEnteringemail() {
		return Enteringemail;
	}


	public WebElement getEnteringpwd() {
		return Enteringpwd;
	}


	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	public Pom_class(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	


}


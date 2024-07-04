package Runner_Pak;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Manoj\\eclipse-workspace\\luma_Project\\src\\test\\java\\Feature_Pak",glue="Step_Pak",
		dryRun = false,tags="@Tc1")


public class Runner_class {
	public static WebDriver driver;
	
	@BeforeClass
	public static void browseropen() {
		driver =new ChromeDriver();
	}
	
	@AfterClass
	
	public static void browserclose() {
		driver.close();
	}

}

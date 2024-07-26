package Runner_Pak;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHandling {
	
	public static WebDriver driver;

	public static void main(String[] args) {	
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("//span[.='Browse …']"));
		      JavascriptExecutor js =(JavascriptExecutor)driver;
		      js.executeScript("arguments[0].click()", ele);
		
		

	}

}

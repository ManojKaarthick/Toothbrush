package Runner_Pak;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handles {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		 driver =new ChromeDriver();
		 driver.get("https://letcode.in/alert");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		 WebElement clk=driver.findElement(By.id("accept"));
		 clk.click();
		 Alert a=driver.switchTo().alert();
		 System.out.println("The name of the alert is:"+a.getText());
		 
		 a.accept();
		 driver.close();
		 
//		WebElement click= driver.findElement(By.xpath("//button[text()='Confirm Alert']"));
//		click.click();
//		 Alert b=driver.switchTo().alert();
//		 System.out.println("The alert is"+b.getText());
//		 b.dismiss();
		 
//		 WebElement clk1=driver.findElement(By.id("prompt"));
//		 clk1.click();
//		 
//		 Alert c=driver.switchTo().alert();
//		 
//		 c.sendKeys("Manoj");
//		 c.accept();
//		String name= driver.findElement(By.id("myName")).getText();
//		System.out.println("The name is :" +name);
//		
		 
		
		
	
	
	

	
}
}
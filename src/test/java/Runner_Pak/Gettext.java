package Runner_Pak;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriver driver=new  ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.findElement(By.className("card-content"));
		
		
	}

}

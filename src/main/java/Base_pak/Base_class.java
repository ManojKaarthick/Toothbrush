package Base_pak;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base_class {
	
	
	public static WebDriver driver;
	
	public static void url(WebDriver driver, String s) {
		driver.get(s);
	}
	
	public static void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public static void close(WebDriver driver) {
		driver.close();
	}
	
	public static void Credentials(WebElement ele,String SE) {
		ele.sendKeys(SE);
	}
	public static void clk(WebElement W) {
		W.click();
	}
	
	public static void Screenshot(WebDriver driver,String N) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sc=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Manoj\\eclipse-workspace\\luma_Project\\Screenshot"+N+".Png");
		FileUtils.copyFile(sc,des);
		
	}
	
	

}

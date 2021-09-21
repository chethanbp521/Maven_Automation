package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Amazon {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones under 15000");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.linkText("Redmi")).click();
		//driver.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox'][2]")).click();
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		String price = ele.getText().replace(",", "");
		int act = Integer.parseInt(price);
		int exp = 15000;
		Assert.assertTrue(act<exp);
		System.out.println(act+" is less than 15000. Pass");
		driver.close();
		
	}

}

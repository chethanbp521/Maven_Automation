package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTrip {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//div[@class='loginModal displayBlock modalLogin dynHeight personal ']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'From')]")).click();
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("BLR");
		driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'To')]")).click();
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("DEL");
		driver.findElement(By.xpath("//p[contains(text(),'Delhi, India')]")).click();
		
		driver.findElement(By.xpath("//span[@class='lbl_input latoBold appendBottom10']")).click(); 
		

	}

}

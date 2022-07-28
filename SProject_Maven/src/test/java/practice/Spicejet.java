package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spicejet 
{
	public static void main(String[] args) throws Throwable {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String from = "Kempegowda International Airport";
		String to = "Indira Gandhi International Airport";
		int year = 2021;
		String month = "December";
		int date = 5;
		
		driver.get("https://beta.spicejet.com/");
		
		driver.findElement(By.xpath("//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")).click();
		driver.findElement(By.xpath("//div[text()='"+from+"']")).click();
		driver.findElement(By.xpath("//div[text()='"+to+"']")).click();
		
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-"+month+"-"+year+"']"
				+ "/descendant::div[text()="+date+"]")).click();
		
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		
		driver.findElement(By.xpath("//div[@class = 'css-76zvg2 r-jwli3a r-1i10wst r-1kfrs79']")).click();
		
		
	}

}

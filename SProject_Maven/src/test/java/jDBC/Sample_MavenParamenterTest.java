package jDBC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.autodesk.GenericUtility.PropertyFileUtility;

public class Sample_MavenParamenterTest {

	@Test
	public void sampleTest() throws Throwable
	{
		PropertyFileUtility pfu = new PropertyFileUtility();
		System.out.println("EXECUTE TEST");
		String Url = pfu.getPropertyFileData("url");
		String UserName = pfu.getPropertyFileData("username");
		String Password = pfu.getPropertyFileData("password");
		
		System.out.println(Url);
		System.out.println(UserName);
		System.out.println(Password);
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(Url);
		
		driver.close();
	}
}

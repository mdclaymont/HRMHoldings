package HRM.hrmwebui;

import java.time.Duration;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LogIn {
	
	@Test
	public void login_Test() {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String url=rb.getString("CrigUrl");
		String userName=rb.getString("CrigUserId");
		String userPass=rb.getString("CrigPassword");
		
		driver.get(url);
		driver.findElement(By.id("inputEmailHandle")).sendKeys(userName);
		driver.findElement(By.id("inputPassword")).sendKeys(userPass);
		driver.findElement(By.id("login")).click();
		
		String getTitle=driver.getTitle();
		Assert.assertEquals(getTitle, "craigslist account");
		System.out.println(getTitle);
		driver.close();
	}

}

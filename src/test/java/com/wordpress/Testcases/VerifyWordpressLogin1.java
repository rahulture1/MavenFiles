/**
 * 
 */
package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPage;

/**
 * @author Minds
 *
 */
public class VerifyWordpressLogin1 {

	
	@Test
	public void verifyValidLogin()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/bbpress/wp-login.php");
		
		
		LoginPage login=new LoginPage(driver);
		login.typeUserName("admin");
		login.typePassword("demo123");
		login.ClickOnLoginButton();
		
		driver.quit();
		
		
	}
	
	
	

}

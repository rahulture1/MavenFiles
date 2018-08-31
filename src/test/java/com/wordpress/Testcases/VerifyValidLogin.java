/**
 * 
 */
package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPage;
import com.wordpress.Pages.LoginPageNew;

import Helper.BrowserFactory;

/**
 * @author Minds
 *
 */
public class VerifyValidLogin 
{
	@Test
	public void checkValiduser()
	{
	WebDriver driver=BrowserFactory.startBrowser("chrome", "http://demosite.center/bbpress/wp-login.php");
	
	//Created Page object using Page Factory
	LoginPageNew login_page=PageFactory.initElements(driver, LoginPageNew.class);
	login_page.login_wordpress("admin", "demo123");
	//PageFactory.initElements(driver, LoginPage.class);
	}
	

}

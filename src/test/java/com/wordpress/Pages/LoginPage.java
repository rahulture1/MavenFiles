/**
 * 
 */
package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Minds
 *
 */
public class LoginPage {

	WebDriver driver;
	
	
	By username=By.id("user_login");
	By password=By.id("user_pass");
	By loginButton=By.name("wp-submit");
	
	
	public LoginPage(WebDriver driver) //constructor
	{
		this.driver=driver;
	}
	
	public void typeUserName(String uid)
	{
		driver.findElement(username).sendKeys();
	}
	public void typePassword(String pass)
	{
		driver.findElement(password).sendKeys();	
	}
	public void ClickOnLoginButton()
	{
		driver.findElement(loginButton).click();
	}
	
}

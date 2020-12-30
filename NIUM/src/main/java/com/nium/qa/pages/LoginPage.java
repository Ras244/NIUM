/**
 * 
 */
package com.nium.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.nium.qa.Testbase.TestBase;




public class LoginPage extends TestBase {

	@FindBy(name = "email")
	WebElement Username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//button[text()='Log In']")
	WebElement signbtn;

	@FindBy(xpath = "//li[text()='Log In']")
	WebElement loginBtn;

	@FindBy(xpath = "//button[@type='button']")
	WebElement allow;

	// @FindBy(xpath = "(//button[@type='button'])[2]")
	// WebElement deny;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void verifytitlelogin() {
		String actualtitle = driver.getTitle();
		String expectedtitle = prop.getProperty("title");
		Assert.assertEquals(actualtitle, expectedtitle);
	}

	public Sendmoneypage login() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		loginBtn.click();
		Thread.sleep(3000);
		Username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		signbtn.click();
		Thread.sleep(6000);
		allow.click();
		Thread.sleep(6000);

		return new Sendmoneypage();
	}

	public AddnewRecipeintpage login2() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		loginBtn.click();
		Thread.sleep(3000);
		Username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		signbtn.click();
		Thread.sleep(6000);
		allow.click();
		Thread.sleep(6000);

		return new AddnewRecipeintpage();
	}
	
}

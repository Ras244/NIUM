package com.nium.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.nium.qa.Testbase.TestBase;



public class Paymentmethodpage extends TestBase {
	@FindBy(xpath = "//div[@class='css-tlfecz-indicatorContainer']")
	WebElement ReasonTotransfer;

	@FindBy(xpath = "//div[text()='Transfer to own account']")
	WebElement TranferToOwn;

	@FindBy(xpath = "(//img[@alt='Dropdown Pointer'])[2]")
	WebElement Sourceoffunds;

	@FindBy(xpath = "//div[text()='Investments']")
	WebElement Investments;

	@FindBy(xpath = "//input[@label='Add a Note (Optional)']")
	WebElement Examples;

	@FindBy(xpath = "//button[@class='primary-one-btn']")
	WebElement AuthorizeTransfer;

	@FindBy(xpath = "//button[text()='Send Verification Code']")
	WebElement Sendverificationcode;

	@FindBy(xpath = "//input[@class='form-control otp-input']")
	WebElement otp1;

	@FindBy(xpath = "(//label[text()='Add a Note (Optional)']/following::input)[2]")
	WebElement otp2;

	@FindBy(xpath = "(//input[@class='form-control otp-input'])[3]")
	WebElement otp3;

	@FindBy(xpath = "(//input[@class='form-control otp-input']/following-sibling::input)[3]")
	WebElement otp4;

	@FindBy(xpath ="//div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[5]")
	WebElement otp5;

	@FindBy(xpath = "//div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[6]")
	WebElement otp6;

	@FindBy(xpath = "//button[text()='Confirm']")
	WebElement Confirm;

	public Paymentmethodpage() {
		PageFactory.initElements(driver, this);
	}

	public AddnewRecipeintpage SendingMoneyTo() throws InterruptedException {
        ReasonTotransfer.click();
		TranferToOwn.click();
		Sourceoffunds.click();
		Investments.click();
		Examples.sendKeys("For personal use");
		AuthorizeTransfer.click();
		Sendverificationcode.click();
		otp1.click();
		otp1.sendKeys(prop.getProperty("OTP1"));
		otp2.click();
		otp2.sendKeys(prop.getProperty("OTP2"));
		otp3.click();
		otp3.sendKeys(prop.getProperty("OTP3"));
		otp4.click();
		otp4.sendKeys(prop.getProperty("OTP4"));
		otp5.click();
		otp5.sendKeys(prop.getProperty("OTP5"));
		otp6.click();
		otp6.sendKeys(prop.getProperty("OTP6"));
		Confirm.click();
		Thread.sleep(3000);
		return new AddnewRecipeintpage();

	}

	public void verifyotp() {
		String actualtitle = driver.getTitle();
		String expectedtitle = prop.getProperty("otptitle");
		Assert.assertEquals(actualtitle, expectedtitle);

	}
}

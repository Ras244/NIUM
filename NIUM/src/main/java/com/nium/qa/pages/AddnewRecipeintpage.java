package com.nium.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nium.qa.Testbase.TestBase;




public class AddnewRecipeintpage extends TestBase {
	
	@FindBy(xpath = "//a[contains(@class,'addbtn float-right')]")
	WebElement addrecipient;

	@FindBy(xpath = "//img[@alt='Dropdown Pointer']")
	WebElement recipttype;
	
	@FindBy(xpath = "//div[text()='Individual']")
	WebElement Individual;

	@FindBy(xpath = "//div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	WebElement Recipientrecievingcountry;

	@FindBy(xpath = "//div[@class=' css-1ss7rlo']//div[1]")
	WebElement philip;
	
	@FindBy(xpath = "(//img[@alt='Dropdown Pointer'])[3]")
	WebElement currencybtn;

	@FindBy(xpath = "//div[text()='PHP']")
	WebElement PHP;
	
	@FindBy(xpath = "//div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/img[1]")
	WebElement sendmoneyto;

	@FindBy(xpath = "//div[text()='Self']")
	WebElement self;

	@FindBy(xpath = "//div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/img[1]")
	WebElement countryofrecidience;

	@FindBy(xpath = "//div[@class=' css-1ss7rlo']//div[1]")
	WebElement countryphilip;

	@FindBy(xpath = "//div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/img[1]")
	WebElement title;

	@FindBy(xpath = "//div[text()='Mr.']")
	WebElement titlemr;

	@FindBy(xpath = "//input[@label='First Name']")
	WebElement first;

	@FindBy(xpath = "//label[text()='First Name']/following::input")
	WebElement middle;

	@FindBy(xpath = "//label[text()='Middle Name(optional)']/following::input")
	WebElement last;

	@FindBy(xpath = "//div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/img[1]")
	WebElement code;
	
	@FindBy(xpath = "//div[text()='63']")
	WebElement philipscode;

	@FindBy(xpath = "//input[@label='Email']")
	WebElement codeemail;

	@FindBy(xpath = "//input[@label='Mobile Number']")
	WebElement codemobile;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement saveandcontinue;

	public AddnewRecipeintpage() {
		PageFactory.initElements(driver, this);
	}

	public Recipientaddresspage Newrecipient() throws InterruptedException 
	{
		Thread.sleep(5000);
		addrecipient.click();
		Thread.sleep(5000);
		recipttype.click();
		Thread.sleep(5000);
		Individual.click();
		Recipientrecievingcountry.click();
		philip.click();
		Thread.sleep(3000);
		currencybtn.click();
		PHP.click();
		sendmoneyto.click();
		self.click();
		countryofrecidience.click();
		countryphilip.click();
		title.click();
		titlemr.click();
		Thread.sleep(3000);
		first.sendKeys(prop.getProperty("Firstname"));
		middle.sendKeys(prop.getProperty("Middlename"));
		Thread.sleep(3000);
		last.sendKeys(prop.getProperty("Lastname"));
		code.click();
		philipscode.click();
		codemobile.sendKeys(prop.getProperty("mobile"));
		codeemail.sendKeys(prop.getProperty("Email"));
		Thread.sleep(3000);
		saveandcontinue.click();
		System.out.println("sucessfully procced");
		return new Recipientaddresspage();

	}

}

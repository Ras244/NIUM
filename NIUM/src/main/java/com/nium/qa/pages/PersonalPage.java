package com.nium.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nium.qa.Testbase.TestBase;



public class PersonalPage extends TestBase {
	
	@FindBy(xpath = "//img[@alt='Dropdown Pointer']")
	WebElement titledrop;
	
	@FindBy(xpath = "//div[text()='Ms.']")
	WebElement mrtitle;

	@FindBy(xpath = "//input[@label='First Name']")
	WebElement firstname;

	@FindBy(xpath = "//input[@label='Middle Name (Optional)']")
	WebElement middlename;

	@FindBy(xpath = "//input[@label='Last Name']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@label='Date of Birth']")
	WebElement dateofbirth;
	
	@FindBy(xpath = "(//img[@src='/static/media/pointerDownRed.611ce21c.svg'])[2]")
	WebElement nationalitydrop;
	
	@FindBy(xpath = "//div[@class=' css-1gtu0rj-indicatorContainer']//img[1]")
	WebElement prholder;
	
	@FindBy(xpath = "//div[text()='No']")
	WebElement  prholderno;
	
	@FindBy(xpath = "//div[text()='Filipino, Philippine']")
	WebElement nationality;
	
	@FindBy(xpath = "//input[@label='Mobile Number']")
	WebElement mobileno;
	
	@FindBy(xpath = "//button[text()='Send Verification Code']")
	WebElement mobileotpbtn;
	
	@FindBy(xpath = "(//input[@type='number'])[2]")
	WebElement otptext;
	
	@FindBy(xpath = "//input[@label='Unit/Apartment Number']")
	WebElement unitno;
	
	@FindBy(xpath = "//input[@label='Floor']")
	WebElement floorno;
	
	@FindBy(xpath = "//input[@label='Building Name']")
	WebElement buildingno;
	
	@FindBy(xpath = "//input[@label='Block Number']")
	WebElement blockno;
	
	@FindBy(xpath = "//input[@label='Street']")
	WebElement street;
	
	@FindBy(xpath = "//input[@label='Postal Code']")
	WebElement postalcode;
	
	@FindBy(xpath = "//button[text()=' Proceed to Upload']")
	WebElement procceddocument;
	
	

	public PersonalPage() {
		PageFactory.initElements(driver, this);
	}
	public DocumentuploadPage Personal() throws Throwable {
		titledrop.click();
		mrtitle.click();
		firstname.sendKeys(prop.getProperty("Firstname1"));
		middlename.sendKeys(prop.getProperty("Middlename1"));
		lastname.sendKeys(prop.getProperty("Lastname1"));
		dateofbirth.sendKeys(prop.getProperty("DOB"));
		nationalitydrop.click();
		nationality.click();
		prholder.click();
		prholderno.click();
		Thread.sleep(6000);
		mobileno.sendKeys(prop.getProperty("mobile1"));
		Thread.sleep(6000);
	    mobileotpbtn.click(); 
		Thread.sleep(6000);
	    otptext.sendKeys(prop.getProperty("OTP1"));
	    Thread.sleep(6000);
		unitno.sendKeys(prop.getProperty("Unitno1"));
		floorno.sendKeys(prop.getProperty("Floorno1"));
		buildingno.sendKeys(prop.getProperty("Buildingname1"));
		blockno.sendKeys(prop.getProperty("Blockno1"));
		street.sendKeys(prop.getProperty("Street1"));
		postalcode.sendKeys(prop.getProperty("Postalcode1"));
		procceddocument.click();
		return new DocumentuploadPage();
	}
	
	
	
	
	
	
	
	
}

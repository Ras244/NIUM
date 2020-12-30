package com.nium.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.nium.qa.Testbase.TestBase;



public class SelfieuploadPage extends TestBase
{
	@FindBy(xpath = "//div[@class=\"upload-input-component\"]")
	WebElement selfie;

	@FindBy(xpath = "//button[text()='Save and Continue']")
	WebElement saveandcountine;

	public SelfieuploadPage() {
		PageFactory.initElements(driver, this);
		
	}
	    Screen screen = new Screen();
		public void selfieUploaddoc() throws Throwable {
		selfie.click();
		Thread.sleep(6000);
		Pattern img5 = new Pattern("E:\\sikuli\\image3\\1.PNG");
		Pattern img6 = new Pattern("E:\\sikuli\\image3\\2.PNG");
		screen.wait(img5, 10);
		screen.type(img5, "E:\\sikuli\\image3\\image3.png");
		screen.click(img6);
		Thread.sleep(6000);
        saveandcountine.click();
	}

}

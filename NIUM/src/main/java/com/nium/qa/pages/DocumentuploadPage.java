package com.nium.qa.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.nium.qa.Testbase.TestBase;



public class DocumentuploadPage extends TestBase {
	@FindBy(xpath = "//input[@label='FIN Number']")
	WebElement finno;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div/div/form/div[3]/div/div/input")
	WebElement dateofexpiry;
	
	@FindBy(xpath = "//p[text()='Upload your foreign Identification Card']")
	WebElement demo;
	

	@FindBy(xpath= "//div[@class=\"upload-input-component\"]")
	WebElement finfornt;

	@FindBy(xpath = "//div[@class=\"upload-input-component\"]")
	WebElement finback;

	@FindBy(xpath = "//button[text()='Proceed to ']")
	WebElement proccedto;

	//@FindBy(xpath = "//div[@class=\"upload-input-component\"][1]")
	//WebElement selfie;

	////@FindBy(xpath = "//button[text()='Save and Continue']")
	WebElement saveandcountine;

	public DocumentuploadPage() {
		PageFactory.initElements(driver, this);
	}

	Screen screen = new Screen();
	
	public SelfieuploadPage  Uploaddoc() throws Throwable {
		finno.sendKeys(prop.getProperty("Finno1"));
		Thread.sleep(6000);
		dateofexpiry.sendKeys(prop.getProperty("Expirydate1"));
		demo.click();
		Thread.sleep(6000);
		finfornt.click();
		Thread.sleep(6000);
		Pattern img1 = new Pattern("E:\\sikuli\\image1\\1.PNG");
		Pattern img2 = new Pattern("E:\\sikuli\\image1\\2.PNG");
		screen.wait(img1, 10);
		screen.type(img1, "E:\\sikuli\\image1\\image1.png");
		screen.click(img2);
		Thread.sleep(6000);
	    finback.click();
    	Thread.sleep(6000);
		Pattern img3 = new Pattern("E:\\sikuli\\image2\\1.PNG");
		Pattern img4 = new Pattern("E:\\sikuli\\image2\\2.PNG");
		screen.wait(img3, 10);
		screen.type(img3, "E:\\sikuli\\image2\\image2.png");
		screen.click(img4);
		Thread.sleep(6000);
		proccedto.click();
		System.out.println("successfully procceded");
		Thread.sleep(6000);
		//selfie.click();
		//Thread.sleep(6000);
		//Pattern img5 = new Pattern("E:\\sikuli\\image3\\1.PNG");
		//Pattern img6 = new Pattern("E:\\sikuli\\image3\\2.PNG");
		//screen.wait(img5, 10);
		//screen.type(img5, "E:\\sikuli\\image3\\image3.png");
		//screen.click(img6);
		//Thread.sleep(6000);
        saveandcountine.click();
        return new SelfieuploadPage();
	}
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	

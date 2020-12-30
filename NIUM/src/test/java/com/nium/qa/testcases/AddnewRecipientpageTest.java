package com.nium.qa.testcases;


import java.util.logging.LogManager;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nium.qa.Testbase.TestBase;
import com.nium.qa.pages.AddnewRecipeintpage;
import com.nium.qa.pages.LoginPage;
import com.nium.qa.pages.Paymentmethodpage;
import com.nium.qa.pages.Recipientaddresspage;
import com.nium.qa.pages.Sendmoneypage;

public class AddnewRecipientpageTest extends TestBase {
	LoginPage LoginPag;
	AddnewRecipeintpage AddnewRecipeintpag;
	Recipientaddresspage Recipientaddresspag;
	Sendmoneypage Sendmoneypag;
	Paymentmethodpage Paymentmethodpag;
	@BeforeMethod
	public void setup() {
		initialization();
		}

	@AfterMethod
	public void teardown() {
	driver.quit();
	}

	@Test(priority = 1)
	public void AddRecipienttype() throws Throwable {
		LoginPag = new LoginPage();
		AddnewRecipeintpag	=LoginPag.login2();
		Recipientaddresspag = AddnewRecipeintpag.Newrecipient();		
		Sendmoneypag=Recipientaddresspag.ResidentailAddress();
		Paymentmethodpag=Sendmoneypag.Bankdeposit();
		Paymentmethodpag.SendingMoneyTo();
	}
}

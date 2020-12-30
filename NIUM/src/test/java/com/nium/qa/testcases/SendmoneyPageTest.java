package com.nium.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nium.qa.Testbase.TestBase;
import com.nium.qa.pages.LoginPage;
import com.nium.qa.pages.Sendmoneypage;

public class SendmoneyPageTest extends TestBase {
	LoginPage LoginPag;
	Sendmoneypage Sendmoneypag;

	@BeforeMethod
	public void setup() {
		initialization();
		}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void transferfund() throws Throwable {
		LoginPag = new LoginPage();
		Sendmoneypag=LoginPag.login();
		Sendmoneypag.Bankdeposit();
	}



}

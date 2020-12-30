
package com.nium.qa.testcases;

import java.io.IOException;
import java.util.Hashtable;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.nium.qa.Testbase.TestBase;


import com.nium.qa.pages.LoginPage;
import com.nium.qa.util.testUtil;

public class LoginPageTest extends TestBase {

	LoginPage LoginPag;

	@BeforeMethod
	public void setup() {
		initialization();
		app_logs.debug("LAUNCH BROWSER");
		LoginPag = new LoginPage();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
		app_logs.debug("CLOSE BROWSER");
	}

	@Test(priority = 1)
	public void validatetitle() {
		LoginPag.verifytitlelogin();
		app_logs.debug("VERIFY TITLE");
	}

	@Test(priority = 2)
	public void loginTest() throws Throwable {
		LoginPag.login();
		app_logs.debug("LOGIN TEST");
	}
}

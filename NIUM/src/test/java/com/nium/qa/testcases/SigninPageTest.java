package com.nium.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nium.qa.Testbase.TestBase;
import com.nium.qa.pages.DocumentuploadPage;
import com.nium.qa.pages.PersonalPage;
import com.nium.qa.pages.SigninPage;


public class SigninPageTest extends TestBase {
	

	   SigninPage Signinpag;
	   PersonalPage PersonalPag;
	   DocumentuploadPage DocumentuploadPag;

		@BeforeMethod
		public void setup() {
			initialization();
			app_logs.debug("LAUNCH BROWSER");
		
		}

		@AfterMethod
		public void teardown() {
			driver.quit();
			app_logs.debug("CLOSE BROWSER");
		}

	

		@Test(priority = 1)
		public void signTest() throws Throwable {
			Signinpag = new SigninPage();
			PersonalPag=Signinpag.signin();
			DocumentuploadPag=PersonalPag.Personal();
			DocumentuploadPag.Uploaddoc();
		}
	}



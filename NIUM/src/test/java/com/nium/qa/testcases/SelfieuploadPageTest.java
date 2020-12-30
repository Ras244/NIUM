package com.nium.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nium.qa.Testbase.TestBase;
import com.nium.qa.pages.DocumentuploadPage;
import com.nium.qa.pages.PersonalPage;
import com.nium.qa.pages.SelfieuploadPage;
import com.nium.qa.pages.SigninPage;

public class SelfieuploadPageTest extends TestBase  {
	
		SigninPage Signinpag;
		PersonalPage PersonalPag;
		DocumentuploadPage DocumentuploadPag;
		SelfieuploadPage SelfieuploadPag;
		
		@BeforeMethod
		public void setup() {
			initialization();
			}

		@AfterMethod
		public void teardown() {
			driver.quit();
		}

		@Test(priority = 1)
		public void upload() throws Throwable {
			
			Signinpag = new SigninPage();
		    Signinpag.signin();
			PersonalPag = new PersonalPage();
	        PersonalPag.Personal();
	        DocumentuploadPag =new DocumentuploadPage();
	        DocumentuploadPag.Uploaddoc();
	        SelfieuploadPag =new SelfieuploadPage();
	        SelfieuploadPag.selfieUploaddoc();
		}



	}




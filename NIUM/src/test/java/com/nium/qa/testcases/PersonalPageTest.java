package com.nium.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nium.qa.Testbase.TestBase;
import com.nium.qa.pages.PersonalPage;
import com.nium.qa.pages.SigninPage;



	public class PersonalPageTest extends TestBase {
		SigninPage Signinpag;
		PersonalPage PersonalPag;

		@BeforeMethod
		public void setup() {
			initialization();
			}

		@AfterMethod
		public void teardown() {
			driver.quit();
		}

		@Test(priority = 1)
		public void Personalinfo() throws Throwable {
			Signinpag = new SigninPage();
			Signinpag.signin();
			PersonalPag = new PersonalPage();
            PersonalPag.Personal();
		}



	}



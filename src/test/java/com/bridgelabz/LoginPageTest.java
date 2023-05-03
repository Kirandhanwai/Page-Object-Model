package com.bridgelabz;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.page.HomePage;
import com.bridgelabz.page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

    public class LoginPageTest extends BaseClass {
        LoginPage loginPage;
        HomePage homePage;

        public LoginPageTest(){
            super();
        }

        @BeforeMethod
        public void setUp(){
           launchBrowser();
            loginPage = new LoginPage();
        }

        @Test(priority=1)
        public void loginPageTitleTest(){
            String title = loginPage.validateLoginPageTitle();
            Assert.assertEquals(title, "Cogmento CRM");
        }

        @Test(priority=2)
        public void loginTest(){
            homePage = loginPage.login(properties.getProperty("email"), properties.getProperty("password"));
        }

        @AfterMethod
        public void tearDown(){
            driver.quit();
        }


    }

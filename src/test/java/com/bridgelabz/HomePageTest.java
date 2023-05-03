package com.bridgelabz;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.page.ContactsPage;
import com.bridgelabz.page.HomePage;
import com.bridgelabz.page.LoginPage;
import com.bridgelabz.util.Utility;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {
    LoginPage loginPage;
    HomePage homePage;
    Utility testUtil;
    ContactsPage contactsPage;

    public HomePageTest() {
        super();
    }

    //test cases should be separated -- independent with each other
    //before each test case -- launch the browser and login
    //@test -- execute test case
    //after each test case -- close the browser

    @BeforeMethod
    public void setUp() {
        launchBrowser();
        testUtil = new Utility();
        contactsPage = new ContactsPage();
        loginPage = new LoginPage();
        homePage = loginPage.login(properties.getProperty("email"), properties.getProperty("password"));
    }


    @Test(priority=1)
    public void verifyHomePageTitleTest(){
        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle, "Cogmento CRM","Home page title not matched");
    }

    @Test(priority=2)
    public void verifyUserNameTest(){
     // testUtil.switchToFrame();
        Assert.assertTrue(homePage.verifyCorrectUserName());
    }
    @Test(priority=3)
//    public void verifyContactsLinkTest(){
//       //testUtil.switchToFrame();
//        contactsPage = homePage.clickOnContactsLink();
//    }
//



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

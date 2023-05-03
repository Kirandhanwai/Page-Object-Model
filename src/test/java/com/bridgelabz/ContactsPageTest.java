package com.bridgelabz;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.page.ContactsPage;
import com.bridgelabz.page.HomePage;
import com.bridgelabz.page.LoginPage;
import com.bridgelabz.util.Utility;
import com.github.dockerjava.api.model.Ulimit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ContactsPageTest extends BaseClass {

    LoginPage loginPage;
    HomePage homePage;
    Utility testUtil;
    ContactsPage contactsPage;

    String sheetName = "contacts";


    public ContactsPageTest(){
        super();

    }


    @BeforeMethod
    public void setUp() throws InterruptedException {

        launchBrowser();
        testUtil = new Utility();
        contactsPage = new ContactsPage();
        loginPage = new LoginPage();
        homePage = loginPage.login(properties.getProperty("email"), properties.getProperty("password"));
       //Utility.runTimeInfo("error", "login successful");
      //  Utility.switchToFrame();
         contactsPage = homePage.clickOnContactsLink();
    }

    @Test(priority=1)
    public void verifyContactsPageLabel(){
        Assert.assertTrue(contactsPage.verifyContactsLabel(), "contacts label is missing on the page");
    }

    @Test(priority=2)
    public void selectSingleContactsTest() {
        contactsPage.selectContactsByName("Kiran Dhanwai");
    }

    @Test(priority=3)
    public void selectMultipleContactsTest(){
        contactsPage.selectContactsByName("Kiran Dhanwai");
        contactsPage.selectContactsByName("ui uiii");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}

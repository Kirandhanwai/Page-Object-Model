package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    //Page Factory - OR:
    @FindBy(name="email")
    WebElement email;

    @FindBy(name="password")
    WebElement password;

    @FindBy(xpath="//div[contains(text(),'Login')]")
    WebElement loginBtn;

    @FindBy(xpath="//a[contains(text(),'Sign Up')]")
    WebElement signUpBtn;

    @FindBy(xpath="//body/div[@id='ui']/div[1]/div[2]/div[1]/div[1]")
    WebElement crmLogo;

    //Initializing the Page Objects:
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    //Actions:
    public String validateLoginPageTitle(){
        return driver.getTitle();
    }

    public HomePage login(String un, String pwd){
        email.sendKeys(un);
        password.sendKeys(pwd);
        loginBtn.click();
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].click();", loginBtn);

        return new HomePage();
    }

}



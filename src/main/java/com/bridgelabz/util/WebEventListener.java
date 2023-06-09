//package com.bridgelabz.util;
//
//import com.bridgelabz.base.BaseClass;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.events.WebDriverEventListener;
//
//import java.io.IOException;
//
//public class WebEventListener extends BaseClass implements WebDriverEventListener {
//
//
//    public void beforeNavigateTo(String url, WebDriver driver) {
//        System.out.println("Before navigating to: '" + url + "'");
//    }
//
//    public void afterNavigateTo(String url, WebDriver driver) {
//        System.out.println("Navigated to:'" + url + "'");
//    }
//
//    public void beforeChangeValueOf(WebElement element, WebDriver driver) {
//        System.out.println("Value of the:" + element.toString() + " before any changes made");
//    }
//
//    public void afterChangeValueOf(WebElement element, WebDriver driver) {
//        System.out.println("Element value changed to: " + element.toString());
//    }
//
//    public void beforeClickOn(WebElement element, WebDriver driver) {
//        System.out.println("Trying to click on: " + element.toString());
//    }
//
//    public void afterClickOn(WebElement element, WebDriver driver) {
//        System.out.println("Clicked on: " + element.toString());
//    }
//
//    public void beforeNavigateBack(WebDriver driver) {
//        System.out.println("Navigating back to previous page");
//    }
//
//    public void afterNavigateBack(WebDriver driver) {
//        System.out.println("Navigated back to previous page");
//    }
//
//    public void beforeNavigateForward(WebDriver driver) {
//        System.out.println("Navigating forward to next page");
//    }
//
//    public void afterNavigateForward(WebDriver driver) {
//        System.out.println("Navigated forward to next page");
//    }
//
//    public void onException(Throwable error, WebDriver driver) {
//        System.out.println("Exception occured: " + error);
//        Utility.takeScreenshotAtEndOfTest();
//    }
//
//    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
//        System.out.println("Trying to find Element By : " + by.toString());
//    }
//
//    public void afterFindBy(By by, WebElement element, WebDriver driver) {
//        System.out.println("Found Element By : " + by.toString());
//    }
//
//    /*
//     * non overridden methods of WebListener class
//     */
//    public void beforeScript(String script, WebDriver driver) {
//    }
//
//    public void afterScript(String script, WebDriver driver) {
//    }
//
//    public void beforeAlertAccept(WebDriver driver) {
//        // TODO Auto-generated method stub
//
//    }
//
//    public void afterAlertAccept(WebDriver driver) {
//        // TODO Auto-generated method stub
//
//    }
//
//    public void afterAlertDismiss(WebDriver driver) {
//        // TODO Auto-generated method stub
//
//    }
//
//    public void beforeAlertDismiss(WebDriver driver) {
//        // TODO Auto-generated method stub
//
//    }
//
//    public void beforeNavigateRefresh(WebDriver driver) {
//        // TODO Auto-generated method stub
//
//    }
//
//    public void afterNavigateRefresh(WebDriver driver) {
//        // TODO Auto-generated method stub
//
//    }
//
//    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
//        // TODO Auto-generated method stub
//
//    }
//
//    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
//        // TODO Auto-generated method stub
//
//    }
//
//    public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
//        // TODO Auto-generated method stub
//
//    }
//
//    public void afterGetText(WebElement arg0, WebDriver arg1, String arg2) {
//        // TODO Auto-generated method stub
//
//    }
//
//    public void afterSwitchToWindow(String arg0, WebDriver arg1) {
//        // TODO Auto-generated method stub
//
//    }
//
//    public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
//        // TODO Auto-generated method stub
//
//    }
//
//    public void beforeGetText(WebElement arg0, WebDriver arg1) {
//        // TODO Auto-generated method stub
//
//    }
//
//    public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
//        // TODO Auto-generated method stub
//
//    }
//
//}
//
//
//
package com.bridgelabz.util;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WebEventListener extends BaseClass implements WebDriverEventListener {
    @Override
    public void beforeAlertAccept(WebDriver driver) {

    }

    @Override
    public void afterAlertAccept(WebDriver driver) {

    }

    @Override
    public void afterAlertDismiss(WebDriver driver) {

    }

    @Override
    public void beforeAlertDismiss(WebDriver driver) {

    }

    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {

    }

    @Override
    public void afterNavigateTo(String url, WebDriver driver) {

    }

    @Override
    public void beforeNavigateBack(WebDriver driver) {

    }

    @Override
    public void afterNavigateBack(WebDriver driver) {

    }

    @Override
    public void beforeNavigateForward(WebDriver driver) {

    }

    @Override
    public void afterNavigateForward(WebDriver driver) {

    }

    @Override
    public void beforeNavigateRefresh(WebDriver driver) {

    }

    @Override
    public void afterNavigateRefresh(WebDriver driver) {

    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {

    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {

    }

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {

    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {

    }

    @Override
    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

    }

    @Override
    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

    }

    @Override
    public void beforeScript(String script, WebDriver driver) {

    }

    @Override
    public void afterScript(String script, WebDriver driver) {

    }

    @Override
    public void beforeSwitchToWindow(String windowName, WebDriver driver) {

    }

    @Override
    public void afterSwitchToWindow(String windowName, WebDriver driver) {

    }

    @Override
    public void onException(Throwable throwable, WebDriver driver) {

        System.out.println("Exception Occured: "+throwable);
        Utility.captureScreenshot();
    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> target) {

    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {

    }

    @Override
    public void beforeGetText(WebElement element, WebDriver driver) {

    }

    @Override
    public void afterGetText(WebElement element, WebDriver driver, String text) {

    }
}

//package com.bridgelabz.util;
//
//import com.bridgelabz.base.BaseClass;
//import org.apache.commons.io.FileUtils;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.io.FileHandler;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//
//public class Utility extends BaseClass {
//
//
////    public static long PAGE_LOAD_TIMEOUT = 20;
////    public static long IMPLICIT_WAIT = 20;
////
////    public static String TESTDATA_SHEET_PATH = "/Users/naveenkhunteta/Documents/workspace"
////            + "/FreeCRMTest/src/main/java/com/crm/qa/testdata/FreeCrmTestData.xlsx";
////
////    static Workbook book;
////    static Sheet sheet;
////    static JavascriptExecutor js;
////
////    public static void takeScreenshotAtEndOfTest() {
////    }
////
////    public static void switchToFrame() {
////        driver.switchTo().frame("mainpanel");
////    }
//
//    public static Object[][] getTestData(String sheetName) {
//        FileInputStream file = null;
//        try {
//            file = new FileInputStream(TESTDATA_SHEET_PATH);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        try {
//            book = WorkbookFactory.create(file);
//        } catch (InvalidFormatException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        sheet = book.getSheet(sheetName);
//        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
//        // System.out.println(sheet.getLastRowNum() + "--------" +
//        // sheet.getRow(0).getLastCellNum());
//        for (int i = 0; i < sheet.getLastRowNum(); i++) {
//            for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
//                data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
//                // System.out.println(data[i][k]);
//            }
//        }
//        return data;
//    }
//
//    public static void takeScreenshotAtEndOfTest() throws IOException {
//        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        String currentDir = System.getProperty("user.dir");
//        FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
//    }
//
//}
//
package com.bridgelabz.util;

import com.bridgelabz.base.BaseClass;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Utility extends BaseClass {


    static String testsheetPath = "src/main/resources/facbookLoginTestData.xlsx";
    static Workbook workbook;
    static Sheet sheet;


    public static Object[][] getTestData(String sheetName) {

        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(testsheetPath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            workbook = WorkbookFactory.create(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        sheet = workbook.getSheet(sheetName);

        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        for (int i = 0; i < sheet.getLastRowNum(); i++) {

            for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {

                data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
            }
        }

        return data;
    }
    public static void captureScreenshot(){

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

        File sourceFile = takesScreenshot.getScreenshotAs((OutputType.FILE));

        File destinationFile = new File(System.getProperty("user.dir")+"/screenshots/"+System.currentTimeMillis() + "_screenshot.png");

        try {
            FileHandler.copy(sourceFile, destinationFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

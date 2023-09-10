package Tests;

import Utilities.QaEnvPropReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;


public class Demo {


//        WebDriver driver;
//        @BeforeTest
//        public void setup() throws IOException {
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(5, SECONDS);
//            String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\test\\resources\\Project.xlsx";
//            String url = QaEnvPropReader.getproperty("url");
//            driver.get(url);
//            FileInputStream inputStream = new FileInputStream(excelFilePath);
//            Workbook workbook = new XSSFWorkbook(inputStream);
//            Sheet sheet = workbook.getSheetAt(0);
//            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
//                Row row = sheet.getRow(i);
//                String username = row.getCell(1).getStringCellValue();
//                String password = row.getCell(2).getStringCellValue();
//                Page page = new Page(driver);
//                page.Username.sendKeys(username);
//                page.Password.sendKeys(password);
//                page.Login.click();
//
//            }
//        }
//
//    @Test
//    public void EditJobTitle() throws IOException {
//        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\test\\resources\\Project.xlsx";
//        FileInputStream inputStream = new FileInputStream(excelFilePath);
//        Workbook workbook = new XSSFWorkbook(inputStream);
//        Sheet sheet = workbook.getSheetAt(1);
//        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
//            Row row = sheet.getRow(i);//            String edittitle = row.getCell(4).getStringCellValue();
//            Page page = new Page(driver);
//            page.ClickOnAdmin.click();
//            page.SelectJobDropdown.click();
//            page.SelectJobTitles.click();
//            WebElement old = page.JobTitle;
//            String oldjobtitle = old.getText();
//            page.EditJobTitle.click();
//            page.ClickOnJobTitle.click();
//            page.ClickOnJobTitle.sendKeys(Keys.CONTROL + "a");
//            page.ClickOnJobTitle.sendKeys(Keys.DELETE);
//            page.ClickOnJobTitle.sendKeys(edittitle);
//            page.SaveJobTitle.click();
//            WebElement new1 = page.JobTitle;
//            String newjobtitle = new1.getText();
//            Assert.assertNotEquals(oldjobtitle, newjobtitle, "Text should not match");
//        }
//    }
//
//        @AfterTest
//        public void teardown(){
//
//        driver.quit();
//        }
//public class ScreenshotExample {
//    public static void main(String[] args) {
//        // Set up WebDriver
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        // Open a web page
//        driver.get("https://example.com");
//
//        // Take a screenshot
//        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//        try {
//            // Save the screenshot to a desired location
//            FileUtils.copyFile(screenshotFile, new File("path/to/screenshot.png"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        // Close the WebDriver
//        driver.quit();
//    }
//}
//
//        public static void main(String[] args) throws Exception {
//            WebDriverManager.chromedriver().setup();
//            WebDriver driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(5, SECONDS);
//            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//            driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
//            driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
//            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
//
//        }

}

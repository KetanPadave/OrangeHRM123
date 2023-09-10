package Tests;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Poject15 extends Basetest {
    @Test
    public void CreateJobTitle() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(1);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String jobtitle = row.getCell(1).getStringCellValue();
            String jobsepcification = row.getCell(2).getStringCellValue();
            String note = row.getCell(3).getStringCellValue();
            Page page = new Page(driver);
            page.ClickOnAdmin.click();
            page.SelectJobDropdown.click();
            page.SelectJobTitles.click();
            page.ClickOnAdd.click();
            page.ClickOnJobTitle.sendKeys(jobtitle);
            page.ClickOnJobDescription.sendKeys(jobsepcification);
            page.AddNotes.sendKeys(note);
            page.SaveJobTitle.click();
            boolean displayed = page.VerifyJobTitle.isDisplayed();
            Assert.assertEquals(displayed,true);

        }
    }

    @Test
    public void EditJobTitle() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(1);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String edittitle = row.getCell(4).getStringCellValue();
            Page page = new Page(driver);
            page.ClickOnAdmin.click();
            page.SelectJobDropdown.click();
            page.SelectJobTitles.click();
            page.EditJobTitle.click();
            page.ClickOnJobTitle.click();
            page.ClickOnJobTitle.sendKeys(Keys.CONTROL + "a");
            page.ClickOnJobTitle.sendKeys(Keys.DELETE);
            page.ClickOnJobTitle.sendKeys(edittitle);
            page.SaveJobTitle.click();
            boolean displayed = page.VerifyEditJobTitle.isDisplayed();
            Assert.assertEquals(displayed,true);
        }
    }


    @Test
    public void DeleteJobTitle() throws IOException {

            Page page = new Page(driver);
            page.ClickOnAdmin.click();
            page.SelectJobDropdown.click();
            page.SelectJobTitles.click();
            page.JobTitle1select.click();
            page.DeleteJobTitle1select.click();
            page.DeleteJobTitle.click();
            boolean displayed = page.VerifyDeleteJobTitle.isDisplayed();
            Assert.assertEquals(displayed,true);

    }

    @Test
    public void VerifyComplsoryFieldCreateJobTitle() throws IOException {
            Page page = new Page(driver);
            page.ClickOnAdmin.click();
            page.SelectJobDropdown.click();
            page.SelectJobTitles.click();
            page.ClickOnAdd.click();
            page.SaveJobTitle.click();
            boolean displayed = page.VerifyCompulsoryFieldInCreateJobTitle.isDisplayed();
            Assert.assertEquals(displayed,true);
    }

    @Test
    public void CreatePayGrade() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(2);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String paygradename = row.getCell(1).getStringCellValue();
            Page page = new Page(driver);
            page.ClickOnAdmin.click();
            page.SelectJobDropdown.click();
            page.SelectPayGrades.click();
            page.AddPayGrades.click();
            page.NamePayGrades.sendKeys(paygradename);
            page.SavePayGrades.click();
            boolean displayed = page.VerifySavePayGrades.isDisplayed();
            Assert.assertEquals(displayed,true);
        }
    }
    @Test
    public void EditPaygrade() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(2);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String editpaygrade = row.getCell(2).getStringCellValue();
            Page page = new Page(driver);
            page.ClickOnAdmin.click();
            page.SelectJobDropdown.click();
            page.SelectPayGrades.click();
            page.Editpaygrade.click();
            page.paygradetoedit.click();
            page.paygradetoedit.sendKeys(Keys.CONTROL + "a");
            page.paygradetoedit.sendKeys(Keys.DELETE);
            page.paygradetoedit.sendKeys(editpaygrade);
            page.Saveedit.click();
            boolean displayed = page.VerifySaveEdit.isDisplayed();
            Assert.assertEquals(displayed,true);
        }
    }
    @Test
    public void DeletePayGrade() throws IOException {

        Page page = new Page(driver);
        page.ClickOnAdmin.click();
        page.SelectJobDropdown.click();
        page.SelectPayGrades.click();
        page.SelectPayGradeTitle.click();
        page.DeletePayGradeTitle.click();
        page.DeletePayGradeTitleYes.click();
        boolean displayed = page.VerifyDeletePayGrade.isDisplayed();
        Assert.assertEquals(displayed,true);

    }

    @Test
    public void VerifyPayGradeRequireFieldFunctionality() throws IOException {
        Page page = new Page(driver);
            page.ClickOnAdmin.click();
            page.SelectJobDropdown.click();
            page.SelectPayGrades.click();
            page.AddPayGrades.click();
            page.SavePayGrades.click();
            boolean displayed = page.VerifyPayGradeRequireFieldFunctionality.isDisplayed();
            Assert.assertEquals(displayed,true);

    }
    @Test
    public void CreateEmploymentStatus() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(3);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String employmentname = row.getCell(1).getStringCellValue();
            Page page = new Page(driver);
            page.ClickOnAdmin.click();
            page.SelectJobDropdown.click();
            page.SelectEmploymentStatus.click();
            page.AddEmploymentStatus.click();
            page.AddEmploymentStatusName.sendKeys(employmentname);
            page.SaveEmploymentStatusName.click();
            boolean displayed = page.VerifySaveEmploymentStatus.isDisplayed();
            Assert.assertEquals(displayed,true);
        }
    }

    @Test
    public void EditEmploymentStatus() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(3);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String editEmployeestatus = row.getCell(2).getStringCellValue();
            Page page = new Page(driver);
            page.ClickOnAdmin.click();
            page.SelectJobDropdown.click();
            page.SelectEmploymentStatus.click();
            page.EditEmploymentStatusName.click();
            page.EditStatusName.click();
            page.EditStatusName.sendKeys(Keys.CONTROL + "a");
            page.EditStatusName.sendKeys(Keys.DELETE);
            page.EditStatusName.sendKeys(editEmployeestatus);
            page.SaveEditedEmploymentStatusName.click();
            boolean displayed = page.VerifyEditedEmploymentStatus.isDisplayed();
            Assert.assertEquals(displayed,true);
        }
    }

    @Test
    public void DeleteEmploymentStatus() throws IOException {

        Page page = new Page(driver);
        page.ClickOnAdmin.click();
        page.SelectJobDropdown.click();
        page.SelectEmploymentStatus.click();
        page.EmploymentStatusTitleSelect.click();
        page.EmploymentStatusTitleDelete.click();
        page.EmploymentStatusTitleDeleteComplete.click();
        boolean displayed = page.VerifyEmploymentStatusDelete.isDisplayed();
        Assert.assertEquals(displayed,true);
    }

    @Test
    public void VerifyCompulsoryEmploymentStatusField() throws IOException {

        Page page = new Page(driver);
        page.ClickOnAdmin.click();
        page.SelectJobDropdown.click();
        page.SelectEmploymentStatus.click();
        page.AddEmploymentStatus.click();
        page.SaveEmploymentStatusName.click();
        boolean displayed = page.VerifyReqCreateEmploymentStatusField.isDisplayed();
        Assert.assertEquals(displayed,true);
    }


    @Test
    public void CreateJobCategories() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(4);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String jobcategory = row.getCell(1).getStringCellValue();
            Page page = new Page(driver);
            page.ClickOnAdmin.click();
            page.SelectJobDropdown.click();
            page.SelectJobCategories.click();
            page.AddJobCategory.click();
            page.AddJobCategoryName.sendKeys(jobcategory);
            page.SaveJobCategoryName.click();
            boolean displayed = page.VerifySaveJobCategoryName.isDisplayed();
            Assert.assertEquals(displayed,true);
        }
    }

    @Test
    public void EditJobCategory() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(4);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String editjobcategory = row.getCell(2).getStringCellValue();
            Page page = new Page(driver);
            page.ClickOnAdmin.click();
            page.SelectJobDropdown.click();
            page.SelectJobCategories.click();
            page.EditJobCategoryName.click();
            page.EnterJobCategoryName.click();
            page.EnterJobCategoryName.sendKeys(Keys.CONTROL + "a");
            page.EnterJobCategoryName.sendKeys(Keys.DELETE);
            page.EnterJobCategoryName.sendKeys(editjobcategory);
            page.SaveEditJobCategoryName.click();
            boolean displayed = page.VerifySaveEditJobCategory.isDisplayed();
            Assert.assertEquals(displayed,true);
        }
    }

    @Test
    public void DeleteJobCategory() throws IOException {
        Page page = new Page(driver);
        page.ClickOnAdmin.click();
        page.SelectJobDropdown.click();
        page.SelectJobCategories.click();
        page.JobCategorySelect.click();
        page.DeleteJobCategory.click();
        page.ConfirmDeleteJobCategory.click();
        boolean displayed = page.VerifyDeleteJobCategory.isDisplayed();
        Assert.assertEquals(displayed,true);
    }

    @Test
    public void VerifyReqFieldsCreateJobCategories() throws IOException {
            Page page = new Page(driver);
            page.ClickOnAdmin.click();
            page.SelectJobDropdown.click();
            page.SelectJobCategories.click();
            page.AddJobCategory.click();
            page.SaveJobCategoryName.click();
            boolean displayed = page.VerifyREqFieldsCreateJobCategory.isDisplayed();
            Assert.assertEquals(displayed,true);
        }

    @Test
    public void CreateWorkShift() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(5);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String workshift = row.getCell(1).getStringCellValue();
            Page page = new Page(driver);
            page.ClickOnAdmin.click();
            page.SelectJobDropdown.click();
            page.SelectWorkShift.click();
            page.AddWorkShift.click();
            page.AddWorkShiftName.sendKeys(workshift);
        }
    }

    @Test
    public void EditWorkShift() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(5);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String editworkshift = row.getCell(4).getStringCellValue();
//            String editworkshifttimeto = row.getCell(5).getStringCellValue();
            Page page = new Page(driver);
            page.ClickOnAdmin.click();
            page.SelectJobDropdown.click();
            page.SelectWorkShift.click();
            WebElement old = page.WorkShiftName;
            String oldworkshift = old.getText();
            page.EditWorkShiftName.click();
            page.EnterWorkShiftName.click();
            page.EnterWorkShiftName.sendKeys(Keys.CONTROL + "a");
            page.EnterWorkShiftName.sendKeys(Keys.DELETE);
            page.EnterWorkShiftName.sendKeys(editworkshift);
//            page.EnterWorkShiftTimeTo.clear();
//            page.EnterWorkShiftTimeTo.sendKeys(editworkshifttimeto);
            page.SaveEditWorkShift.click();
            WebElement new1 = page.WorkShiftName;
            String newworkshift = new1.getText();
            Assert.assertNotEquals(oldworkshift, newworkshift, "Text should not match");
        }
    }
    @Test
    public void DeleteWorkShift() throws IOException {

        Page page = new Page(driver);
        page.ClickOnAdmin.click();
        page.SelectJobDropdown.click();
        page.SelectWorkShift.click();
        WebElement old = page.WorkShift;
        String oldworkshift = old.getText();
        page.WorkShiftSelect.click();
        page.WorkShiftSelectDelete.click();
        page.ConfirmWorkShiftSelectDelete.click();
        WebElement new1 = page.WorkShift;
        String newworkshift = new1.getText();
        Assert.assertNotEquals(oldworkshift, newworkshift, "Text should not match");

    }
}

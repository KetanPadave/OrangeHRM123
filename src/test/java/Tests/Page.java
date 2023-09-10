package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Page {
    public Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@name='username']")
    public WebElement Username;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement Password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement Login;
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][1]")
    public WebElement ClickOnAdmin;
    //i[@class='oxd-icon bi-x oxd-sidepanel-header-close']
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")
    public WebElement SelectJobDropdown;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")
    public WebElement SelectJobTitles;
    @FindBy(xpath = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
    public WebElement ClickOnAdd;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
    public WebElement ClickOnJobTitle;
    (//div//input[@class='oxd-input oxd-input--active'])[2]
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")
    public WebElement ClickOnJobDescription;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[1]")
    public WebElement ClickOnJobSpecification;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")
    public WebElement AddNotes;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SaveJobTitle;
    @FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]/div/div[1]/div[2]/p[2]")
    public WebElement VerifyJobTitle;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[4]/div/button[2]/i")
    public WebElement EditJobTitle;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[2]/div")
    public WebElement JobTitle;
    @FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]/div/div[1]/div[2]/p[2]")
    public WebElement VerifyEditJobTitle;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[2]/div/div[2]/div")
    public WebElement JobTitle1;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[2]/div/div[1]/div/div/label/span/i")
    public WebElement JobTitle1select;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/button")
    public WebElement DeleteJobTitle1select;
    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")
    public WebElement DeleteJobTitle;
    @FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]/div/div[1]/div[2]/p[2]")
    public WebElement VerifyDeleteJobTitle;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/span")
    public WebElement VerifyCompulsoryFieldInCreateJobTitle;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[2]/a")
    public WebElement SelectPayGrades;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")
    public WebElement AddPayGrades;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input")
    public WebElement NamePayGrades;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
    public WebElement SavePayGrades;
    @FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]/div/div[1]/div[2]/p[2]")
    public WebElement VerifySavePayGrades;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/div/div[1]/div/button")
    public WebElement Addcurrecy;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/form/div[1]/div/div/div/div[2]/div/div/div[1]")
    public WebElement Selectcurrecydropdown;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/form/div[1]/div/div/div/div[2]/div/div/div[1]")
    public WebElement Selectcurrecy;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[4]/div/button[2]/i")
    public WebElement Editpaygrade;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/div/form/div[1]/div/div/div/div[2]/input")
    public WebElement paygradetoedit;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/div/form/div[2]/button[2]")
    public WebElement Saveedit;
    @FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]/div/div[1]/div[2]/p[2]")
    public WebElement VerifySaveEdit;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[2]/div")
    public WebElement Paygradename;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[2]/div/div[2]/div")
    public WebElement PayGradeTitle;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[2]/div/div[1]/div/div/label/span/i")
    public WebElement SelectPayGradeTitle;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/button")
    public WebElement DeletePayGradeTitle;
    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")
    public WebElement DeletePayGradeTitleYes;
    @FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]/div/div[1]/div[2]/p[2]")
    public WebElement VerifyDeletePayGrade;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/span")
    public WebElement VerifyPayGradeRequireFieldFunctionality;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[3]/a")
    public WebElement SelectEmploymentStatus;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")
    public WebElement AddEmploymentStatus;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
    public WebElement AddEmploymentStatusName;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
    public WebElement SaveEmploymentStatusName;
    @FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]/div/div[1]/div[2]/p[2]")
    public WebElement VerifySaveEmploymentStatus;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[2]/div")
    public WebElement EmploymentStatusName;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[3]/div/button[2]/i")
    public WebElement EditEmploymentStatusName;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
    public WebElement EditStatusName;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
    public WebElement SaveEditedEmploymentStatusName;
    @FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]/div/div[1]/div[2]/p[2]")
    public WebElement VerifyEditedEmploymentStatus;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[2]/div/div[2]/div")
    public WebElement EmploymentStatusTitle;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[2]/div/div[1]/div/div/label/span/i")
    public WebElement EmploymentStatusTitleSelect;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/button")
    public WebElement EmploymentStatusTitleDelete;
    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")
    public WebElement EmploymentStatusTitleDeleteComplete;
    @FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]/div/div[1]/div[2]/p[2]")
    public WebElement VerifyEmploymentStatusDelete;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/span")
    public WebElement VerifyReqCreateEmploymentStatusField;


    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[4]/a")
    public WebElement SelectJobCategories;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")
    public WebElement AddJobCategory;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
    public WebElement AddJobCategoryName;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
    public WebElement SaveJobCategoryName;
    @FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]/div/div[1]/div[2]/p[2]")
    public WebElement VerifySaveJobCategoryName;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[2]/div")
    public WebElement JobCategoryName;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[3]/div/button[2]/i")
    public WebElement EditJobCategoryName;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
    public WebElement EnterJobCategoryName;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
    public WebElement SaveEditJobCategoryName;
    @FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]/div/div[1]/div[2]/p[2]")
    public WebElement VerifySaveEditJobCategory;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[2]/div/div[2]/div")
    public WebElement JobCategory;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[2]/div/div[1]/div/div/label/span/i")
    public WebElement JobCategorySelect;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/button")
    public WebElement DeleteJobCategory;
    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")
    public WebElement ConfirmDeleteJobCategory;
    @FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]/div/div[1]/div[2]/p[2]")
    public WebElement VerifyDeleteJobCategory;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/span")
    public WebElement VerifyREqFieldsCreateJobCategory;


    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[5]/a")
    public WebElement SelectWorkShift;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")
    public WebElement AddWorkShift;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input")
    public WebElement AddWorkShiftName;
    @FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]/div/div[1]/div[2]/p[2]")
    public WebElement AddWorkShiftName1;
    //*[@id="oxd-toaster_1"]/div/div[1]/div[2]/p[2]
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/input")
    public WebElement WorkShiftTimeFrom;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div[2]/div[1]/input")
    public WebElement WorkShiftTimeFromHR;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div[2]/div[4]/div[1]/input")
    public WebElement WorkShiftTimeFormat;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/input")
    public WebElement WorkShiftTimeTo;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/input")
    public WebElement WorkShiftTimeToHR;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div[2]/div[4]/div[2]/input")
    public WebElement WorkShiftTimeToFormat;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div/div/div[2]/div/div[1]/input")
    public WebElement WorkShiftPerson;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/button[2]")
    public WebElement SaveWorkShift;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[2]/div")
    public WebElement WorkShiftName;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[6]/div/button[2]/i")
    public WebElement EditWorkShiftName;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input")
    public WebElement EnterWorkShiftName;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/input")
    public WebElement EnterWorkShiftTimeTo;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/button[2]")
    public WebElement SaveEditWorkShift;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[2]/div/div[2]/div")
    public WebElement WorkShift;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[2]/div/div[1]/div/div/label/span/i")
    public WebElement WorkShiftSelect;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/button")
    public WebElement WorkShiftSelectDelete;
    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")
    public WebElement ConfirmWorkShiftSelectDelete;








}

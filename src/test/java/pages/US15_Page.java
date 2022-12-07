package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US15_Page {


    public US15_Page()  {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement myPagesSekmesi;

    @FindBy(xpath = "//li[@id='admin-menu']")
    public WebElement adminAdministrator;

    @FindBy(xpath = "//*[@href=\"/admin/user-management\"]")
    public WebElement userManagement;

    @FindBy(xpath = "//*[@href='/admin/user-management/new']")
    public WebElement createAnewUser;

    @FindBy(name = "login")
    public WebElement formUserLogin;

    @FindBy(name = "firstName")
    public WebElement formUserFirstname;

    @FindBy(name = "lastName")
    public WebElement formUserLastname;

    @FindBy(name = "email")
    public WebElement formUserEmail;

    @FindBy(name = "ssn")
    public WebElement formUserSsn;

    @FindBy(xpath = "//*[@id=\"langKey\"]/option[1]")
    public WebElement formUserLanguage;

    @FindBy(xpath = "//*[@id=\"authorities\"]/option[3]")
    public WebElement formUserRole;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement formUserSave;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alert;

    @FindBy(xpath = "//*[text()='Your SSN is invalid']")
    public WebElement invalidSnn;

    @FindBy(xpath = "//*[text()='Your email is invalid.']")
    public WebElement invalidEmail;














}

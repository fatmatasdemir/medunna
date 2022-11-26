package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class US_19_Page {
    public US_19_Page() {  PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement icon;


    @FindBy(linkText = "Sign in")
    public WebElement signIn;


    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement sigINBtn;

    @FindBy(linkText = "Items&Titles")
    public WebElement itemTitle;

    @FindBy(linkText = "Staff")
    public WebElement staffBtn;

    @FindBy(linkText = "Create a new Staff")
    public WebElement createStaff;

    @FindBy(id = "useSSNSearch")
    public WebElement useSearch;

    @FindBy(id = "searchSSN")
    public WebElement searchSsn;

    @FindBy(css = "[class='btn btn-secondary']")
    public WebElement searchUserBtn;

    @FindBy(id = "staff-phone")
    public WebElement staffTelefon;
    @FindBy(id = "staff-adress")
    public WebElement staffAdress;

    @FindBy(id = "staff-description")
    public WebElement staffDescription;

    @FindBy(id = "staff-country")
    public WebElement staffCountry;

    @FindBy(id = "staff-cstate")
    public WebElement staffState;

    @FindBy(xpath = "//button[@type='submit']/*/*")
    public WebElement save;

    @FindBy(linkText = "View")
    public WebElement view;

    @FindBy(linkText = "Edit")
    public WebElement edit;

    @FindBy(linkText = "Delete")
    public WebElement deleteIcon;
    @FindBy(id = "jhi-confirm-delete-staff")
    public WebElement deleteBtn;

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class US_19_20_21_Page {
    public US_19_20_21_Page() {  PageFactory.initElements(Driver.getDriver(), this);
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
    public static WebElement save;

    @FindBy(linkText = "View")
    public WebElement view;

    @FindBy(linkText = "Edit")
    public WebElement edit;

    @FindBy(linkText = "Delete")
    public WebElement deleteIcon;
    @FindBy(id = "jhi-confirm-delete-staff")
    public WebElement deleteBtn;

    @FindBy(linkText = "MY PAGES")
    public WebElement myPages;

    @FindBy(linkText = "Search Patient")
    public WebElement searchPatientIcon;

    @FindBy(linkText = "Show Appointments")
    public WebElement showAppoin;

    @FindBy(id = "appointment-status")
    public WebElement status;

    @FindBy(xpath = "//option[@value='PENDING']")
    public WebElement pending;

    @FindBy(id = "appointment-physician")
    public WebElement physician;

    @FindBy(xpath = "//option[@value='COMPLETED']")
    public WebElement completed;
    @FindBy(id = "appointment-anamnesis")
    public WebElement anamnesis;

    @FindBy(id = "appointment-treatment")
    public WebElement treatment;
    @FindBy(id = "appointment-diagnosis")
    public WebElement diagnose;

    @FindBy(xpath = "//option[@value='CANCELLED']")
    public WebElement cancelled;

    @FindBy(linkText = "Administration")
    public WebElement administration;

    @FindBy(linkText = "User management")
    public WebElement management;

    @FindBy(xpath = "//select[@id='authorities']")
    public WebElement profil;

    @FindBy(linkText = "ROLE_PHYSICIAN")
    public WebElement role;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveBtn;

    @FindBy(linkText = "Show Tests")
    public WebElement test;

}

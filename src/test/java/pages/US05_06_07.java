package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US05_06_07 {




    public US05_06_07()  {
        PageFactory.initElements(Driver.getDriver(), this);}



    @FindBy(css = ".Toastify__toast-body")
    public static WebElement AppointmentRegistrationSaved;

    @FindBy (xpath="//*[text()='Your FirstName is required.']")
    public static WebElement firstNameIsRequired;

    @FindBy(xpath="//input[@name='ssn']")
    public static WebElement SSN;
    @FindBy(xpath="//*[text()='Your SSN is invalid']")
    public static WebElement YourSSNIsInvalid;

    @FindBy (xpath="//input[@name='lastName']")
    public static WebElement LastName;

    @FindBy (xpath="//input[@name='email']")
    public static WebElement Email;

    @FindBy (xpath="//input[@name='phone']")
    public static WebElement PhoneNumber;

    @FindBy (xpath="//*[text()='Send an Appointment Request']")
    public static WebElement SendanAppointmentRequestButonu;

    @FindBy (xpath="(//*[text()='My Appointments'])[1]")
    public static WebElement MyAppointments;

    @FindBy(xpath="//thead//tr[1]//th[1]")
    public static WebElement id;
    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public static WebElement accountMenuButton2;

    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    public static WebElement signInButton;

    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Sign in')]")
    public static WebElement signInButton2;
    @FindBy(xpath = "//*[@id='entity-menu']")
    public static WebElement myPages;
    @FindBy(xpath = "//input[@name='appoDate']")
    public static WebElement appointmentDateTimeBox;
    @FindBy(xpath = "//input[@id='username']")
    public static WebElement usernameTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public static WebElement passwordTextBox;
    @FindBy(xpath = "//span[normalize-space()='Settings']")
    public static WebElement settingsButton;

    @FindBy(xpath = "//input[@id='firstName']")
    public static WebElement firstnameTextbox;

    @FindBy(xpath = "//input[@id='lastName']")
    public static WebElement lastnameTextbox;

    @FindBy(xpath = "//input[@id='email']")
    public static WebElement emailTextbox;

    @FindBy(xpath = "//span[normalize-space()='Save']")
    public static WebElement saveButton;

    @FindBy(xpath = "//strong[normalize-space()='Settings saved!']")
    public static WebElement settingsSavedText;
    @FindBy(xpath = "//input[@id='appoDate']")
    public static WebElement appoDate;
    @FindBy(xpath = "//*[@class='appointment-btn scrollto']")
    public static WebElement makeAnAppointmentButton;
    @FindBy(xpath = "(//input[@id='phone'])[1]")
    public static WebElement phoneBox;
    @FindBy(xpath="//span[text()='Appointment date can not be past date!']")
    public static WebElement pastDateTextElement;









}

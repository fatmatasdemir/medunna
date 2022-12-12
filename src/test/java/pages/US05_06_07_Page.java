package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US05_06_07_Page {




    public US05_06_07_Page()  {
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


    //US_12 LOCATE

    @FindBy (id = "account-menu")
    public WebElement accountMenu;

    @FindBy (id = "login-item")
    public WebElement signInButton1;

    @FindBy (xpath = "//input[@name='username']")
    public WebElement userNameButton;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement passwordButton;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement signInButton3;

   // @FindBy (xpath = "//*[text()='MY PAGES']")
   // public WebElement myPages;

    @FindBy (xpath = "(//*[text()='My Appointments'])[1]")
    public WebElement myAppointments;

    @FindBy (xpath = "//*[text()='Edit']")
    public WebElement editButton;

    @FindBy(xpath = "//*[text()='Request A Test']")
    public WebElement requestATest;

    @FindBy (xpath = "//tr//th")
    public List<WebElement> testItemsTable;

    @FindBy (xpath = "//button[@id='save-entity']")
    public WebElement saveButtonx;



    @FindBy (xpath = "//*[text()='Show Test Results']")
    public WebElement showTestResultButton;

    @FindBy (xpath = "//*[text()='Request Inpatient']")
    public WebElement requestInpatientButton;


    @FindBy(xpath = "(//div[@class='btn-group flex-btn-group-container'])[1]")
    public WebElement viewResultsButton;

    @FindBy (xpath = "//tr//th")
    public List<WebElement> testResultsBaslikIsimleri;

    @FindBy(xpath = "//input[@id='1404']")
    public WebElement sodiumbutton;

    @FindBy(xpath = "//input[@id='1402']")
    public WebElement ureaButton;

    @FindBy(xpath = "//input[@id='1408']")
    public WebElement hemoglobinButton;

    @FindBy(xpath = "//input[@id='1407']")
    public WebElement albuminButton;

    @FindBy(xpath = "//input[@id='1403']")
    public WebElement creatinineButton;

    @FindBy(xpath = "//input[@id='132795']")
    public WebElement potassiumButton;

    @FindBy(xpath = "//input[@id='132751']")
    public WebElement glucoseButton;

    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> testResultsListesi;


    //US_26 LOCATELERI

    @FindBy(xpath="//*[text()='CONTACT']")
    public WebElement contactButton;

    //@FindBy(xpath = "//*[text()=\"575 Eighth Avenue New York, NY 10018\"][1]")
    //public WebElement location;

    @FindBy(xpath = "//div[@class='info']")
    public List<WebElement> uclu;

    @FindBy(xpath = "//p[starts-with(text(),'575')]")
    public WebElement location;

    @FindBy(xpath = "//p[starts-with(text(),'contact@')]")
    public WebElement email;

    @FindBy(xpath = "(//p[starts-with(text(),'+1 (336)')])[1]")
    public WebElement call;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement mesajName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement mesajEmail;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement mesajSubject;



    @FindBy(xpath = "//*[@id='message']")
    public WebElement mesaj;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement sendButonu;

    @FindBy(xpath = "//*[@id=\"register-form\"]/div[1]/div[1]/div/div")
    public WebElement NameIsRequired;

    @FindBy(xpath = "//*[@id=\"register-form\"]/div[1]/div[2]/div/div")
    public WebElement YourEmailIsRequired;

    @FindBy(xpath = "//*[@id=\"register-form\"]/div[2]/div/div/div")
    public  WebElement ThisFieldIsRequired;


    //*[@id="register-form"]/div[2]/div/div/div


}

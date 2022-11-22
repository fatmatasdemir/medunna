package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US05_06_07 {




    public US05_06_07()  {
        PageFactory.initElements(Driver.getDriver(), this);}



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



    @FindBy(xpath = "//*[@class='dropdown nav-item']")
    public static WebElement girisIkonu;

    @FindBy(xpath = "//span[text()='Sign in']")
    public static WebElement signInTextElement;

    @FindBy(xpath = "//input[@name='username']")
    public static WebElement signInUsername;

    @FindBy(xpath = "//input[@name='password']")
    public static WebElement signInPassword;



    @FindBy(xpath = "//span[text()='MY PAGES(PATIENT)']")
    public WebElement myPagesPatient;


    @FindBy(xpath = "//span[text()='Send an Appointment Request']")
    public WebElement sendAnAppointmentRequest;

    @FindBy(xpath = "//div[text()='Your FirstName is required.']")
    public WebElement firstNameRequiredTextElement;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement makeAnAppointmentSsn;

    @FindBy(xpath = "//div[text()='Your SSN is required.']")
    public WebElement ssnRequiredTextElement;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement makeAnAppointmentLastName;

    @FindBy(xpath = "//div[text()='Your LastName is required.']")
    public WebElement lastNameRequiredTextElement;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement makeAnAppointmentPhone;

    @FindBy(xpath = "//div[text()='Phone number is required.']")
    public WebElement phoneNumberRequiredTextElement;

    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement makeAppointmentsElement;

    @FindBy(xpath = "//tbody//tr/td[6]")
    public List<WebElement> createdDateElements;

   // //span[text()='Settings']

    @FindBy(xpath = "  //*[@id=\"account-menu\"]/div/a[1]/span")
    public static WebElement settings;

    @FindBy(xpath = "//input[@name='firstName']")
    public static WebElement settingsFirstName;

    @FindBy(xpath = "//input[@name='lastName']")
    public static WebElement settingsLastName;

    @FindBy(xpath = "//input[@name='email']")
    public static WebElement settingsEmail;




   // @FindBy(xpath = "(//a[@href='#'])[1]")
   // public WebElement dropDownIkonu;

  //  @FindBy(xpath = "//span[text()='Sign in']")
   // public WebElement signinElementi;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    //@FindBy(xpath = "//button[@type='submit']")
   // public WebElement signinButonu;

  //  @FindBy(xpath = "//span[text()='MY PAGES(PATIENT)']")
   // public WebElement mypagesElementi;

    @FindBy(xpath = "//span[text()='Make an Appointment']")
    public static WebElement makeanAppointmentButonu;



    @FindBy(xpath = "//input[@name='appoDate']")
    public static WebElement appointmentDateTimeBox;

    //@FindBy(xpath="//button[@type='submit']")
   // public WebElement appointmentRequestButonu;



   // @FindBy(xpath="//div[@style='pointer-events: none;']")
   // public WebElement randevuKabulTextElementi;

    @FindBy(xpath="//span[text()='Administration']")
    public WebElement administrationElementi;

    @FindBy(xpath="//span[text()='User management']")
    public WebElement userManagementButonu;

    @FindBy(xpath="(//span[text()='View'])[13]")
    public WebElement userViewButonu;

    @FindBy(xpath="//span[text()='First name']")
    public WebElement userFirstNameElement;

    @FindBy(xpath="//span[text()='Last name']")
    public WebElement userLastNameElement;

    @FindBy(xpath="//span[text()='Email']")
    public WebElement userEmailElement;

    @FindBy(xpath="(//span[text()='Edit'])[13]")
    public WebElement userEditButton;

    @FindBy(xpath="(//span[text()='Delete'])[13]")
    public WebElement userDeleteButton;

    @FindBy(xpath="//input[@name='firstName']")
    public WebElement userIdFirstNameBox;

    @FindBy(xpath="//input[@name='lastName']")
    public WebElement userIdLastNameBox;

    @FindBy(xpath="//input[@name='email']")
    public WebElement userIdMailBox;

    @FindBy(xpath="//input[@name='activated']")
    public WebElement activatedBox;

    @FindBy(xpath="//option[@value='ROLE_ADMIN']")
    public WebElement profilsRoleAdmin;

    @FindBy(xpath="//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement rolKabulYaziElementi;

    @FindBy(xpath="//span[text()='Save']")
    public WebElement saveButonu;

    @FindBy(xpath="//option[@value='ROLE_USER']")
    public WebElement profilsRoleUser;

    @FindBy(xpath="//option[@value='ROLE_PATIENT']")
    public WebElement profilsRolePatient;

    @FindBy(xpath="//option[@value='ROLE_STAFF']")
    public WebElement profilsRoleStaff;

    @FindBy(xpath="//option[@value='ROLE_PHYSICIAN']")
    public WebElement profilsRolePhysician;

    //US05 VE US06  LOCETLERI










    @FindBy(xpath = "//input[@id='username']")
    public static WebElement usernameTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public static WebElement passwordTextBox;


;


    // Settings Page (US006)
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


 ///US07 LOCETLERI

   @FindBy (xpath = "//li[@id='account-menu']")
    public static WebElement accountMenuButonu;




   @FindBy(xpath = "//*[span='Make an Appointment']")
   public static WebElement makeAppointment;



    @FindBy(xpath = "//input[@name='phone']")
    public static WebElement phone;

    @FindBy(xpath = "//input[@id='appoDate']")
    public static WebElement appoDate;

    @FindBy(xpath = "//button[@id='register-submit']")
    public static WebElement sendRequestButton;

     // US0707 LOCETLERI


  @FindBy(xpath = "(//a[@href='#'])[1]")
     public static WebElement dropDownIkonu;

    @FindBy(xpath = "//span[text()='Sign in']")
    public static WebElement signinElementi;



    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement signinButonu;

    @FindBy(xpath = "//span[text()='MY PAGES(PATIENT)']")
    public static WebElement mypagesElementi;

    @FindBy(xpath = "//*[@class='appointment-btn scrollto']")
    public static WebElement makeAnAppointmentButton;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement makeAnAppointmentUserName;


    @FindBy(xpath = "(//input[@id='phone'])[1]")
    public static WebElement phoneBox;


    @FindBy(xpath="//button[@type='submit']")
    public static WebElement appointmentRequestButonu;

    @FindBy(xpath="//span[text()='Appointment date can not be past date!']")
    public static WebElement pastDateTextElement;

    @FindBy(xpath="//div[@style='pointer-events: none;']")
    public static WebElement randevuKabulTextElementi;









}

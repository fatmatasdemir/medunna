package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US04_08_09_Pages {

    //US004

    public US04_08_09_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='account-menu']")
    public WebElement girisIkonu;

    @FindBy(xpath = "//div//span[text()='Sign in']")
    public WebElement signInButton1;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement signInUsername;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement signInPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton2;

    @FindBy(xpath = "//label[@class='form-check-label']")
    public WebElement rememberMe;

    @FindBy(xpath = "//span[text()='Did you forget your password?']")
    public WebElement forgetPassword;

    @FindBy(xpath = "(//div[@class='alert alert-warning fade show'])[2]")
    public WebElement alertSecenegi;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement cancelSecenegi;


   //US008
    @FindBy(xpath = "//span[text()='Staff Sirin']")
    public WebElement girisYaptiktanSonrakiIkon;

    //@FindBy(xpath = "//li[@id='account-menu']")
    //public WebElement accountMenu;

    @FindBy(xpath = "//span[text()='Password']")
    public WebElement passwordButton;

    @FindBy(xpath = "//input[@name='currentPassword']")
    public WebElement currentPasswordSekmesi;

    @FindBy(xpath = "//input[@name='newPassword']")
    public WebElement newPasswordSekmesi;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement confirmPasswordSekmesi;

    @FindBy(xpath = "//span//strong[text()='Password changed!']")
    public WebElement passwordChangedYazisi;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement invalidFeedbackYazisi;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 153, 0);']")
    public List<WebElement> passwordStrengthTuruncuColour;

    @FindBy(xpath="//li[@style='background-color: rgb(153, 255, 0);']")
    public List<WebElement> passwordStrengthAcikYesilColour;

    @FindBy(xpath = "//li[@style='background-color: rgb(0, 255, 0);']")
    public List<WebElement> passwordStrengthKoyuYesilColour;

    //US009
    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement myPagesSekmesi;

    @FindBy(xpath = "//span[text()='Search Patient']")
    public WebElement searchPatientSekmesi;

    @FindBy(xpath = "//span[text()='Patients']")
    public WebElement patientsYazisi;

    @FindBy(xpath = "//a[@href='/patient-update/4856']")
    public WebElement editButton;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstnameSekmesi;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastnameSekmesi;

    @FindBy(xpath = "//textarea[@id='patient-description']")
    public WebElement descriptionSekmesi;

    @FindBy(xpath = "//input[@id='patient-adress']")
    public WebElement adressSekmesi;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailSekmesi;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneSekmesi;

    @FindBy(xpath = "//select[@id='patient-gender']")
    public WebElement genderSekmesi;

    @FindBy(xpath = "//select[@id='patient-bloodGroup']")
    public WebElement bloodGroupSekmesi;

    @FindBy(xpath = "//select[@name='user.id']")
    public WebElement userSekmesi;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement patientSSNSekmesi;

    @FindBy(xpath = "//a[@href='/patient-detail/4856']")
    public WebElement viewButton;

    @FindBy(xpath = "//dl[@class='jh-entity-details']")
    public WebElement viewIleHastaBilgileri;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement silindiktenSonrakiMesajGoruntusu;

}

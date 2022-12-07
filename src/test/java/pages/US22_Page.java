package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US22_Page {

    public US22_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement myPagesSekmesi;

    @FindBy(xpath = "//span[text()='Search Patient']")
    public WebElement searchPatient;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement patientSsn;

    @FindBy(xpath = "//tbody/tr[1]")
    public WebElement tablosSsnSatiri;

    @FindBy(xpath = "//*[text()='Show Appointments']")
    public WebElement showAppointment;

    @FindBy(xpath = "(//span[text()='Show Tests'])[1]")
    public WebElement showTests;

    @FindBy(xpath = "(//span[text()='View Results'])[1]")
    public WebElement viewResults;

    @FindBy(xpath = "//table")
    public WebElement testSonucTablosu;

    @FindBy(xpath = "//*[text()='MY PAGES(PATIENT)']")
    public WebElement hastaMyPages;

    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement hastaMyAppointments;

    @FindBy(xpath = "//span[text()='Show Tests']")
    public WebElement hastaShowTests;

    @FindBy(xpath = "//textarea[@name='anamnesis']")
    public WebElement anamnesis;

    @FindBy(xpath = "//textarea[@name='treatment']")
    public WebElement treatment;

    @FindBy(xpath = "//textarea[@name='diagnosis']")
    public WebElement diagnosis;

    @FindBy(xpath = "//textarea[@name='prescription']")
    public WebElement prescription;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement description;

    @FindBy(xpath = "//select[@id='appointment-physician")
    public WebElement physicianAlani;

    @FindBy(xpath = "//select[@id='appointment-patient']")
    public WebElement patientId;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement formUserSave;

    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement itemsTitels;

    @FindBy(xpath = "//span[text()='Appointment']")
    public WebElement adminAppointment;

    @FindBy(xpath = "//a[@href=\"/appointment/new\"]")
    public WebElement createANewAppointment;

    @FindBy(css = "#appointment-startDate")
    public WebElement startDate;

    @FindBy(css = "#appointment-endDate")
    public WebElement endDate;

    @FindBy(css = "//option[@value='330653']")
    public WebElement doctorId;

    @FindBy(xpath = "//*[@id=\"c-test-heading\"]")
    public WebElement testsYazisi;



















}

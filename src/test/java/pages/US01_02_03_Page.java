package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US01_02_03_Page {


    public US01_02_03_Page()  {
        PageFactory.initElements(Driver.getDriver(), this);
    }

   @FindBy(id = "ssn")
   public WebElement SSN;


    @FindBy(name = "firstName")
    public WebElement FN;

    @FindBy(id = "lastName")
    public WebElement LN;

    @FindBy(id = "username")
    public WebElement UN;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "firstPassword")
    public WebElement Npassword;

    @FindBy(id = "secondPassword")
    public WebElement Spassword;

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public static WebElement UIkon;

    @FindBy(id = "//*[@id=\"account-menu\"]/div/a[2]/span")
    public WebElement RegisterButton;

    @FindBy(xpath = "//span[text()='Register']")
    public WebElement Register;;

    @FindBy(xpath = "//*[text()='Your SSN is required.']")
    public WebElement SSNgerekli;

    @FindBy(xpath = "//*[.='Your FirstName is required.']")
    public WebElement FNgerekli;

    @FindBy(xpath = "//*[.='Your LastName is required.']")
    public WebElement LNgerekli;

    @FindBy(xpath = "//*[.='Your username is required.']")
    public WebElement USNgerekli;

    @FindBy(xpath = "//*[.='Your password is required.']")
    public WebElement Npasswordgerekli;

    @FindBy(xpath = "//*[.='Your confirmation password is required.']")
    public WebElement Spasswordgerekli;

    @FindBy(xpath = "//*[@style='background-color: rgb(0, 255, 0);']")
    public WebElement TheStrongestPassword;

    @FindBy(xpath = "//*[@style='background-color: rgb(153, 255, 0);']")
    public WebElement StrongPassword;

    @FindBy(xpath = "//*[@style='background-color: rgb(255, 153, 0);']")
    public WebElement WeakPassword;

    @FindBy(xpath = "//*[@style='background-color: rgb(255, 0, 0);']")
    public WebElement TheWeakestPassword;













}

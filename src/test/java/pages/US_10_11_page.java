package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_10_11_page {


    public US_10_11_page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id=\"account-menu\"]/a")
    public WebElement ikon;

    @FindBy(xpath = "//*[@id=\"login-item\"]/span")
    public WebElement signinAnasayfa;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[3]/button[2]/span")
    public WebElement Signin;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/a/span")
    public WebElement Mypages;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[1]/span")
    public WebElement MyAppoitments;

    @FindBy(xpath = "//table/thead/tr/th")
    public List<WebElement> basliklistesi;

    @FindBy(xpath = "//tbody//td[1]")
    public List<WebElement> istnenensatirListesi;

    @FindBy(xpath = "//table/tbody/tr/td")
    public List<WebElement> randevuTablosu;

    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> randevuTablosusatir;


    @FindBy(xpath = "(//td[@class='text-right'])[1]")
    public WebElement Edit1;

    @FindBy(id = "appointment-id")
    public WebElement ID;

    @FindBy(id = "appointment-startDate")
    public WebElement startDatetime;


    @FindBy(id = "appointment-endDate")
    public WebElement endDatetime;

    @FindBy(id = "appointment-status")
    public WebElement status;
    @FindBy(id = "appointment-physician")
    public WebElement physician;


    @FindBy(xpath = "(//td[@class='text-right'])[2]")
    public WebElement Edit2;

    @FindBy(id = "appointment-anamnesis")
    public WebElement anamnesis;

    @FindBy(id = "appointment-treatment")
    public WebElement treatment;

    @FindBy(id = "appointment-diagnosis")
    public WebElement diagnosis;



    @FindBy(id= "save-entity")
    public WebElement save;


    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]")
    public WebElement alert;

    @FindBy(xpath= "//table/tbody/tr[2]/td")
    public List<WebElement> yazi;

    @FindBy(xpath= "//div[.='This field is required.']/div")
    public List<WebElement> required;

    @FindBy(id= "appointment-prescription")
    public WebElement prescription;

    @FindBy(id= "appointment-description")
    public WebElement description;


}



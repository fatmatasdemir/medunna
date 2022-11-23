package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_16_17_18_28 {
    public US_16_17_18_28(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "account-menu")
    public WebElement girisIkonu;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement login;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement sifre;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement signInButonu;

    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement itemsTitles;

    @FindBy(xpath = "//span[text()='Room']")
    public WebElement room;

    @FindBy(xpath = "//a[@id='jh-create-entity']")
    public WebElement createANewRoom;

    @FindBy(xpath = "//button[@class='btn btn-primary'and @id='save-entity']")
    public WebElement save;










}

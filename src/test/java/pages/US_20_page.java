package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_20_page {
    public US_20_page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(linkText = "Administration")
    public WebElement administration;

    @FindBy(linkText = "User management")
    public WebElement management;

    @FindBy(linkText = "View")
    public WebElement view;

    @FindBy(linkText = "Edit")
    public WebElement edit;

    @FindBy(xpath = "//select[@id='authorities']")
    public WebElement profil;

    @FindBy(linkText = "ROLE_PHYSICIAN")
    public WebElement role;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveBtn;











}

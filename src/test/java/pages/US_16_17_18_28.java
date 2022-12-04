package pages;

import org.junit.Assert;
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

    @FindBy(id = "save-entity")
    public WebElement saveRoom;

    @FindBy(xpath = "//select[@id='room-roomType']")
    public WebElement roomType;

    @FindBy(css = "[id=\"room-status\"]")
    public WebElement checkBox;


    @FindBy(xpath = "//input[@name='roomNumber']")
    public WebElement roomNumber;

    @FindBy(xpath = "//input[@name='price']")
    public WebElement priceRoom;

    @FindBy(xpath = "//input[@name='description']")
    public WebElement description;

    @FindBy(xpath = "//div[starts-with(text(),'A new Room is created with')]")
    public WebElement massageSuccess;



    @FindBy(xpath = "//input[@name='createdDate']")
    public WebElement date;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement edit;

    @FindBy(xpath = "//div[starts-with(text(),'A new Room is created with')]")
    public WebElement roomCreationSuccessMessage;

    @FindBy(xpath = "//div[text()='Room information is not consistent. Room number must be unique']")
    public WebElement roomUniqueFailMessage;

    @FindBy(xpath = "(//div[text()='This field is required.'])[2]")
    public WebElement invalidPriceFeedback;

    @FindBy(xpath = "(//a[@class='page-link'])[7]")
    public WebElement sonSayfa;

    @FindBy(xpath = "//div[starts-with(text(),'A Room is updated with identifier')]")
    public WebElement roomUpdatedMessage;


    @FindBy(xpath = "//span[text()='Room Type']")
    public WebElement roomTypeUstBaslik;


    @FindBy(xpath = "//span[text()='Test Item']")
    public WebElement testItemDDM;


    @FindBy(css = "[href=\"/c-test-item/new\"]")
    public WebElement createTestItem;


    @FindBy(css = "[id=\"c-test-item-name\"]")
    public WebElement itemName;


    @FindBy(css = "[id=\"c-test-item-description\"]")
    public WebElement itemDescription;

    @FindBy(css = "[id=\"c-test-item-price\"]")
    public WebElement itemPrice;

    @FindBy(css = "[id=\"c-test-item-defaultValMin\"]")
    public WebElement itemMinValue;

    @FindBy(css = "[id=\"c-test-item-defaultValMax\"]")
    public WebElement itemMaxValue;

    @FindBy(xpath = "//div[starts-with(text(),'A new Test Item is created with identifier')]")
    public WebElement itemCreatedMessage;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement itemEdit;

    @FindBy(xpath = "//span[text()='Back']")
    public WebElement itemBackButton;

    @FindBy(xpath = "(//a[@class='btn btn-info btn-sm'])[1]")
    public WebElement itemView;

    @FindBy(xpath = "//div[starts-with(text(),'A Test Item is updated with identifier')]")
    public WebElement itemUpdatedMessage;

    @FindBy(xpath = "//span[text()='Physician']")
    public WebElement physicianDDM;

    @FindBy(xpath = "/html/body//div/div[1]/div/table/tbody/tr[1]/td[1]")
    public WebElement physicianId;

    @FindBy(xpath = "/html/body//div/div[1]/div/table/tbody/tr[1]/td[2]")
    public WebElement physicianSSN;


    @FindBy(xpath = "/html/body//div/div[1]/div/table/tbody/tr[1]/td[3]")
    public WebElement physicianFirstName;


    @FindBy(xpath = "/html/body//div/div[1]/div/table/tbody/tr[1]/td[4]")
    public WebElement physicianLastName;

    @FindBy(xpath = "//span[text()='Create a new Physician']")
    public WebElement createNewPhysician;

    @FindBy(xpath = "//input[@id=\"useSSNSearch\"]")
    public WebElement useSearchBox;

    @FindBy(xpath = "//input[@id=\"searchSSN\"]")
    public WebElement ssn;

    @FindBy(xpath = "//div[(text()='User found with search SSN')]")
    public WebElement physicianFoundMessage;

    @FindBy(xpath = "//a[@href=\"/physician/2051/edit?page=1&sort=id,asc\"]")
    public WebElement physicianEdit;

    @FindBy(css = "[name=\"firstName\"]")
    public WebElement physicianFirstNameBox;

    @FindBy(css = "[name=\"lastName\"]")
    public WebElement physicianLastNameBox;



    @FindBy(css = "[name=\"examFee\"]")
    public WebElement examFee;

    @FindBy(css = "[name=\"phone\"]")
    public WebElement phone;

    @FindBy(css = "[name=\"birthDate\"]")
    public WebElement birthDate;
    @FindBy(xpath = "//select[@id='physician-speciality']")
    public WebElement bolum;

    @FindBy(xpath = "//div[starts-with(text(),'A Physician is updated with identifier')]")
    public WebElement physicianUpdateMessage;
    @FindBy(css = "[name=\"name\"]")
    public WebElement nameCountry;

    @FindBy(xpath = "//input[@id=\"file_image\"]")
    public WebElement chooseFile;


    @FindBy(xpath = "//span[text()='Administration']")
    public WebElement administrationButton;



    @FindBy(xpath = "//span[text()='User management']")
    public WebElement userManagementButton;

    @FindBy(xpath = "//span[text()='Country']")
    public WebElement countryDDM;

    @FindBy(xpath = "//span[text()='Create a new Country']")
    public WebElement createCountry;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveCountry;

    @FindBy(xpath = "//div[starts-with(text(),'A new Country is created with identifier')]")
    public WebElement countryMessage;

    @FindBy(xpath = "//tbody//tr[1]//td[3]")
    public WebElement room1;


    @FindBy(xpath = "//tbody//tr[2]//td[3]")
    public WebElement room2;


    @FindBy(xpath = "//tbody//tr[3]//td[3]")
    public WebElement room3;

    @FindBy(css = "[name=\"user.id\"]")
    public WebElement userPhysician;

    @FindBy(xpath = "(//span[text()='Edit'])[1]")
    public WebElement editUserManagement;

    @FindBy(css = "[value=\"ROLE_PHYSICIAN\"]")
    public WebElement doktorSecimi;

    @FindBy(xpath = "//div[starts-with(text(),'A user is updated with identifier')]")
    public WebElement doktorUpdatedMessage;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveUserAdmin;
    @FindBy(xpath = "//select[@id=\"authorities\"]")
    public WebElement profiles;

    @FindBy(xpath = "(//span[text()='Delete'])[1]")
    public WebElement deleteCountry;

    @FindBy(xpath = "//button[@id=\"jhi-confirm-delete-country\"]")
    public WebElement uyariDelete;


    @FindBy(xpath = "//div[starts-with(text(),'A Country is deleted with identifier')]")
    public WebElement countryDeleteUyariMesaji;

    @FindBy(xpath = "//span[text()='State/City']")
    public WebElement stateCityDDM;

    @FindBy(xpath = "//span[text()='Create a new State/City']")
    public WebElement createStateCity;

    @FindBy(css = "[name=\"name\"]")
    public WebElement nameStateCity;

    @FindBy(css = "[name=\"state.id\"]")
    public WebElement selectStateCity;

    @FindBy(xpath = "//div[starts-with(text(),'A new State/City is created with identifier')]")
    public WebElement stateCityDeleteMesaji;

    @FindBy(css = "[href=\"/physician/3651/delete?page=1&sort=id,asc\"]")
    public WebElement deletePhysician;

    @FindBy(css = "[id=\"jhi-confirm-delete-physician\"]")
    public WebElement confirmDeletePhysician;

    @FindBy(xpath = "//div[starts-with(text(),'A Physician is deleted with identifier')]")
    public WebElement physicianDeleteMessage;

    @FindBy(css = "[id=\"image\"]")
    public WebElement image;

}

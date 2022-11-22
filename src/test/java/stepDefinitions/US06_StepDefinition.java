package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.US05_06_07;
import utilities.ConfigReader;
import utilities.Driver;

public class US06_StepDefinition {

    US05_06_07 page = new US05_06_07();
    Faker faker = new Faker();


    @When("Kullanici {string} adresinde")
    public void kullaniciAdresinde(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @And("Kullanici giris ikonuna tiklar")
    public void Kullanicigirisikonunatiklar() {
        US05_06_07.accountMenuButton2.click();
    }

    @And("Kullanici Sign in butonuna tiklar")
    public void kullaniciSignInButonunaTiklar() {
        US05_06_07.signInButton.click();

    }


    @And("Kullanici gecerli username ve password ile girisi yapar")
    public void kullaniciGecerliUsernameVePasswordIleGirisiYapar() {
        US05_06_07.usernameTextBox.sendKeys(ConfigReader.getProperty("patientUsername"));
        US05_06_07.passwordTextBox.sendKeys(ConfigReader.getProperty("password"));
        US05_06_07.signInButton2.click();

    }

    @And("Kullanici settings butonuna tiklar")
    public void kullaniciSettingsButonunaTiklar() {
        US05_06_07.settingsButton.click();
    }


    @And("Firstname textbox'una isim yazar")
    public void firstnameTextboxUnaIsimYazar() {
        US05_06_07.firstnameTextbox.sendKeys(faker.name().firstName());
    }

    @And("Lastname textbox'una soyisim yazar")
    public void lastnameTextboxUnaSoyisimYazar() {
        US05_06_07.lastnameTextbox.sendKeys(faker.name().lastName());
    }

    @Then("email textbox'una email yazar")
    public void emailTextboxUnaEmailYazar() {


    }


    @And("Firstname textbox'unda onceden girilen isimin gorundugu dogrulanir")
    public void firstnameTextboxUndaOncedenGirilenIsiminGorunduguDogrulanir() {
        String actualFirstnameTextbox = US05_06_07.firstnameTextbox.getAttribute("value");
        Assert.assertEquals(actualFirstnameTextbox, ConfigReader.getProperty("patientFirstname"));


    }

    @And("Lastname textbox'unda onceden girilen soyismin gorundugu dogrulanir")
    public void lastnameTextboxUndaOncedenGirilenSoyisminGorunduguDogrulanir() {
        String actualLastnameTextbox = US05_06_07.lastnameTextbox.getAttribute("value");
        Assert.assertEquals(actualLastnameTextbox, ConfigReader.getProperty("patientLastname"));
    }

    @Then("email textbox'unda onceden girilen mail adresinin gorundugu dogrulanir")
    public void emailTextboxUndaOncedenGirilenMailAdresininGorunduguDogrulanir() {
        Assert.assertEquals(US05_06_07.emailTextbox.getAttribute("value"), ConfigReader.getProperty("patientEmail"));

    }

    @Then("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("Kulanici farkli isim girer")
    public void kulaniciFarkliIsimGirer() {
        US05_06_07.firstnameTextbox.clear();
        US05_06_07.firstnameTextbox.sendKeys(faker.name().firstName());
    }

    @And("Kulanici farkli soyisim girer")
    public void kulaniciFarkliSoyisimGirer() {
        US05_06_07.lastnameTextbox.clear();
        US05_06_07.lastnameTextbox.sendKeys(faker.name().lastName());


    }

    @And("Kulanici farkli email girer")
    public void kulaniciFarkliEmailGirer() {
        US05_06_07.emailTextbox.clear();
        US05_06_07.emailTextbox.sendKeys(faker.internet().emailAddress());
    }

    @And("Kullanici Save butonuna tiklar")
    public void kullaniciSaveButonunaTiklar() {
        US05_06_07.saveButton.click();
    }

    @Then("Settings Saved yazisi gorundugu dogrulanir")
    public void settingsSavedYazisiGorunduguDogrulanir() {
        US05_06_07.settingsSavedText.isDisplayed();
    }


    @Then("First Name bilgisinin dogrulugunu kontrol eder")
    public void firstNameBilgisininDogrulugunuKontrolEder() {
        US05_06_07.settingsFirstName.isDisplayed();
        String expectedFirstName = ConfigReader.getProperty("userFirstName");
        String actualFirstName = US05_06_07.settingsFirstName.getAttribute("value");

        Assert.assertEquals(actualFirstName, expectedFirstName);
    }

    @And("Last Name bilgisinin dogrulugunu kontrol eder")
    public void lastNameBilgisininDogrulugunuKontrolEder() {
        String expectedLastName = ConfigReader.getProperty("userLastName");
        String actualLastName = US05_06_07.settingsLastName.getAttribute("value");

        Assert.assertEquals(actualLastName, expectedLastName);
    }

    @And("Email bilgisinin dogrulugunu kontrol eder")
    public void emailBilgisininDogrulugunuKontrolEder() {
        String expectedEmail= ConfigReader.getProperty("userEmail");
        String actualEmail = US05_06_07.settingsEmail.getAttribute("value");

        Assert.assertEquals(actualEmail, expectedEmail);

     /*   US05_06_07.settingsEmail.clear();
        String expectedEmail = faker.internet().emailAddress();
        US05_06_07.settingsEmail.sendKeys(expectedEmail + Keys.ENTER);
        Driver.getDriver().navigate().refresh();

        String actualEmail =US05_06_07.settingsEmail.getAttribute("value");

        Assert.assertEquals(actualEmail, expectedEmail);

    }*/
    }
}
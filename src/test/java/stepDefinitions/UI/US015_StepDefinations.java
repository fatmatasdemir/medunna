package stepDefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US04_08_09_Pages;
import pages.US15_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US015_StepDefinations {
    US04_08_09_Pages pages = new US04_08_09_Pages();
    US15_Page pages15=new US15_Page();
    Faker faker=new Faker();
    @Given("Admin Medunna sayfasina gider")
    public void adminMedunnaSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));


    }

    @Then("Admin sayfanin sag ust kosesinde yer alan giris ikonuna tiklar")
    public void adminSayfaninSagUstKosesindeYerAlanGirisIkonunaTiklar() {
        pages.girisIkonu.click();

    }

    @And("Admin dropdown menude Sign in butonuna tiklar")
    public void adminDropdownMenudeSignInButonunaTiklar() {
        pages.signInButton1.click();
    }

    @And("Kullanici Username olarak {string} girer")
    public void kullaniciUsernameOlarakGirer(String kelime) {
        pages.signInUsername.sendKeys(ConfigReader.getProperty(kelime));


    }

    @And("Kullanici Password olarak {string} girer")
    public void kullaniciPasswordOlarakGirer(String passwordSckn) {
        pages.signInPassword.sendKeys(ConfigReader.getProperty(passwordSckn));

    }

    @And("Acilan sayfada ADMINISTRATION sekmesine tiklar")
    public void acilanSayfadaADMINISTRATIONSekmesineTiklar() {
        pages15.adminAdministrator.click();


    }

    @And("Dropdown menuden USER MANAGEMENT butonuna tiklar")
    public void dropdownMenudenUSERMANAGEMENTButonunaTiklar() {
        pages15.userManagement.click();


    }

    @Then("Kullanici Create_A_New_User butonuna tiklar")
    public void kullaniciCreate_A_New_UserButonunaTiklar() {
        pages15.createAnewUser.click();
    }

    @Then("Kullanici Login alanina gecerli bir kullanici adi girer")
    public void kullaniciLoginAlaninaGecerliBirKullaniciAdiGirer() {
        pages15.formUserLogin.sendKeys(faker.name().username());

    }

    @Then("Kullanici first_name alanina gecerli bir isim girer")
    public void kullaniciFirst_nameAlaninaGecerliBirIsimGirer() {
        pages15.formUserFirstname.sendKeys(faker.name().firstName());
    }

    @Then("Kullanici last_name alanina gecerli bir soyisim girer")
    public void kullaniciLast_nameAlaninaGecerliBirSoyisimGirer() {
        pages15.formUserLastname.sendKeys(faker.name().lastName());
    }

    @Then("Kullanici email alanina gecerli bir emailAdresi girer")
    public void kullaniciEmailAlaninaGecerliBirEmailAdresiGirer() {
        pages15.formUserEmail.sendKeys(faker.internet().emailAddress());
    }

    @Then("Kullanici ssn alanina gecerli bir ssnNo girer")
    public void kullaniciSsnAlaninaGecerliBirSsnNoGirer() {
        pages15.formUserSsn.sendKeys(faker.idNumber().ssnValid());
    }

    @Then("Kullanici language alanina English girer")
    public void kullaniciLanguageAlaninaEnglishGirer() {
        pages15.formUserLanguage.click();
    }

    @Then("Kullanici profiles alanina gecerli bir role_admin girer")
    public void kullaniciProfilesAlaninaGecerliBirRole_adminGirer() {
        pages15.formUserRole.click();

    }
    @Then("Kellanici {int} saniye bekler")
    public void kellaniciSaniyeBekler(int saniye) {
        ReusableMethods.waitFor(saniye);
    }

    @And("Kullanici kayit isleminin basarili oldugunu onaylar")
    public void kullaniciKayitIslemininBasariliOldugunuOnaylar() {
       String alertYazisi= pages15.alert.getText();

        Assert.assertTrue(alertYazisi.contains("created"));

    }


    @Then("Kullanici ssn alanina gecersiz bir ssnNo girer")
    public void kullaniciSsnAlaninaGecersizBirSsnNoGirer() {
        pages15.formUserSsn.sendKeys(faker.phoneNumber().phoneNumber());
    }

    @And("Kullanici kayit isleminin basarisiz oldugunu onaylar")
    public void kullaniciKayitIslemininBasarisizOldugunuOnaylar() {

        Assert.assertTrue(pages15.invalidSnn.isDisplayed());
    }

    @Then("Kullanici email alanina gecersiz bir emailAdresi girer")
    public void kullaniciEmailAlaninaGecersizBirEmailAdresiGirer() {
        pages15.formUserEmail.sendKeys(faker.name().username());
    }

    @And("Kullanici hatali email uzarisi alir")
    public void kullaniciHataliEmailUzarisiAlir() {
        Assert.assertTrue(pages15.invalidEmail.isDisplayed());
    }

}

package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US04_08_09_Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US004_Stepdefinitions {

    US04_08_09_Pages pages = new US04_08_09_Pages();
    @Given("Kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }

    @Then("Kullanici sayfanin sag ust kosesinde yer alan giris ikonuna tiklar")
    public void kullaniciSayfaninSagUstKosesindeYerAlanGirisIkonunaTiklar() {
        pages.girisIkonu.click();
    }

    @And("Acilan dropdown menude Sign in butonuna tiklar")
    public void acilanDropdownMenudeSignInButonunaTiklar() {
        pages.signInButton1.click();
    }

    @And("Username olarak {string} girer")
    public void usernameOlarakGirer(String staffUser) {
        pages.signInUsername.sendKeys(ConfigReader.getProperty(staffUser));
    }

    @And("Password olarak {string} girer")
    public void passwordOlarakGirer(String staffPassword) {
        pages.signInPassword.sendKeys(ConfigReader.getProperty(staffPassword));
    }

    @And("Sign in butonuna tiklar")
    public void signInButonunaTiklar() {
        pages.signInButton2.click();
    }

    @Then("Basari mesajinin gorunurlugunu test eder")
    public void basariMesajininGorunurlugunuTestEder() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue("the success message yazisi görüntülenemedi",Driver.getDriver().getPageSource().contains("the success message "));
    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("{string} seceneginin gorunurlugunu test eder")
    public void secenegininGorunurlugunuTestEder(String arg0) {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(pages.rememberMe.isDisplayed());
    }

    @Then("You don't have an account yet? Register a new account seceneginin gorunur oldugunu test eder")
    public void youDonTHaveAnAccountYetRegisterANewAccountSecenegininGorunurOldugunuTestEder() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(pages.alertSecenegi.isDisplayed());
    }

    @Then("Cancel seceneginin gorunurlugunu test eder")
    public void cancelSecenegininGorunurlugunuTestEder() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(pages.cancelSecenegi.isDisplayed());
    }

    @Then("Did you forget your password? seceneginin gorunurlugunu test eder")
    public void didYouForgetYourPasswordSecenegininGorunurlugunuTestEder() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(pages.forgetPassword.isDisplayed());
    }
}

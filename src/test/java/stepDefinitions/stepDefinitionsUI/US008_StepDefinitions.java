package stepDefinitions.stepDefinitionsUI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.US04_08_09_Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US008_StepDefinitions {

    US04_08_09_Pages pages = new US04_08_09_Pages();
    Actions actions=new Actions(Driver.getDriver());
    @Given("Kullanici {string} sayfasinda")
    public void kullaniciSayfasinda(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }

    @Then("sayfanin sag ust kosesinde yer alan giris ikonuna tiklar")
    public void sayfaninSagUstKosesindeYerAlanGirisIkonunaTiklar() {
        pages.girisIkonu.click();
    }

    @And("Acilan dropdown menude Sign in butonuna tiklarr")
    public void acilanDropdownMenudeSignInButonunaTiklarr() {
        pages.signInButton1.click();
    }

    @And("Username olarak {string} girerr")
    public void usernameOlarakGirerr(String staffUser) {
        pages.signInUsername.sendKeys(ConfigReader.getProperty(staffUser));
    }

    @And("Password olarak {string} girerr")
    public void passwordOlarakGirerr(String staffPassword) {
        pages.signInPassword.sendKeys(ConfigReader.getProperty(staffPassword));
    }

    @And("Sign in butonuna tiklar ve sayfaya giris yapar")
    public void signInButonunaTiklarVeSayfayaGirisYapar() {
        pages.signInButton2.click();
    }

    @And("Sayfanin sag ust kosesinde yer alan giris ikonuna tiklar ve Password butonuna tiklar")
    public void sayfaninSagUstKosesindeYerAlanGirisIkonunaTiklarVePasswordButonunaTiklar() {
        pages.girisYaptiktanSonrakiIkon.click();
        pages.passwordButton.click();
    }

    @And("{string} sekmesine gecerli bir password girer")
    public void sekmesineGecerliBirPasswordGirer(String staffPassword) {
        ReusableMethods.jsScrollClick(pages.currentPasswordSekmesi);
        pages.currentPasswordSekmesi.sendKeys("sHirin@_322");

    }

    @And("{string} sekmesine yeni bir password girer")
    public void sekmesineYeniBirPasswordGirer(String newPassword) {
        ReusableMethods.jsScrollClick(pages.newPasswordSekmesi);
        pages.newPasswordSekmesi.sendKeys("sHirin@_3225");
    }

    @And("{string} sekmesine {string} sekmesine girdigi passwordu tekrar girer")
    public void sekmesineSekmesineGirdigiPassworduTekrarGirer(String arg0, String newPassword) {
        pages.confirmPasswordSekmesi.sendKeys("sHirin@_3225");
    }

    @Then("{string} mesajinin gorunur oldugunu test eder")
    public void mesajininGorunurOldugunuTestEder(String passwordChanged) {
        Assert.assertTrue(pages.passwordChangedYazisi.isDisplayed());
    }

    @And("Kullanici Sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("{string} sekmesine en az {int} kucuk harf iceren yeni bir password girer")
    public void sekmesineEnAzKucukHarfIcerenYeniBirPasswordGirer(String arg0, int arg1) {
        pages.newPasswordSekmesi.sendKeys("SSSSSSs");
    }

    @Then("{string} seviyesinin degistigini ve password strength'in turuncu renkte oldugunu test eder")
    public void seviyesininDegistiginiVePasswordStrengthInTuruncuRenkteOldugunuTestEder(String arg0) {
        int expectedResultSize = pages.passwordStrengthTuruncuColour.size();
        boolean bln;
        if(expectedResultSize==2){
            bln=true;
        }else{
            bln=false;
        }
        Assert.assertTrue("expectedResultSize==2", bln);
    }

    @And("{string} sekmesine en az {int} buyuk harf iceren yeni bir password girer")
    public void sekmesineEnAzBuyukHarfIcerenYeniBirPasswordGirer(String arg0, int arg1) {
        pages.newPasswordSekmesi.sendKeys("Sssssss");
    }

    @And("{string} sekmesine en az {int} rakam iceren yeni bir password girer")
    public void sekmesineEnAzRakamIcerenYeniBirPasswordGirer(String arg0, int arg1) {
        pages.newPasswordSekmesi.sendKeys("Ssssss7");
    }

    @Then("{string} seviyesinin degistigini ve password strength'in acik yesil oldugunu test eder")
    public void seviyesininDegistiginiVePasswordStrengthInAcikYesilOldugunuTestEder(String arg0) {
        int expectedResultSize = pages.passwordStrengthAcikYesilColour.size();
        boolean bln;
        if(expectedResultSize==4){
            bln=true;
        }else{
            bln=false;
        }
        Assert.assertTrue("expectedResultSize==4", bln);
    }

    @And("{string} sekmesine en az {int} ozel karakter iceren yeni bir password girer")
    public void sekmesineEnAzOzelKarakterIcerenYeniBirPasswordGirer(String arg0, int arg1) {
        pages.newPasswordSekmesi.sendKeys("Sssss7@");
    }

    @Then("{string} seviyesinin degistigini ve password strength'in acik yesil oldugunu test ederr")
    public void seviyesininDegistiginiVePasswordStrengthInAcikYesilOldugunuTestEderr(String arg0) {
        int expectedResultSize = pages.passwordStrengthAcikYesilColour.size();
        boolean bln;
        if(expectedResultSize==4){
            bln=true;
        }else{
            bln=false;
        }
        Assert.assertTrue("expectedResultSize==4",bln);
    }

    @And("{string} sekmesine en az {int} karakterden olusan yeni bir password girer")
    public void sekmesineEnAzKarakterdenOlusanYeniBirPasswordGirer(String arg0, int arg1) {
        pages.newPasswordSekmesi.sendKeys("Sssss7@_");
    }

    @Then("{string} seviyesinin degistigini ve password strength'in koyu yesil oldugunu test eder")
    public void seviyesininDegistiginiVePasswordStrengthInKoyuYesilOldugunuTestEder(String arg0) {
        int expectedResultSize = pages.passwordStrengthKoyuYesilColour.size();
        boolean bln;
        if(expectedResultSize==5){
            bln=true;
        }else{
            bln=false;
        }
        Assert.assertTrue("expectedResultSize==5",bln);
    }

    @And("{string} sekmesine {string} sekmesine girdigi passwordu girer")
    public void sekmesineSekmesineGirdigiPassworduGirer(String arg0, String staffPassword) {
        ReusableMethods.jsScrollClick(pages.newPasswordSekmesi);
        pages.newPasswordSekmesi.sendKeys("shiriN@_555");
    }

    @And("{string} sekmesine {string} sekmesine girdigi passwordu girerr")
    public void sekmesineSekmesineGirdigiPassworduGirerr(String arg0, String newPassword) {
        ReusableMethods.jsScrollClick(pages.confirmPasswordSekmesi);
        pages.confirmPasswordSekmesi.sendKeys("shiriN@_555");
    }

    @And("Kullanici {int} dakika bekler")
    public void kullaniciDakikaBekler(int arg0) {
        ReusableMethods.waitFor(3);
    }

    @And("Kullanici save butonuna tiklar")
    public void kullaniciSaveButonunaTiklar() {
        ReusableMethods.jsScrollClick(pages.saveButton);
    }

    @Then("Password changed mesajinin gorunurlugunu dogrular")
    public void passwordChangedMesajininGorunurlugunuDogrular() {
        Assert.assertTrue(pages.passwordChangedYazisi.isDisplayed());
    }
}

package stepDefinitions.stepDefinitionsUI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US04_08_09_Pages;
import utilities.Driver;
import utilities.ReusableMethods;

public class US009_StepDefinitions {

    US04_08_09_Pages pages = new US04_08_09_Pages();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @And("Acilan sayfada MY PAGES sekmesine tiklar")
    public void acilanSayfadaMYPAGESSekmesineTiklar() {
        pages.myPagesSekmesi.click();
    }

    @And("Dropdown menuden Search Patient butonuna tiklar")
    public void dropdownMenudenSearchPatientButonunaTiklar() {
        pages.searchPatientSekmesi.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Hasta bilgilerinin gorunurlugunu dogrular")
    public void hastaBilgilerininGorunurlugunuDogrular() {
        Assert.assertTrue(pages.patientsYazisi.isDisplayed());
    }


    @And("Kullanici Patient SSN kismina hastanin SSN bilgisini girer")
    public void kullaniciPatientSSNKisminaHastaninSSNBilgisiniGirer() {
        pages.patientSSNSekmesi.click();
        pages.patientSSNSekmesi.sendKeys("122-56-9045");
        // ReusableMethods.waitFor(2);
    }


    @Then("Bilgilerin silinip silinmedigini test eder")
    public void bilgilerinSilinipSilinmediginiTestEder() {
        ReusableMethods.jsScrollClick(pages.saveButton);
        Assert.assertTrue(pages.silindiktenSonrakiMesajGoruntusu.isDisplayed());
    }


    @And("kullanici  istenilen hastanin bilgilerinin gorunur oldugunu test eder")
    public void kullaniciIstenilenHastaninBilgilerininGorunurOldugunuTestEder() {
        Assert.assertTrue(pages.viewIleHastaBilgileri.isDisplayed());
    }

    @Then("Staff butun hasta bilgilerini duzenlenebilir oldugunu test eder")
    public void staffButunHastaBilgileriniDuzenlenebilirOldugunuTestEder() {
        // ReusableMethods.waitFor(3);
        pages.firstnameSekmesi.clear();
        pages.firstnameSekmesi.sendKeys("Patient");
        ReusableMethods.waitFor(2);
        pages.lastnameSekmesi.clear();
        pages.lastnameSekmesi.sendKeys("Jasmine");
        ReusableMethods.waitFor(2);
        pages.emailSekmesi.clear();
        pages.emailSekmesi.sendKeys("jasmine9793@gmail.com");
        ReusableMethods.waitFor(2);

        pages.phoneSekmesi.clear();
        pages.phoneSekmesi.sendKeys("576-789-4567");

        ReusableMethods.jsScrollClick(pages.saveButton);
        ReusableMethods.waitFor(2);

    }
    @And("Kullanici kayit bilgilerini siler")
    public void kullaniciKayitBilgileriniSiler() {

        pages.firstnameSekmesi.clear();
        pages.firstnameSekmesi.sendKeys("-", Keys.TAB);

        pages.lastnameSekmesi.clear();
        pages.lastnameSekmesi.sendKeys("-", Keys.TAB);

        pages.emailSekmesi.clear();
        pages.emailSekmesi.sendKeys("bos@bos.c", Keys.TAB);

        pages.phoneSekmesi.clear();
        pages.phoneSekmesi.sendKeys("000-000-0000", Keys.TAB);

        pages.adressSekmesi.clear();
        pages.adressSekmesi.sendKeys("-");

        pages.descriptionSekmesi.clear();
        pages.descriptionSekmesi.sendKeys("-");

        ReusableMethods.jsScrollClick(pages.saveButton);
        Assert.assertTrue(pages.silindiktenSonrakiMesajGoruntusu.isDisplayed());
        ReusableMethods.jsScroll(pages.silindiktenSonrakiMesajGoruntusu);

    }

    @And("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int arg0) {
        ReusableMethods.waitFor(3);
    }

    @And("Kullanici ilk hastanin yanindaki edit butonuna tiklar")
    public void kullaniciIlkHastaninYanindakiEditButonunaTiklar() {
        actions.sendKeys(Keys.ARROW_RIGHT);
        actions.sendKeys(Keys.ARROW_RIGHT);
        pages.editButton.click();
    }

    @And("Kullanici ilgili hastanin yanindaki view butonuna tiklar")
    public void kullaniciIlgiliHastaninYanindakiViewButonunaTiklar() {
        actions.sendKeys(Keys.ARROW_RIGHT);
        actions.sendKeys(Keys.ARROW_RIGHT);
        pages.viewButton.click();
    }

}

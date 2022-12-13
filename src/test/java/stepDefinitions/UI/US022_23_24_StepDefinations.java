package stepDefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.US04_08_09_Pages;
import pages.US15_Page;
import pages.US22_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.LocalDateTime;

public class US022_23_24_StepDefinations {
    US04_08_09_Pages pages = new US04_08_09_Pages();
    US15_Page pages15 = new US15_Page();
    US22_Page page22 = new US22_Page();
    Faker faker = new Faker();

    @And("Acilan sayfada Mypages sekmesine tiklar")
    public void acilanSayfadaMypagesSekmesineTiklar() {
        page22.myPagesSekmesi.click();



    }

    @And("Dropdown menuden Search Patient sekmesine tiklar")
    public void dropdownMenudenSearchPatientSekmesineTiklar() {
        page22.searchPatient.click();
    }

    @And("Kullanici  Patient SSN bölümüne {string} bilgisini girer")
    public void kullaniciPatientSSNBölümüneBilgisiniGirer(String ssn) {

        page22.patientSsn.sendKeys(ConfigReader.getProperty(ssn));
    }

    @And("Kullanici Show appointment butonuna tiklar")
    public void kullaniciShowAppointmentButonunaTiklar() {
        page22.showAppointment.click();
    }

    @And("Kullanici test istenen bir randevuya ait Show Test butonuna tiklar")
    public void kullaniciTestIstenenBirRandevuyaAitShowTestButonunaTiklar() {
        page22.showTests.click();
    }

    @And("Kullanici View Results butonuna tiklar")
    public void kullaniciViewResultsButonunaTiklar() {
        page22.viewResults.click();
    }

    @And("Kullanici test sonuc sayfasinda {string} ibarisinin oldugunu dogrular")
    public void kullaniciTestSonucSayfasindaIbarisininOldugunuDogrular(String kelime) {
        String tabloBaslik=page22.testSonucTablosu.getText();
        Assert.assertTrue(tabloBaslik.contains(kelime));

    }

    @And("Kullanici Items Titles butonuna tiklar")
    public void kullaniciItemsTitlesButonunaTiklar() {
        page22.itemsTitels.click();
    }

    @And("Kullanici drop down menuden Appointment butonuna tiklar")
    public void kullaniciDropDownMenudenAppointmentButonunaTiklar() {
        page22.adminAppointment.click();
    }

    @And("Kullanici Create A New Appointment butonuna tiklar")
    public void kullaniciCreateANewAppointmentButonunaTiklar() {
        page22.createANewAppointment.click();
    }

    @And("Kullanici randevu formunu doldurur ve kaydeder")
    public void kullaniciRandevuFormunuDoldururVeKaydeder() {

        page22.startDate.sendKeys("08122022  0910");


        page22.endDate.sendKeys("08122022  1010");
        page22.anamnesis.sendKeys("anamnesis");
        page22.treatment.sendKeys("treatment");
        page22.diagnosis.sendKeys("diagnosis");
        page22.prescription.sendKeys("prescription");
        page22.description.sendKeys("description");



        Driver.getDriver().switchTo().frame(1);


        page22.doctorId.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(page22.physicianAlani.isEnabled());
        page22.patientId.sendKeys(ConfigReader.getProperty("idPatient"));
        ReusableMethods.waitFor(25);
        page22.formUserSave.click();




    }

    @And("Kullanici drop down menuden MyAppointment butonuna tiklar")
    public void kullaniciDropDownMenudenMyAppointmentButonunaTiklar() {
        page22.hastaMyAppointments.click();
    }

    @And("Kullanici teste iliskin randevu satirindaki Show Tests butonuna tiklar")
    public void kullaniciTesteIliskinRandevuSatirindakiShowTestsButonunaTiklar() {
        page22.showTests.click();
    }

    @And("Kullanici istenilen test sonuclarini görüntüler")
    public void kullaniciIstenilenTestSonuclariniGörüntüler() {
        Assert.assertTrue(page22.testsYazisi.isDisplayed());
    }
}


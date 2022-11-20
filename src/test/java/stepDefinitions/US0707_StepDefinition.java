package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.US05_06_07;
import utilities.ConfigReader;
import utilities.Driver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class US0707_StepDefinition {
/*
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    US05_06_07 page=new US05_06_07();

    @Given("kullanici Medunna internet sitesinin anasayfasina gider")
    public void kullaniciMedunnaInternetSitesininAnasayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("Kullanici anasayfadaki account-menuye tiklar")
    public void kullaniciAnasayfadakiAccountMenuyeTiklar() {
        US05_06_07.dropDownIkonu.click();
    }

    @And("Hasta sign in elementini tiklar")
    public void hastaSignInElementiniTiklar() {
      US05_06_07.signinElementi.click();
    }

    @And("Hasta gecerli bir username girer")
    public void hastaGecerliBirUsernameGirer() {
        US05_06_07.usernameTextBox.sendKeys(ConfigReader.getProperty("patientUsername"));
    }

    @And("Hasta gecerli bir password girer")
    public void hastaGecerliBirPasswordGirer() {
     US05_06_07.passwordTextBox.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("Hasta signinButonuna tiklar")
    public void hastaSigninButonunaTiklar() {
       US05_06_07.signinButonu.click();
    }

    @And("Hasta My Pages-patient elementine tiklar")
    public void hastaMyPagesPatientElementineTiklar() {
        US05_06_07.mypagesElementi.click();
    }

    @And("Hasta Make an Appointment butonuna tiklar")
    public void hastaMakeAnAppointmentButonunaTiklar() {
        US05_06_07.makeanAppointmentButonu.click();
    }

    @Then("Hasta Phone boxa telefon numarasi girer")
    public void hastaPhoneBoxaTelefonNumarasiGirer() {
      US05_06_07.phoneBox.sendKeys(ConfigReader.getProperty("phonePatient"));
    }

    @And("Hasta appointment DateTime Gecmis bir tarih girer")
    public void hastaAppointmentDateTimeGecmisBirTarihGirer() {
      US05_06_07.appointmentDateTimeBox.sendKeys(ConfigReader.getProperty("gecmisTarih"));
    }

    @And("Hasta gecmis bir tarihle randevu alinamayacagini test eder")
    public void hastaGecmisBirTarihleRandevuAlinamayacaginiTestEder() {
        Assert.assertTrue(US05_06_07.pastDateTextElement.isDisplayed());
    }

    @And("Hasta appointment DateTime Boxa guncel veya gelecekteki bir tarih girer")
    public void hastaAppointmentDateTimeBoxaGuncelVeyaGelecektekiBirTarihGirer() {
        Date simdikiZaman = new Date();
        System.out.println(simdikiZaman.toString());
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(df.format(simdikiZaman));
      US05_06_07.appointmentDateTimeBox.sendKeys(df.format(simdikiZaman));
    }

    @And("Hasta appointment request butonunu tiklar")
    public void hastaAppointmentRequestButonunuTiklar() {
      US05_06_07.appointmentRequestButonu.click();
    }

    @And("Hasta guncel veya gelecek bir tarih girilebilecegini dogrular")
    public void hastaGuncelVeyaGelecekBirTarihGirilebileceginiDogrular() {
        Assert.assertTrue(US05_06_07.randevuKabulTextElementi.isDisplayed());
    }

    @And("Hasta Sayfayi kapatir")
    public void hastaSayfayiKapatir() throws InterruptedException {
        Thread.sleep(2000);
        Driver.closeDriver();
    }

    @And("Hasta girilen tarihin gg.aa.yyyy formunda oldugunu dogrular")
    public void hastaGirilenTarihinGgAaYyyyFormundaOldugunuDogrular() {
     US05_06_07.appointmentDateTimeBox.sendKeys(ConfigReader.getProperty("unvalidDate"));

    }

 */
}

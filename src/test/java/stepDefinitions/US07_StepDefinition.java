package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.US05_06_07;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class US07_StepDefinition {
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    US05_06_07 page=new US05_06_07();

    @Given("Hasta Kullanici {string} gider")
    public void hastaKullaniciGider(String arg0) {

        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @When("Kullanici anasayfadaki account-menu ye tiklar")
    public void kullaniciAnasayfadakiAccountMenuYeTiklar() {
        US05_06_07.accountMenuButonu.click();
    }

    @And("Kullanici sign in butonuna tiklar")
    public void kullaniciSignInButonunaTiklar() {
       US05_06_07.signInButton.click();
    }

    @Then("Kullanici gecerli isim girisi yapar")
    public void kullaniciGecerliIsimGirisiYapar() {
        US05_06_07.usernameTextBox.sendKeys(ConfigReader.getProperty("patientUsername"));

    }

    @And("Kullanici gecerli sifre girisi yapar")
    public void kullaniciGecerliSifreGirisiYapar() {
       US05_06_07.passwordTextBox.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("Kullanici ikinci sign in butonuna tiklar")
    public void kullaniciIkinciSignInButonunaTiklar() {
        US05_06_07.signInButton2.click();
    }

    @When("Kullanici acilan sayfadaki MY PAGES\\(PATIENT) bolumune gelir")
    public void kullaniciAcilanSayfadakiMYPAGESPATIENTBolumuneGelir() {
        US05_06_07.myPages.click();
    }

    @And("Make an Appointment'i tiklar")
    public void makeAnAppointmentITiklar() {
        US05_06_07.makeAppointment.click();
    }

    @And("Kullanici gecerli Phone numarasini girer")
    public void kullaniciGecerliPhoneNumarasiniGirer() {
       US05_06_07.phone.sendKeys(ConfigReader.getProperty("phonePatient"));


    }

    @Then("{int} saniye bekler")
    public void saniyeBekler(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @Given("Appointment DateTime altindaki kutucuga gunun tarihi girilir")
    public void appointmentDateTimeAltindakiKutucugaGununTarihiGirilir() {

        US05_06_07.appoDate.sendKeys("26112022");
    }

    @And("Send an Appointment Request'e tiklanir")
    public void sendAnAppointmentRequestETiklanir() {
        US05_06_07.sendRequestButton.click();

    }

    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("Appointment DateTime altindaki kutucuga ileri bir tarih girilir")
    public void appointmentDateTimeAltindakiKutucugaIleriBirTarihGirilir() {
      US05_06_07.appoDate.sendKeys("16122022");

    }



    @And("Girilen tarihin gun.ay.yil formatinda oldugu test edilir")
    public void girilenTarihinGunAyYilFormatindaOlduguTestEdilir() {
        assertTrue(("16122022"), US05_06_07.appoDate.isDisplayed());
    }


    @Then("Kullanici appointment DateTime Gecmis bir tarih girer")
    public void kullaniciAppointmentDateTimeGecmisBirTarihGirer() {
      US05_06_07.appointmentDateTimeBox.sendKeys(ConfigReader.getProperty("gecmisTarih"));

    }

    @And("Kullanici gecmis bir tarihle randevu alinamayacagini test eder")
    public void kullaniciGecmisBirTarihleRandevuAlinamayacaginiTestEder() {
        Assert.assertTrue(US05_06_07.pastDateTextElement.isDisplayed());
    }
}

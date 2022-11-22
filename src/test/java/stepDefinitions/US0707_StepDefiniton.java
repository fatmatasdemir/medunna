package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.US05_06_07;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class US0707_StepDefiniton {
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    US05_06_07 page=new US05_06_07();


    @Given("kullanıcı {string} sayfasına gider")
    public void kullanıcıSayfasınaGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }


    @And("kullanıcı anasayfadaki Make an Appointment butonuna tıklar")
    public void kullanıcıAnasayfadakiMakeAnAppointmentButonunaTıklar() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", US05_06_07.makeAnAppointmentButton);
        jse.executeScript("arguments[0].click()",US05_06_07.makeAnAppointmentButton);

    }


    @And("Kullanici tüm bilgilerini girer")
    public void kullaniciTümBilgileriniGirer() {



    }

    @Then("{int} saniye bekler")
    public void saniyeBekler(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



    @And("Send an Appointment Request'e tiklanir")
    public void sendAnAppointmentRequestETiklanir() {
        US05_06_07.appointmentRequestButonu.click();
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
        assertTrue(("01022023"), US05_06_07.appoDate.isDisplayed());
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







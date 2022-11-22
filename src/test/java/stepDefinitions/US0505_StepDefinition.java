package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.US05_06_07;
import utilities.ConfigReader;
import utilities.Driver;

public class US0505_StepDefinition {

    @Given("Kullanici {string} ana sayfasina gider")
    public void kullaniciAnaSayfasinaGider(String medunnaUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @And("Make an Appointmenta tiklar")
    public void makeAnAppointmentaTiklar() {
        US05_06_07.makeAnAppointmentButton.click();

    }

    @Then("First Name kutusunun bos birakilamayacagini kontrol eder")
    public void firstNameKutusununBosBirakilamayacaginiKontrolEder() {
    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
    }

    @And("SSN kutusunun bos birakilamayacagini kontrol eder")
    public void ssnKutusununBosBirakilamayacaginiKontrolEder() {
    }

    @And("Last Name kutusunun bos birakilamayacagini kontrol eder")
    public void lastNameKutusununBosBirakilamayacaginiKontrolEder() {
    }

    @And("Phone kutusunun bos birakilamayacagini kontrol eder")
    public void phoneKutusununBosBirakilamayacaginiKontrolEder() {
    }

    @And("Randevu formuna telefon numarasi girer")
    public void randevuFormunaTelefonNumarasiGirer() {
    }

    @And("Send an Appointment Requeste tiklar")
    public void sendAnAppointmentRequesteTiklar() {
    }

    @And("Randevu olusturuldugunu kontrol eder")
    public void randevuOlusturuldugunuKontrolEder() {
    }

    @And("My Pages\\(patient)e tiklar")
    public void myPagesPatientETiklar() {
    }

    @And("My Appointmentsa tiklar")
    public void myAppointmentsaTiklar() {
    }

    @And("Ramdevularin goruntulendigini kontrol eder")
    public void ramdevularinGoruntulendiginiKontrolEder() {
    }
}

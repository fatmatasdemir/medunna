package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US_10_11_page;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_10_11_SD {

    US_10_11_page page = new US_10_11_page();
    Actions action = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    @Given("Doctor {string} anasayfasina gider")
    public void doctorAnasayfasinaGider(String anasayfa) {
        Driver.getDriver().get(ConfigReader.getProperty(anasayfa));

    }

    @And("ikonu tiklar")
    public void ikonuTiklar() {
        page.ikon.click();

    }

    @And("ilk sayfa sign in butonunu tiklar")
    public void ilkSayfaSignInButonunuTiklar() {
        page.signinAnasayfa.click();
    }


    @Then("kullanici adini girer")
    public void kullanici_adini_girer() {
        page.username.sendKeys("doktorhakan25" + Keys.ENTER);


    }

    @Then("Sifreyi girer")
    public void sifreyi_girer() {
        page.password.sendKeys("Hakan.25");

    }

    @Then("Signin butonuna tiklar")
    public void signin_butonuna_tiklar() {

        page.Signin.click();
    }

    @When("Mypages butonuna tiklar")
    public void mypages_butonuna_tiklar() throws InterruptedException {
        page.Mypages.click();
        Thread.sleep(2000);
        ;
    }

    @When("My appointments i tiklar")
    public void my_appointments_i_tiklar() {
        page.MyAppoitments.click();
    }

    @And("Appoitments  sayfasinda  bulunan hastalarin randevu listesini ve zaman dilimlerini assert eder")
    public void appoitmentsSayfasindaBulunanHastalarinRandevuListesiniVeZamanDilimleriniAssertEder() {


        List<String> randevulistStr = new ArrayList<>();
        List<WebElement> randevulistesisatiri = page.randevuTablosusatir;
        List<String> randevulistesisatiriStr = new ArrayList<>();
        List<WebElement> randevuList = page.randevuTablosu;

        for (WebElement w : randevuList) {

            randevulistStr.add(w.getText());

        }

        System.out.println(randevulistStr);

        assertTrue(randevulistStr.get(0).contains("304443"));


        for (WebElement w : randevulistesisatiri) {

            randevulistesisatiriStr.add(w.getText());

        }
        System.out.println(randevulistesisatiriStr.get(0));
        System.out.println(randevulistesisatiriStr.get(1));


    }


    @And("Doktor patientID {string}, start date {string}, end date {string}, status {string} bilgilerini görebilmeli")
    public void doktorPatientIDStartDateEndDateStatusBilgileriniGörebilmeli(String patientID, String startDate, String endDate, String status) {

        int satirnumarasi = -1;
        List<WebElement> arraylist = page.basliklistesi;

        for (int i = 0; i < arraylist.size(); i++) {

            if (arraylist.get(i).getText().contains("ID")) {
                satirnumarasi = i + 1;
                List<WebElement> istenenSutun = Driver.getDriver().findElements(By.xpath("//tbody//td[" + satirnumarasi + "]"));
                List<String> IDList = new ArrayList<>();
                if (satirnumarasi != -1) {
                    for (WebElement w : istenenSutun) {
                        IDList.add(w.getText());
                    }
                }
                System.out.println("Istenen ID listesi" + IDList);
                assertTrue(IDList.get(0).contains(patientID));
            }

            if (arraylist.get(i).getText().contains("Start DateTime")) {
                satirnumarasi = i + 1;
                List<WebElement> istenenSutun = Driver.getDriver().findElements(By.xpath("//tbody//td[" + satirnumarasi + "]"));
                List<String> startDateTime = new ArrayList<>();
                if (satirnumarasi != -1) {
                    for (WebElement w : istenenSutun) {
                        startDateTime.add(w.getText());
                    }
                }

                System.out.println("Start Date Time" + startDateTime);
                assertTrue(startDateTime.get(0).contains(startDate));
            }

            if (arraylist.get(i).getText().contains("End DateTime")) {
                satirnumarasi = i + 1;
                List<WebElement> istenenSutun = Driver.getDriver().findElements(By.xpath("//tbody//td[" + satirnumarasi + "]"));
                List<String> endDateList = new ArrayList<>();
                if (satirnumarasi != -1) {
                    for (WebElement w : istenenSutun) {
                        endDateList.add(w.getText());
                    }
                }
                System.out.println("Istenen Date list" + endDateList);
                assertTrue(endDateList.get(0).contains(endDate));
            }

            if (arraylist.get(i).getText().contains("Status")) {
                satirnumarasi = i + 1;
                List<WebElement> istenenSutun = Driver.getDriver().findElements(By.xpath("//tbody//td[" + satirnumarasi + "]"));
                List<String> statusList = new ArrayList<>();
                if (satirnumarasi != -1) {
                    for (WebElement w : istenenSutun) {
                        statusList.add(w.getText());
                    }
                }

                System.out.println("Istenen Status" + statusList);
                assertTrue(statusList.get(0).contains(status));

            }


        }
    }


    @And("Doktor  Create or edit an appointment işlemlerini yapabilmeli")
    public void doktorCreateOrEditAnAppointmentIşlemleriniYapabilmeli() throws InterruptedException {

        page.Edit1.click();
        Thread.sleep(3000);
        //page.Edit.isEnabled();
        Thread.sleep(2000);

    }

    @And("Doktor randevuyu guncellediginde id {string}, startDate {string}, endDate {string}, status {string}, physcian {string} bilgilerini gormelidir")
    public void doktorRandevuyuGuncelledigindeIdStartDateEndDateStatusBilgileriniGormelidir(String id, String startDate, String endDate, String status, String physician) {

        assertTrue(page.ID.isDisplayed());
        assertTrue(page.startDatetime.isDisplayed());
        assertTrue(page.endDatetime.isDisplayed());
        assertTrue(page.status.isDisplayed());
        assertTrue(page.status.isDisplayed());
        assertTrue(page.physician.isDisplayed());
        assertTrue(page.physician.isEnabled());



    }


    @And("Doktor  Create or editIki an appointment işlemlerini yapabilmeli")
    public void doktorCreateOreditBirAnAppointmentIşlemleriniYapabilmeli() throws InterruptedException {

        page.Edit2.click();
        Thread.sleep(2000);
    }

    @And("Doktor  Anamnesis, Treatment ve Diagnosis  alanlarını doldurmak zorundadır.")
    public void doktorAnamnesisTreatmentVeDiagnosisAlanlarınıDoldurmakZorundadır() throws InterruptedException {

        jse.executeScript("arguments[0].scrollIntoView(true);", page.anamnesis);
        page.anamnesis.sendKeys("ahmet" + Keys.ENTER);
        Thread.sleep(2000);
        page.treatment.sendKeys("ahmet" + Keys.ENTER);
        Thread.sleep(2000);
        page.diagnosis.sendKeys("ahmet" + Keys.ENTER);
        Thread.sleep(2000);
        jse.executeScript("arguments[0].click();", page.save);

    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {

        try {
            Thread.sleep(1000 * saniye);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("Doktorun doldurdugu alanlar yazilar assert edilir")
    public void doktorunDoldurduguAlanlarYazilarAssertEdilir() {
        page.alert.isDisplayed();


    }

    @And("Doktor  Anamnesis, Treatment ve Diagnosis  alanlarını bos birakir")
    public void doktorAnamnesisTreatmentVeDiagnosisAlanlarınıBosBirakir() throws InterruptedException {


        jse.executeScript("arguments[0].scrollIntoView(true);", page.anamnesis);
        page.anamnesis.sendKeys("" + Keys.ENTER);
        Thread.sleep(2000);
        page.treatment.sendKeys("" + Keys.ENTER);
        Thread.sleep(2000);
        page.diagnosis.sendKeys("" + Keys.ENTER);
        Thread.sleep(2000);
        jse.executeScript("arguments[0].click();", page.save);

    }




    @And("Doktor  anamnesis{string} alanini bos birakir")
    public void doktorAnamnesisAlaniniBosBirakir(String anamnesis) {
        page.anamnesis.sendKeys(anamnesis);

    }

    @And("Doktor  treatment {string} alanini bos birakir")
    public void doktorTreatmentAlaniniBosBirakir(String treatment) {
        page.treatment.sendKeys(treatment);

    }

    @And("Doktor  diagnosis {string} alanini bos birakir")
    public void doktorDiagnosisAlaniniBosBirakir(String diagnosis) {
        page.diagnosis.sendKeys(diagnosis);

    }

    @And("Doktor save yi tiklar")
    public void doktorSaveYiTiklar() {
        jse.executeScript("arguments[0].click();", page.save);
        List<WebElement> requiredList = Driver.getDriver().findElements(By.xpath("//div[.='This field is required.']/div"));
        List<String> requiredListSTr = new ArrayList<>();

        for (WebElement w : requiredList) {

            requiredListSTr.add(w.getText());
        }

        System.out.println(requiredListSTr);
        Assert.assertTrue(requiredListSTr.size() == 3);

    }

    @And("Doktor  anamnesis{string} alaninini doldurur")
    public void doktorAnamnesisAlanininiDoldurur(String anamnesis) {
        page.anamnesis.sendKeys(anamnesis);
    }

    @And("Doktor  treatment {string} alanini doldurur")
    public void doktorTreatmentAlaniniDoldurur(String treatment) {
        page.anamnesis.sendKeys(treatment);
    }

    @And("Doktor  diagnosis {string} doldurur")
    public void doktorDiagnosisDoldurur(String diagnosis) {
        page.anamnesis.sendKeys(diagnosis);
    }

    @And("Doktor  prescription {string} alanini doldurur")
    public void doktorPrescriptionAlaniniDoldurur(String prescription) {
        page.prescription.sendKeys(prescription);

    }

    @And("Doktor  description {string} alanini  doldurur")
    public void doktorDescriptionAlaniniDoldurur(String description) {
        page.prescription.sendKeys(description);
    }

    @And("Assert edilir")
    public void assertEdilir() {
        page.alert.isDisplayed();

    }


    @And("Doktor Status alaninini degistirebilir")
    public void doktorStatusAlanininiDegistirebilir() {
        page.status.isSelected();
        page.status.sendKeys("PENDING");
        assertTrue(page.status.getText().contains("PENDING"));

        page.status.sendKeys("COMPLETED");
        assertTrue(page.status.getText().contains("COMPLETED"));

        page.status.sendKeys("CANCELLED");
        assertTrue(page.status.getText().contains("CANCELLED"));
        //String tumsecenekler=page.status.getText();
        //   System.out.println(tumsecenekler);

        Select select = new Select(page.status);

        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());
        System.out.println("==================");

        List<WebElement> tumliste = select.getAllSelectedOptions();
        List<String> tumlisteStr = new ArrayList<>();

        for (WebElement w:tumliste){

            tumlisteStr.add(w.getText());
        }
        System.out.println(tumlisteStr);

    }

    @And("Doktor Status alaninini {string} olarak degistirir")
    public void doktorStatusAlanininiOlarakDegistirir(String statusalani) {


        page.status.isSelected();
        page.status.sendKeys(statusalani);
        assertTrue(page.status.getText().contains(statusalani));



    }


    @And("Doktor editIki alanini tiklar")
    public void doktorEditIkiAlaniniTiklar() throws InterruptedException {
        page.Edit2.click();
        Thread.sleep(2000);

    }

    @And("Doktor editBir alanini tiklar")
    public void doktorEditBirAlaniniTiklar() throws InterruptedException {
            page.Edit1.click();
            //page.Edit.isEnabled();
            Thread.sleep(2000);

        }

    }
















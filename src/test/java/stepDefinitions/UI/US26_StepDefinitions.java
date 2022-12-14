package stepDefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.US05_06_07_Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class US26_StepDefinitions {

    US05_06_07_Page page=new US05_06_07_Page();
    List<Map<String,Object>> actualData;
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();
    static SoftAssert softAssert;

    @Given("Kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));
    }

    @Then("Kullanici Contact'a tiklar")
    public void kullaniciContactATiklar() {
        page.contactButton.click();
    }


    @Then("Location,Email ve Call Bilgileri dogrulanir")
    public void locationEmailVeCallBilgileriDogrulanir() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        List<WebElement> LocEmaCall= page.uclu;
        for (WebElement w:   LocEmaCall ) {
            Assert.assertTrue(w.isDisplayed());
        }

        String expectedLocation="575 Eighth Avenue New York, NY 10018";
        String actualLocation=page.location.getText();
        Assert.assertEquals(actualLocation,expectedLocation);

        String expectedEmail="contact@medunna.com";
        String actulaEmail=page.email.getText();
        Assert.assertEquals(actulaEmail,expectedEmail);

        String expectedCall="+1 (336) 546-5245";
        String actualCall=page.call.getText();
        Assert.assertEquals(actualCall,expectedCall);


    }






    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Then("Contect butonuna tiklar")
    public void contectButonunaTiklar() {

        page.contactButton.click();
       // actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("mesaj icin gerekli olan name kutucugu doldurur")
    public void mesajIcinGerekliOlanNameKutucuguDoldurur() throws InterruptedException {
     //   actions.sendKeys(Keys.PAGE_DOWN).perform();
        assertTrue( page.mesajName.isDisplayed());
        page.mesajName.sendKeys(faker.name().firstName());
        Thread.sleep(2000);

    }

    @And("mesaj icin gerekli olan email kutucugu doldurur")
    public void mesajIcinGerekliOlanEmailKutucuguDoldurur() throws InterruptedException {
        assertTrue(page.mesajEmail.isDisplayed());
        page.mesajEmail.sendKeys(faker.internet().emailAddress());
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN);

    }

    @And("mesaj icin gerekli olan Subject kutucugu doldurur")
    public void mesajIcinGerekliOlanSubjectKutucuguDoldurur() throws InterruptedException {

        assertTrue(page.mesajSubject.isDisplayed());
        page.mesajSubject.sendKeys("Konu Basligi");
        actions.sendKeys(Keys.DOWN);
        Thread.sleep(2000);

    }

    @And("mesaj icin gerekli olan Message kutucugu doldurur")
    public void mesajIcinGerekliOlanMessageKutucuguDoldurur() throws InterruptedException {
        assertTrue(page.mesaj.isDisplayed());
        actions.sendKeys(Keys.DOWN);
        Thread.sleep(2000);
        page.mesaj.sendKeys("PROJE BITSEDE HERSEY ASIL SIMDI BASLIYOR; UMUDUNU HICBIR ZAMAN KAYBETME");


    }

    @Then("Send butonuna taklar")
    public void sendButonunaTaklar() {
        actions.sendKeys(Keys.DOWN);
        page.sendButonu.submit();
    }


    @And("Name bolumunu bos birakir")
    public void nameBolumunuBosBirakir() {
        page.mesajName.sendKeys(" ");
    }

    @And("Email bolumunu bos birakir")
    public void emailBolumunuBosBirakir() {
        page.mesajEmail.sendKeys(" ");
        actions.sendKeys(Keys.TAB).perform();
    }

    @And("Subject bolumunu bos birakir")
    public void subjectBolumunuBosBirakir() {
        page.mesajSubject.sendKeys(" ");
     actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB);
       // actions.sendKeys(Keys.TAB).perform();
       /* JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", page.mesajName);
        jse.executeScript("arguments[0].click()", page.mesajName);
     */
    }

    @And("Name is required yazisini görür")
    public void nameIsRequiredYazisiniGörür() {
    assertTrue(page.NameIsRequired.isDisplayed());
    }

    @And("Your email is required yazisini görür")
    public void yourEmailIsRequiredYazisiniGörür() {
        assertTrue(page.YourEmailIsRequired.isDisplayed());
    }

    @And("This field is required yazisini görür")
    public void thisFieldIsRequiredYazisiniGörür() {
        assertTrue(page.ThisFieldIsRequired.isDisplayed());
    }

    @Then("Message bolumunu bos birakir")
    public void message_bolumunu_bos_birakir() {
       page.mesaj.sendKeys(" ");
    }

}

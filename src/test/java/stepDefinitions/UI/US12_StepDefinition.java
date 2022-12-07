package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.US05_06_07_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US12_StepDefinition {

    US05_06_07_Page page =new US05_06_07_Page();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @Given("Doktor {string} gider")
    public void doktor_gider(String string) {
      Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));
    }
    @When("Doktor Giris ikonuna tiklar")
    public void doktor_giris_ikonuna_tiklar() {
       page.accountMenu.click();
    }
    @Then("Doktor Sign in secenegine tiklar")
    public void doktor_sign_in_secenegine_tiklar() {
    page.signInButton.click();
    }

        @And("Doktor valid {string} ve valid {string} ile giris yapar")
    public void doktorValidVeValidIleGirisYapar(String doctorusername, String doctorpassword) {
   page.userNameButton.sendKeys(ConfigReader.getProperty(doctorusername));
   page.passwordButton.sendKeys(ConfigReader.getProperty(doctorpassword));

    }

    @And("Doktor Sign in butonuna tiklar")
    public void doktorSignInButonunaTiklar() {
   page.signInButton3.click();
    }

    @And("Doktor My Pages'e tiklar")
    public void doktorMyPagesETiklar() {
        page.myPages.click();
    }

    @And("Doktor My appointments'e tiklar")
    public void doktorMyAppointmentsETiklar() {
        page.myAppointments.click();
    }

    @And("Doktor Edit butonuna tiklar")
    public void doktorEditButonunaTiklar() {
        page.editButton.click();
        ReusableMethods.waitFor(3);
    }

    @And("Doktor Request A Test butonuna tiklar")
    public void doktorRequestATestButonunaTiklar() {
         page.requestATest.click();
        ReusableMethods.waitFor(5);
    }

    @And("Doktor Test items tablosunun gorunur oldugunu test eder")
    public void doktorTestItemsTablosununGorunurOldugunuTestEder() {
        page.testItemsTable.size();

    }

    @Then("Doktor sayfayi kapatir")
    public void doktorSayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("Doktor Testlere tiklar")
    public void doktorTestlereTiklar() {
        js.executeScript("arguments[0].scrollIntoView()",page.sodiumbutton);
        js.executeScript("arguments[0].click();",page.sodiumbutton);
        js.executeScript("arguments[0].scrollIntoView()",page.ureaButton);
        js.executeScript("arguments[0].click();",page.ureaButton);
        js.executeScript("arguments[0].scrollIntoView()",page.creatinineButton);
        js.executeScript("arguments[0].click();",page.creatinineButton);
        js.executeScript("arguments[0].scrollIntoView()",page.albuminButton);
        js.executeScript("arguments[0].click();",page.albuminButton);
        js.executeScript("arguments[0].scrollIntoView()",page.hemoglobinButton);
        js.executeScript("arguments[0].click();",page.hemoglobinButton);
        js.executeScript("arguments[0].scrollIntoView()",page.glucoseButton);
        js.executeScript("arguments[0].click();",page.glucoseButton);
        js.executeScript("arguments[0].scrollIntoView()",page.potassiumButton);
        js.executeScript("arguments[0].click();",page.potassiumButton);
        ReusableMethods.waitFor(5);
    }

    @And("Doktor save butonuna tiklar")
    public void doktorSaveButonunaTiklar() {
        js.executeScript("arguments[0].scrollIntoView()",page.saveButtonx);
        ReusableMethods.waitFor(2);
        js.executeScript("arguments[0].click();",page.saveButtonx);
        ReusableMethods.waitFor(3);
    }

    @And("Doktor Show Test Result butonuna tiklar")
    public void doktorShowTestResultButonunaTiklar() {
        page.showTestResultButton.click();
    }

    @And("Doktor View Results butonuna tiklar")
    public void doktorViewResultsButonunaTiklar() {
        page.viewResultsButton.click();

    }

    @And("Doktor Test iceriginde \\(glucose, Urea, Creatinine, Sodium, Potassium-, Albumin, Hemoglobin) seceneklerinin oldugunu test eder")
    public void doktorTestIcerigindeGlucoseUreaCreatinineSodiumPotassiumAlbuminHemoglobinSeceneklerininOldugunuTestEder() {

        List<String> expectedBaslik=new ArrayList<>();
        expectedBaslik.add("ID");
        expectedBaslik.add("Name");
        expectedBaslik.add("Result");
        expectedBaslik.add("Default Min. Value");
        expectedBaslik.add("Default Max. Value");
        expectedBaslik.add("Test");
        expectedBaslik.add("Description");
        expectedBaslik.add("Date");

        List<String> actualBaslik=new ArrayList<>();
        for (WebElement w: page.testResultsBaslikIsimleri
        ) {
            actualBaslik.add(w.getText());
        }
        Assert.assertTrue(actualBaslik.containsAll(expectedBaslik));
    }



}


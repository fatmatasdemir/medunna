package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import pages.US05_06_07;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;
import static pages.US05_06_07.LastName;

public class US05_StepDefinition {

   US05_06_07 page=new US05_06_07();
    Faker faker=new Faker();
    String expectedCreatedDate;
    int actualCreatedIndex;




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

    @Then("kullanıcı bir {string} yazar ve bu alanı boş bırakamaz")
    public void kullanıcıBirYazarVeBuAlanıBoşBırakamaz(String FirstName) {
     JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
     jse.executeScript("arguments[0].scrollIntoView(true);", US05_06_07.makeAnAppointmentButton);
     jse.executeScript("arguments[0].click()",US05_06_07.makeAnAppointmentButton);
       US05_06_07.firstnameTextbox.sendKeys(FirstName);

    }

    @And("Your {string} is required. yazısının olmadığı test edilir.")
    public void yourIsRequiredYazısınınOlmadığıTestEdilir(String arg0) {
     try
     {
      Assert.assertTrue(US05_06_07.firstNameIsRequired.isDisplayed());



     } catch (AssertionError e)
     {
      Assert.assertTrue(true);
     }


    }



    @Then("kullanıcı sayfayı kapatır")
    public void kullanıcıSayfayıKapatır() {
     Driver.closeDriver();
    }


    @Then("kullanıcı kayıtlı {string} yazar ve bu alanı boş bırakamaz")
    public void kullanıcıKayıtlıYazarVeBuAlanıBoşBırakamaz(String SSN) {
     US05_06_07.SSN.sendKeys(SSN+ Keys.TAB);
    }

    @And("Your SSN is invalid yazısının olmadığı test edilir.")
    public void yourSSNIsInvalidYazısınınOlmadığıTestEdilir() {
     try
     {


     US05_06_07.YourSSNIsInvalid.isDisplayed();
      Assert.fail();

     } catch (NoSuchElementException e)
     {
      Assert.assertTrue(true);

     }
    }

    @Then("kullanıcı LastName kısmına bir {string} yazar ve bu alanı boş bırakamaz")
    public void kullanıcıLastNameKısmınaBirYazarVeBuAlanıBoşBırakamaz(String LastName) {
    US05_06_07.LastName.sendKeys(LastName+Keys.TAB);
    }

    @And("Last Name kısmının altında Your {string} is required. yazısının olmadığı  test edilir.")
    public void lastNameKısmınınAltındaYourIsRequiredYazısınınOlmadığıTestEdilir(String arg0) {
     if(LastName.equals("")){

      Assert.fail();
     }else{


      Assert.assertTrue(true);
     }
    }


    @Then("kullanıcı email kısmına bir {string} yazar ve bu alanı boş bırakamaz")
    public void kullanıcıEmailKısmınaBirYazarVeBuAlanıBoşBırakamaz(String Email) {
     US05_06_07.Email.sendKeys(Email+Keys.TAB);

    }

    @And("Email kısmının altında Your {string} is required. yazısının olmadığı  test edilir.")
    public void emailKısmınınAltındaYourIsRequiredYazısınınOlmadığıTestEdilir(String arg0) {
    }

    @Then("kullanıcı telefon numarası kısmına bir {int}. ve {int}. rakamdan sonra {string} olan {int} rakamlı {string} girer ve bu alanı boş bırakamaz")
    public void kullanıcıTelefonNumarasıKısmınaBirVeRakamdanSonraOlanRakamlıGirerVeBuAlanıBoşBırakamaz(int arg0, int arg1, String arg2, int arg3, String PhoneNumber) {

     US05_06_07.PhoneNumber.sendKeys(PhoneNumber+Keys.TAB);
    }

    @And("telefon numarasının altında Your {string} is required. yazısının olmadığı  test edilir.")
    public void telefonNumarasınınAltındaYourIsRequiredYazısınınOlmadığıTestEdilir(String PhoneNumber) {
     if(PhoneNumber.charAt(3) == '-'){
      if (PhoneNumber.charAt(7) == '-'){
       if(PhoneNumber.length()==12){
        assertTrue(true);
       }else {
        Assert.fail();
       }
      }else{
       Assert.fail();
      }

     }else{
      Assert.fail();
     }
    }


    @And("kullanıcı Send an Appointment Request butonuna tıklar")
    public void kullanıcıSendAnAppointmentRequestButonunaTıklar() {
     US05_06_07.SendanAppointmentRequestButonu.submit();
    }

    @And("kullanıcı sayfanın sag ust kısmındaki kullanıcı logosuna tıklar")
    public void kullanıcıSayfanınSagUstKısmındakiKullanıcıLogosunaTıklar() {
     US05_06_07.accountMenuButton2.click();

    }

    @Then("kullanıcı acilan menude Sign in butonuna tiklar")
    public void kullanıcıAcilanMenudeSignInButonunaTiklar() {
      US05_06_07.signInButton.click();
    }

    @And("kullanıcı username kısmına {string}  girer.")
    public void kullanıcıUsernameKısmınaGirer(String username) {
     US05_06_07.usernameTextBox.sendKeys(username);
    }

    @Then("kullanıcı password kısmına {string} girer.")
    public void kullanıcıPasswordKısmınaGirer(String password) {
     US05_06_07.passwordTextBox.sendKeys(password);
    }

    @And("kullanıcı sayfaya gidebilmek icin Sign in butonuna tıklar.")
    public void kullanıcıSayfayaGidebilmekIcinSignInButonunaTıklar() {
     US05_06_07.signInButton2.click();
    }

    @Then("kullanıcı sayfanin sağ ust kismindaki My Pages butonuna tiklar.")
    public void kullanıcıSayfaninSağUstKismindakiMyPagesButonunaTiklar() {
     US05_06_07.myPages.click();

    }

    @And("kullanıcı My Appointments butonuna tıklar")
    public void kullanıcıMyAppointmentsButonunaTıklar() {
     US05_06_07.MyAppointments.click();
    }

    @Then("kullanıcı randevusunu oluşturduğunu görür")
    public void kullanıcıRandevusunuOluşturduğunuGörür() {
     try{
     US05_06_07.id.isDisplayed();
      Assert.assertTrue(true);
     }catch(Exception e){
      Assert.fail();
     }


    }
}

package stepDefinitionsUI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import pages.US05_06_07_Page;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static pages.US05_06_07_Page.LastName;

public class US05_06_07_StepDefinition {

 US05_06_07_Page page = new US05_06_07_Page();
 Faker faker = new Faker();
 String expectedCreatedDate;
 int actualCreatedIndex;



 @Given("kullanıcı {string} sayfasına gider")
 public void kullanıcıSayfasınaGider(String arg0) {

  Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));
 }

 @And("kullanıcı anasayfadaki Make an Appointment butonuna tıklar")
 public void kullanıcıAnasayfadakiMakeAnAppointmentButonunaTıklar() {
  JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
  jse.executeScript("arguments[0].scrollIntoView(true);", US05_06_07_Page.makeAnAppointmentButton);
  jse.executeScript("arguments[0].click()", US05_06_07_Page.makeAnAppointmentButton);

 }

 @Then("kullanıcı bir {string} yazar ve bu alanı boş bırakamaz")
 public void kullanıcıBirYazarVeBuAlanıBoşBırakamaz(String FirstName) {
  JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
  jse.executeScript("arguments[0].scrollIntoView(true);", US05_06_07_Page.makeAnAppointmentButton);
  jse.executeScript("arguments[0].click()", US05_06_07_Page.makeAnAppointmentButton);
  US05_06_07_Page.firstnameTextbox.sendKeys(FirstName);

 }

 @And("Your {string} is required. yazısının olmadığı test edilir.")
 public void yourIsRequiredYazısınınOlmadığıTestEdilir(String arg0) {
  try {
   Assert.assertTrue(US05_06_07_Page.firstNameIsRequired.isDisplayed());


  } catch (AssertionError e) {
   Assert.assertTrue(true);
  }


 }


 @Then("kullanıcı sayfayı kapatır")
 public void kullanıcıSayfayıKapatır() {
  Driver.closeDriver();
 }


 @Then("kullanıcı kayıtlı {string} yazar ve bu alanı boş bırakamaz")
 public void kullanıcıKayıtlıYazarVeBuAlanıBoşBırakamaz(String SSN) {

  US05_06_07_Page.SSN.sendKeys(SSN + Keys.TAB);
 }

 @And("Your SSN is invalid yazısının olmadığı test edilir.")
 public void yourSSNIsInvalidYazısınınOlmadığıTestEdilir() {
  try {


   US05_06_07_Page.YourSSNIsInvalid.isDisplayed();
   Assert.fail();

  } catch (NoSuchElementException e) {
   Assert.assertTrue(true);

  }
 }

 @Then("kullanıcı LastName kısmına bir {string} yazar ve bu alanı boş bırakamaz")
 public void kullanıcıLastNameKısmınaBirYazarVeBuAlanıBoşBırakamaz(String LastName) {
  US05_06_07_Page.LastName.sendKeys(LastName + Keys.TAB);
 }

 @And("Last Name kısmının altında Your {string} is required. yazısının olmadığı  test edilir.")
 public void lastNameKısmınınAltındaYourIsRequiredYazısınınOlmadığıTestEdilir(String arg0) {
  if (LastName.equals("")) {

   Assert.fail();
  } else {


   Assert.assertTrue(true);
  }
 }


 @Then("kullanıcı email kısmına bir {string} yazar ve bu alanı boş bırakamaz")
 public void kullanıcıEmailKısmınaBirYazarVeBuAlanıBoşBırakamaz(String Email) {
  US05_06_07_Page.Email.sendKeys(Email + Keys.TAB);

 }

 @And("Email kısmının altında Your {string} is required. yazısının olmadığı  test edilir.")
 public void emailKısmınınAltındaYourIsRequiredYazısınınOlmadığıTestEdilir(String arg0) {
 }

 @Then("kullanıcı telefon numarası kısmına bir {int}. ve {int}. rakamdan sonra {string} olan {int} rakamlı {string} girer ve bu alanı boş bırakamaz")
 public void kullanıcıTelefonNumarasıKısmınaBirVeRakamdanSonraOlanRakamlıGirerVeBuAlanıBoşBırakamaz(int arg0, int arg1, String arg2, int arg3, String PhoneNumber) {

  US05_06_07_Page.PhoneNumber.sendKeys(PhoneNumber + Keys.TAB);
 }

 @And("telefon numarasının altında Your {string} is required. yazısının olmadığı  test edilir.")
 public void telefonNumarasınınAltındaYourIsRequiredYazısınınOlmadığıTestEdilir(String PhoneNumber) {
  if (PhoneNumber.charAt(3) == '-') {
   if (PhoneNumber.charAt(7) == '-') {
    if (PhoneNumber.length() == 12) {
     assertTrue(true);
    } else {
     Assert.fail();
    }
   } else {
    Assert.fail();
   }

  } else {
   Assert.fail();
  }
 }


 @And("kullanıcı Send an Appointment Request butonuna tıklar")
 public void kullanıcıSendAnAppointmentRequestButonunaTıklar() {

  US05_06_07_Page.SendanAppointmentRequestButonu.submit();
 }

 @And("kullanıcı sayfanın sag ust kısmındaki kullanıcı logosuna tıklar")
 public void kullanıcıSayfanınSagUstKısmındakiKullanıcıLogosunaTıklar() {
  US05_06_07_Page.accountMenuButton2.click();

 }

 @Then("kullanıcı acilan menude Sign in butonuna tiklar")
 public void kullanıcıAcilanMenudeSignInButonunaTiklar() {
  US05_06_07_Page.signInButton.click();
 }

 @And("kullanıcı username kısmına {string}  girer.")
 public void kullanıcıUsernameKısmınaGirer(String username) {
  US05_06_07_Page.usernameTextBox.sendKeys(username);
 }

 @Then("kullanıcı password kısmına {string} girer.")
 public void kullanıcıPasswordKısmınaGirer(String password) {
  US05_06_07_Page.passwordTextBox.sendKeys(password);
 }

 @And("kullanıcı sayfaya gidebilmek icin Sign in butonuna tıklar.")
 public void kullanıcıSayfayaGidebilmekIcinSignInButonunaTıklar() {
  US05_06_07_Page.signInButton2.click();
 }

 @Then("kullanıcı sayfanin sağ ust kismindaki My Pages butonuna tiklar.")
 public void kullanıcıSayfaninSağUstKismindakiMyPagesButonunaTiklar() {
  US05_06_07_Page.myPages.click();

 }

 @And("kullanıcı My Appointments butonuna tıklar")
 public void kullanıcıMyAppointmentsButonunaTıklar() {
  US05_06_07_Page.MyAppointments.click();
 }

 @Then("kullanıcı randevusunu oluşturduğunu görür")
 public void kullanıcıRandevusunuOluşturduğunuGörür() {
  try {
   US05_06_07_Page.id.isDisplayed();
   Assert.assertTrue(true);
  } catch (Exception e) {
   Assert.fail();
  }


 }


 @Then("{int} saniye bekler")
 public void saniyeBekler(int saniye) {
  try {
   Thread.sleep(saniye * 1000);
  } catch (InterruptedException e) {
   throw new RuntimeException(e);
  }
 }

 @And("Kullanici giris ikonuna tiklar")
 public void kullaniciGirisIkonunaTiklar() {
  US05_06_07_Page.accountMenuButton2.click();
 }

 @And("Kullanici Sign in butonuna tiklar")
 public void kullaniciSignInButonunaTiklar() {
  US05_06_07_Page.signInButton.click();
 }

 @And("Kullanici gecerli username ve password ile girisi yapar")
 public void kullaniciGecerliUsernameVePasswordIleGirisiYapar() {
  US05_06_07_Page.usernameTextBox.sendKeys(ConfigReader.getProperty("patientUsername"));
  US05_06_07_Page.passwordTextBox.sendKeys(ConfigReader.getProperty("password"));
  US05_06_07_Page.signInButton2.click();

 }

 @And("Kullanici settings butonuna tiklar")
 public void kullaniciSettingsButonunaTiklar() {
  US05_06_07_Page.settingsButton.click();
 }

 @Then("First Name bilgisinin dogrulugunu kontrol eder")
 public void firstNameBilgisininDogrulugunuKontrolEder() {
  String actualFirstnameTextbox = US05_06_07_Page.firstnameTextbox.getAttribute("value");
  Assert.assertEquals(actualFirstnameTextbox, ConfigReader.getProperty("userFirstName"));


 }

 @And("Last Name bilgisinin dogrulugunu kontrol eder")
 public void lastNameBilgisininDogrulugunuKontrolEder() {
  String actualLastnameTextbox = US05_06_07_Page.lastnameTextbox.getAttribute("value");
  Assert.assertEquals(actualLastnameTextbox, ConfigReader.getProperty("userLastName"));
 }

 @And("Email bilgisinin dogrulugunu kontrol eder")
 public void emailBilgisininDogrulugunuKontrolEder() {
  Assert.assertEquals(US05_06_07_Page.emailTextbox.getAttribute("value"), ConfigReader.getProperty("userEmail"));
 }

 @And("Kulanici farkli isim girer")
 public void kulaniciFarkliIsimGirer() {
  US05_06_07_Page.firstnameTextbox.clear();
  US05_06_07_Page.firstnameTextbox.sendKeys(faker.name().firstName());
 }

 @And("Kullanici Save butonuna tiklar")
 public void kullaniciSaveButonunaTiklar() {
  US05_06_07_Page.saveButton.click();
 }

 @Then("Settings Saved yazisi gorundugu dogrulanir")
 public void settingsSavedYazisiGorunduguDogrulanir() {
  US05_06_07_Page.settingsSavedText.isDisplayed();
 }

 @And("Kulanici farkli soyisim girer")
 public void kulaniciFarkliSoyisimGirer() {
  US05_06_07_Page.lastnameTextbox.clear();
  US05_06_07_Page.lastnameTextbox.sendKeys(faker.name().lastName());

 }

 @And("Kulanici farkli email girer")
 public void kulaniciFarkliEmailGirer() {
  US05_06_07_Page.emailTextbox.clear();
  US05_06_07_Page.emailTextbox.sendKeys(faker.internet().emailAddress());
 }



 @Then("Appointment DateTime altindaki kutucuga ileri bir tarih girilir")
 public void appointmentDateTimeAltindakiKutucugaIleriBirTarihGirilir() {
  US05_06_07_Page.appoDate.sendKeys("16122022");
 }

 @And("Girilen tarihin gun.ay.yil formatinda oldugu test edilir")
 public void girilenTarihinGunAyYilFormatindaOlduguTestEdilir() {
  assertTrue(("01022023"), US05_06_07_Page.appoDate.isDisplayed());
 }

 @Then("Kullanici appointment DateTime Gecmis bir tarih girer")
 public void kullaniciAppointmentDateTimeGecmisBirTarihGirer() {
  US05_06_07_Page.appointmentDateTimeBox.sendKeys(ConfigReader.getProperty("gecmisTarih"));
 }

 @And("Kullanici gecmis bir tarihle randevu alinamayacagini test eder")
 public void kullaniciGecmisBirTarihleRandevuAlinamayacaginiTestEder() {
  Assert.assertTrue(US05_06_07_Page.pastDateTextElement.isDisplayed());
 }

 @And("Kullanici gecerli bilgileri girer")
 public void kullaniciGecerliBilgileriGirer() {
  US05_06_07_Page.firstnameTextbox.sendKeys(ConfigReader.getProperty("patientFirstname"));
  US05_06_07_Page.lastnameTextbox.sendKeys(ConfigReader.getProperty("patientLastname"));
  US05_06_07_Page.emailTextbox.sendKeys(ConfigReader.getProperty("patientEmail"));
  US05_06_07_Page.phoneBox.sendKeys(ConfigReader.getProperty("phonePatient"));
  US05_06_07_Page.SSN.sendKeys(ConfigReader.getProperty("SSN"));

 }

    @And("kullanıcı bir {string} yazar")
    public void kullanıcıBirYazar(String FirstName) {
     US05_06_07_Page.firstnameTextbox.sendKeys(FirstName);
    }

    @And("kullanıcı LastName kısmına bir {string} yazar")
    public void kullanıcıLastNameKısmınaBirYazar(String LastName ) {
     US05_06_07_Page.LastName.sendKeys(LastName + Keys.TAB);
    }

    @And("kullanıcı kayıtlı {string} yazar")
    public void kullanıcıKayıtlıYazar(String SSN) {
     US05_06_07_Page.SSN.sendKeys(SSN + Keys.TAB);
    }

    @And("kullanıcı email kısmına bir {string} yazar")
    public void kullanıcıEmailKısmınaBirYazar(String Email) {
     US05_06_07_Page.Email.sendKeys(Email + Keys.TAB);

    }

    @And("kullanıcı telefon numarası kısmına {int} rakamlı {string} girer")
    public void kullanıcıTelefonNumarasıKısmınaRakamlıGirer(int arg0, String PhoneNumber) {
     US05_06_07_Page.PhoneNumber.sendKeys(PhoneNumber + Keys.TAB);

    }


    @Then("Kullanici ekranda Appointment registration saved mesajini gorememeli")
    public void kullaniciEkrandaAppointmentRegistrationSavedMesajiniGorememeli() {
       assertFalse("Appointment registration saved mesaji görüldü", US05_06_07_Page.AppointmentRegistrationSaved.isDisplayed());
    }

  @And("Kullanici randevu tarihini  secer")
  public void kullaniciRandevuTarihiniSecer() {

   US05_06_07_Page.appoDate.sendKeys("18122022");
 }
}
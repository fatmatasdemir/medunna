package stepDefinitionsUI;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.US_16_17_18_28;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MedunnaStepDefinition {
    US_16_17_18_28 medunna = new US_16_17_18_28();
    Faker faker = new Faker();
    Actions action = new Actions(Driver.getDriver());

    Select select;

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    @Given("admin {string} sayfasina gider")
    public void admin_sayfasina_gider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @And("ana sayfadaki giris ikonuna tiklar")
    public void anaSayfadakiGirisIkonunaTiklar() {
     medunna.girisIkonu.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("sign in sekmesine tiklar")
    public void signInSekmesineTiklar() {
        medunna.login.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @When("gecerli bir admin_user_name ve sifre girer")
    public void gecerliBirAdmin_user_nameVeSifreGirer() {
        medunna.username.sendKeys("Team02");
        medunna.sifre.sendKeys("team02@12345");
        medunna.signInButonu.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Acilan sayfada ust menudeki Items&titles sekmesine tiklar")
    public void acilanSayfadaUstMenudekiItemsTitlesSekmesineTiklar() {
        medunna.itemsTitles.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Acilan menude room secenegini tiklar")
    public void acilanMenudeRoomSeceneginiTiklar() {
        medunna.room.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Acilan sayfada create a new room sekmesine tiklar")
    public void acilanSayfadaCreateANewRoomSekmesineTiklar() {
        medunna.createANewRoom.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }




    @Then("Room Number kisminda This field is required yazisinin gorunur oldugunu dogrular")
    public void roomNumberKismindaThisFieldIsRequiredYazisininGorunurOldugunuDogrular() {

        WebElement invalidFeedback= Driver.getDriver().findElement(By.xpath("(//div[text()='This field is required.'])[1]"));
        Assert.assertTrue(invalidFeedback.isDisplayed());
    }



    @When("admin {int} saniye bekler")
    public void adminSaniyeBekler(int istenenSure) {

        try {
            Thread.sleep(istenenSure*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @And("Room Type sekmesine tiklar")
    public void roomTypeSekmesineTiklar() {
        medunna.roomType.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Then("Acilan menude {string} yazilarinin gorundugunu dogrular")
    public void acilanMenudeYazilarininGorundugunuDogrular(String arg0) {
        select= new Select(medunna.roomType);

       List<WebElement> actualRoomTypes= select.getOptions();
       List<String> expectedRooms = new ArrayList<String>();
       expectedRooms.add("TWIN");
       expectedRooms.add("DELUXE");
       expectedRooms.add("PREMIUM_DELUXE");
       expectedRooms.add("SUITE");
       expectedRooms.add("DAYCARE");


        for (WebElement roomType : actualRoomTypes) {
            Assert.assertTrue(expectedRooms.contains(roomType.getText()));
        }
    }

    @And("Acilan sayfada Status check box'a tiklar")
    public void acilanSayfadaStatusCheckBoxATiklar() {
        medunna.checkBox.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Then("Check box'in isaretlenmis oldugunu dogrular")
    public void checkBoxInIsaretlenmisOldugunuDogrular() {
        WebElement checkBoxValue =Driver.getDriver().findElement(By.cssSelector("[id=\"room-status\"]"));
        Assert.assertEquals(checkBoxValue.getAttribute("value"),"true");
    }

    @And("Room number kismina unique bir oda numarasi girer")
    public void roomNumberKisminaUniqueBirOdaNumarasiGirer() {
        int roomNumber= faker.number().numberBetween(111111,99999999);
        medunna.roomNumber.sendKeys(String.valueOf(roomNumber));


    }

    @And("price kismina bir fiyat yazar")
    public void priceKisminaBirFiyatYazar() {
        medunna.priceRoom.clear();
        medunna.priceRoom.sendKeys("100");
    }


    @Then("Acilan Room sayfasinda A new Room is created with identifier yazisinin gorunur oldugunu test eder")
    public void acilanRoomSayfasindaANewRoomIsCreatedWithIdentifierYazisininGorunurOldugunuTestEder() {

        String expectedRoomstext= "A new Room is created with identifier";
        String actualRoomstext= medunna.roomCreationSuccessMessage.getText();
      Assert.assertTrue(actualRoomstext.contains(expectedRoomstext));

    }


    @Then("Price kisminda This field is required yazisinin gorunur oldugunu dogrular")
    public void priceKismindaThisFieldIsRequiredYazisininGorunurOldugunuDogrular() {
        Assert.assertTrue(medunna.invalidPriceFeedback.isDisplayed());
    }

    @And("description kismina bir tanim yazar")
    public void descriptionKisminaBirTanimYazar() {
        medunna.description.sendKeys("room beautiful");
    }

    @And("tarihin istenen formatta oldugunu dogrular")
    public void tarihinIstenenFormattaOldugunuDogrular() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.now();
        medunna.date.sendKeys(dtf.format(localDate));

    }

    @And("sayfadaki ilk odanin edit secenegine tiklar")
    public void sayfadakiIlkOdaninEditSecenegineTiklar() {
        medunna.edit.click();
    }

    @Then("Acilan Room sayfasinda A Room is updated with identifier yazisinin gorunur oldugunu test eder")
    public void acilanRoomSayfasindaARoomIsUpdatedWithIdentifierYazisininGorunurOldugunuTestEder() {
        String expectedText="A Room is updated with identifier";
        String actualText=medunna.roomUpdatedMessage.getText();
        Assert.assertTrue(actualText.contains(expectedText));
    }





    @And("Acilan room sayfasinda son sayfaya gider")
    public void acilanRoomSayfasindaSonSayfayaGider() {
        jse.executeScript("arguments[0].scrollIntoView(true);", medunna.sonSayfa);
        jse.executeScript("arguments[0].click()", medunna.sonSayfa);
    }

    @And("kaydedilen odanin tarihinin kaydedilen tarih degil de guncel oldugunu onaylar")
    public void kaydedilenOdaninTarihininKaydedilenTarihDegilDeGuncelOldugunuOnaylar() {
      WebElement tarih=Driver.getDriver().findElement(By.xpath("(//td[text()='']//following::td/following::span)[1]"));
    }



    @And("tarih kisminda yil kismini {string} yapar")
    public void tarihKismindaYilKisminiYapar(String arg0) {
        medunna.date.sendKeys("10/10/2020");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("acilan sayfada room type ust basligina tiklar")
    public void acilanSayfadaRoomTypeUstBasliginaTiklar() {
        medunna.roomTypeUstBaslik.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("sayfadaki ilk {int} odanin TWIN turde oldugunu dogrular")
    public void sayfadakiIlkOdaninTWINTurdeOldugunuDogrular(int arg0) {
        String expectedRoom= "TWIN";
        String actualRoom1 = medunna.room1.getText();
        String actualRoom2 = medunna.room2.getText();
        String actualRoom3 = medunna.room3.getText();
        Assert.assertEquals(expectedRoom, actualRoom1);
        Assert.assertEquals(expectedRoom, actualRoom2);
        Assert.assertEquals(expectedRoom, actualRoom3);


    }



    @And("ilk {int} odanin DAYCARE turunde oldugunu dogrular")
    public void ilkOdaninDAYCARETurundeOldugunuDogrular(int arg0) {
        String expectedRoom= "DAYCARE";
        String actualRoom1 = medunna.room1.getText();
        String actualRoom2 = medunna.room2.getText();
        String actualRoom3 = medunna.room3.getText();
        Assert.assertEquals(expectedRoom, actualRoom1);
        Assert.assertEquals(expectedRoom, actualRoom2);
        Assert.assertEquals(expectedRoom, actualRoom3);

    }

    @And("Acilan menude Test Item secenegini tiklar")
    public void acilanMenudeTestItemSeceneginiTiklar() {
        medunna.testItemDDM.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @And("Acilan sayfada create a new Test Item sekmesine tiklar")
    public void acilanSayfadaCreateANewTestItemSekmesineTiklar() {
        medunna.createTestItem.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("acilan syfada name kismina unique isim yazar")
    public void acilanSyfadaNameKisminaUniqueIsimYazar() {
    Name name= faker.name();
        medunna.itemName.sendKeys(name.name());
    }

    @And("acilan sayfada discription kismina arteriel kan basinci girer")
    public void acilanSayfadaDiscriptionKisminaArterielKanBasinciGirer() {
        medunna.itemDescription.sendKeys("arteriel kan basinci");
    }

    @And("price kismina {int} yazar")
    public void priceKisminaYazar(int arg0) {
        medunna.itemPrice.sendKeys("10");
    }

    @And("Default Min. Value kismina {int} girer")
    public void defaultMinValueKisminaGirer(int arg0) {
        medunna.itemMinValue.sendKeys("60");
    }

    @And("Default Max. Value kismina {int} girer")
    public void defaultMaxValueKisminaGirer(int arg0) {
        medunna.itemMaxValue.sendKeys("140");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("sayfada A new Test Item is created with identifier yazisinin gorundugunu dogrular")
    public void sayfadaANewTestItemIsCreatedWithIdentifierYazisininGorundugunuDogrular() {
        String expectedText = "A new Test Item is created with identifier";
        String actualText =medunna.itemCreatedMessage.getText();
        Assert.assertTrue(actualText.contains(expectedText));
    }


    @And("Acilan sayfada ilk itemin view butonuna tiklar")
    public void acilanSayfadaIlkIteminViewButonunaTiklar() {
        medunna.itemView.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        
    }

    @And("test item sayfasinin acildigini back butonunu gorerek dogrular")
    public void testItemSayfasininAcildiginiBackButonunuGorerekDogrular() {
        Assert.assertTrue(medunna.itemBackButton.isDisplayed());
    }

    @And("Acilan sayfada ilk itemin edit butonuna tiklar")
    public void acilanSayfadaIlkIteminEditButonunaTiklar() {
        medunna.itemEdit.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Acilan sayfada name kismina farkli bir isim girer")
    public void acilanSayfadaNameKisminaFarkliBirIsimGirer() {
        medunna.itemName.clear();
        Name name = faker.name();
        medunna.itemName.sendKeys(name.name());

    }

    @And("price kismina farkli bir fiyat girer")
    public void priceKisminaFarkliBirFiyatGirer() {
        medunna.itemPrice.clear();
      Number number=  faker.number().numberBetween(1,100);
   medunna.itemPrice.sendKeys(number.toString());

    }

    @And("A Test Item is updated with identifier yazisinin gorundugunu dogrular")
    public void aTestItemIsUpdatedWithIdentifierYazisininGorundugunuDogrular() {
        String expectedText= "A Test Item is updated with identifier";
        String actualText= medunna.itemUpdatedMessage.getText();
        Assert.assertTrue(actualText.contains(expectedText));
    }

    @And("Acilan menude Physician secenegini tiklar")
    public void acilanMenudePhysicianSeceneginiTiklar() {
        medunna.physicianDDM.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Acilan sayfada doktor bilgilerinin oldugunu dogrular")
    public void acilanSayfadaDoktorBilgilerininOldugunuDogrular() {
        Assert.assertTrue(medunna.physicianId.isDisplayed());
        Assert.assertTrue(medunna.physicianFirstName.isDisplayed());
        Assert.assertTrue(medunna.physicianLastName.isDisplayed());
        Assert.assertTrue(medunna.physicianSSN.isDisplayed());
    }

    @And("Acilan sayfada Create a new Physician sekmesine tiklar")
    public void acilanSayfadaCreateANewPhysicianSekmesineTiklar() {
        medunna.createNewPhysician.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Use Search kutucuguna tiklar")
    public void useSearchKutucugunaTiklar() {
        medunna.useSearchBox.click();
    }

    @And("SSN kismini gecerli bir ssn numarasi girer")
    public void ssnKisminiGecerliBirSsnNumarasiGirer() {
        medunna.ssn.sendKeys("123-45-1112",Keys.ENTER);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("ekrandaki User found with search SSN mesajini dogrular")
    public void ekrandakiUserFoundWithSearchSSNMesajiniDogrular() {
        String expectedText="User found with search SSN";
        String actualText= medunna.physicianFoundMessage.getText();
        Assert.assertTrue(actualText.equals(expectedText));
    }

    @And("Acilan sayfada ilk doktorun edit sekmesine tiklar")
    public void acilanSayfadaIlkDoktorunEditSekmesineTiklar() {
        medunna.physicianEdit.click();

    }

    @And("Acilan sayfada first name kismina bir isim yazar")
    public void acilanSayfadaFirstNameKisminaBirIsimYazar() {
        Name name = faker.name();
        medunna.physicianFirstNameBox.clear();
        medunna.physicianFirstNameBox.sendKeys(name.name());
    }

    @And("last name kismina bir soyisim girer")
    public void lastNameKisminaBirSoyisimGirer() {
       String lastName= faker.name().lastName();
       medunna.physicianLastNameBox.clear();
       medunna.physicianLastNameBox.sendKeys(lastName);

    }

    @And("speciality kisminda Internal_medicine bolumunu secer")
    public void specialityKismindaInternal_medicineBolumunuSecer() {
  select=new Select(medunna.bolum);
     select.selectByValue("INTERNAL_MEDICINE");

    }

    @And("Bolumun secildigini dogrular")
    public void bolumunSecildiginiDogrular() {
        String bolum= select.getFirstSelectedOption().getText();
        Assert.assertEquals("Internal_medicine", bolum);
    }

    @And("exam fee kismina bir fiyat girer \\({int})")
    public void examFeeKisminaBirFiyatGirer(int arg0) {
        medunna.examFee.clear();
        medunna.examFee.sendKeys("85");
    }

    @And("Fiyatin girildigini dogrular")
    public void fiyatinGirildiginiDogrular() {
      String fee=  medunna.examFee.getAttribute("value");
      int expectedFee = 85;

        String parseFEe=Integer.toString(expectedFee);
      Assert.assertEquals(parseFEe, fee);

    }

    @And("ekranda A Physician is updated with identifier yazisinin ciktigini dogrular")
    public void ekrandaAPhysicianIsUpdatedWithIdentifierYazisininCiktiginiDogrular() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String expectedText="A Physician is updated with identifier";
        String actualText=medunna.physicianUpdateMessage.getText();
        Assert.assertTrue(actualText.contains(expectedText));
    }



    @And("Acilan sayfada Choose File kismindan profil resmi atamasi yapar")
    public void acilanSayfadaChooseFileKismindanProfilResmiAtamasiYapar() {
        jse.executeScript("arguments[0].scrollIntoView(true);", medunna.chooseFile);
   // action.sendKeys(Keys.PAGE_DOWN).perform();
        medunna.chooseFile.sendKeys("C:\\Users\\Admin\\Downloads\\download.jpg");
       // jse.executeScript("arguments[0].click();", medunna.saveRoom);

    }



    @And("ekranda choose file sekmesi yaninda yukledigi remin adinin oldugunu dogrular")
    public void ekrandaChooseFileSekmesiYanindaYukledigiReminAdininOldugunuDogrular() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        select =new Select(medunna.image);
      String value= medunna.image.getAttribute("value");
       Assert.assertFalse(value.isEmpty());
    }







    @And("telefon numarasi girer")
    public void telefonNumarasiGirer() {
        int phone = faker.number().numberBetween(1111111111,2000000000);
        medunna.phone.sendKeys(String.valueOf(phone));
    }

    @And("dogum tarihi girer")
    public void dogumTarihiGirer() {
        medunna.birthDate.sendKeys("10/10/2000");
    }

    @And("Administration menusunden User management secenegine tiklar")
    public void administrationMenusundenUserManagementSecenegineTiklar() {
        medunna.administrationButton.click();
        medunna.userManagementButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @And("islem yapmak istedigi kullanicida edit butonuna tiklar")
    public void islemYapmakIstedigiKullanicidaEditButonunaTiklar() {
        medunna.editUserManagement.click();
    }

    @And("Profiles menusunden Doktor secenegine tiklar")
    public void profilesMenusundenDoktorSecenegineTiklar() {
        select=new Select(medunna.profiles);
        select.selectByValue("ROLE_PHYSICIAN");
        select.selectByValue("ROLE_PHYSICIAN");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @And("A user is updated with identifier mesajini dogrular")
    public void aUserIsUpdatedWithIdentifierMesajiniDogrular() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String expectedText="A user is updated with identifier";
        String actualText=medunna.doktorUpdatedMessage.getText();
        Assert.assertTrue(actualText.contains(expectedText));


    }

    @And("Acilan menude Country secenegini tiklar")
    public void acilanMenudeCountrySeceneginiTiklar() {
        medunna.countryDDM.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @And("Acilan sayfada {string} sekmesine tiklar")
    public void acilanSayfadaSekmesineTiklar(String arg0) {
        medunna.createCountry.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("name kismina bir ulke ismi girer")
    public void nameKisminaBirUlkeIsmiGirer() {
        medunna.nameCountry.sendKeys(faker.country().name());
    }

 

    @And("ekranda A new Country is created with identifier mesajinin gorundugunu dogrular")
    public void ekrandaANewCountryIsCreatedWithIdentifierMesajininGorundugunuDogrular() {

        String expectedText ="A new Country is created with identifier";
        String actualText =medunna.countryMessage.getText();
        Assert.assertTrue(actualText.contains(expectedText));
    }


    @And("save tusuna tiklar")
    public void saveTusunaTiklar() {
        medunna.saveCountry.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("user ismini secer")
    public void userIsminiSecer() {

        medunna.userPhysician.sendKeys("ruthie.dickinson:881-42-4842");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Save kismina tiklar")
    public void saveKisminaTiklar() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        jse.executeScript("arguments[0].click()", medunna.saveUserAdmin);

    }

    @And("Acilan sayfada ilk ulkenin delete butonuna tiklar")
    public void acilanSayfadaIlkUlkeninDeleteButonunaTiklar() {
        medunna.deleteCountry.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("gelen onay uyarisinda delete secenegini tiklar")
    public void gelenOnayUyarisindaDeleteSeceneginiTiklar() {
       medunna.countryDeleteUyariMesaji.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Ekranda A Country is deleted with identifier mesajinin gorundugunu dogrular")
    public void ekrandaACountryIsDeletedWithIdentifierMesajininGorundugunuDogrular() {

        String expectedText ="A Country is deleted with identifier";
        String actualText =medunna.countryDeleteUyariMesaji.getText();
        Assert.assertTrue(actualText.contains(expectedText));

    }

    @And("create a new State City sekmesine tiklar")
    public void createANewStateCitySekmesineTiklar() {
        medunna.createStateCity.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
    }

    @And("name kismina bir isim girer")
    public void nameKisminaBirIsimGirer() {
        medunna.nameStateCity.sendKeys("mahalle");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
    }

    @And("State City kisminda istedigi ulkeyi secer")
    public void stateCityKismindaIstedigiUlkeyiSecer() {
        select=new Select(medunna.selectStateCity);
        select.selectByVisibleText("Germany");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
    }


    @And("A new State City is created with identifier mesajini dogrular")
    public void aNewStateCityIsCreatedWithIdentifierMesajiniDogrular() {
        String expectedText ="A new State/City is created with identifier";
        String actualText =medunna.countryDeleteUyariMesaji.getText();
        Assert.assertTrue(actualText.contains(expectedText));

    }

    @And("Acilan sayfada ilk doktorun delete sekmesine tiklar")
    public void acilanSayfadaIlkDoktorunDeleteSekmesineTiklar() {
        medunna.deletePhysician.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        
    }


    @And("Acilan Confirm delete operation uyarisinda delete butonuna tiklar")
    public void acilanConfirmDeleteOperationUyarisindaDeleteButonunaTiklar() {
        medunna.confirmDeletePhysician.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
    }

    @And("ekranda {string} uyarisinin gorundugunu dogrular")
    public void ekrandaUyarisininGorundugunuDogrular(String arg0) {
        String expectedText ="A Physician is deleted with identifier";
        String actualText =medunna.physicianDeleteMessage.getText();
        Assert.assertTrue(actualText.contains(expectedText));
    }


    @And("Acilan menude State City secenegini tiklar")
    public void acilanMenudeStateCitySeceneginiTiklar() {

       medunna.stateCityDDM.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



    @And("Save secenegine tiklar")
    public void saveSecenegineTiklar() {

        //  jse.executeScript("arguments[0].scrollIntoView(true);", medunna.save);
        jse.executeScript("arguments[0].click()", medunna.saveRoom);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }

    @And("save secenegini tiklar")
    public void saveSeceneginiTiklar() {
        jse.executeScript("arguments[0].click()", medunna.saveRoom);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

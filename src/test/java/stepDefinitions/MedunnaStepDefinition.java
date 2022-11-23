package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US_16_17_18_28;
import utilities.ConfigReader;
import utilities.Driver;

public class MedunnaStepDefinition {
    US_16_17_18_28 medunna = new US_16_17_18_28();
    Faker faker = new Faker();
    Actions action = new Actions(Driver.getDriver());
    @Given("admin {string} sayfasina gider")
    public void admin_sayfasina_gider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }


    @And("ana sayfadaki giris ikonuna tiklar")
    public void anaSayfadakiGirisIkonunaTiklar() {
     medunna.girisIkonu.click();
    }

    @And("sign in sekmesine tiklar")
    public void signInSekmesineTiklar() {
        medunna.login.click();
    }
    @When("gecerli bir admin_user_name ve sifre girer")
    public void gecerliBirAdmin_user_nameVeSifreGirer() {
        medunna.username.sendKeys("Team02");
        medunna.sifre.sendKeys("team02@12345");
        medunna.signInButonu.click();
    }

    @And("Acilan sayfada ust menudeki Items&titles sekmesine tiklar")
    public void acilanSayfadaUstMenudekiItemsTitlesSekmesineTiklar() {
        medunna.itemsTitles.click();
    }

    @And("Acilan menude room secenegini tiklar")
    public void acilanMenudeRoomSeceneginiTiklar() {
        medunna.room.click();
    }

    @And("Acilan sayfada create a new room sekmesine tiklar")
    public void acilanSayfadaCreateANewRoomSekmesineTiklar() {
        medunna.createANewRoom.click();
    }

    @And("Save secenegine tiklar")
    public void saveSecenegineTiklar() {
    //   action.sendKeys(Keys.PAGE_DOWN).perform();
    medunna.save.click();
    }


    @Then("Room Number kisminda This field is required yazisinin gorunur oldugunu dogrular")
    public void roomNumberKismindaThisFieldIsRequiredYazisininGorunurOldugunuDogrular() {

    }



    @When("admin {int} saniye bekler")
    public void adminSaniyeBekler(int istenenSure) {

        try {
            Thread.sleep(istenenSure*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}

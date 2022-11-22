package stepDefinitionsUI;

import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import pages.US01_02_03_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class US01_02_03_SD {

      US01_02_03_Page object =new US01_02_03_Page();

    @Given("User goes to Medunna url")
    public void user_goes_to_medunna_url() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));

    }
    @When("user navigates the register in page")
    public void user_navigates_the_register_in_page() {
        object.UIkon.click();


    }
    @When("user sees the register button and clicks  on the register button")
    public void user_sees_the_register_button_and_clicks_on_the_register_button()
    {

        object.Register.click();



      //  JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
      //  jse.executeScript("arguments[0].scrollIntoView(true);", object.Register);
      //  jse.executeScript("arguments[0].click()", object.Register);
    }

    @Then("User enters a {int} digit number in the SSN box on the page")
    public void user_enters_a_digit_number_in_the_ssn_box_on_the_page(Integer int1) {
        object.SSN.sendKeys("102-34-5641"+ Keys.ENTER);

    }
    @Then("After the 3rd and 5th digits, there must be a {string}")
    public void after_the_3rd_and_5th_digits_there_must_be_a(String string) {


    }


    @And("user waits {int} seconds")
    public void userWaitsSeconds(int saniye) throws InterruptedException {

        Thread.sleep(saniye*1000);
    }
}

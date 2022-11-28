package stepDefinitionsUI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.US_19_20_21_Page;
import utilities.Driver;

public class US_19_SD {
    US_19_20_21_Page page = new US_19_20_21_Page();

    @Given("Navigate to medunna")
    public void navigateToMedunna()  {
        Driver.getDriver().get("https://www.medunna.com/");

    }

    @When("username and password and click login button")
    public void usernameAndPasswordAndClickLoginButton() {

        page.icon.click();
        page.signIn.click();
        page.username.sendKeys("Team02");
        page.password.sendKeys("team02@12345");
        page.sigINBtn.click();

    }

    @And("Admin, clicks Item and Titles and clicks staff button")
    public void adminClicksItemAndTitlesAndClicksStaffButton() {
        page.itemTitle.click();
        page.staffBtn.click();
    }

    @When("Admin, clicks add new staff.")
    public void adminClicksAddNewStaff() {
        page.createStaff.click();
    }

    @And("click the use search button.")
    public void clickTheUseSearchButton() {
        page.useSearch.click();
    }

    @Then("Enter the SSN information and click the search user button.")
    public void enterTheSSNInformationAndClickTheSearchUserButton() {
        page.searchSsn.sendKeys("161-22-0190");
        page.searchUserBtn.click();
    }

    @And("Verify    message")
    public void verifyMessage() {
    }


    @And("All personnel information is filled in.")
    public void allPersonnelInformationIsFilledIn() {
        page.staffTelefon.sendKeys("1223344556");
        page.staffAdress.sendKeys("Berliner strasse");
        page.staffDescription.sendKeys("very good");
        page.staffCountry.sendKeys("Germany");
        page.staffState.sendKeys("Berlin");
    }

    @And("Click the save button")
    public void clickTheSaveButton() throws InterruptedException {
//        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
//        jse.executeScript("arguments[0].scrollIntoView(true);", US_19_Page.save);
//        jse.executeScript("arguments[0].click()", US_19_Page.save);
        Thread.sleep(2000);
        page.saveBtn.click();
        Thread.sleep(2000);
    }

    @And("Admin clicks the id of a user from among the existing users")
    public void adminClicksTheIdOfAUserFromAmongTheExistingUsers() {
        page.view.click();
    }

    @Then("Admin edits Personnel information")
    public void adminEditsPersonnelInformation() {
        page.edit.click();
        page.staffDescription.sendKeys("yeni kayit");
    }

    @Then("Admin deleted Personnel information")
    public void adminDeletedPersonnelInformation() throws InterruptedException {
        Thread.sleep(2000);
        page.deleteIcon.click();
        Thread.sleep(2000);
        page.deleteBtn.click();
    }
}

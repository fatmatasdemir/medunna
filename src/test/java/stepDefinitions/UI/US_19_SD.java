package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.US_19_20_21_Page;
import utilities.Driver;

import java.util.List;

public class US_19_SD {
    US_19_20_21_Page page = new US_19_20_21_Page();

    @Given("Navigate to medunna")
    public void navigateToMedunna() {
        Driver.getDriver().get("https://www.medunna.com/");

    }

    @Then("Enter the SSN information {string}and click the search user button.")
    public void enterTheSSNInformationAndClickTheSearchUserButton(String ssn) {
        page.searchSsn.sendKeys(ssn);
        page.searchUserBtn.click();


//
//                page.searchSsn.sendKeys("161-22-0190");
//        page.searchUserBtn.click();
    }

    @When("username {string} and password {string} and click login button")
    public void usernameAndPasswordAndClickLoginButton(String user, String pass) {
        page.icon.click();
        page.signIn.click();
        page.username.sendKeys(user);
        page.password.sendKeys(pass);
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


    @And("Verify    message")
    public void verifyMessage() {
        Assert.assertEquals("User found with search SSN", "User found with search SSN");
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
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", US_19_20_21_Page.save);
        jse.executeScript("arguments[0].click()", US_19_20_21_Page.save);
//        Thread.sleep(2000);
//        page.saveBtn.click();
//        Thread.sleep(2000);
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

    @When("Admin, clicks Administirstor and clicks user management button")
    public void admin_clicks_administirstor_and_clicks_user_management_button() {
        page.administration.click();
        page.management.click();
    }

    @When("Admin, clicks view.")
    public void admin_clicks_view() {
        page.view.click();
    }


    @When("Admin clicks edit and changes roles from profile.")
    public void adminClicksEditAndChangesRolesFromProfile() throws InterruptedException {
        Thread.sleep(2000);
        page.edit.click();
        Thread.sleep(2000);
        page.profil.click();
        Thread.sleep(2000);
        page.role.click();
        Thread.sleep(2000);
        page.saveBtn.click();


    }


    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        page.icon.click();
        page.signIn.click();
        page.username.sendKeys("StaffSteffan");
        page.password.sendKeys("Steffan.123");
        page.sigINBtn.click();

    }

    @And("Staff clicks on My Pages and Search Patient")
    public void staffClicksOnMyPagesAndSearchPatient() {
        page.myPages.click();
        page.searchPatientIcon.click();

    }

    @Then("Staff clicks Show Appointments")
    public void staffClicksShowAppointments() {
        page.showAppoin.click();
    }

    @And("Staff click on edit")
    public void staffClickOnEdit() {
        page.edit.click();
    }

    @Then("Staff clicks on the status and on appointments pending")
    public void staffClicksOnTheStatusAndOnAppointmentsPending() {
        page.status.click();
        page.pending.click();

    }

    @And("Staff Clicks on Physician and doctor chooses")
    public void staffClicksOnPhysicianAndDoctorChooses() throws InterruptedException {

        Thread.sleep(2000);
        page.physician.sendKeys("303221");
    }

    @Then("Staff clicks on the status")
    public void staffClicksOnTheStatus() {
    }

    @And("Staff clicks on appointments pending or cancelled")
    public void staffClicksOnAppointmentsPendingOrCancelled() {
        page.cancelled.click();
    }

    @Then("Staff can't click Complete")
    public void staffCanTClickComplete() {
        Assert.assertFalse(page.completed.isSelected());
    }

    @Then("staff should not be able to enter data about Anamnesis")
    public void staffShouldNotBeAbleToEnterDataAboutAnamnesis() {


        page.anamnesis.sendKeys("data girememeli");

    }

    @And("staff should not be able to enter data about Treatment")
    public void staffShouldNotBeAbleToEnterDataAboutTreatment() {

        page.treatment.sendKeys("data girememeli ");

    }

    @Then("staff should not be able to enter data about Diagnosis")
    public void staffShouldNotBeAbleToEnterDataAboutDiagnosis() throws InterruptedException {
        Thread.sleep(2000);
        page.diagnose.sendKeys("data girememeli");

    }

    @When("Staff clickd on Show Tests")
    public void staffClickdOnShowTests() {


        page.test.click();
    }


    @When("Then Admin can deleted users")
    public void thenAdminCanDeletedUsers() throws InterruptedException {

        page.doktor.click();
        Thread.sleep(2000);
        page.deleteIcon.click();
        Thread.sleep(2000);
        page.delete.click();


    }
}

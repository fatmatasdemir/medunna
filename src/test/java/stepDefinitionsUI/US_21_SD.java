package stepDefinitionsUI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.US_19_20_21_Page;

public class US_21_SD {
    US_19_20_21_Page page=new US_19_20_21_Page();

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
      //  page.status.click();
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
        page.completed.click();
    }

    @Then("staff should not be able to enter data about Anamnesis")
    public void staffShouldNotBeAbleToEnterDataAboutAnamnesis() throws InterruptedException {
        Thread.sleep(2000);
        page.anamnesis.sendKeys("hasta");
    }

    @And("staff should not be able to enter data about Treatment")
    public void staffShouldNotBeAbleToEnterDataAboutTreatment() throws InterruptedException {
        Thread.sleep(2000);
        page.treatment.sendKeys("tani");
    }

    @Then("staff should not be able to enter data about Diagnosis")
    public void staffShouldNotBeAbleToEnterDataAboutDiagnosis() throws InterruptedException {
        Thread.sleep(2000);
        page.diagnose.sendKeys("diagnose");

    }

    @When("Staff clickd on Show Tests")
    public void staffClickdOnShowTests() {
        page.test.click();
    }
}

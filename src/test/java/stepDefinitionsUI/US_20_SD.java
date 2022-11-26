package stepDefinitionsUI;

import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.US_20_Page;

public class US_20_SD {

    US_20_Page page = new US_20_Page();


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
}

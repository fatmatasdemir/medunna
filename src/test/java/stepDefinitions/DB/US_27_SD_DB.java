package stepDefinitions.DB;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.DatabaseUtility;
import java.util.List;
import static org.junit.Assert.assertTrue;
import static utilities.DatabaseUtility.*;

public class US_27_SD_DB {

     String query;


    @Given("Admin database e baglanir")
    public void admin_database_e_baglanir() {
        DatabaseUtility.createConnection();

    }

    @When("Admin id nosu {int} olan query olusturur")
    public void adminIdNosuOlanQueryOlusturur(Integer idNo) {

     query = "select * from cmessage where" + idNo;

     List<String> messages = getColumnNames(query);
     System.out.println(messages);

    }



    @And("Gelen mesaji assert eder")
    public void gelenMesajiAssertEder() {
        List<Object> messagesADI = getColumnData(query, "message");
        System.out.println("kursun sonuna geldik: "+messagesADI.contains("kursun sonuna geldik"));
        assertTrue(messagesADI.contains("kursun sonuna geldik"));


    }
}






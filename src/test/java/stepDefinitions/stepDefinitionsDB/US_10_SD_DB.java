package stepDefinitions.stepDefinitionsDB;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.DBUtils;
import java.sql.*;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.DBUtils.*;

public class US_10_SD_DB {

    Connection connection;
    Statement statement;
    ResultSet resultSet;
    String username = ConfigReader.getProperty("db_username");
    String password = ConfigReader.getProperty("db_password");
    String url = ConfigReader.getProperty("database_medunna_url");
    String query;
    List<Integer> actualIDlist = new ArrayList<>();
    List<Object> actualDButilsList;
    String  MyApointmens;

    @Given("Doktor db ile medunnaya baglanti kurar")
    public void kullanici_db_ile_medunnaya_baglanti_kurar() throws SQLException {

        connection = DriverManager.getConnection(url,username,password);

        }

    @And("Doktor sorgu yapar doktor id  {int} baslik {string}")
    public void doktorSorguYaparDoktorIdBaslik(int doktorID, String baslik) throws SQLException {

        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        query = "select appointment.patient_id from "+baslik+" where physician_id="+doktorID;


        resultSet=statement.executeQuery(query);
    }
    @Then("Doktor randevu listesini basliktan {string} gorur")
    public void doktorRandevuListesiniBasliktanGorur(String baslik) throws SQLException {

        while (resultSet.next()) {
            resultSet.getInt(baslik);
            actualIDlist.add((resultSet.getInt(baslik)));
        }
        System.out.println(actualIDlist);
    }

    @And("DB sorgu Assert edilir")
    public void dbSorguAssertEdilir() {

        List<Integer> expectedIDList = new ArrayList<>();
        expectedIDList.add(10353);
        expectedIDList.add(10372);
        expectedIDList.add(12153);
        expectedIDList.add(16576);
        expectedIDList.add(302420);
        expectedIDList.add(304196);
        expectedIDList.add(303585);
        expectedIDList.add(9099);
        expectedIDList.add(9088);

        System.out.println(expectedIDList);
        assertTrue(actualIDlist.contains(10353));
        assertEquals(expectedIDList, actualIDlist);
    }
    @And("DB sorgu hastaID {int} ile assert edilir")
    public void dbSorguHastaIDIleAssertEdilir(int hastaID) {

      assertTrue(actualIDlist.contains(hastaID));
    }


    @Given("Doktor DBUtils ile medunnaya baglanti kurar")
    public void doktor_db_utils_ile_medunnaya_baglanti_kurar() {

        DBUtils.createConnection();
    }

    @Given("Doktor DBUtils ile sorgu yapar doktor id  {int} baslik {string}")
    public void doktor_db_utils_ile_sorgu_yapar_doktor_id_baslik(Integer doktorID, String baslik) {
       query = "select appointment.patient_id from "+baslik+" where physician_id="+doktorID;
        DBUtils.executeQuery(query);

    }

    @Then("Doktor DBUtils ile hasta randevu basliktan {string}  patientID si {string} olan hastanin kaydini gorur")
    public void doktorDBUtilsiktanPatientIDSiOlanHastaninKaydiniGorur(String baslik, String patientIDNo) {
       query = "select appointment.patient_id from appointment where physician_id=301030";

        List<Map<String,Object>> doktormap =getQueryResultMap(query);
        System.out.println(doktormap);

        actualDButilsList = DBUtils.getColumnData(query,baslik);
        System.out.println(actualDButilsList);

       List<String> expectedIDList=new ArrayList<>();
       expectedIDList.add(patientIDNo);

       assertTrue(actualDButilsList.contains(expectedIDList));


    }


}




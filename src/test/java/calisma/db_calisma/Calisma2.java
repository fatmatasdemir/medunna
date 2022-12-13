package calisma.db_calisma;

import org.junit.Test;
import utilities.ConfigReader;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static utilities.DBUtils.*;

public class Calisma2  {

    Connection connection;
    Statement statement;
    ResultSet resultSet;
    String username = ConfigReader.getProperty("db_username");
    String password = ConfigReader.getProperty("db_password");
    String url = ConfigReader.getProperty("database_medunna_url");

    String doktorrandevu = "select appointment.patient_id from appointment where physician_id=301030";

    @Test
    public void dbTest() {
        createConnection();
        getQueryResultMap(doktorrandevu); // id si 301030 olan doktorun randevularini gosterir
        System.out.println(getQueryResultMap(doktorrandevu));
        getColumnData(doktorrandevu, "patient_id");// bu bize basliga gore id listesini verir
        System.out.println(getColumnData(doktorrandevu, "patient_id"));

        getCellValue(doktorrandevu);
        System.out.println(getCellValue(doktorrandevu));

    }

    @Test
    public void dbTest2() throws SQLException, ClassNotFoundException {

        connection = DriverManager.getConnection(url, username, password);

        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        resultSet = statement.executeQuery(doktorrandevu);

        List<Integer> actualIDlist = new ArrayList<>();

        while (resultSet.next()) {

            resultSet.getInt("patient_id");
            actualIDlist.add((resultSet.getInt("patient_id")));

        }
        System.out.println(actualIDlist);

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

        // src/test/resources/TestData/mesajlistesi.txt


    }


}

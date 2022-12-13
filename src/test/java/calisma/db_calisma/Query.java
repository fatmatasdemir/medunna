package calisma.db_calisma;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.*;

public class Query {

           Connection connection;
           Statement statement;
           ResultSet resultSet;

           @Before
           public void setup() throws ClassNotFoundException, SQLException {
       Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection("jdbc:postgresql://medunna.com:5432/medunna_db", "medunna_user", "medunna_pass_987");

               // SQL kodlarimizin yazildigi bir nesne olusturacagiz

        statement = connection.createStatement();
           }

                  @Test
             public void  query01() throws ClassNotFoundException, SQLException {

         // Driver yukle

         String physician = "select * from physician";

         // baglanti olustur

         resultSet = statement.executeQuery("select * from physician where ID=301030");

         // sonuclari al  java kullanacagiz
         while (resultSet.next()) {

             System.out.printf("%-10s %-10s %6d\n",resultSet.getInt(1) + resultSet.getString(2));
         }   // veri kapama



     }
                 @Test
           public  void query02() throws SQLException {
           resultSet = statement.executeQuery("select * from appointment");

           while (resultSet.next()){

               System.out.println(resultSet.getInt(1) + resultSet.getString(2));
           }

                  }


                  @After


                public void tearDown() throws SQLException {
                 connection.close();
                 statement.close();
                 resultSet.close();
             }

}
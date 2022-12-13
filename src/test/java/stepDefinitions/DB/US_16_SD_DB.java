package stepDefinitions.DB;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.DatabaseUtility;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_16_SD_DB {

       String query;
    @Given("Admin db ile medunnaya baglanti kurar Room olusturma")
    public void doktorDbIleMedunnayaBaglantiKurarRoomOlusturma() {
        DatabaseUtility.createConnection();
    }
    @When("Admin id nosu {int} olan roomun query kismini olusturur")
    public void admin_id_nosu_olan_roomun_query_kismini_olusturur(Integer odaIdNumarasi) {
        query = "select * from room where id=" + odaIdNumarasi;
    }
    @And("Oda numarasini {int} assert eder")
    public void odaNumarasiniAssertEder(int odaNumarasi) {
        // 1. yol
         List<Object> roomIDinfo=DatabaseUtility.getRowList(query);
         System.out.println(roomIDinfo);
         List<Object> roombilgileri=DatabaseUtility.getColumnData(query,"room_number");
         System.out.println("Room bilgileri: "+roombilgileri);
         assertTrue(roombilgileri.contains(odaNumarasi));
        //2.yol
         Map<String, Object>  randevuBilgileriMAP = DatabaseUtility.getRowMap(query);
         System.out.println(randevuBilgileriMAP);
         String roomnoSTR=randevuBilgileriMAP.get("room_number").toString();
         System.out.println(roomnoSTR);
          Integer roomnoINT= Integer.parseInt(roomnoSTR);
          assertEquals(odaNumarasi,roomnoINT.intValue());


    }
}





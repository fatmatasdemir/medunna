package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.cucumber.java.sl.In;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TestItem {
    /*
    {

  "defaultValMax": "string",
  "defaultValMin": "string",
  "description": "string",

  "name": "string",
  "price": 0
}
     */

    private String defaultValMax;
    private String defaultValMin;
    private String description;
    private String name;
    private Integer price;

    public TestItem() {
    }

    public TestItem(String defaultValMax, String defaultValMin, String description, String name, Integer price) {
        this.defaultValMax = defaultValMax;
        this.defaultValMin = defaultValMin;
        this.description = description;
        this.name = name;
        this.price = price;
    }

    public String getDefaultValMax() {
        return defaultValMax;
    }

    public void setDefaultValMax(String defaultValMax) {
        this.defaultValMax = defaultValMax;
    }

    public String getDefaultValMin() {
        return defaultValMin;
    }

    public void setDefaultValMin(String defaultValMin) {
        this.defaultValMin = defaultValMin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    private String title;
    private Integer status;
    private String detail;
    private String message;

    public TestItem(String title, Integer status, String detail, String message) {
        this.title = title;
        this.status = status;
        this.detail = detail;
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private Integer id;

    public TestItem(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TestItem{" +
                "id=" + id +
                '}';
    }
}

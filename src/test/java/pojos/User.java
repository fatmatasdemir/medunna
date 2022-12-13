package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {



    private int id;
    private String login;
    private String firstName;
    private String lastName;
    private String ssn;
    private String email;
    private String imageUrl;
    private boolean activated;
    private String langKey;
    private String createdBy;
    private String createdDate;
    private String lastModifiedBy;
    private String lastModifiedDate;
    private String authorities;





}

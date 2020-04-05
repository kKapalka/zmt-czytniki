package pl.zmt.reader.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String login;

    private String password;

    private String firstName;

    private String lastName;

    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<UserRole> roles;

}

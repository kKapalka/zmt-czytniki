package pl.zmt.reader.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.zmt.reader.entities.enums.UserRole;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity(name = "user")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    private String login;

    private String password;

    private String firstName;

    private String lastName;

    public User(String login, String password, String firstName, String lastName, UserRole roles) {
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.roles = roles;
    }

    @Enumerated(EnumType.STRING)
    private UserRole roles;

}

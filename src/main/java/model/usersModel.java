package model;
import jakarta.persistence.*;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
//public class usersModel {
//
//    private int id;
//    private String name;
//    private String email;
//    private String password;
//    private int role_id;
//    private String created_at;
//}
@Entity
@Table(name = "users")
public class usersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private String email;
    private String password;
    private int role_id;
    private String created_at;
}
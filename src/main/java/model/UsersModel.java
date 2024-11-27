package model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users") // Ensure this matches your actual database table name
public class UsersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email; // Maps to "email" column
    private String password; // Maps to "password" column

    @Column(name = "role_id") // Explicit mapping if column names differ
    private int roleId;

    @Column(name = "created_at") // Explicit mapping for "created_at"
    private String createdAt;
}

package dao;
import org.springframework.data.jpa.repository.JpaRepository;
import model.usersModel;

import java.util.ArrayList;


public interface UsersDao extends JpaRepository<usersModel, Long> {
    ArrayList<usersModel> findByNombre(String nombre);
    usersModel save(usersModel usuario);
}
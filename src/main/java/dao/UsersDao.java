package dao;
import org.springframework.data.jpa.repository.JpaRepository;
import model.UsersModel;

import java.util.ArrayList;


public interface UsersDao extends JpaRepository<UsersModel, Long> {
    ArrayList<UsersModel> findByNombre(String nombre);
    UsersModel save(UsersModel usuario);
}
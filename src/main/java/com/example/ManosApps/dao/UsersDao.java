package com.example.ManosApps.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ManosApps.model.UsersModel;

import java.util.List;

public interface UsersDao extends JpaRepository<UsersModel, Long> {
    List<UsersModel> findByName(String name);
    UsersModel save(UsersModel usuario);
    void deleteById(int id);
    UsersModel findByid(int id);
    UsersModel update(UsersModel usuario);
}

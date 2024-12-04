package com.example.ManosApps.dao;


import com.example.ManosApps.model.picsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PicsReprository extends JpaRepository<picsModel, Long> {

    ArrayList<picsModel> findAll();

    picsModel save(picsModel pic);

    void deleteById(int id);

    picsModel findByid(int id);

    //ArrayList<picsModel> saveall(ArrayList<picsModel> pics);
    // JpaRepository provides the saveAll method, so no additional code is needed here.

}

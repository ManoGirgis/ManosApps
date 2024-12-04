package com.example.ManosApps.service;


import com.example.ManosApps.dao.PicsReprository;
import com.example.ManosApps.model.picsModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PicsService {
    @Autowired
    private PicsReprository repo;

    public ArrayList<picsModel> getall() {
        return (ArrayList<picsModel>) repo.findAll();
    }

    public List<picsModel> saveall(ArrayList<picsModel> pics) {
        System.out.println(pics);
      return repo.saveAll(pics);
    }

    public picsModel savepic(picsModel pic) {
        return repo.save(pic);
    }

    public void deletepic(int id) {
        repo.deleteById(id);
    }

    public picsModel findbyid(int id) {
        return repo.findByid(id);
    }
}


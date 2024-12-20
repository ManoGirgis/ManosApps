package com.example.ManosApps.service;

import com.example.ManosApps.dao.UsersDao;
import com.example.ManosApps.model.UsersModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    private UsersDao usersDao;

    public ArrayList<UsersModel> getuserbyname(String nombre){
        return (ArrayList<UsersModel>) usersDao.findByName(nombre);
    }

    public UsersModel saveuser(UsersModel usuario) {
        return usersDao.save(usuario);
    }
}


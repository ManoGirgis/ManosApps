package service;

import model.UsersModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    private dao.UsersDao usersDao;

    public ArrayList<UsersModel> getuserbyname(String nombre){
        return (ArrayList<UsersModel>) usersDao.findByNombre(nombre);
    }

    public UsersModel saveuser(UsersModel usuario) {
        return usersDao.save(usuario);
    }
}


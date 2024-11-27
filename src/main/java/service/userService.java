package service;

import model.usersModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class userService {
    @Autowired
    private dao.UsersDao usersDao;

    public ArrayList<usersModel> getuserbyname(String nombre){
        return (ArrayList<usersModel>) usersDao.findByNombre(nombre);
    }

    public usersModel saveuser(usersModel usuario) {
        return usersDao.save(usuario);
    }
}

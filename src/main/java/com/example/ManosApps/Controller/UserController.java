package com.example.ManosApps.Controller;

import com.example.ManosApps.model.UsersModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.ManosApps.service.UserService;

import java.util.ArrayList;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public UsersModel createuser(@RequestBody UsersModel user) {
        return userService.saveuser(user);
    }

    @GetMapping("/{nombre}")
    public ArrayList<UsersModel> getuserbyname(@PathVariable String nombre) {
        return userService.getuserbyname(nombre);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteuser(@PathVariable int id) {
        userService.deleteuser(id);
    }
    @GetMapping("/id/{id}")
    public UsersModel getuserbyid(@PathVariable int id) {
        return userService.getuserbyid(id);
    }
    @PutMapping("/update/{id}")
    public UsersModel updateuser(@RequestBody UsersModel user) {
        return userService.updateuser(user);
    }
}


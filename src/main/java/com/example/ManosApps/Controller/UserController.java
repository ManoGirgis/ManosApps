package com.example.ManosApps.Controller;

import com.example.ManosApps.model.UsersModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.ManosApps.service.UserService;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/users")
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
}


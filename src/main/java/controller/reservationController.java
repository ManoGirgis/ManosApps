package controller;

import model.usersModel;
import org.springframework.web.bind.annotation.*;
import service.userService;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

@RestController
@RequestMapping("/users")

public class UserController {
    @Autowired
    private userService userService;

    @PostMapping("/create")
    public usersModel createuser(@RequestBody usersModel user) {
        return userService.saveuser(user);
    }

    @GetMapping("/{nombre}")
    public ArrayList<usersModel> getuserbyname(@PathVariable String nombre) {
        return userService.getuserbyname(nombre);
    }
}


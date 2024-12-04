package com.example.ManosApps.Controller;

import com.example.ManosApps.model.picsModel;
import com.example.ManosApps.service.PicsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping(value = "/pics")
public class PicsController {
    @Autowired
    private PicsService service;
    private ArrayList<picsModel> pics = new ArrayList<>();

    @PostMapping("/saveall")
    public void saveall() {
        pics.add(new picsModel(123456789L, "myphoto","./utils","10/04/2024",1,"jpg","20mb","picture","homepicture"));
        pics.add(new picsModel(12345678L, "myphoto", "./utils", "10/04/2024", 1, "jpg", "20mb", "picture", "homepicture"));
        service.saveall(pics);
    }

    @GetMapping
    public ArrayList<picsModel> getall() {

        return service.getall();
    }

    @PostMapping("/create")
    public picsModel addpic(@RequestBody picsModel pic) {
        return service.savepic(pic);
    }


    @GetMapping("/{id}")
    public picsModel getuserbyname(@PathVariable int id) {
        return service.findbyid(id);
    }

    @GetMapping("delete/{id}")
    public void delete(@PathVariable int id) {
        service.deletepic(id);
    }



}


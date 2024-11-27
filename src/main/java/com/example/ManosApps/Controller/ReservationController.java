package com.example.ManosApps.Controller;

import com.example.ManosApps.model.reservationModel;
import com.example.ManosApps.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
    @Autowired
    private ReservationService service;

    @PostMapping("/create")
    public reservationModel createreserva(@RequestBody reservationModel reserva) {
        return service.savereserva(reserva);
    }

    @GetMapping("/{id}")
    public reservationModel getuserbyname(@PathVariable int id) {
        return service.getreservabyid(id);
    }
}


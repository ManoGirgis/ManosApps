package com.example.ManosApps.service;

import com.example.ManosApps.dao.ReservationDao;
import com.example.ManosApps.model.reservationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ReservationService {
    @Autowired
    private ReservationDao Dao;

    public reservationModel getreservabyid(int id){
        return (reservationModel) Dao.findByid(id);
    }

    public reservationModel savereserva(reservationModel reserva) {
        return Dao.save(reserva);
    }
}


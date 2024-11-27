package com.example.ManosApps.dao;

import com.example.ManosApps.model.reservationModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationDao extends JpaRepository<reservationModel, Long> {
   reservationModel findByid(int id);
    reservationModel save(reservationModel reserva);
}

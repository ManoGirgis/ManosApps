package dao;

import model.reservationModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;


public interface ReservationDao extends JpaRepository<reservationModel, Long> {
    ArrayList<reservationModel> findByID(String nombre);
    reservationModel save(reservationModel reservation);
}
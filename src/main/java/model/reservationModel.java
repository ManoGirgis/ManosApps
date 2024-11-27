package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class reservationModel {

    private int id;
   private int userId;
   private int room_number;
   private String reservation_date;
   private String status;
}

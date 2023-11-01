package lk.ijse.gdse.Hotel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Hotel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hotelId;

    private String hotelName;
    private String category;
    private String location;
    private String address;
    private String email;
    private int contactNumber1;
    private int contactNumber2;
    private String pet;
    private double priceHotel;
}

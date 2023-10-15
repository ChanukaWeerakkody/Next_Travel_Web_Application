package com.ijse.gdse.Next_Travel.entity.hotelPackage;

import jakarta.persistence.*;
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
public class HotelPackage implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long packageId;

    private String hotelName;
    private String location;
    private String email;
    private int contactNumber;
    private double price;
    private String pet;

    private String category;
    private String travelArea;
    private int noOfAdults;
    private int noOfChild;
    private int totalCount;
    private double packagePrice;
}

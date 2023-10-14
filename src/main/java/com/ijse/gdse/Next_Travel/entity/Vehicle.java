package com.ijse.gdse.Next_Travel.entity;

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
public class Vehicle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleId;


    private String brand;
    private String subName;
    private String type; //Car , Van, Suv, Bus
    private String pata;
    private String category;//Economic,Midrange,Luxury,Super Luxury
    private String transmission;//auto/manual
    private String seatCapacity;
    private String fuelType;//diesel,petrol
    private String model;//hybrid,Non hybrid
    private double pricePerKM;

    private String image1;
    private String image2;
    private String image3;
    private String image4;
}

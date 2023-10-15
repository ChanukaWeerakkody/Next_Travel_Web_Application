package com.ijse.gdse.Next_Travel.dto.vehicle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class VehicleDTO {
    private Long vehicleId;
    private String brand;
    private String subName;
    private String type;
    private String pata;
    private String category;
    private String transmission;
    private String seatCapacity;
    private String fuelType;
    private String model;
    private double pricePerKM;

    private String image1;
    private String image2;
    private String image3;
    private String image4;
}

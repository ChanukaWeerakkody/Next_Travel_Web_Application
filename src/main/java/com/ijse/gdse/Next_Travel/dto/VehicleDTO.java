package com.ijse.gdse.Next_Travel.dto;

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
    private String type; //Car , Van, Suv, Bus
    private String pata;
    private String category;//Economic,Midrange,Luxury,Super Luxury
    private String transmission;//auto/manual
    private String seatCapacity;
    private String fuelType;//diesel,petrol
    private String model;//hybrid,Non hybrid

    private String image1;
    private String image2;
    private String image3;
    private String image4;
}

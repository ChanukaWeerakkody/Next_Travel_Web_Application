package com.ijse.gdse.Next_Travel.dto.hotelPackage;

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
public class HotelPackageDTO {
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

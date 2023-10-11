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
public class HotelDTO {
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

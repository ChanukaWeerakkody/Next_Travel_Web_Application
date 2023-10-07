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
    private String name;
    private String category;
    private String location;
    private String googleLocation;
    private String email;
    private int contact1;
    private int contact2;
    private String petOrNo;
    private double price;
}

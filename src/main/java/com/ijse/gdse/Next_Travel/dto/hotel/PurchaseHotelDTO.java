package com.ijse.gdse.Next_Travel.dto.hotel;

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
public class PurchaseHotelDTO implements Serializable {
    private Long hotelOid;
    private Long hotelId;
    private double pricePerDay;
    private int days;
    private double fullPrice;
    private String userId;
}

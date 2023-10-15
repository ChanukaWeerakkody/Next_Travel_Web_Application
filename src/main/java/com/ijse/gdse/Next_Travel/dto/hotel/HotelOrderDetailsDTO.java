package com.ijse.gdse.Next_Travel.dto.hotel;

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
public class HotelOrderDetailsDTO {
    private Long oid;
    private Long hotelId;
    private double amount;
}

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
public class HotelPackageOrderDetailsDTO {
    private Long oid;
    private Long packageId;
    private double amount;
}

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
@ToString
@Data
public class PurchaseOrderDTO {
    private Long orderId;
    private Long vehicleId;
    private Long hotelId;
    private Long packageId;
    private Long guideId;
    private Long userId;

    private double finalPrice;
}

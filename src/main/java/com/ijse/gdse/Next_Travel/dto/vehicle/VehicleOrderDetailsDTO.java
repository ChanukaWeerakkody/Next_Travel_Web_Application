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
public class VehicleOrderDetailsDTO {
    private Long oid;
    private Long vehicleId;
    private double amount;
}

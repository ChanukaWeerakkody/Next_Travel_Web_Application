package com.ijse.gdse.Next_Travel.entity;

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
public class OrderVehicle_PK implements Serializable {
    private Long oid;
    private Long vehicleId;
}

package com.ijse.gdse.Next_Travel.entity;

import jakarta.persistence.*;
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
@Entity
@IdClass(OrderVehicle_PK.class)
public class VehicleOrderDetails {
    @Id
    private Long oid;

    @Id
    private Long vehicleId;


    private double amount;


    @ManyToOne
    @JoinColumn(name = "oid",referencedColumnName = "oid",insertable = false,updatable = false)
    private VehicleOrders orders;

    @ManyToOne
    @JoinColumn(name = "vehicleId" , referencedColumnName = "vehicleId", insertable = false,updatable = false)
    private Vehicle vehicle;

}

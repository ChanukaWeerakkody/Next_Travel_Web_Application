package com.ijse.gdse.Next_Travel.entity.hotel;

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
@IdClass(OrderHotel_PK.class)
public class HotelOrderDetails {
    @Id
    private Long oid;

    @Id
    private Long hotelId;


    private double amount;

    @ManyToOne
    @JoinColumn(name = "oid",referencedColumnName = "oid",insertable = false,updatable = false)
    private HotelOrders orders;

    @ManyToOne
    @JoinColumn(name = "hotelId" , referencedColumnName = "hotelId", insertable = false,updatable = false)
    private Hotel hotel;
}

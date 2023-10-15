package com.ijse.gdse.Next_Travel.entity.hotelPackage;

import com.ijse.gdse.Next_Travel.entity.guide.Guide;
import com.ijse.gdse.Next_Travel.entity.guide.GuideOrders;
import com.ijse.gdse.Next_Travel.entity.guide.OrderGuide_PK;
import com.ijse.gdse.Next_Travel.entity.hotel.OrderHotel_PK;
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
@IdClass(OrderHotelPackage_PK.class)
public class HotelPackageOrderDetails {
    @Id
    private Long oid;

    @Id
    private Long packageId;


    private double amount;


    @ManyToOne
    @JoinColumn(name = "oid",referencedColumnName = "oid",insertable = false,updatable = false)
    private HotelPackageOrders orders;

    @ManyToOne
    @JoinColumn(name = "packageId" , referencedColumnName = "packageId", insertable = false,updatable = false)
    private HotelPackage hotelPackage;
}

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
@IdClass(OrderGuide_PK.class)
public class GuideOrderDetails {
    @Id
    private Long oid;

    @Id
    private Long guideId;


    private double amount;


    @ManyToOne
    @JoinColumn(name = "oid",referencedColumnName = "oid",insertable = false,updatable = false)
    private GuideOrders orders;

    @ManyToOne
    @JoinColumn(name = "guideId" , referencedColumnName = "guideId", insertable = false,updatable = false)
    private Guide guide;
}

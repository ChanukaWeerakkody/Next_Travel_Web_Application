package com.ijse.gdse.Next_Travel.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class GuideOrders {
    @Id
    private Long oid;

    private String date;

    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "userId",referencedColumnName = "userId",nullable = false)
    private User user;

    @OneToMany(mappedBy = "orders" , cascade = CascadeType.ALL)
    private List<GuideOrderDetails> orderDetails;
}

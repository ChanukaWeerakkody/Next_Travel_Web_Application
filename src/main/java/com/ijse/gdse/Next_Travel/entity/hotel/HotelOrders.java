package com.ijse.gdse.Next_Travel.entity.hotel;

import com.ijse.gdse.Next_Travel.entity.User;
import com.ijse.gdse.Next_Travel.entity.guide.GuideOrderDetails;
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
public class HotelOrders {
    @Id
    private Long oid;

    private String date;

    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "userId",referencedColumnName = "userId",nullable = false)
    private User user;

    @OneToMany(mappedBy = "orders" , cascade = CascadeType.ALL)
    private List<HotelOrderDetails> orderDetails;
}

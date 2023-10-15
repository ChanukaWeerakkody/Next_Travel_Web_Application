package com.ijse.gdse.Next_Travel.repo;

import com.ijse.gdse.Next_Travel.entity.VehicleOrders;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/

public interface OrdersRepo extends JpaRepository<VehicleOrders,Long> {
}

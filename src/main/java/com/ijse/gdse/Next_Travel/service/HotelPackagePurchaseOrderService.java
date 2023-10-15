package com.ijse.gdse.Next_Travel.service;

import com.ijse.gdse.Next_Travel.dto.hotelPackage.HotelPackageOrderDTO;
import com.ijse.gdse.Next_Travel.dto.vehicle.VehicleOrdersDTO;
import com.ijse.gdse.Next_Travel.entity.hotelPackage.HotelPackageOrders;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/

public interface HotelPackagePurchaseOrderService {
    void purchaseOrder(HotelPackageOrderDTO dto);
}

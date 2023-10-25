package com.ijse.gdse.Next_Travel.service;

import com.ijse.gdse.Next_Travel.dto.vehicle.PurchaseVehicleDTO;

import java.util.List;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/

public interface PurchaseVehicleService {
    void savePurchaseVehicle(PurchaseVehicleDTO dto);
    void updatePurchaseVehicle(PurchaseVehicleDTO dto);
    void deletePurchaseVehicle(Long id);
    PurchaseVehicleDTO searchPurchaseVehicleById(String id);
    List<PurchaseVehicleDTO> getAllPurchaseVehicleDetail();
    void uploadVehicleImage(String carFrontViewPath, String carBackViewPath,  Long vehicleId);
}

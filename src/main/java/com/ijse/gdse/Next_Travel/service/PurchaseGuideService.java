package com.ijse.gdse.Next_Travel.service;

import com.ijse.gdse.Next_Travel.dto.guide.PurchaseGuideDTO;
import com.ijse.gdse.Next_Travel.dto.vehicle.PurchaseVehicleDTO;

import java.util.List;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/

public interface PurchaseGuideService {
    void savePurchaseGuide(PurchaseGuideDTO dto);
    void updatePurchaseGuide(PurchaseGuideDTO dto);
    void deletePurchaseGuide(Long id);
    PurchaseGuideDTO searchPurchaseGuideById(String id);
    List<PurchaseGuideDTO> getAllPurchaseGuideDetail();
}

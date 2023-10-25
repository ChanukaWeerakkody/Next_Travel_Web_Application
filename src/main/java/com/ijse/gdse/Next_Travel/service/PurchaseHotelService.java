package com.ijse.gdse.Next_Travel.service;

import com.ijse.gdse.Next_Travel.dto.guide.PurchaseGuideDTO;
import com.ijse.gdse.Next_Travel.dto.hotel.PurchaseHotelDTO;

import java.util.List;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/

public interface PurchaseHotelService {
    void savePurchaseHotel(PurchaseHotelDTO dto);
    void updatePurchaseHotel(PurchaseHotelDTO dto);
    void deletePurchaseHotel(Long id);
    PurchaseHotelDTO searchPurchaseHotelById(String id);
    List<PurchaseHotelDTO> getAllPurchaseHotelDetail();
}

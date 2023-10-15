package com.ijse.gdse.Next_Travel.service;

import com.ijse.gdse.Next_Travel.dto.hotelPackage.HotelPackageDTO;
import com.ijse.gdse.Next_Travel.entity.hotelPackage.HotelPackage;

import java.util.List;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/

public interface HotelPackageService {
    void savePackage(HotelPackageDTO dto);
    void deletePackage(Long id);
    void updatePackage(HotelPackageDTO dto);
    List<HotelPackage> getAllHotelPackageDetail();
}

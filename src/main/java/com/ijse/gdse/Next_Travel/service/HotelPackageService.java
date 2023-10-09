package com.ijse.gdse.Next_Travel.service;

import com.ijse.gdse.Next_Travel.dto.HotelPackageDTO;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/

public interface HotelPackageService {
    void savePackage(HotelPackageDTO dto);
    void deletePackage(Long id);
    void updatePackage(HotelPackageDTO dto);
}

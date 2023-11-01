package lk.ijse.gdse.Package.service;

import lk.ijse.gdse.Package.dto.HotelPackageDTO;
import lk.ijse.gdse.Package.entity.HotelPackage;

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

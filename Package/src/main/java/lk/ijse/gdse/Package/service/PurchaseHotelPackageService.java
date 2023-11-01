package lk.ijse.gdse.Package.service;

import lk.ijse.gdse.Package.dto.PurchaseHotelPackageDTO;

import java.util.List;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/

public interface PurchaseHotelPackageService {
    void savePurchaseHotelPackage(PurchaseHotelPackageDTO dto);
    void updatePurchaseHotelPackage(PurchaseHotelPackageDTO dto);
    void deletePurchaseHotelPackage(Long id);
    PurchaseHotelPackageDTO searchPurchaseHotelPackageById(String id);
    List<PurchaseHotelPackageDTO> getAllPurchaseHotelPackageDetail();
}

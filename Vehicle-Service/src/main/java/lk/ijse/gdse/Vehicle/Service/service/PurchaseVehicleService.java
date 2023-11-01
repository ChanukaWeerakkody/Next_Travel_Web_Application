package lk.ijse.gdse.Vehicle.Service.service;
;
import lk.ijse.gdse.Vehicle.Service.dto.PurchaseVehicleDTO;

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

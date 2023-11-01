package lk.ijse.gdse.Vehicle.Service.service;


import lk.ijse.gdse.Vehicle.Service.dto.VehicleDTO;

import java.util.List;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/

public interface VehicleService {
    void saveVehicle(VehicleDTO dto);
    void uploadVehicleImage(String carFrontViewPath, String carBackViewPath, String carSideViewPath, String carInteriorViewPath,Long id);

    void updateVehicle(VehicleDTO dto);
    void deleteVehicle(Long id);
    VehicleDTO searchVehicleById(String id);
    List<VehicleDTO> getAllVehicleDetail();

    void uploadCarImage(String carFrontViewPath, String carBackViewPath, String carSideViewPath, String carInteriorViewPath, Long vehicleId);
}
